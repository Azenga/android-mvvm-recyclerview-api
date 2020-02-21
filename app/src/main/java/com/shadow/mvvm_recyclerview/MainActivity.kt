package com.shadow.mvvm_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.shadow.mvvm_recyclerview.data.PropertiesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = PropertiesRepository(PropertiesApi())


        GlobalScope.launch(Dispatchers.Main) {
            val properties = repository.getProperties()
            Toast.makeText(this@MainActivity, properties.toString(), Toast.LENGTH_LONG).show()
            Log.d("MainActivity", "onCreate: " + properties[0].name)

        }
    }
}
