package com.umutakpinar.kotlinnullabilitydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.umutakpinar.kotlinnullabilitydemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        val view = binding.root;
        setContentView(view);

    }

    override fun onStart() {
        super.onStart()

        binding.button.setOnClickListener {
            run {
                val nameInput = binding.editTextName.text.toString();
                val ageInput = binding.editTextAge.text.toString().toIntOrNull();
                val jobInput = binding.editTextAge.text.toString();
                val person = Person(nameInput,ageInput,jobInput)

                if(ageInput == null || nameInput == "" || jobInput == ""){
                    Toast.makeText(this@MainActivity,"Please fill the lines",Toast.LENGTH_LONG).show();
                }else{
                    binding.textView.text = "Name : ${person.getName()}, Age: ${person.getAge()}, Job: ${person.getJob()}";
                }
            }
        }
    }
}