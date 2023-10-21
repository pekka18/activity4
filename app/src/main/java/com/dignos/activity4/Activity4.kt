package com.dignos.activity4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dignos.activity4.databinding.Activity4Binding
import com.dignos.activity4.datastore.SharedPref

class Activity4 : AppCompatActivity() {
    private lateinit var binding: Activity4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPref = getSharedPreferences("", MODE_PRIVATE)
        val editor = sharedPref.edit()

        binding.apply {
            btnSave.setOnClickListener {
                val email = edtEmail.text.toString()
                val nickname = edtNickname.text.toString()

                editor.apply {
                    putString("Email", email)
                    putString("Nickname", nickname)

                }

                tvEmail.text = email
                tvNickname.text = nickname
            }
        }
        fun onResume() {
            super.onResume()
            val mail = sharedPref.getString("Email", null)
            val name = sharedPref.getString("Nickname", null)
            binding.tvEmail.text = mail
            binding.tvNickname.text = name
        }

    }


}