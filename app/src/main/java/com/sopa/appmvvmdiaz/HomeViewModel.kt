package com.sopa.appmvvmdiaz

import androidx.lifecycle.ViewModel
import com.sopa.appmvvmdiaz.login.LoginProvider

class HomeViewModel : ViewModel() {

    fun login(user: String, password: String): Boolean{

        return LoginProvider.checkUser(user,password)
    }


}