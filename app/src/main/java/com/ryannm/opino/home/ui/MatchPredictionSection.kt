package com.ryannm.opino.home.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ryannm.opino.core.ui.design_system.BigNoButton
import com.ryannm.opino.core.ui.design_system.BigYesButton
import com.ryannm.opino.core.ui.design_system.Card

fun LazyListScope.matchPredictionSection() {
    val predictions = listOf(1,2,3)
    items(predictions.size) { _ ->
        SingleMatchPredictionCard()
    }
}

@Composable
fun SingleMatchPredictionCard() {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Title Text
                Text(
                    text = "Kolkata to win the match vs Mumbai?",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    maxLines = 2
                )
                Spacer(modifier = Modifier.width(4.dp))

                // Logo Image
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = "IPL",
                    tint = Color.Yellow,
                    modifier = Modifier.size(40.dp)
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            // Subtitle Text
            Text(
                text = "H2H last 5 T20: Kolkata 4, Mumbai 1, DRAW 0",
                color = Color.White,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            // Yes/No Buttons
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                BigYesButton ("Yes ₹ 5.3") {

                }
                BigNoButton ("No ₹ 4.7") {

                }
            }
        }
    }
}

@Composable
@Preview
private fun preview() {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)) {
        SingleMatchPredictionCard()
    }
}
