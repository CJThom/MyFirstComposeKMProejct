package com.example.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import com.example.core.presentation.App
import com.example.core.presentation.MyFirstKMViewModel
import org.koin.androidx.compose.koinViewModel

//val androidModule = module {
//    single { MyFirstKMViewModel() }
//}


class MainActivity : AppCompatActivity() {

    // private val myFirstKMViewModel: MyFirstKMViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            MaterialTheme {

//                val myFirstKMViewModel = get<MyFirstKMViewModel>()
                //  val myFirstKMViewModel: MyFirstKMViewModel by viewModel()

                val myFirstKMViewModel: MyFirstKMViewModel = koinViewModel()

                val hockeyPlayerList = myFirstKMViewModel.hockeyPlayerListFlow.collectAsState(initial = emptyList()).value

                App(
                    modifier = Modifier,
                    hockeyPlayerList = hockeyPlayerList,
                    platform = myFirstKMViewModel.platform
                )
            }
        }
    }
}



//@Composable
//fun thing() {
//    val viewModel: MyFirstKMViewModel by viewModels()
//}

