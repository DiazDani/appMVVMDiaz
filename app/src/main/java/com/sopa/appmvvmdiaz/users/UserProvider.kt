package com.sopa.appmvvmdiaz.users

import com.sopa.appmvvmdiaz.login.LoginModel
import com.sopa.appmvvmdiaz.login.LoginProvider

class UserProvider {
    companion object{


        fun random(): UsersModel {
            val position = (0..10).random()
            return user[position]
        }

        private val user = listOf(
            UsersModel(
                name = "Dani Diaz",
                age= 19,
                mail = "daniel.diaz@institutvidreres.cat"
            ),  UsersModel(
                name = "Hector Viñas",
                age= 19,
                mail = "hector.vinas@institutvidreres.cat"
            ),  UsersModel(
                name = "Ismael Naciri",
                age= 20,
                mail = "ismael.naciri@institutvidreres.cat"
            ),  UsersModel(
                name = "Marc Rubio",
                age= 19,
                mail = "marc.rubio@institutvidreres.cat"
            ),  UsersModel(
                name = "Alex Blanco",
                age= 19,
                mail = "alex.blanco@institutvidreres.cat"
            ),  UsersModel(
                name = "Dani Gelabert",
                age= 19,
                mail = "daniel.gelabert@institutvidreres.cat"
            ),  UsersModel(
                name = "Arnau Lloveras",
                age= 19,
                mail = "arnau.lloveras@institutvidreres.cat"
            ),  UsersModel(
                name = "Aram Mateos",
                age= 19,
                mail = "aram.mateos@institutvidreres.cat"
            ),  UsersModel(
                name = "Eloy Castaño",
                age= 20,
                mail = "eloy.castano@institutvidreres.cat"
            ),  UsersModel(
                name = "Nerea Torralba",
                age= 21,
                mail = "nerea.torralba@institutvidreres.cat"
            ),  UsersModel(
                name = "Ruben Huertas",
                age= 20,
                mail = "ruben.huertas@institutvidreres.cat"
            ),
        )
    }
}