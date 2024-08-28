package com.example.mvvmandroid.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmandroid.R
import com.example.mvvmandroid.navigation.ROUT_HOME
import com.example.mvvmandroid.navigation.ROUT_INTENT
import com.example.mvvmandroid.ui.theme.lit
import com.example.mvvmandroid.ui.theme.pastorange


@Composable
fun AboutScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(pastorange),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Spacer(modifier = Modifier.height(30.dp))
        Image(
            painter =painterResource(id = R.drawable.icon) ,
            contentDescription ="Icon",
            modifier = Modifier.size(100.dp)
        )
        Text(
            text = "Your Best Online Shop",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(30.dp))
        Column {
            Card(
                modifier = Modifier
                .fillMaxWidth()
                .height(700.dp),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                colors = CardDefaults.cardColors(lit)


            ){
                //row 1
                Row(modifier = Modifier.padding(20.dp)){
                    //card1
                    Card(
                        modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                            .clickable{
                                navController.navigate(ROUT_HOME)
                            }


                    ){

                        // put the image in a box in order to Align it at the center
                        Column {
                            Spacer(modifier = Modifier.height(30.dp))


                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){

                                Image(
                                    painter = painterResource(id = R.drawable.img),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )

                            }
                            Text(
                                text = "Home",
                                modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center,
                                //to center align a text
                                fontSize = 20.sp
                            )
                        }

                    }
                    //end card1
                    Spacer(modifier = Modifier.width(30.dp))//to separate both cards

                    //card 2
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)){

                        // put the image in a box in order to Align it at the center
                        Column {
                            Spacer(modifier = Modifier.height(30.dp))


                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){

                                Image(
                                    painter = painterResource(id = R.drawable.notif),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )

                            }
                            Text(
                                text = "Messages",
                                modifier = Modifier.fillMaxWidth()
                                , textAlign = TextAlign.Center, //to center align a text
                                fontSize = 20.sp
                            )
                        }

                    }


                    }
                //end of row1
                
                //row2
                Row(modifier = Modifier.padding(20.dp)){
                    //card1
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)){

                        // put the image in a box in order to Align it at the center
                        Column {
                            Spacer(modifier = Modifier.height(30.dp))


                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){

                                Image(
                                    painter = painterResource(id = R.drawable.profile),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )

                            }
                            Text(
                                text = "Profile",
                                modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center,
                                //to center align a text
                                fontSize = 20.sp
                            )
                        }

                    }
                    //end card1
                    Spacer(modifier = Modifier.width(30.dp))//to separate both cards

                    //card 2
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)){

                        // put the image in a box in order to Align it at the center
                        Column {
                            Spacer(modifier = Modifier.height(30.dp))


                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){

                                Image(
                                    painter = painterResource(id = R.drawable.settings),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )

                            }
                            Text(
                                text = "Settings",
                                modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, //to center align a text
                                fontSize = 20.sp
                            )
                        }

                    }


                }
                //end of row 2
                //row3
                Row(modifier = Modifier.padding(20.dp)){
                    //card1
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)){

                        // put the image in a box in order to Align it at the center
                        Column {
                            Spacer(modifier = Modifier.height(30.dp))


                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){

                                Image(
                                    painter = painterResource(id = R.drawable.img_1),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )

                            }
                            Text(
                                text = "Clothes",
                                modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center,
                                //to center align a text
                                fontSize = 20.sp
                            )
                        }

                    }
                    //end card1
                    Spacer(modifier = Modifier.width(30.dp))//to separate both cards

                    //card 2
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)){

                        // put the image in a box in order to Align it at the center
                        Column {
                            Spacer(modifier = Modifier.height(30.dp))


                            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){

                                Image(
                                    painter = painterResource(id = R.drawable.img),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )

                            }
                            Text(
                                text = "Intent",
                                modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, //to center align a text
                                fontSize = 20.sp
                            )
                        }

                    }


                }
                //end of row 3





                }


            }
        }

    }





@Composable
@Preview(showBackground = true)
fun AboutScreenPreview(){
    AboutScreen(rememberNavController())
}
