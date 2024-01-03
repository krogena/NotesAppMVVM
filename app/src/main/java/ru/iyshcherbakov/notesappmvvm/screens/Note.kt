package ru.iyshcherbakov.notesappmvvm.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ru.iyshcherbakov.notesappmvvm.ui.theme.NotesAppMVVMTheme

@Composable
fun NoteScreen(navController: NavHostController) {
    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "title",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold)
                Text(text = "subtitle")
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun prevNoteScreen(){
    NotesAppMVVMTheme {
        NoteScreen(navController = rememberNavController())
    }
}