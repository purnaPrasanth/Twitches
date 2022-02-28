package com.purnaprasanth.twitches

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.lifecycle.ViewModelProvider
import com.purnaprasanth.twitches.baseandroid.LocalViewModelFactory
import com.purnaprasanth.twitches.baseandroid.theme.MyTypography
import com.purnaprasanth.twitches.baseandroid.theme.myDarkColors
import com.purnaprasanth.twitches.baseandroid.theme.myLightColors
import com.purnaprasanth.twitches.bottomnavigation.BottomNavigationItem
import com.purnaprasanth.twitches.bottomnavigation.MyBottomNavigation
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeActivity : ComponentActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CompositionLocalProvider(
                LocalViewModelFactory provides viewModelFactory
            ) {
                MaterialTheme(
                    typography = MyTypography,
                    colors = if (isSystemInDarkTheme()) myDarkColors else myLightColors
                ) {
                    val selectedScreen =
                        remember { mutableStateOf<BottomNavigationItem>(BottomNavigationItem.Home) }

                    Scaffold(
                        bottomBar = {
                            MyBottomNavigation {
                                selectedScreen.value = it
                            }
                        }
                    ) {
                        ConstraintLayout(
                            modifier = Modifier
                                .padding(it)
                                .fillMaxSize()
                        ) {
                            val (title) = createRefs()
                            Text(
                                text = stringResource(id = selectedScreen.value.titleId),
                                style = MaterialTheme.typography.h6,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .constrainAs(title) {
                                        top.linkTo(parent.top)
                                        bottom.linkTo(parent.bottom)
                                        start.linkTo(parent.start, margin = 16.dp)
                                        end.linkTo(parent.end, margin = 16.dp)
                                    },
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        }
    }
}
