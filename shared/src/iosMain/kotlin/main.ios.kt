import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.platform.Typeface
import androidx.compose.ui.window.ComposeUIViewController
import org.jetbrains.skia.FontFamilyName
import org.jetbrains.skia.FontStyle
import org.jetbrains.skia.Typeface
import ui.HomeScreen

actual fun getPlatformName(): String = "iOS"

fun MainViewController() = ComposeUIViewController { HomeScreen() }

private fun loadCustomFont(name: String): Typeface {
    return Typeface.makeFromName(name, FontStyle.NORMAL)
}

actual val ococFont: FontFamily = FontFamily(
    Typeface(loadCustomFont("righteous"))
)

