package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*enableEdgeToEdge()*/
        setContent {
            TaskManagerTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color= MaterialTheme.colorScheme.background) {
                        WelcomeImage()
                }
            }
        }
    }
}

@Composable
fun WelcomeText(modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier=modifier) {
        Text(
            text = "Task Management",
            fontSize=30.sp,
            lineHeight = 40.sp,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(20.dp)

        )
        Text(
            text = "This productivity tool is designed to help " +
                    "you better manager your task " +
                    "project-wise conveniently",
            fontSize = 20.sp,
            lineHeight = 21.sp,
            textAlign = TextAlign.Center
        )
    }

}

@Composable
fun WelcomeImage(modifier: Modifier=Modifier){
    val image = painterResource(id = R.drawable.androidparty)

    Box(modifier){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.3F
        )
        WelcomeText(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }

}

@Preview(
)
@Composable
fun WelcomeTextPreview(modifier: Modifier = Modifier){
    TaskManagerTheme {
        WelcomeImage()
    }
}

