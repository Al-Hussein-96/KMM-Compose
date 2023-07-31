package ui.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import getCurrentLocalization
import ococFont
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import theme.DarkBlue
import theme.Green


@OptIn(ExperimentalMaterial3Api::class, ExperimentalResourceApi::class)
@Composable
fun FeatureCard(modifier: Modifier = Modifier,title: String,icon: String){
    Card(
        onClick = { /* Do something */ },
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = DarkBlue)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Icon(
                painter = painterResource(icon),
                contentDescription = icon,
                tint = Green,
                modifier = Modifier.fillMaxWidth().height(70.dp)
            )
            Text(text = title, color = Color.White, fontSize = 17.sp, fontFamily = ococFont)
        }
    }
}