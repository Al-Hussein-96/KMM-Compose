package ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.TopAppBar
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
import ococFont
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import theme.DarkBlue
import theme.Green
import theme.MyAppTheme
import theme.Typography
import theme.darkGray
import ui.widgets.FeatureCard
import ui.widgets.SliderWidget


@OptIn(ExperimentalMaterial3Api::class, ExperimentalResourceApi::class)
@Composable
fun HomeScreen() {
    MyAppTheme {


        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
            Scaffold(
                modifier = Modifier,
                backgroundColor = darkGray,
                topBar = {
                    TopAppBar(
                        title = {
                            Text(
                                getCurrentLocalization().appName,
                                color = Color.White,
                                style = Typography.titleLarge,
                                fontFamily = ococFont
                            )
                        },
                        navigationIcon = {
                            Icon(
                                Icons.Default.Menu,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.padding(horizontal = 16.dp)
                            )
                        },
                        actions = {
                            Icon(
                                Icons.Default.Phone,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.padding(horizontal = 16.dp)
                            )
                            Icon(
                                painterResource("notifications_active.xml"),
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.padding(horizontal = 16.dp)
                            )
                        },
                    )
                },
                bottomBar = {
                    BottomNavigation(backgroundColor = Green, modifier = Modifier.height(60.dp)) {
                        BottomNavigationItem(
                            icon = {
                                Icon(
                                    painterResource("ic_stadiums.xml"),
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp)
                                )
                            },
                            onClick = {

                            },
                            selected = true,
                            label = {
                                Text(
                                    getCurrentLocalization().home,
                                    fontFamily = ococFont
                                )
                            },
                            selectedContentColor = Color.White,
                            unselectedContentColor = DarkBlue
                        )
                        BottomNavigationItem(icon = {
                            Icon(
                                painterResource("ic_teams.png"),
                                contentDescription = null,
                                modifier = Modifier.size(24.dp)
                            )
                        }, onClick = {

                        }, selected = false, label = {
                            Text(
                                getCurrentLocalization().myTeams,
                                fontFamily = ococFont,

                                )
                        },
                            selectedContentColor = Color.White,
                            unselectedContentColor = DarkBlue
                        )
                        BottomNavigationItem(icon = {
                            Icon(
                                painterResource("ic_stadiums.xml"),
                                contentDescription = null,
                                modifier = Modifier.size(24.dp)

                            )
                        }, onClick = {

                        }, selected = false, label = {
                            Text(
                                getCurrentLocalization().stadiums,
                                fontFamily = ococFont,

                                )
                        },
                            selectedContentColor = Color.White,
                            unselectedContentColor = DarkBlue
                        )
                    }
                }
            ) {
                Column {
                    SliderWidget(emptyList())
                    Column(
                        modifier = Modifier.fillMaxSize()
                            .padding(vertical = 8.dp, horizontal = 32.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        val cardModifier: Modifier = remember {
                            Modifier.weight(1f).aspectRatio(1.1f)
                        }


                        Spacer(modifier = Modifier.height(16.dp))

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
                                "ic_tournaments.xml"
                            )
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Row {
                            FeatureCard(
                                modifier = cardModifier,
                                getCurrentLocalization().officials,
                                "ic_matches.png"
                            )
                            Spacer(modifier = Modifier.width(16.dp))
                            FeatureCard(
                                modifier = cardModifier,
                                getCurrentLocalization().posts,
                                "ic_stadium_icon.xml"
                            )
                        }
                    }
                }

            }
        }

    }
}


