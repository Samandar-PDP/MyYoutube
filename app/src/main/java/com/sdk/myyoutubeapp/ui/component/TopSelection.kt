package com.sdk.myyoutubeapp.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopSelection(
    onClick: (String) -> Unit,
) {
    val selectedIndex = rememberSaveable { mutableStateOf(0) }
    val categoryList = listOf(
        "All",
        "Mixes",
        "Music",
        "Programming",
        "Graphic",
        "Football",
        "Family"
    )
    LazyRow(
        contentPadding = PaddingValues(start = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ){
        itemsIndexed(
            items = categoryList
        ) { index, item ->
            AssistChip(
                onClick = {
                    selectedIndex.value = index
                    onClick(item)
                },
                label = {
                    Text(text = item)
                },
                colors = AssistChipDefaults.assistChipColors(
                    containerColor = if (selectedIndex.value == index) Color.Black.copy(.9f) else Color.LightGray,
                    labelColor = if (selectedIndex.value == index) Color.White else Color.Black
                )
            )
        }
    }
}