package kutalekjk.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btn_start)
        val etName : EditText = findViewById(R.id.et_name)

        btnStart.setOnClickListener {
            // Check if name was entered
            if (etName.text.isEmpty()) {
                Toast.makeText(this, "Please, enter Your name", Toast.LENGTH_LONG).show()
            }

            else {
                // Move from this activity to the "Questions" activity
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                startActivity(intent)

                finish()
            }
        }
    }
}