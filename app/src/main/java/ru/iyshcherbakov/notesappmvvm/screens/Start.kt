package ru.iyshcherbakov.notesappmvvm.screens

import android.app.Application
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import ru.iyshcherbakov.notesappmvvm.MainViewModel
import ru.iyshcherbakov.notesappmvvm.MainViewModelFactory
import ru.iyshcherbakov.notesappmvvm.ui.theme.NotesAppMVVMTheme
import ru.iyshcherbakov.notesappmvvm.utils.TYPE_FIREBASE
import ru.iyshcherbakov.notesappmvvm.utils.TYPE_ROOM

@Composable
fun StartScreen(navController: NavHostController) {
        val context = LocalContext.current
        val mViewModel: MainViewModel =
                viewModel(factory = MainViewModelFactory(context.applicationContext as Application) )

        Column (
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
        ){
                Text(text = "What will you use")
                Button(
                        onClick = {
                                mViewModel.initDatabase(TYPE_ROOM)
                                navController.navigate(route = "main_screen")
                        },
                        modifier = Modifier
                                .width(203.dp)
                                .padding(vertical = 8.dp)
                ) {
                        Text(text = "Room database")
                }
                Button(
                        onClick = {
                                mViewModel.initDatabase(TYPE_FIREBASE)
                                navController.navigate(route = "main_screen")
                        },
                        modifier = Modifier
                                .width(203.dp)
                                .padding(vertical = 8.dp)
                ) {
                        Text(text = "Firebase database")
                }
        }
}

@Preview(showBackground = true)
@Composable
fun prevStartScreen(){
        NotesAppMVVMTheme {
                StartScreen(navController = rememberNavController())
        }
}