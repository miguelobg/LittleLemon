package com.example.littlelemon.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ItemOrder() {
    var count by remember {
        mutableStateOf(0)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(8.dp),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally

    ) {
        Text(
            text = "Greek Salad",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(8.dp)
        )

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp), horizontalArrangement = Arrangement.Center
        ){
            IconButton(
                onClick = {if (count > 0) count--}
            ) {
                Icon(
                    imageVector = Icons.Default.Remove,
                    contentDescription = "Remove"
                )
            }
            Text(
                text = "$count",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(8.dp)
            )

            IconButton(
                onClick = {count++}
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add"
                )
            }
        }
    }
}

@Composable
@Preview
fun ItemOrderPreview() {
    ItemOrder()
}