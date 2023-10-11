package org.freedu.studentmanagementadmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.freedu.studentmanagementadmin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.addBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, AddActivity::class.java))
            finish()
        }
        binding.updateBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, UpdateActivity::class.java))
            finish()
        }
        binding.deleteBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, DeleteActivity::class.java))
            finish()
        }
    }
}