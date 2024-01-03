package ru.iyshcherbakov.notesappmvvm.screens

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import ru.iyshcherbakov.notesappmvvm.ui.theme.NotesAppMVVMTheme

@Composable
fun StartScreen(navController: NavHostController) {
        Column (
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
        ){
                Text(text = "What will you use")
                Button(
                        onClick = {
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