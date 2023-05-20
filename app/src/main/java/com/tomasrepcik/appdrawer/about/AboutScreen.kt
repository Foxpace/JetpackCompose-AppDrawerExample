package com.tomasrepcik.appdrawer.about

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.tomasrepcik.appdrawer.app.ui.components.appbar.AppBar
import com.tomasrepcik.appdrawer.app.ui.previews.AllScreenPreview
import com.tomasrepcik.appdrawer.app.ui.theme.AppDrawerExampleTheme

@Composable
fun AboutScreen(drawerState: DrawerState) {
    Scaffold(
        topBar = { AppBar(drawerState = drawerState) }
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(it),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("About")
        }
    }
}

@AllScreenPreview
@Composable
fun AboutScreenPreview() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    AppDrawerExampleTheme {
        AboutScreen(drawerState)
    }
}