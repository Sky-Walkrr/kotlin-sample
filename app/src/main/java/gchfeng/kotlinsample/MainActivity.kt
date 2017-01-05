package gchfeng.kotlinsample

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        fabMain.setOnClickListener {
            toast(fabMain,"welcome to Kotlin~")
        }
        btnMain.setOnClickListener {
            val data1 = MainDto(1,"Value ",true)
            tvMain.text = data1.name + data1.id + data1.isPrimary
        }

        //Collections and string control character $
        for ((key,value) in mapOf("a" to "A","b" to "B")) {
            Log.d("tag","key:$key,value:$value")
        }

    }

    fun toast(view : View,text : String,length : Int = Snackbar.LENGTH_SHORT) : Unit {
    Snackbar.make(view,text,length).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
