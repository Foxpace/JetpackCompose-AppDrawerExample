package com.tomasrepcik.appdrawer.app.ui.previews

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

@Preview(device = "id:pixel_5", name = "Pixel 5")
@Preview(device = "id:pixel", name = "Pixel")
annotation class BrightScreens

@Preview(device = "id:pixel_5", uiMode = Configuration.UI_MODE_NIGHT_YES, name = "Pixel 5 - Dark")
@Preview(device = "id:pixel", uiMode = Configuration.UI_MODE_NIGHT_YES, name = "Pixel - Dark")
annotation class DarkScreens

@BrightScreens
@DarkScreens
annotation class AllScreenPreview

