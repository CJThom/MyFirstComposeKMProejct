package com.example.common

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.Database
import com.example.common.sqldelight.database.HockeyPlayer
import com.example.common.widget.Item
import com.example.common.widget.VerticalScrollbar
import com.example.common.widget.rememberScrollbarAdapter

import org.koin.core.component.inject

@Composable
fun App(
    modifier: Modifier = Modifier,
    platform: Platform,
    hockeyPlayerList: List<HockeyPlayer>,

) {

    var isSearchVisible by remember { mutableStateOf(false) }
    //  val platformName = getPlatformName()
    val state = rememberLazyListState()

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = {
                   Text(platform.name)
                  //  Text("Thing")
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    isSearchVisible = !isSearchVisible
                }
            ) {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = null
                )
            }
        }
    ) { contentPadding ->

        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(contentPadding),
                state = state,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {


                items(hockeyPlayerList) { player ->
                    Item(
                        text = "${player.full_name}: ${player.player_number}",
                        modifier = Modifier.padding(8.dp)
                    )
                }

            }

            VerticalScrollbar(
                modifier = Modifier.align(Alignment.CenterEnd).fillMaxHeight(),
                adapter = rememberScrollbarAdapter(
                    scrollState = state
                )
            )
        }


    }

}
