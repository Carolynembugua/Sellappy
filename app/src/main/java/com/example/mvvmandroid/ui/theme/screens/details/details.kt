package com.example.mvvmandroid.ui.theme.screens.details


import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmandroid.R
import com.example.mvvmandroid.ui.theme.pastorange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController){


    Column(modifier = Modifier.fillMaxSize()){

        //TopAppBar
        TopAppBar(
            title = { Text(text = "SellApy", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(pastorange),
            navigationIcon = {  //FOR THE BUTTONS TO BE AT THE START
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu" , tint = Color.White)
                }
            },
            actions = { //FOR THE BUTTONS TO BE AT THE END
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu" , tint = Color.White)
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "shopping" , tint = Color.White)

                }
            }
        )
        //End of TopAppBar

        Spacer(modifier = Modifier.size(10.dp))

        //Start of searchbar
        var search by remember { mutableStateOf("") }

        OutlinedTextField(
            value = search,
            onValueChange = {search = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search")},// FOR ICON TO BE AT BEGINNING
            placeholder = { Text(text = "Browse your product...")}
        )
        //End of searchbar

        Spacer(modifier = Modifier.size(10.dp))

        //Start of image
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(300.dp), contentAlignment = Alignment.Center){


            Image(
                painter = painterResource(id = R.drawable.clothes1),
                contentDescription = "",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "",
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(20.dp),
                tint = Color.White
            )

            Text(
                text = "Your best online shop",
                fontSize = 30.sp,
                color = Color.White,
                fontWeight = FontWeight.ExtraBold
            )
        }
        //End of image

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "More products",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.size(10.dp))

        //row1
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())){

            Spacer(modifier = Modifier.width(10.dp))

            //Card
            Card(modifier = Modifier
                .height(160.dp)
                .width(120.dp)) {

                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                    Image(
                        painter = painterResource(id = R.drawable.index),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
            }
            //End of card

            Spacer(modifier = Modifier.width(10.dp))

            //Card
            Card(modifier = Modifier
                .height(160.dp)
                .width(120.dp)) {

                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                    Image(
                        painter = painterResource(id = R.drawable.index),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
            }
            //End of card

            Spacer(modifier = Modifier.size(10.dp))

            //Card
            Card(modifier = Modifier
                .height(160.dp)
                .width(120.dp)) {

                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                    Image(
                        painter = painterResource(id = R.drawable.index),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
            }
            //End of card

            Spacer(modifier = Modifier.width(10.dp))

            //Card
            Card(modifier = Modifier
                .height(160.dp)
                .width(120.dp)) {

                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                    Image(
                        painter = painterResource(id = R.drawable.index),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
            }
            //End of card

            Spacer(modifier = Modifier.width(10.dp))

            //Card
            Card(modifier = Modifier
                .height(160.dp)
                .width(120.dp)) {

                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                    Image(
                        painter = painterResource(id = R.drawable.index),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
            }
            //End of card

            Spacer(modifier = Modifier.width(10.dp))

        }
        //End of row1
        Text(
            text = "Additional Information",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.width(10.dp))


        Row {


            Card(modifier = Modifier
                .height(160.dp)
                .width(200.dp)) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = R.drawable.index),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
            }


            Spacer(modifier = Modifier.width(20.dp))



            Column {
                Text(text = "Shop : Sellapy", fontSize = 20.sp)
                Text(text = "Brand : Fantasia", fontSize = 20.sp)
                Text(text = "Location : Westlands", fontSize = 20.sp)
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Call")
                }
            }






        }




    }



}

@Composable
@Preview(showBackground = true)
fun DetailsScreenPreview(){
    DetailsScreen(rememberNavController())
}