package com.example.evaluacion.Navegacion

sealed class AppNav(val ruta:String){
object PrimerPantalla:AppNav(ruta="PrimerPantalla")
object SegundaPantalla:AppNav(ruta="SegundaPantalla")
object TercerPantalla:AppNav(ruta="TercerPantalla")
}