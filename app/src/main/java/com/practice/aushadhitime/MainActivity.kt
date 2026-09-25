package com.practice.aushadhitime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.practice.aushadhitime.ui.theme.AushadhiTimeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AushadhiTimeTheme {
                AushadhiTimeOpeningScreen()
            }
        }
    }
}

@Composable
fun AushadhiTimeOpeningScreen() {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(
                id = R.drawable.at_opening
            ),
            contentDescription = "AushadhiTime welcome screen",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun AushadhiTimeOpeningScreenPreview() {

    AushadhiTimeTheme {
        AushadhiTimeOpeningScreen()
    }
}