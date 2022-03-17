package com.purnaprasanth.twitches.bottomnavigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

@Composable
fun MyBottomNavigation(
    listOfItems: List<BottomNavigationItem> = listOfBottomNavigationItems,
    onNavigationSelected: (BottomNavigationItem) -> Unit
): Unit {
    BottomNavigation {
        val selected = remember {
            mutableStateOf<BottomNavigationItem>(BottomNavigationItem.Home)
        }

        listOfItems.forEach { navigationItem ->
            BottomNavigationItem(
                selected = selected.value == navigationItem,
                alwaysShowLabel = false,
                onClick = {
                    selected.value = navigationItem
                    onNavigationSelected(navigationItem)
                },
                icon = {
                    Icon(
                        painter = painterResource(id = navigationItem.iconId),
                        contentDescription = "Bottom navigation home"
                    )
                },
                label = { Text(stringResource(id = navigationItem.titleId)) }
            )
        }
    }
}
