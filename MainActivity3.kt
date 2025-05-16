package com.example.myfan

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfan.MainActivity2
import com.example.myfan.ui.theme.MyFanTheme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                //Code for the Correct image
                Image(
                    painter = painterResource(id = R.drawable.correct),
                    contentDescription = "ehdnikrnh"
                )

                Text(text = "Correct!, Barack Obama was the first Black American president of the United States. He was elected as the 44th president and served two terms, from January 20, 2009, to January 20, 2017.")

                Button(onClick = {

                        val next = Intent(this@MainActivity3, MainActivity5::class.java)
                        startActivity(next)
                    }) {
                        Text(text = "Next")
                    }



                }
            }

           }
        }

