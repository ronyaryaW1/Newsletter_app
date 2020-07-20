package com.example.newsletter.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.newsletter.R
import com.example.newsletter.entity.News
import com.example.newsletter.helper.NewsLetterDBHelper
import kotlinx.android.synthetic.main.activity_create_news.*

class CreateActivity : AppCompatActivity() {

    private val db = NewsLetterDBHelper(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_news)
        btn_insert.setOnClickListener{
            insertNews()
            Toast.makeText(this,"success", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@CreateActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }

    private fun insertNews(){
        val news = News(input_title.text.toString(),
                        input_body.text.toString(),
                        input_date.text.toString())
        db.insertNews(news)
    }
}

