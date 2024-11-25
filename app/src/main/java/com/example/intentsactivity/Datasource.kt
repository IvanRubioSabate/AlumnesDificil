package com.example.intentsactivity

class Datasource private constructor(){
    private var arrayAlumne: ArrayList<Alumne> = arrayListOf(
        Alumne("Marcos", 5, "SMX1"),
        Alumne("Manel", 5, "SMX1"),
        Alumne("Fradera", 5, "SMX1"),
        Alumne("Cacahuete", 5, "SMX1"),
        Alumne("Marcos", 5, "SMX1"),
        Alumne("Manel", 5, "SMX1"),
        Alumne("Fradera", 5, "SMX1"),
        Alumne("Cacahuete", 5, "SMX1"),
        Alumne("Marcos", 5, "SMX1"),
        Alumne("Manel", 5, "SMX1"),
        Alumne("Fradera", 5, "SMX1"),
        Alumne("Cacahuete", 5, "SMX1"),
        Alumne("Marcos", 5, "SMX1"),
        Alumne("Manel", 5, "SMX1"),
        Alumne("Fradera", 5, "SMX1"),
        Alumne("Cacahuete", 5, "SMX1"),
        Alumne("Marcos", 5, "SMX1"),
        Alumne("Manel", 5, "SMX1"),
        Alumne("Fradera", 5, "SMX1"),
        Alumne("Cacahuete", 5, "SMX1"),

        Alumne("Michel", 3, "DAM1"),
        Alumne("Guilherme", 3, "DAM1"),
        Alumne("Eduardo", 3, "DAM1"),

        Alumne("David", 70, "DAM2"),
        Alumne("Joel", 70, "DAM2")
    )

    companion object {
        val instace: Datasource by lazy { Datasource() }
    }

    fun loadAlumnesArray() :ArrayList<Alumne> {
        return arrayAlumne
    }

    fun addAlumneToArray(alumne: Alumne) {
        arrayAlumne.plusAssign(alumne)
    }
}