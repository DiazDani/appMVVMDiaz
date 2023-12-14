package com.sopa.appmvvmdiaz.login

class LoginProvider {

    companion object {

        fun checkUser(usuari: String,contrasenya: String): Boolean {

            val value = LoginModel (
                user = usuari,
                password = contrasenya
            )
            return logins.contains(value)

        }

        private val logins = listOf(
            LoginModel(
                user = "enaitz",
                password = "1111"
            ),
            LoginModel(
                user = "isma",
                password = "222"
            ),
            LoginModel(
                user = "hector",
                password = "333"
            ),
            LoginModel(
                user = "dani",
                password = "444"
            ),
            LoginModel(
                user = "marc",
                password = "555"
            ),
            LoginModel(
                user = "alex",
                password = "666"
            ),
            LoginModel(
                user = "gelabert",
                password = "777"
            ),
            LoginModel(
                user = "arnau",
                password = "888"
            ),
            LoginModel(
                user = "aram",
                password = "999"
            ),
        )

    }
}


