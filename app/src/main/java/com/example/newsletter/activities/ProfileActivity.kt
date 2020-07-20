package com.example.newsletter.activities

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.newsletter.R
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    private val PRIVATE_MODE = 0
    private val PREF_NAME = "bitlabs"
    var sharedPref : SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        sharedPref = this.getSharedPreferences(PREF_NAME,PRIVATE_MODE)
        user_profile_name.setText(sharedPref!!.getString("user-name", ""))
        user_profile_email.setText(sharedPref!!.getString("user-email", ""))
    }
}