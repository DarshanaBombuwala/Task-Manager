package com.example.taskmanager

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
                    WelcomeImage(onButtonClick = {
                        navigateToSecondActivity()
                    })
                }
            }
        }
    }

    private fun navigateToSecondActivity() {
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }

}


@Composable
fun WelcomeText(modifier: Modifier = Modifier,onButtonClick:()->Unit) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()
    ) {
        Text(
            text = stringResource(id = R.string.app_name),
            fontSize = 30.sp,
            lineHeight = 40.sp,
            modifier = Modifier
                .padding(20.dp)
        )
        Text(
            text = stringResource(R.string.welcome_text),
            fontSize = 20.sp,
            lineHeight = 21.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(20.dp)
        )


        Spacer(modifier = Modifier.height(40.dp))


        GetStartedButton(
            modifier = Modifier
                .padding(top = 16.dp),
            onButtonClick = onButtonClick
        )
    }
}


@Composable
fun WelcomeImage(modifier: Modifier=Modifier,onButtonClick: () -> Unit){
    val image = painterResource(id = R.drawable.androidparty)

    Box(modifier){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        WelcomeText(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            onButtonClick = onButtonClick
        )

    }

}

@Composable
fun GetStartedButton(modifier: Modifier = Modifier,onButtonClick:()->Unit){
    Button(
        modifier=modifier,
        onClick = onButtonClick) {
        Text(stringResource(R.string.get_started))
    }
}


@Preview(
)
@Composable
fun WelcomeTextPreview(modifier: Modifier = Modifier){
    TaskManagerTheme {
        WelcomeImage(onButtonClick = {})
    }
}