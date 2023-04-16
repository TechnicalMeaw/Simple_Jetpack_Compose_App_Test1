package com.example.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstcomposeapp.ui.theme.MyFirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()
        }
    }
}

@Composable
fun Greeting() {

    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize().padding(10.dp)) {
        Image(painter = painterResource(id = R.drawable.img), contentDescription = "image",
            modifier = Modifier
                .size(200.dp)
                .clip(shape = CircleShape)
                .border(width = 2.dp, color = Color.Red, shape = CircleShape), contentScale = ContentScale.Crop)


        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxSize().padding(10.dp)){
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "100", fontWeight = FontWeight.Bold)
                Text(text = "Nature")


            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "100", fontWeight = FontWeight.Bold)
                Text(text = "Nature")
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "100", fontWeight = FontWeight.Bold)
                Text(text = "Nature")
            }
        }

    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyFirstComposeAppTheme {
        Greeting()
    }
}