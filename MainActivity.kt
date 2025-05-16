package com.example.myfan

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                Image(
                    painter = painterResource(id = R.drawable.importance_of_history_scaled_1),
                    contentDescription = "wdhv4fhv"
                )
                Text(text = "Welcome to the History Lesson")
                Text(text = "In this Session you will be asked 5 questions to test your knowledge and at the end you will be granted with your score")




                Button(onClick = {
                    //Runs when button is clicked
                    val next = Intent(this@MainActivity, MainActivity2::class.java)
                    startActivity(next)
                }
                ) {
                    Text(text = "Start")
                }
            }
            }




            }
        }

