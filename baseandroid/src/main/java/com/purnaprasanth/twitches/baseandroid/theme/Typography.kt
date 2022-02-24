package com.purnaprasanth.twitches.baseandroid.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.purnaprasanth.twitches.baseandroid.R

val QuickSand = FontFamily(
    Font(R.font.quicksand_light, FontWeight.Light),
    Font(R.font.quicksand_regular, FontWeight.Normal),
    Font(R.font.quicksand_medium, FontWeight.Medium),
    Font(R.font.quicksand_bold, FontWeight.Bold)
)

private val defaultTypography = Typography()

val MyTypography = Typography(
    defaultFontFamily = QuickSand,
    h6 = defaultTypography.h6.copy(fontWeight = FontWeight.Bold),
    h5 = defaultTypography.h5.copy(fontWeight = FontWeight.Medium),
    h4 = defaultTypography.h4.copy(fontWeight = FontWeight.Medium),
    body1 = defaultTypography.body1.copy(fontWeight = FontWeight.Medium),
    body2 = defaultTypography.body2.copy(fontWeight = FontWeight.Medium),
    button = defaultTypography.button.copy(fontWeight = FontWeight.Bold),
    subtitle1 = defaultTypography.subtitle1.copy(fontWeight = FontWeight.Medium),
    subtitle2 = defaultTypography.subtitle2.copy(fontWeight = FontWeight.Bold),
    caption = defaultTypography.caption.copy(fontWeight = FontWeight.Bold),
    overline = defaultTypography.overline.copy(fontWeight = FontWeight.Medium)
)