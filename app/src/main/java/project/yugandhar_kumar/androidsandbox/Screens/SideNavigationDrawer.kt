package project.yugandhar_kumar.androidsandbox.Screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import kotlinx.coroutines.launch
import project.yugandhar_kumar.androidsandbox.Screens.Comps.CustomTopAppBar

@Composable
fun SideNavigationDrawerScreen(navController: NavHostController) {
    val drawerState = rememberDrawerState(initialValue = androidx.compose.material3.DrawerValue.Closed)
    val coroutineScope = rememberCoroutineScope()

    ModalNavigationDrawer(
        modifier = Modifier.fillMaxSize(),
        drawerState = drawerState,
        drawerContent = {
            Column(modifier = Modifier.padding(top = 200.dp)) {
                NavigationDrawerItem(
                    label = { Text("Home") },
                    selected = false,
                    modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding),
                    onClick = { }
                )
                Spacer(modifier = Modifier.height(16.dp))
                NavigationDrawerItem(
                    label = { Text("Settings") },
                    selected = false,
                    modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding),
                    onClick = { }
                )
                Spacer(modifier = Modifier.height(16.dp))
                NavigationDrawerItem(
                    label = { Text("Profile") },
                    selected = false,
                    modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding),
                    onClick = { }
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    ) {
        Scaffold(
            topBar = {
                CustomTopAppBar(navController, "Side Navigation Drawer")
            }
        ) { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = paddingValues.calculateTopPadding() + 50.dp, start = 16.dp)
            ) {
                Text(
                    "Side Navigation Drawer Example",
                    modifier = Modifier.align(Alignment.Center)
                )
                IconButton(
                    onClick = {
                        coroutineScope.launch {
                            drawerState.open()
                        }
                    },
                    modifier = Modifier.align(Alignment.TopStart)
                ) {
                    Icon(Icons.Default.Menu, contentDescription = "Menu")
                }
            }
        }
    }
}
