package com.example.myfan

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfan.ui.theme.MyFanTheme



class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                Text(text = "Historical Questions")
                Text(text = "Question 1")
                Image(
                    painter = painterResource(id = R.drawable.overview_barack_obama),
                    contentDescription = "jsbjf")
                Text(text = "Was Barack Obama the First Black president of the United States?")

                Row {
                    Button(onClick = {
                        val True = Intent(this@MainActivity2, MainActivity3::class.java)
                        startActivity(True)

                    }) {
                        Text(text = "True")
                    }
                    Button(onClick = {
                        val False = Intent(this@MainActivity2, MainActivity4::class.java)
                        startActivity(False)

                    }) {
                        Text(text = "False")
                    }
                }




                Button(onClick = {
                    //Runs when button is clicked
                    val back = Intent(this@MainActivity2, MainActivity::class.java)
                    startActivity(back)
                }) {
                    Text(text = "Back")
                }

            }

                }




            }


    }


