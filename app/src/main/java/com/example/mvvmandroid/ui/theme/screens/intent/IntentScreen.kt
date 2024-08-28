package com.example.mvvmandroid.ui.theme.screens.home

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
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
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmandroid.R
import com.example.mvvmandroid.ui.theme.pastorange
import com.example.mvvmandroid.ui.theme.pastory

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController:NavHostController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val mcontext = LocalContext.current

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
            topBar = {
                TopAppBar(
                    title = {Text(text = "Intent")},
                    colors = TopAppBarDefaults.mediumTopAppBarColors(pastorange),
                    navigationIcon = {  //FOR THE BUTTONS TO BE AT THE START
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "menu" , tint = Color.White)
                        }
                    },
                    actions = { //FOR THE BUTTONS TO BE AT THE END
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(imageVector = Icons.Default.Notifications, contentDescription = "menu" , tint = Color.White)
                        }

                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "shopping" , tint = Color.White)

                        }
                    }


                    )
            },


            floatingActionButton = {
                FloatingActionButton( //the plus floating
                    onClick = { /*TODO*/ },
                    containerColor = pastorange) {
                    IconButton(onClick = {
                    }) {
                        Icon(imageVector = Icons.Default.Add,
                            contentDescription = "menu")
                    }
                }
            },
            //Content Section - the white space
            content = @Composable {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Spacer(modifier = Modifier.height(80.dp))

                    Text(
                        text = "More products",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(10.dp))


                    //Body of the screen
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
                    Spacer(modifier = Modifier.height(10.dp))


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
                    Spacer(modifier = Modifier.width(10.dp))
                    //mpesa
                    Button(
                        onClick = { mcontext.startActivity(Intent(mcontext.packageManager.getLaunchIntentForPackage("com.android.stk")))},
                        colors = ButtonDefaults.buttonColors(pastorange),
                        shape = RoundedCornerShape(10.dp),

                        ) {
                        Text(text = "Mpesa")
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    //email
                    Button(
                        onClick = { mcontext.startActivity(Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "akinyiglory2@gmail.com", null))) },
                        colors = ButtonDefaults.buttonColors(pastorange),
                        shape = RoundedCornerShape(10.dp),

                        ) {
                        Text(text = "Email")
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    //camera
                    Button(
                        onClick = {  },
                        colors = ButtonDefaults.buttonColors(pastorange),
                        shape = RoundedCornerShape(10.dp),

                        ) {
                        Text(text = "Camera")
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    //call
                    Button(
                        onClick = { mcontext.startActivity(Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", , null))) },
                        colors = ButtonDefaults.buttonColors(pastorange),
                        shape = RoundedCornerShape(10.dp),

                        ) {
                        Text(text = "Call")
                    }
                    Spacer(modifier = Modifier.width(10.dp))


                    //sms
                    Button(
                        onClick = {  },
                        colors = ButtonDefaults.buttonColors(pastorange),
                        shape = RoundedCornerShape(10.dp),

                        ) {
                        Text(text = "Sms")
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    //share
                    Button(
                        onClick = {  },
                        colors = ButtonDefaults.buttonColors(pastorange),
                        shape = RoundedCornerShape(10.dp),

                        ) {
                        Text(text = "Share")
                    }


                }


        )

    }
}



val bottomNavItems = listOf( //the icons
    BottomNavItem(
        title = "Home",
        route="home",//parse the route value
        selectedIcon=Icons.Filled.Home,
        unselectedIcon=Icons.Outlined.Home,
        hasNews = false,
        badges=0 //changes the amount of notifs
    ),



    BottomNavItem(
        title = "Upload",
        route="details",
        selectedIcon=Icons.Filled.Add,
        unselectedIcon=Icons.Outlined.Add,
        hasNews = true,
        badges=0
    ),

    BottomNavItem(
        title = "View",
        route="dashboard",
        selectedIcon=Icons.Filled.Info,
        unselectedIcon=Icons.Outlined.Info,
        hasNews = true,
        badges=1
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