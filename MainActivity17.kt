package com.example.myfan

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myfan.ui.theme.MyFanTheme

private fun Unit.Builder(activity: MainActivity17) {
    TODO("Not yet implemented")
}

private fun Unit.setTitle(string: String) {}

private fun Unit.setMessage(string: String) {}

private fun Unit.setPositiveButton(string: String, function: Any) {}

class MainActivity17 : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

                fun main() {
                    // Parallel arrays: questions and corresponding answers
                    val questions = arrayOf(
                        "Was Barack Obama the First Black president of the United States",
                        "Cleopatra was a famous queen of the Ancient Egypt",
                        "The titanic sank in 1992 after hitting an iceberg",
                        "The berlin wall divided paris from 1961 to 1989",
                        "Apartheid in South Africa officially ended in 1994"
                    )

                    val answers = booleanArrayOf(
                        true,   //  Barack Obama was the First Black president of the United States
                        true,  // Cleopatra was a famous queen of the Ancient Egypt
                        true,   // The titanic did sink in 1992 after hitting an iceberg
                        false,  // The berlin wall divided east and west berlin from 1961 to 1989 not paris
                        true    // Apartheid in South Africa did officially end in 1994
                    )

                    // Initialize score counter
                    var score = 0



                    // Iterate through the 5 questions
                    for (i in questions.indices) {
                        println("Question ${i + 1}: ${questions[i]}")
                        print("Your answer: ")

                        val userInput = readLine()?.toBooleanStrictOrNull()

                        if (userInput == answers[i]) {
                            println("Correct!\n")
                            score++
                        } else {
                            println("Incorrect. The correct answer was ${answers[i]}.\n")
                        }
                    }

                    // Final score output
                    println("You got $score out of ${questions.size} correct.")

                }

            Button(onClick = {
                lateinit var exitButton: Button

                @SuppressLint("MissingSuperCall", "MissingInflatedId")
                fun onCreate(savedInstanceState: Bundle?) {
                    super.onCreate(savedInstanceState)
                    setContentView(R.layout.activity_main)

                    // Reference to the Exit button
                    exitButton = findViewById(R.id.exitButton)

                    // Set a click listener to exit the app
                    exitButton.setOnClickListener {
                        finishAffinity() // This will close the app completely
                    }
                }
                val Exit = Intent(this@MainActivity17, MainActivity::class.java)
                startActivity(Exit)
            }) {Text(text = "Exit")

            }

        }
    }
}










