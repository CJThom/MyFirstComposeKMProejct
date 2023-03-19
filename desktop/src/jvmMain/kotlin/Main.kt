import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.window.WindowDraggableArea
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*
import com.example.core.presentation.App
import com.example.core.presentation.MyFirstKMViewModel
import di.Helper
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject


fun main() = application {
    val applicationState = remember { MyApplicationState() }

    Helper().initKoin()

    for (window in applicationState.windows) {
        MyWindow(
            window
        )
    }

}

@Composable
private fun WindowScope.AppWindowTitleBar() = WindowDraggableArea {
    Box(Modifier.fillMaxWidth().height(48.dp).background(Color.DarkGray))
}

// Injection Boostrap di.Helper
class ViewModelHelper : KoinComponent {
    val viewModel: MyFirstKMViewModel by inject()
}

@Composable
private fun ApplicationScope.MyWindow(
    state: MyWindowState
) {

    var isAskingToClose by remember { mutableStateOf(false) }

    Window(
        onCloseRequest = { isAskingToClose = true },
        title = state.title,
        undecorated = true
    ) {
        Column {

            AppWindowTitleBar()

            val myFirstKMViewModel: MyFirstKMViewModel = ViewModelHelper().viewModel

//            App(
//                modifier = Modifier,
//                platform = ViewModelHelper().platform,
//                hockeyPlayerList = emptyList()
//            )
            App(
                modifier = Modifier,
                platform = myFirstKMViewModel.platform,
                hockeyPlayerList = myFirstKMViewModel.hockeyPlayerList
            )
            Box(Modifier.size(200.dp).background(Color.DarkGray))

            if (isAskingToClose) {
                Dialog(
                    onCloseRequest = { isAskingToClose = false },
                    title = "Close the document without saving?",
                ) {
                    Button(
                        onClick = state::close
                    ) {
                        Text("Yes")
                    }
                }
            }

            MenuBar {
                Menu("File") {
                    Item("New window", onClick = state.openNewWindow)
                    Item("Exit", onClick = state.exit)
                }
            }

        }
    }
}

private class MyApplicationState {
    val windows = mutableStateListOf<MyWindowState>()

    init {
        windows += MyWindowState("Initial window")
    }

    fun openNewWindow() {
        windows += MyWindowState("Window ${windows.size}")
    }

    fun exit() {
        windows.clear()
    }

    private fun MyWindowState(
        title: String
    ) = MyWindowState(
        title,
        openNewWindow = ::openNewWindow,
        exit = ::exit,
        windows::remove
    )
}

private class MyWindowState(
    val title: String,
    val openNewWindow: () -> Unit,
    val exit: () -> Unit,
    private val close: (MyWindowState) -> Unit
) {
    fun close() = close(this)
}

