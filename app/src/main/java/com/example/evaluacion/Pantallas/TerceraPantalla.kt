package com.example.evaluacion.Pantallas

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.evaluacion.Navegacion.AppNav

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun TercerPantalla(navController: NavController){
    Scaffold(
        topBar = {
                 TopAppBar() {
                     Row(modifier = Modifier.fillMaxWidth(),
                         horizontalArrangement = Arrangement.Center) {
                         Text(text = "Pantalla de pago")
                     }
                 }
        },
        bottomBar={
            BottomAppBar() {
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(imageVector = Icons.Default.Home,
                        contentDescription = "ArrowBack",
                        modifier = Modifier.clickable {
                            navController.navigate(route = AppNav.PrimerPantalla.ruta)
                        }
                    )
                }
            }
        }
    ){
        Contenido3(navController)
    }
}

@Composable
fun Contenido3(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(text = "Factura de Pago", fontSize = 45.sp)
        Text(text = "Nombre: Ferney Murillo")
        Text(text = "Vaor a Pagar: Precio del producto")
        Text(text = "Producto: Producto Escogido")
        Text(text = "Detalles extras: Ninguno")
    }
}

