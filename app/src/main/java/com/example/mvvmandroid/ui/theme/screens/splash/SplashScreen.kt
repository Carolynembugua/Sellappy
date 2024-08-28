package com.example.mvvmandroid.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.mvvmandroid.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavController
import com.example.mvvmandroid.navigation.ROUT_DASHBOARD
import com.example.mvvmandroid.ui.theme.liter
import com.example.mvvmandroid.ui.theme.orange
import com.example.mvvmandroid.ui.theme.ory
import com.example.mvvmandroid.ui.theme.pastory
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()){

        //navigation FOR SPLASHSCREEN
        val coroutine = rememberCoroutineScope()
        coroutine.launch{
            delay(3000)
            navController.navigate(ROUT_DASHBOARD)

        }
        //END


        Card(modifier = Modifier
            .fillMaxWidth()
            .height(400.dp),
            shape = RoundedCornerShape(bottomStart = 50.dp, bottomEnd = 50.dp),
            colors = CardDefaults.cardColors(pastory)

        ){
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ){

                Image(
                    painter =painterResource(id = R.drawable.icon) ,
                    contentDescription ="product",
                    modifier = Modifier.size(200.dp)
                )
                Text(
                    text = "Welcome to SellAppy",
                    fontSize = 50.sp,
                    color = Color.White,
                    fontFamily = FontFamily.Cursive
                )
                Text(
                    text = " The home of fashion",
                    fontSize = 20.sp,
                    color = Color.White,
                )

            }

        }
        Spacer(modifier = Modifier.height(50.dp))


        Text(
            text = "E-commerce (electronic commerce) is the exchange of goods and services and the transmission of funds and data over the internet. ",
            fontSize = 20.sp,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))


        Button(
            onClick = {  },
            colors = ButtonDefaults.buttonColors(ory),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)

            ) {
            Text(text = "Continue")
        }

    }



}

@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())
}
