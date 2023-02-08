package com.example.evaluacion.Pantallas

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.evaluacion.Navegacion.AppNav
import com.example.evaluacion.R

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun PrimerPantalla(navController: NavController){
    Scaffold(
        bottomBar = {
            BottomAppBar() {
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Spacer(modifier = Modifier.width(45.dp))
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription = "ArrowBack",
                        modifier = Modifier.clickable {
                            navController.navigate(route = AppNav.SegundaPantalla.ruta)
                        }
                    )
                }
            }
        }
    ) {
        Contenido1(navController)
    }
}

@Composable
fun Contenido1(navController: NavController){
    Box(modifier = Modifier.fillMaxSize()
        ) {
        Image(painter = painterResource(R.drawable.restaurante),
            contentDescription ="",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.size(1500.dp),
        )
    }
    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row() {
            Text(text = "Bienvenido al Restaurante Chollo",
                fontFamily = FontFamily.Cursive,
                fontSize = 40.sp,
                color = Color.LightGray,
                textAlign = TextAlign.Center
            )
        }
    }
}
