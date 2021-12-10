package com.example.jetpackcompose2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.padding(16.dp)  //Padding
            ) {
                Column(
                    modifier = Modifier
                        .border(width = 2.dp, color = Color.Blue)  //Border
                        .fillMaxWidth() //MacthParent
                        .height(200.dp),
                    verticalArrangement = Arrangement.Center
                    //horizontalAlignment = Alignment.CenterHorizontally  //Align Center
                ) {  //Menampilkan Kolom
                    Text(
                        "Text Ke-1",
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                    Text(
                        "Text Ke-2",
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )   //Text ALignment
                }
                Spacer(modifier = Modifier.padding(16.dp))  //Jarak
                Row(
                    modifier = Modifier
                        .border(width = 3.dp, color = Color.Red)  //Border
                        .fillMaxWidth() //MacthParent
                        .height(100.dp),
                    horizontalArrangement = Arrangement.Center, //Arragment Center
                    verticalAlignment = Alignment.CenterVertically
                ) {     //Menampilkan Baris
                    Text(
                        text = "Text Ke-1"/*,
                        modifier = Modifier.align(Alignment.CenterVertically)*/
                    )
                    Text(
                        text = "Text Ke-2"/*,
                        Modifier = Modifier.align(Alignment.CenterVertically)*/
                    )
                }
            }
        }
    }
}