package ru.iyshcherbakov.notesappmvvm.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import ru.iyshcherbakov.notesappmvvm.screens.AddScreen

import ru.iyshcherbakov.notesappmvvm.screens.MainScreen

import ru.iyshcherbakov.notesappmvvm.screens.NoteScreen

import ru.iyshcherbakov.notesappmvvm.screens.StartScreen

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
        composable("start_screen") { StartScreen(navController = navController) }
        composable("main_screen") { MainScreen(navController = navController) }
        composable("add_screen") { AddScreen(navController = navController) }
        composable("note_screen") { NoteScreen(navController = navController) }
    }
}
}