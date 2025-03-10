package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.littlelemon.components.LowerPanel
import com.example.littlelemon.components.UpperPanel
import com.example.littlelemon.ui.theme.LittleLemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LittleLemonTheme {
                HomeScreen()
            }

        }
    }
}

@Composable
fun HomeScreen(){
    Column (
        Modifier.background(Color.White)
    ){
        UpperPanel()
        LowerPanel()
    }
}

@Composable
@Preview
fun HomeScreenPreview(){
    HomeScreen()
}