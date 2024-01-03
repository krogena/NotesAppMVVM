package ru.iyshcherbakov.notesappmvvm.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ru.iyshcherbakov.notesappmvvm.ui.theme.NotesAppMVVMTheme

@Composable
fun AddScreen(navController: NavHostController) {
    var title by remember { mutableStateOf(TextFieldValue("")) }
    var subtitle by remember { mutableStateOf(TextFieldValue("")) }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(modifier = Modifier.padding(8.dp),
            text = "Add new note",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
        )
        OutlinedTextField(
            modifier = Modifier.padding(vertical = 5.dp),
            label = { Text(text = "Note title")},
            value = title,
            onValueChange = { title = it }
        )
        OutlinedTextField(
            label = { Text(text = "Note subtitle")},
            value = subtitle,
            onValueChange = { subtitle = it }
        )
        Button(modifier = Modifier
            .padding(top = 8.dp),
            onClick = {
            navController.navigate(route = "main_screen")
        }) {
            Text(text = "Add Note")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun prevAddScreen(){
    NotesAppMVVMTheme {
        AddScreen(navController = rememberNavController())
    }
}