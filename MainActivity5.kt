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
import com.example.myfan.MainActivity8
import com.example.myfan.ui.theme.MyFanTheme

class MainActivity5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                Text(text = "Question 3")
                Text(text = "Cleopatra was a Famous queen of Ancient Egypt")


                Row {
                    Button(onClick = {
                        val True = Intent(this@MainActivity5, MainActivity6::class.java)
                        startActivity(True)

                    }) {
                        Text(text = "True")
                    }
                    Button(onClick = {
                        val False = Intent(this@MainActivity5, MainActivity7::class.java)
                        startActivity(False)

                    }) {
                        Text(text = "False")
                    }
                }
            }
        }
    }
}


