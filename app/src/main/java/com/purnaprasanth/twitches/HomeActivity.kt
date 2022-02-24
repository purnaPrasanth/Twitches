package com.purnaprasanth.twitches

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.purnaprasanth.twitches.baseandroid.theme.MyTypography
import com.purnaprasanth.twitches.baseandroid.theme.myDarkColors
import com.purnaprasanth.twitches.baseandroid.theme.myLightColors
import com.purnaprasanth.twitches.bottomnavigation.BottomNavigationItem
import com.purnaprasanth.twitches.bottomnavigation.MyBottomNavigation

class HomeActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme(
                typography = MyTypography,
                colors = if (isSystemInDarkTheme()) myDarkColors else myLightColors
            ) {
                val selectedScreen =
                    remember { mutableStateOf<BottomNavigationItem>(BottomNavigationItem.Home) }

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        MyBottomNavigation {
                            selectedScreen.value = it
                        }
                    }
                ) {
                    Text(
                        text = stringResource(id = selectedScreen.value.titleId),
                        style = MaterialTheme.typography.h5,
                        modifier = Modifier.fillMaxSize(),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}
