package com.example.myfan

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfan.MainActivity2
import com.example.myfan.ui.theme.MyFanTheme

class MainActivity8 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column{
                Text(text = "Question 3")
                Text(text = "The Titanic sank in 1912 after hitting an iceberg.")


                Row {
                    Button(onClick = {
                        val True = Intent(this@MainActivity8, MainActivity10::class.java)
                        startActivity(True)

                    }) {
                        Text(text = "True")
                    }
                    Button(onClick = {
                        val False = Intent(this@MainActivity8, MainActivity9::class.java)
                        startActivity(False)

                    }) {
                        Text(text = "False")
                    }
                }
            }
        }
    }
}
