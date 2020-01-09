package com.purnaprasanth.twitches

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import io.reactivex.Observable
import okhttp3.OkHttpClient
import org.reactivestreams.Subscriber
import java.net.SocketTimeoutException
import java.util.concurrent.ExecutionException
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.stream.Stream

class HomeActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        textView = findViewById(R.id.text_view)
        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            textView.text = menuItem.title
            when (menuItem.itemId) {
                R.id.home, R.id.bookmarks, R.id.profile -> true
                else -> false

            }
        }
    }
}
