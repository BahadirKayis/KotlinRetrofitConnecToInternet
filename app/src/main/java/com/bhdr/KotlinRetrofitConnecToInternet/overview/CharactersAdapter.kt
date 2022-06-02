package com.bhdr.KotlinRetrofitConnecToInternet.overview

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bhdr.KotlinRetrofitConnecToInternet.R
import com.bhdr.KotlinRetrofitConnecToInternet.databinding.CharacterItemDesignBinding
import com.bhdr.KotlinRetrofitConnecToInternet.newtwork.CharacterModel
import com.bumptech.glide.Glide
import com.bumptech.glide.load.model.GlideUrl


class CharactersAdapter:ListAdapter<CharacterModel,CharactersAdapter.CharactersViewHolder>(DiffCallBack) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersAdapter.CharactersViewHolder {
        val binding = CharacterItemDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CharactersViewHolder(binding)
    }
    override fun onBindViewHolder(holder: CharactersAdapter.CharactersViewHolder, position: Int) {
       val character=getItem(position)
        holder.bind(character)

    }
    inner class CharactersViewHolder(private val binding: CharacterItemDesignBinding): RecyclerView.ViewHolder(binding.root){
fun bind(model:CharacterModel){
    Glide
        .with(binding.imgCharacters.context)
        .load(model.imageUrl)
      //  .centerCrop()
       // .placeholder(R.drawable.loading_spinner)
        //.error()
        .into(binding.imgCharacters)

       binding.textHouse.text=model.house;

    binding.textName.text=model.name


}
    }
//Static yapı kurmak için companion
   companion object DiffCallBack:DiffUtil.ItemCallback<CharacterModel>(){

    override fun areItemsTheSame(oldItem: CharacterModel, newItem: CharacterModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: CharacterModel, newItem: CharacterModel): Boolean {
        return oldItem == newItem
    }

}
}