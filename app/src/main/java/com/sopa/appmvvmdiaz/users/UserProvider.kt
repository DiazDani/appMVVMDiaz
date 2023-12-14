package com.sopa.appmvvmdiaz.users



class UserProvider {
    companion object{

        fun findUser(usuari : String): UsersModel? {

            return user.find { it.username.equals(usuari) }
        }

        fun random(): UsersModel {
            val position = (0..10).random()
            return user[position]
        }

        private val user = listOf(
            UsersModel(
                name = "Dani Diaz",
                age= 19,
                mail = "daniel.diaz@institutvidreres.cat",
                username= "dani"
            ),  UsersModel(
                name = "Hector Viñas",
                age= 19,
                mail = "hector.vinas@institutvidreres.cat",
                username = "hector"
            ),  UsersModel(
                name = "Ismael Naciri",
                age= 21,
                mail = "ismael.naciri@institutvidreres.cat",
                username = "isma"
            ),  UsersModel(
                name = "Marc Rubio",
                age= 19,
                mail = "marc.rubio@institutvidreres.cat",
                username = "marc"
            ),  UsersModel(
                name = "Alex Blanco",
                age= 19,
                mail = "alex.blanco@institutvidreres.cat",
                username = "alex"
            ),  UsersModel(
                name = "Dani Gelabert",
                age= 19,
                mail = "daniel.gelabert@institutvidreres.cat",
                username = "gelabert"
            ),  UsersModel(
                name = "Arnau Lloveras",
                age= 19,
                mail = "arnau.lloveras@institutvidreres.cat",
                username = "arnau"
            ),  UsersModel(
                name = "Aram Mateos",
                age= 19,
                mail = "aram.mateos@institutvidreres.cat",
                username = "aram"
            ),  UsersModel(
                name = "Eloy Castaño",
                age= 20,
                mail = "eloy.castano@institutvidreres.cat",
                username = "eloy"
            ),  UsersModel(
                name = "Nerea Torralba",
                age= 21,
                mail = "nerea.torralba@institutvidreres.cat",
                username = "nerea"
            ),  UsersModel(
                name = "Ruben Huertas",
                age= 20,
                mail = "ruben.huertas@institutvidreres.cat",
                username = "ruben"
            ),
        )
    }
}