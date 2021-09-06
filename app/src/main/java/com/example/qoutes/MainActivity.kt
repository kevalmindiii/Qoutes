package com.example.qoutes

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.qoutes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val qoutesList = ArrayList<String>()
    var index:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //Adding quotes in arraylist
        addQoutes()
        binding.quoteText.setText(qoutesList[0])
        binding.btnnext.setOnClickListener {
            next()
        }
        binding.btnprevios.setOnClickListener {
            previous()
        }
        binding.btnshare.setOnClickListener {
            onShare()
        }

    }
    fun addQoutes()
    {
        qoutesList.add("If one way be better than another, that you may be sure is natures way.")
        qoutesList.add("It is not in the stars to hold our destiny but in ourselves.")
        qoutesList.add("I will prepare and some day my chance will come.")
        qoutesList.add("Sometimes the cards we are dealt are not always fair. However you must keep smiling and moving on.")
        qoutesList.add("What we see depends mainly on what we look for.")
        qoutesList.add("If one way be better than another, that you may be sure is natures way.")
        qoutesList.add("It is not in the stars to hold our destiny but in ourselves.")
        qoutesList.add("If one way be better than another, that you may be sure is natures way.")
        qoutesList.add("It is not in the stars to hold our destiny but in ourselves.")
        qoutesList.add("I will prepare and some day my chance will come.")
        qoutesList.add("Sometimes the cards we are dealt are not always fair. However you must keep smiling and moving on.")
        qoutesList.add("What we see depends mainly on what we look for.")
        qoutesList.add("If one way be better than another, that you may be sure is natures way.")
        qoutesList.add("It is not in the stars to hold our destiny but in ourselves.")
        qoutesList.add("If one way be better than another, that you may be sure is natures way.")
        qoutesList.add("It is not in the stars to hold our destiny but in ourselves.")
        qoutesList.add("I will prepare and some day my chance will come.")
        qoutesList.add("Sometimes the cards we are dealt are not always fair. However you must keep smiling and moving on.")
        qoutesList.add("What we see depends mainly on what we look for.")
        qoutesList.add("If one way be better than another, that you may be sure is natures way.")
        qoutesList.add("It is not in the stars to hold our destiny but in ourselves.")
    }
fun next()
{
    if(index <qoutesList.size-1){
        index++
        binding.quoteText.setText(qoutesList[index])
    }
}
fun previous()
{
    if(index >0){
        index--
        binding.quoteText.setText(qoutesList[index])
    }
}
    fun onShare()
    {
        val str:String= binding.quoteText.text.toString()
        val intent = Intent(Intent.ACTION_SEND)
        intent.setType("text/plain")
        intent.putExtra(Intent.EXTRA_TEXT,str)
        startActivity(intent)
    }
}