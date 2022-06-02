package com.bhdr.KotlinRetrofitConnecToInternet

import com.bhdr.KotlinRetrofitConnecToInternet.newtwork.CharacterModel

object Todo {
    fun getTodos():ArrayList<CharacterModel>{
        val todolist= arrayListOf<CharacterModel>()
        todolist.add(CharacterModel(1,"Harry Potter","https://upload.wikimedia.org/wikipedia/tr/thumb/6/61/HarryPotterOotP.jpg/440px-HarryPotterOotP.jpg","Gryffindor"));
        todolist.add(CharacterModel(2,"Harry Potter","https://upload.wikimedia.org/wikipedia/tr/thumb/6/61/HarryPotterOotP.jpg/440px-HarryPotterOotP.jpg","Gryffindor"));
        todolist.add(CharacterModel(3,"Harry Potter","https://upload.wikimedia.org/wikipedia/tr/thumb/6/61/HarryPotterOotP.jpg/440px-HarryPotterOotP.jpg","Gryffindor"));
        todolist.add(CharacterModel(4,"Bahadir Potter","https://upload.wikimedia.org/wikipedia/tr/thumb/6/61/HarryPotterOotP.jpg/440px-HarryPotterOotP.jpg","Gryffindor"));
        todolist.add(CharacterModel(5,"Harry Potter","https://upload.wikimedia.org/wikipedia/tr/thumb/6/61/HarryPotterOotP.jpg/440px-HarryPotterOotP.jpg","Gryffindor"));
        todolist.add(CharacterModel(6,"Harry Potter","https://upload.wikimedia.org/wikipedia/tr/thumb/6/61/HarryPotterOotP.jpg/440px-HarryPotterOotP.jpg","Gryffindor"));
        todolist.add(CharacterModel(7,"Harry Potter","https://upload.wikimedia.org/wikipedia/tr/thumb/6/61/HarryPotterOotP.jpg/440px-HarryPotterOotP.jpg","Gryffindor"));
        todolist.add(CharacterModel(8,"Bahadir Potter","https://upload.wikimedia.org/wikipedia/tr/thumb/6/61/HarryPotterOotP.jpg/440px-HarryPotterOotP.jpg","Gryffindor"));

return todolist
    }
}