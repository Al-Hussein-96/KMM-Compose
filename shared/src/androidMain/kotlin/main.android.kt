import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator

actual fun getPlatformName(): String = "Android"

@Composable fun MainView() = Navigator(HomeScreen)
