package com.tomasrepcik.appdrawer.app.ui.components.appdrawer

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import com.tomasrepcik.appdrawer.DrawerParams
import com.tomasrepcik.appdrawer.MainNavOption
import com.tomasrepcik.appdrawer.app.ui.theme.AppDrawerExampleTheme

@Composable
fun <T> AppDrawerItem(item: AppDrawerItemInfo<T>, onClick: (options: T) -> Unit) =
    Surface(
        color = MaterialTheme.colorScheme.onPrimary,
        modifier = Modifier.width(200.dp).padding(16.dp),
        onClick = { onClick(item.drawerOption) },
        shape = RoundedCornerShape(50),
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(8.dp)
        ) {
            Icon(
                painter = painterResource(id = item.drawableId),
                contentDescription = stringResource(id = item.descriptionId),
                modifier = Modifier
                    .size(24.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = stringResource(id = item.title),
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center,
            )
        }
    }


class MainStateProvider : PreviewParameterProvider<AppDrawerItemInfo<MainNavOption>> {
    override val values = sequence {
        DrawerParams.drawerButtons.forEach { element ->
            yield(element)
        }
    }
}

@Preview
@Composable
fun AppDrawerItemPreview(@PreviewParameter(MainStateProvider::class) state: AppDrawerItemInfo<MainNavOption>) {
    AppDrawerExampleTheme {
        AppDrawerItem(item = state, onClick = {})
    }
}