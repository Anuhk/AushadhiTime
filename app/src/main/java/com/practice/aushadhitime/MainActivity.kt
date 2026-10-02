package com.practice.aushadhitime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity(){

    override fun  onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier= Modifier.fillMaxSize().padding(24.dp),
                    verticalArrangement = Arrangement.Center
                ){
                    Text("AushadhiTime",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold)

                    Spacer(Modifier.height(20.dp))

                    Button( onClick = {},Modifier.width(150.dp), shape=RoundedCornerShape(12.dp), colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)) ) {
                        Text("Get Started", fontSize = 16.sp)
                    }
                }
        }
    }

}