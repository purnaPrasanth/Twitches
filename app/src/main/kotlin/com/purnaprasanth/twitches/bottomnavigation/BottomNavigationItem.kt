package com.purnaprasanth.twitches.bottomnavigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.purnaprasanth.twitches.R

sealed class BottomNavigationItem(@StringRes val titleId: Int, @DrawableRes val iconId: Int) {
    object Home : BottomNavigationItem(R.string.home, R.drawable.ic_home_black_24dp)
    object Bookmark : BottomNavigationItem(R.string.bookmarks, R.drawable.ic_bookmark_black_24dp)
    object Profile : BottomNavigationItem(R.string.profile, R.drawable.ic_account_circle_black_24dp)
}

val listOfBottomNavigationItems =
    listOf(BottomNavigationItem.Home, BottomNavigationItem.Bookmark, BottomNavigationItem.Profile)
