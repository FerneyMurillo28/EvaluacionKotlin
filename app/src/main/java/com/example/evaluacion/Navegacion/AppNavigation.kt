package com.example.evaluacion.Navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.evaluacion.Pantallas.PrimerPantalla
import com.example.evaluacion.Pantallas.SegundaPantalla
import com.example.evaluacion.Pantallas.TercerPantalla


@Composable
fun AppNavigation(){
    val navController= rememberNavController()
    NavHost(navController = navController,
        startDestination = AppNav.PrimerPantalla.ruta
    ){
        composable(route = AppNav.PrimerPantalla.ruta){ PrimerPantalla(navController) }
        composable(route = AppNav.SegundaPantalla.ruta){ SegundaPantalla(navController) }
        composable(route = AppNav.TercerPantalla.ruta){ TercerPantalla(navController) }
    }
}
