package com.tomasrepcik.appdrawer.intro.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.tomasrepcik.appdrawer.app.ui.previews.AllScreenPreview
import com.tomasrepcik.appdrawer.app.ui.theme.AppDrawerExampleTheme
import com.tomasrepcik.appdrawer.intro.IntroNavOption


@Composable
fun MotivationScreen(navController: NavController) = IntroCompose(
    navController = navController,
    text = "Motivation"
) {
    navController.navigate(IntroNavOption.RecommendationScreen.name)
}

@AllScreenPreview
@Composable
fun MotivationPrivacyPreview() {
    val navController = rememberNavController()
    AppDrawerExampleTheme {
        MotivationScreen(navController = navController)
    }
}

