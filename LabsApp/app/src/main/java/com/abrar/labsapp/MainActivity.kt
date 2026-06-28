package com.abrar.labsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.abrar.labsapp.ui.codelabs.BusinessCardScreen
import com.abrar.labsapp.ui.theme.LabsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LabsAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCardScreen(
                        painterResource(R.drawable.android_logo),
                        stringResource(R.string.profile_name),
                        stringResource(R.string.job_title),
                        stringResource(R.string.phone_number),
                        stringResource(R.string.social_handle),
                        stringResource(R.string.email_address),
                        modifier = Modifier
                            .background(Color(0xFFD2E8D4))
                            .fillMaxSize()
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}