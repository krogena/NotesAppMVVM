package ru.iyshcherbakov.notesappmvvm.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.iyshcherbakov.notesappmvvm.screens.Add
import ru.iyshcherbakov.notesappmvvm.screens.Main
import ru.iyshcherbakov.notesappmvvm.screens.Note
import ru.iyshcherbakov.notesappmvvm.screens.Start

sealed class NavRoute(val route: String){
    object Start: NavRoute("start_screen")
    object Main: NavRoute("main_screen")
    object Add: NavRoute("add_screen")
    object Note: NavRoute("note_screen")
}

@Composable
fun NotesNavHost(paddingValues: PaddingValues) {
    val navController = rememberNavController()
Surface (
    modifier = Modifier.padding(top = paddingValues.calculateTopPadding())
){

    NavHost(navController = navController, startDestination = "start_screen") {
        composable("start_screen") { Start(navHostController = navController) }
        composable("main_screen") { Main(navHostController = navController) }
        composable("add_screen") { Add(navHostController = navController) }
        composable("note_screen") { Note(navHostController = navController) }
    }
}
}