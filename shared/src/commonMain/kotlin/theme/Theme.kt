package theme


import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun MyAppTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        typography = Typography,
        // For shapes, we generally recommend using the default Material Wear shapes which are
        // optimized for round and non-round devices.
        content = content,
        colorScheme = colorPlates,
    )
}