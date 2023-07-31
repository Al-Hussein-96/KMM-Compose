package ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import getCurrentLocalization
import org.jetbrains.compose.resources.ExperimentalResourceApi
import theme.MyAppTheme
import theme.Typography
import ui.widgets.FeatureCard


@OptIn(ExperimentalMaterial3Api::class, ExperimentalResourceApi::class)
@Composable
fun HomeScreen() {
    MyAppTheme {



        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            Scaffold(
                topBar = {
                    CenterAlignedTopAppBar(
                        title = {
                            Text("Home Page", color = Color.White, style = Typography.titleLarge)
                        },
                    )
                },
            ) {
                Column(
                    modifier = Modifier.fillMaxSize().padding(32.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    val cardModifier: Modifier =  remember {
                        Modifier.weight(1f).aspectRatio(1.1f)
                    }
                    Row {
                        FeatureCard(
                            modifier = cardModifier,
                            getCurrentLocalization().bookStadium,
                            "icon_booking_stadium.xml"
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        FeatureCard(
                            modifier = cardModifier,
                            getCurrentLocalization().leagues,
                            "ic_matches.png"
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Row {
                        FeatureCard(
                            modifier = cardModifier,
                            getCurrentLocalization().officials,
                            "ic_stadium_icon.xml"
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        FeatureCard(
                            modifier = cardModifier,
                            getCurrentLocalization().posts,
                            "ic_tournaments.xml"
                        )
                    }
                }

            }
        }

    }
}


