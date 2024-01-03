package ru.iyshcherbakov.notesappmvvm.screens


import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ru.iyshcherbakov.notesappmvvm.ui.theme.NotesAppMVVMTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navController.navigate(route = "add_screen")
                },

            ) {
                Icon(imageVector = Icons.Filled.Add,
                    contentDescription = "Add Icons",
                    tint = Color.White)
            }
        }
    ) {
        Column {
            NoteItem("Note1", "Subtitle for note 1", navController = navController)
            NoteItem("Note2", "Subtitle for note 2", navController = navController)
            NoteItem("Note3", "Subtitle for note 3", navController = navController)
            NoteItem("Note4", "Subtitle for note 4", navController = navController)
        }
    }
}


@Composable
fun NoteItem(title: String, subtitle: String, navController: NavHostController){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 24.dp)
            .clickable { navController.navigate(route = "note_screen") },
        elevation = CardDefaults.elevatedCardElevation(6.dp)
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = subtitle)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun prevMainScreen(){
    NotesAppMVVMTheme {
        MainScreen(navController = rememberNavController())
    }
}