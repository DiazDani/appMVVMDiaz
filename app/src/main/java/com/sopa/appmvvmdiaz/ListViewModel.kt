package com.sopa.appmvvmdiaz

import androidx.lifecycle.ViewModel
import com.sopa.appmvvmdiaz.users.UserProvider
import com.sopa.appmvvmdiaz.users.UsersModel

class ListViewModel : ViewModel() {
    private var _nom = ""

    val nom: String
        get()= _nom

    private var _edat = 0

    val edat: Number
        get()= _edat

    private var _mail = ""

    val mail: String
        get()= _mail


    fun findUser(name: String){
        UserProvider
    }

    fun randomUser(){
        val currentUser = UserProvider.random()
        _nom=currentUser.name
        _edat=currentUser.age
        _mail=currentUser.mail
    }
}
