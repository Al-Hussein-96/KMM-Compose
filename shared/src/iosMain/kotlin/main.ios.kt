import androidx.compose.ui.window.ComposeUIViewController
import cafe.adriel.voyager.navigator.Navigator

actual fun getPlatformName(): String = "iOS"

fun MainViewController() = ComposeUIViewController { Navigator(HomeScreen) }