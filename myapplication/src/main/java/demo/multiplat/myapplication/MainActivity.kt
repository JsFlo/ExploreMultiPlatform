package demo.multiplat.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import demo.multiplat.commonSharedCode
import demo.multiplat.getPlatform
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        my_text_view.text = commonSharedCode(getPlatform())
    }
}
