import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import cafe.adriel.voyager.navigator.tab.TabOptions


object HomeScreen : Screen {
    @Composable
    override fun Content() {

        TabNavigator(HomeTab){ tabNavigator ->
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text(text = tabNavigator.current.options.title) }
                    )
                },
                content = {
                    CurrentTab()
                },
                bottomBar = {
                    BottomNavigation {
                        TabNavigationItem(HomeTab)
                        TabNavigationItem(FavoritesTab)
                        TabNavigationItem(ProfileTab)
                    }
                }
            )

        }

//
//        val navigator = LocalNavigator.currentOrThrow
//
//        MaterialTheme {
//            val greetingText by remember { mutableStateOf("Hello, World!") }
//            val showImage by remember { mutableStateOf(false) }
//
//            Scaffold(
//                topBar = {
//                    TopAppBar(
//                        title = {
//                            Text("Home Page")
//                        },
//                    )
//                },
//            ) {
//                Column(
//                    Modifier.padding(it).fillMaxWidth(),
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Button(onClick = {
//                        navigator.push(SecondScreen)
//
////                    greetingText = "Hello, ${getPlatformName()}"
////                    showImage = !showImage
//                    }) {
//                        Text(greetingText)
//                    }
//                    AnimatedVisibility(showImage) {
//                        Image(
//                            painterResource("compose-multiplatform.xml"),
//                            null
//                        )
//                    }
//                }
//            }
//
//
//        }

    }

}

@Composable
private fun RowScope.TabNavigationItem(tab: Tab) {
    val tabNavigator = LocalTabNavigator.current

    BottomNavigationItem(
        selected = tabNavigator.current == tab,
        onClick = { tabNavigator.current = tab },
        icon = { Icon(painter = tab.options.icon!!, contentDescription = tab.options.title) }
    )
}



object HomeTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val icon = rememberVectorPainter(Icons.Default.Home)

            return remember {
                TabOptions(
                    index = 0u,
                    title = "Home",
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        TabContent()
    }
}
object FavoritesTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val icon = rememberVectorPainter(Icons.Default.Home)

            return remember {
                TabOptions(
                    index = 1u,
                    title = "Favorites",
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        TabContent()
    }
}

object ProfileTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val icon = rememberVectorPainter(Icons.Default.Home)

            return remember {
                TabOptions(
                    index = 2u,
                    title = "Profile",
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        TabContent()
    }
}


expect fun getPlatformName(): String