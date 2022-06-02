package com.bhdr.KotlinRetrofitConnecToInternet.overview

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bhdr.KotlinRetrofitConnecToInternet.R
import com.bhdr.KotlinRetrofitConnecToInternet.Todo
import com.bhdr.KotlinRetrofitConnecToInternet.databinding.FragmentOverviewBinding
import com.bhdr.KotlinRetrofitConnecToInternet.newtwork.CharacterModel
import com.bhdr.KotlinRetrofitConnecToInternet.newtwork.CharacterResponse
import com.bhdr.KotlinRetrofitConnecToInternet.newtwork.HarryPotterApi
import com.zhuinden.fragmentviewbindingdelegatekt.viewBinding
import kotlinx.coroutines.launch

class OverviewFragment : Fragment(R.layout.fragment_overview) {
    private val binding by viewBinding(FragmentOverviewBinding::bind)

    private val viewmodel by lazy { OverviewViewModel() }
    private val charactersAdapter by lazy { CharactersAdapter() }
private lateinit var list:List<CharacterModel>
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //  binding.lifecycleOwner= = this bu fragmentın xmlindeki data binding ile entegre ediceğim demek


        val list = viewmodel
        binding.Characters.apply {
            layoutManager =
                GridLayoutManager(binding.Characters.context,2, GridLayoutManager.VERTICAL, false)
            adapter = charactersAdapter
                                 Log.e("binding.apply", list.character.value.toString())

        }// STOPSHIP:  
        //Todo.getTodos()
        charactersAdapter.submitList(list.character.value)
        Log.e("charactersAdapter", list.character.value.toString())

    }

}
