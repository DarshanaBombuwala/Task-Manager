package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.taskmanager.ui.theme.TaskManagerTheme

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                Surface {
                    GetStartedButton2()
                }
            }
        }
    }
}

@Composable
fun GetStartedButton2(modifier: Modifier = Modifier) {
    Button(
        modifier = modifier,
        onClick = {}
    ) {
        Text(stringResource(R.string.get_started))
    }
}
