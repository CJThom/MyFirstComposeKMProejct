package com.example.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.common.App
import com.example.common.MyFirstKMViewModel
import org.koin.androidx.compose.koinViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

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

                App(
                    modifier = Modifier,
                    hockeyPlayerList = myFirstKMViewModel.hockeyPlayerList,
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

