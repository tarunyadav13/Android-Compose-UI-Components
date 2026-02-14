package com.example.mytestapp.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FundamentalScreen() {
    Scaffold(
        topBar = {
            AppTopBar()
        },
        floatingActionButton = {
            MultiFab()
        }
    ) { paddingValues ->
        LazyListContent(
            paddingValues = paddingValues

        )
    }
}
