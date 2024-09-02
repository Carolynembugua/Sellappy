package com.example.mvvmandroid.ui.theme.screens.intent

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmandroid.R
import com.example.mvvmandroid.ui.theme.orange
import com.example.mvvmandroid.ui.theme.pastorange


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController:NavHostController){
    val mContext = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
        ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }

        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar (
                    containerColor = pastorange,
                    contentColor = Color.Black){
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge (containerColor = Color.White){
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(imageVector =
                                    if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title)
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            }
                        )
                    }
                }
            },


            floatingActionButton = {
                FloatingActionButton(
                    onClick = { /*TODO*/ },
                    containerColor = pastorange) {
                    IconButton(onClick = {
                    }) {
                        Icon(imageVector = Icons.Default.Add,
                            contentDescription = "menu")
                    }
                }
            },
            //Content Section
            content = @Composable{
                Column( modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){// body of the screen

                }

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


                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    //Body of the screen

                    //row
                    Row {
                        Spacer(modifier = Modifier.size(10.dp))
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
                        Spacer(modifier = Modifier.size(10.dp))
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
                        Spacer(modifier = Modifier.size(10.dp))
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
                        Spacer(modifier = Modifier.size(10.dp))
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

                    }
                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "More products",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )



                    //mpesa
                    Spacer(modifier = Modifier.height(10.dp))
                    Button(onClick = {
                        val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                    },
                        colors = ButtonDefaults.buttonColors(orange),
                        shape = RoundedCornerShape(10.dp),

                        ) {
                        Text(text = "Mpesa")
                    }


                    //sms
                    Spacer(modifier = Modifier.height(10.dp))
                    Button(onClick = {
                        val smsIntent=Intent(Intent.ACTION_SENDTO)
                        smsIntent.data="smsto:0720245837".toUri()
                        smsIntent.putExtra("sms_body","Hello Glory,how was your day?")
                        mContext.startActivity(smsIntent)
                    },
                        colors = ButtonDefaults.buttonColors(orange),
                        shape = RoundedCornerShape(10.dp),

                        ) {
                        Text(text = "Sms")
                    }
                    //call
                    Spacer(modifier = Modifier.height(10.dp))
                    Button(onClick = {
                        val callIntent=Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:0705562115".toUri()
                        mContext.startActivity(callIntent)
                    },
                        colors = ButtonDefaults.buttonColors(orange),
                        shape = RoundedCornerShape(10.dp),

                        ) {
                        Text(text = "Call")
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    //email
                    Button(onClick = {
                        val shareIntent = Intent(Intent.ACTION_SEND)
                        shareIntent.type = "text/plain"
                        shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                        shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                        mContext.startActivity(shareIntent)
                    },
                        colors = ButtonDefaults.buttonColors(orange),
                        shape = RoundedCornerShape(10.dp),

                        ) {
                        Text(text = "Email")
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    //share

                    Button(onClick = {
                        val shareIntent=Intent(Intent.ACTION_SEND)
                        shareIntent.type="text/plain"
                        shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                        mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
                    },
                        colors = ButtonDefaults.buttonColors(orange),
                        shape = RoundedCornerShape(10.dp),

                        ) {
                        Text(text = " Share")
                    }

                    //camera
                    Spacer(modifier = Modifier.height(10.dp))
                    Button(onClick = {
                        val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                        if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                            mContext.startActivity(cameraIntent)
                        }else{
                            println("Camera app is not available")
                        }
                    },
                        colors = ButtonDefaults.buttonColors(orange),
                        shape = RoundedCornerShape(10.dp),

                        ) {
                        Text(text = "Camera")
                    }
                    Spacer(modifier = Modifier.height(10.dp))








                }

            }

        )

    }




val bottomNavItems = listOf(
    BottomNavItem(
        title = "Home",
        route="home",
        selectedIcon=Icons.Filled.Home,
        unselectedIcon=Icons.Outlined.Home,
        hasNews = false,
        badges=0
    ),



    BottomNavItem(
        title = "Upload",
        route="add_products",
        selectedIcon=Icons.Filled.Add,
        unselectedIcon=Icons.Outlined.Add,
        hasNews = true,
        badges=0
    ),

    BottomNavItem(
        title = "View",
        route="view_products",
        selectedIcon=Icons.Filled.Check,
        unselectedIcon=Icons.Outlined.Check,
        hasNews = true,
        badges=1
    ),

    BottomNavItem(
        title = "Dashboard",
        route="dashboard",
        selectedIcon=Icons.Filled.Info,
        unselectedIcon=Icons.Outlined.Info,
        hasNews = false,
        badges=0
    ),



    )



data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon :ImageVector,
    val hasNews :Boolean,
    val badges :Int
)



@Composable
@Preview(showBackground = true)
fun IntentScreenPreview(){

    IntentScreen(navController = rememberNavController())

}