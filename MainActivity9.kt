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
import com.example.myfan.MainActivity7
import com.example.myfan.ui.theme.MyFanTheme

class MainActivity9 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                Image(
                    painter = painterResource(id = R.drawable.incorrect),
                    contentDescription = "vhvh"
                )

                Text(text = "Incorrect, The Titanic sank in 1912 after hitting an iceberg.")
                Button(onClick = {
                    val next = Intent(this@MainActivity9, MainActivity11::class.java)
                    startActivity(next)
                }) {
                    Text(text = "Next")
                }
            }
        }
    }
}
