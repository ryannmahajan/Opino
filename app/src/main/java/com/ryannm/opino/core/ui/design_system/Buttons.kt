package com.ryannm.opino.core.ui.design_system

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun IconButton(
    imageVector: ImageVector,
    text: String? = null,
    modifier: Modifier = Modifier,
    onClick:()->Unit
) {
    Column (
        modifier = modifier
    ) {
        OutlinedIconButton(onClick = onClick,
//            border = IconButtonDefaults.outlinedIconButtonBorder(true)
//                .copy(brush = SolidColor(Color.White), width = 2.dp)
                )
        {
            Icon(imageVector = imageVector,
                contentDescription = text,
                tint = Color.White,
                modifier = Modifier.size(24.dp))
        }
        text?.let {
            Text(it,
                color = Color.White)
        }
    }
}

@Composable
fun RowScope.BigYesButton(modifier: Modifier = Modifier, text: String = "No", onClick: () -> Unit) {
    BigButton(modifier, color = Color(39, 81, 200), text = text, onClick)
}

@Composable
fun RowScope.BigNoButton(modifier: Modifier = Modifier, text: String = "No", onClick: () -> Unit) {
    BigButton(modifier, color = Color(71, 194, 111), text = text, onClick)
}

@Composable
private fun RowScope.BigButton(modifier: Modifier = Modifier, color:Color, text: String, onClick: () -> Unit) {
    Button(
        shape = RoundedCornerShape(8.dp),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = color),
        modifier = modifier
            .weight(1f)
    ) {
        Text(text = text, color = Color.White)
    }
}