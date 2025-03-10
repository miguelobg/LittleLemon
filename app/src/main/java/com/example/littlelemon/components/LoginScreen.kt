package com.example.littlelemon.components

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.littlelemon.R
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation

@Composable
fun LoginScreen() {
    var username by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    val context = LocalContext.current

    Column(

        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.littlelemonlogo),
            contentDescription = "Logo Image",
            modifier = Modifier.padding(10.dp)
        )
        TextField(
            value = username,
            onValueChange = { username = it },
            label = { Text(text = "Username") },
            modifier = Modifier.padding(10.dp),
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = androidx.compose.ui.text.input.ImeAction.Next)
        )
        TextField(
            value = password,
            onValueChange = { password = it },
            visualTransformation = PasswordVisualTransformation(),
            label = { Text(text = "Password") },
            modifier = Modifier.padding(10.dp)
        )
        Button(
            onClick = {
                if (username.text == "Darian" && password.text == "littlelemon") {
                    Toast.makeText(context,"Welcome to Little Lemon",
                        Toast.LENGTH_SHORT).show()
                }else {
                    Toast.makeText(context,"Invalid Credentials, please try again",
                        Toast.LENGTH_SHORT).show()
                }
            },
            colors = ButtonDefaults.buttonColors(Color(0xFF495E57)),
                modifier = Modifier.padding(10.dp),

        ) {
            Text(text = "Login")
        }
    }

}

@Composable
@Preview
fun LoginScreenPreview() {
    LoginScreen()
}