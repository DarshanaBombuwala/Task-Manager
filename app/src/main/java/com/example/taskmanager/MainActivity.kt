package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

                }
            }
        }
    }
}

@Composable
fun WelcomeText(modifier: Modifier = Modifier){
    Text(
        text = "This productivity tool is designed to help " +
                "you better manager your task " +
                "project-wise conveniently"
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun WelcomeTextPreview(modifier: Modifier = Modifier){
    TaskManagerTheme {
        Text(
            text = "This productivity tool is designed to help " +
                    "you better manager your task " +
                    "project-wise conveniently"
        )
    }

}

