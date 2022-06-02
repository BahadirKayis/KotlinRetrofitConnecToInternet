package com.bhdr.KotlinRetrofitConnecToInternet.overview

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bhdr.KotlinRetrofitConnecToInternet.newtwork.CharacterModel
import com.bhdr.KotlinRetrofitConnecToInternet.newtwork.HarryPotterApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

//Sadece key tutuyoruz
enum class HarryPotterApiStatus { LOADING, ERROR, DONE }

class OverviewViewModel : ViewModel() {
    private val _status = MutableLiveData<HarryPotterApiStatus>()//Anlık olarak alabilmek için
    val status: LiveData<HarryPotterApiStatus>
        //Erişim Sağlmak için,anlık dinleme işlevi
        get() = _status
    private val _characters = MutableLiveData<List<CharacterModel>>()
    val character: LiveData<List<CharacterModel>>
        get() = _characters

    init {//ViewModel oluştuğu anda çalışmasını istedğimiz kodları buraya yazıyoruz
        getCharacters()

    }

    private fun getCharacters() {


        viewModelScope.launch {
            _status.value = HarryPotterApiStatus.LOADING
            try {
                _characters.value = HarryPotterApi.retrofitService.getCharacters().characters
                _status.value = HarryPotterApiStatus.DONE
            } catch (e: Exception) {
                _status.value = HarryPotterApiStatus.ERROR
                _characters.value = ArrayList()
            }
            Log.e("TAG", HarryPotterApi.retrofitService.getCharacters().toString() )
            Log.e("TAG", _characters.value.toString() )
            Log.e("TAG",  _status.value.toString() )


        }

        Log.e("TAG", _characters.value.toString() )
        Log.e("TAG",  _status.value.toString() )

    }
}
