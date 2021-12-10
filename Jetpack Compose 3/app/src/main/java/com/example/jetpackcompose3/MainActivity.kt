package com.example.jetpackcompose3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(fraction = 0.5f)
                    .background(color = Color.Yellow)
                    .padding(16.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(64.dp)
                        .background(color = Color.Blue)
                )
                Box(
                    modifier = Modifier
                        .offset(x = 16.dp, y = 16.dp)
                        .size(200.dp)
                        .border(width = 2.dp, color = Color.Red)
                        .padding(16.dp)
                        .border(width = 2.dp, color = Color.Green)
                        .padding(16.dp)
                        .border(width = 2.dp, color = Color.Black)
                        .padding(16.dp)
                        .clip(CircleShape)
                        .background(color = Color.Magenta)
                )
            }
        }
    }
}