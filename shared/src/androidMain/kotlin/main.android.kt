import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.myapplication.common.R
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import ui.HomeScreen

actual fun getPlatformName(): String = "Android"

@Composable fun MainView() = HomeScreen()


actual val ococFont : FontFamily = FontFamily(
    Font(R.font.cocon)
)