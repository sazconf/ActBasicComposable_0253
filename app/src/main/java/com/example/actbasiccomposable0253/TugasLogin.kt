package com.example.actbasiccomposable0253

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.notasibalok),
            contentDescription = "Music notes",
            contentScale = ContentScale.Fit
        )
        Text(text = "My Music Login")
    }
}
