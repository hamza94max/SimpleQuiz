package school.alihamz.assignment2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import school.alihamz.assignment2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val binding : ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)


    }
}