package com.example.project2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2.ui.theme.Project2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(jamal = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BasicCompose(jamal:Modifier = Modifier){
    Column  (verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize()
            .padding(top =50.dp)
            .background(Color(0xFFF2F0EB)),
        horizontalAlignment = Alignment.CenterHorizontally,
        ){
        Text(
            text = "Login",
            fontSize = 50.sp,
            color = Color(0xFF708090),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Ini adalah halaman login",
            fontSize = 16.sp,
            color = Color(0xFF828382)
        )
        Image(
            painter = painterResource(id = R.drawable.image2),
            contentDescription = "Logo Univ",
            modifier = Modifier
                .size(300.dp)
                .padding(top = 16.dp)
        )
        Text(
            text = "Nama",
            fontSize = 20.sp,
            color = Color(0xFF708090),
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(top = 20.dp)
        )
        Text(
            text = "Saiful Islam",
            fontSize = 24.sp,
            color = Color(0xFF828382),
            fontWeight = FontWeight.Bold,
            )
        Text(
            text = "20210140080",
            fontSize = 40.sp,
        )
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Project2Theme {
        Greeting("Android")
    }
}