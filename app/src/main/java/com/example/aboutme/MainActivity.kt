package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val myName: MyName = MyName("Joey")

   // lateinit var editText: EditText
   // lateinit var nicknameTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.myName = myName

        //findViewById<Button>(R.id.done_button).setOnClickListener {
          //  addNickname(it)
        //}
        binding.doneButton.setOnClickListener {
            addNickname(it)
        }

        //editText = findViewById(R.id.nickname_edit)
        //nicknameTextView = findViewById(R.id.nickname_text)
    }

    private fun addNickname(view: View) {
        binding.apply {
           // nicknameText.text = nicknameEdit.text
            myName?.nickname = nicknameEdit.text.toString()
            invalidateAll()
            nicknameEdit.visibility = View.GONE
            doneButton.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE
        }

       // nicknameTextView.text = editText.text
       // editText.visibility = View.GONE
       // view.visibility = View.GONE
       // nicknameTextView.visibility = View.VISIBLE
    }

    //hide the keyboard
    //val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//   inputMethodManager.hideSoftInputFromWindow(view.windowToken,0)



}
