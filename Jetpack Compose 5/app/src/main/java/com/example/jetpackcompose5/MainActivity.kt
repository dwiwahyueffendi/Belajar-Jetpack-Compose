package com.example.jetpackcompose5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(){
                val checkboxState = remember{ mutableStateOf(false)}
                CustomCheckbox(title = "Checkbox1", checkboxState = checkboxState.value){
                    checkboxState.value = !checkboxState.value
                }
            }
        }
    }
}

@Composable
fun CustomCheckbox(
    title: String,
    checkboxState : Boolean,
    onCheckboxPressed : ((Boolean) -> Unit)?
){
    Row(
        modifier = Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Checkbox(
            checked = checkboxState,
            onCheckedChange = onCheckboxPressed
        )
        Spacer(modifier = Modifier.padding(4.dp))
        Text(text = title)
    }
}