package com.example.evaluacion.Pantallas

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.evaluacion.Navegacion.AppNav
import com.example.evaluacion.menu

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SegundaPantalla(navController: NavController){
    Scaffold(
        bottomBar={
            BottomAppBar() {
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                    ) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "ArrowBack",
                        modifier = Modifier.clickable {
                            navController.navigate(route = AppNav.PrimerPantalla.ruta)
                        }
                    )
                    Spacer(modifier = Modifier.width(45.dp))
                    Icon(imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "ArrowBack",
                        modifier = Modifier.clickable {
                            navController.navigate(route = AppNav.TercerPantalla.ruta)
                        }
                    )
                    
                }
            }
        }
    ){
        Contenido2(navController)
    }
}

@Composable
fun Contenido2(navController: NavController){
    Column(modifier = Modifier.padding(4.dp)) {
        Text(text = "Menu Restaurante Chollo", fontSize = 30.sp, fontFamily = FontFamily.Cursive)
        Menu(menu)
    }
}
@Composable
fun MenuCompleto(nombre:String,precio:Int,descripcion:String,imagen:Int){
    Column(modifier = Modifier.border(3.dp,MaterialTheme.colors.onPrimary)) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Spacer(modifier = Modifier.width(45.dp))
            Image(painter = painterResource(imagen),
                contentDescription ="",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.size(100.dp)
            )
            var expancion by remember{
                mutableStateOf(false)
            }
            Spacer(modifier = Modifier.width(40.dp))
            Column() {
                Text(text = nombre, textAlign = TextAlign.Center, fontSize = 25.sp)
                Text(modifier = Modifier.clickable { expancion =!expancion },text = descripcion, fontSize = 15.sp, maxLines = if (expancion) Int.MAX_VALUE else 1)
                Text(text = "Precio:"+precio.toString()+"$", textAlign = TextAlign.End)
            }
        }
    }
}
@Composable
fun Menu(datos:List<com.example.evaluacion.modelos.Menu>){
    LazyColumn {
        items(datos){
            menu-> MenuCompleto(menu.nombre,menu.precio,menu.descripcion,menu.imagen)
        }
    }
}


