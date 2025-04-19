package es.jmpg.developer.codeblitz.app.fragments;

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment
import es.jmpg.developer.codeblitz.app.R

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpenCamera = findViewById<Button>(R.id.btn_open_camera).setOnClickListener({
//            val intent = Intent(this, CameraActivity::class.java)
//            startActivity(intent)
        })

        val btnClose = findViewById<Button>(R.id.btn_close).setOnClickListener({
            finishAffinity();
        })
    }
     */

}