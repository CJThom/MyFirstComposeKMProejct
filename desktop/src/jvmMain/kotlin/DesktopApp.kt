//import androidx.compose.foundation.*
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.rememberLazyListState
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.*
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.outlined.Search
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.shadow
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.unit.DpOffset
//import androidx.compose.ui.unit.dp
//import com.example.common.getPlatformName
//import com.example.common.widget.Item
//
//@OptIn(ExperimentalFoundationApi::class)
//@Composable
//fun App(
//    modifier: Modifier = Modifier
//) {
//    var isSearchVisible by remember { mutableStateOf(false) }
//    var textContent by remember { mutableStateOf("") }
//    var text by remember { mutableStateOf("Hello, World!") }
//    val platformName = getPlatformName()
//    val state = rememberLazyListState()
//
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = {
//                    Text(platformName)
//                }
//            )
//        },
//        floatingActionButton = {
//            FloatingActionButton(
//                onClick = {
//                    isSearchVisible = !isSearchVisible
//                }
//            ) {
//                Icon(
//                    imageVector = Icons.Outlined.Search,
//                    contentDescription = null
//                )
//            }
//        }
//    ) { contentPadding ->
//        Box(
//            modifier = Modifier.fillMaxSize()
//        ) {
//            LazyColumn(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(contentPadding)
//                    .padding(horizontal = 16.dp),
//                state = state,
//                verticalArrangement = Arrangement.spacedBy(8.dp)
//            ) {
//
//                items(100) {
//                    val text = "Item: $it"
//                    TooltipArea(
//                        tooltip = {
//                            // composable tooltip content
//                            Surface(
//                                modifier = Modifier.shadow(4.dp),
//                                color = Color(255, 255, 210),
//                                shape = RoundedCornerShape(4.dp)
//                            ) {
//                                Text(
//                                    text = "Tooltip for $text",
//                                    modifier = Modifier.padding(10.dp)
//                                )
//                            }
//                        },
//                        modifier = Modifier.padding(start = 40.dp),
//                        delayMillis = 600, // in milliseconds
//                        tooltipPlacement = TooltipPlacement.CursorPoint(
//                            alignment = Alignment.BottomEnd,
//                            offset = if (it % 2 == 0) DpOffset((-16).dp, 0.dp) else DpOffset.Zero // tooltip offset
//                        )
//                    ) {
//                        Item(text = text)
//                    }
//                }
//            }
//            VerticalScrollbar(
//                modifier = Modifier.align(Alignment.CenterEnd).fillMaxHeight(),
//                adapter = rememberScrollbarAdapter(
//                    scrollState = state
//                )
//            )
//        }
//
//
//    }
//
//}
