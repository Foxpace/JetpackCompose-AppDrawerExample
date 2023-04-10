package com.tomasrepcik.appdrawer.app.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = ColorWhiteCultured,
    secondary = ColorBlueIceberg,
    tertiary = ColorRedFleryRose,
    background = ColorBlack,
    surface = ColorBlack,
    onPrimary = ColorChineseBlack,
    onSecondary = ColorWhiteCultured,
    onTertiary = ColorWhiteCultured,
    onBackground = ColorWhiteCultured,
    onSurface = ColorChineseBlack,
    surfaceTint = ColorWhiteCultured
)

private val LightColorScheme = lightColorScheme(
    primary = ColorWhiteCultured,
    secondary = ColorBlueIceberg,
    tertiary = ColorRedFleryRose,
    background = ColorBlueIceberg,
    surface = ColorBlueIceberg,
    onPrimary = ColorChineseBlack,
    onSecondary = ColorWhiteCultured,
    onTertiary = ColorWhiteCultured,
    onBackground = ColorWhiteCultured,
    onSurface = ColorWhiteCultured,
    surfaceTint = ColorBlack
)

@Composable
fun AppDrawerExampleTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        val currentWindow = (view.context as? Activity)?.window
            ?: throw Exception("Not in an activity - unable to get Window reference")

        SideEffect {
            (view.context as Activity).window.statusBarColor = colorScheme.background.toArgb()
            (view.context as Activity).window.navigationBarColor = colorScheme.background.toArgb()
            WindowCompat.getInsetsController(currentWindow, view).isAppearanceLightStatusBars = false
        }
    }

    MaterialTheme(
        colorScheme = colorScheme, typography = customTypography, content = content
    )
}