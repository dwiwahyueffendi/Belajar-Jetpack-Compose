package com.example.jetpackcompose6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScaffoldExample()
        }
    }
}

@Composable
fun ScaffoldExample(){
    val materialBlue700 = Color(0xFF0080FF)
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Scaffold Tutorial")
                },
                 backgroundColor = materialBlue700
            )
        },
        bottomBar = {
            BottomAppBar(
                backgroundColor = materialBlue700
            ){
                Text(text = "Bottom Bar")
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Text(text = "+")
            }
        },
        floatingActionButtonPosition = FabPosition.End,
        drawerContent = {
            Text("Ini Drawer")
        },
        content = {
            Text("Ini Content")
        }
    )
}