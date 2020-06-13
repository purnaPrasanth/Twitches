package com.purnaprasanth.twitches

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.purnaprasanth.twitches.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private val binding: ActivityHomeBinding by lazy { ActivityHomeBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bottomNavigation.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home, R.id.bookmarks, R.id.profile -> {
                    binding.screenName.text = menuItem.title
                    true
                }
                else -> false
            }
        }
    }
}
