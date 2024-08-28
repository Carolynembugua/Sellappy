package com.example.mvvmandroid.ui.theme.screens.home


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mvvmandroid.R
import androidx.navigation.compose.rememberNavController
import com.example.mvvmandroid.navigation.ROUT_DETAILS
import com.example.mvvmandroid.ui.theme.orange
import com.example.mvvmandroid.ui.theme.pastorange

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(pastorange),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ){

        Image(
            painter =painterResource(id = R.drawable.icon) ,
            contentDescription ="Icon",
            modifier = Modifier.size(300.dp)
        )


        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "SellApy",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            color = orange
        )
        Spacer(modifier = Modifier.height(10.dp))


        Button(
            onClick = { navController.navigate(ROUT_DETAILS) },
            colors = ButtonDefaults.buttonColors(orange),
            shape = RoundedCornerShape(10.dp),


        ) {
           Text(text = "Continue")
        }







    }


}




@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){

    HomeScreen(navController = rememberNavController())

}