package com.ryannm.opino.home.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ryannm.opino.R
import com.ryannm.opino.core.ui.design_system.Card

@Composable
fun PricesSection() {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        val titles = listOf("Bitcoin", "IPL", "Ethereum")
        items(titles.size) { i ->
            PriceCard(title = titles[i])
        }
    }
}


@Composable
private fun PriceCard(
    title:String,
    subtitle:String = "$548",
    priceChange:String? = "+0.23",
    imageVector: ImageVector = Icons.Default.Star
    ) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .size(180.dp, 99.dp)             // Adjust size as needed
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp, 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceBetween,
            ) {
                // Title Text
                Text(
                    text = title,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )

                Row (
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = subtitle,
                        color = Color.LightGray,
                        fontSize = 14.sp
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    priceChange?.let {
                        Text(
                            text = it,
                            color = Color(0xFF00C853), // Green color for positive change
                            fontSize = 14.sp
                        )
                    }
                }

            }
            // Icon on the right side
            Icon(
                painter = painterResource(R.drawable.bitcoin_icon),
                contentDescription = title,
                modifier = Modifier.size(40.dp),
                tint = Color.Unspecified
            )
        }
    }
}


@Composable
@Preview
private fun preview() {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)) {
        PricesSection()
    }
}