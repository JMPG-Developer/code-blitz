package es.jmpg.developer.codeblitz.app

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val btnOpenCamera = findViewById<Button>(R.id.btn_open_camera).setOnClickListener({
//            val intent = Intent(this, CameraActivity::class.java)
//            startActivity(intent)
        })

        val btnClose = findViewById<Button>(R.id.btn_close).setOnClickListener({
            finishAffinity();
        })
         */
    }

}