package com.atasksolutions.myportfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSkills = findViewById<Button>(R.id.btSkills)
        val buttonEducation = findViewById<Button>(R.id.btEducation)
        val buttonWork = findViewById<Button>(R.id.btWork)
        val buttonAchievement = findViewById<Button>(R.id.btAchievement)
        val buttonCall = findViewById<Button>(R.id.btCall)
        val buttonSocial = findViewById<Button>(R.id.btSocial)

        buttonSkills.setOnClickListener {
            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }
        buttonEducation.setOnClickListener {
            intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }
        buttonWork.setOnClickListener {
            intent = Intent(this, WorkActivity::class.java)
            startActivity(intent)
        }
        buttonAchievement.setOnClickListener {
            intent = Intent(this, AchievementActivity::class.java)
            startActivity(intent)
        }
        buttonCall.setOnClickListener {
            intent = Intent(this, CallActivity::class.java)
            startActivity(intent)
        }
        buttonSocial.setOnClickListener {
            intent = Intent(this, SocialActivity::class.java)
            startActivity(intent)
        }
    }
}