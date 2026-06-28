package com.abrar.labsapp.ui.codelabs


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abrar.labsapp.R
import com.abrar.labsapp.ui.theme.LabsAppTheme

@Composable
fun BusinessCardScreen(
    profileImage: Painter,
    profileName: String,
    jobTitle: String,
    phone: String,
    socialHandle: String,
    email: String,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(bottom = 30.dp)
    ) {
        Spacer(Modifier.weight(1f))
        CardHeader(profileImage, profileName, jobTitle)
        Spacer(Modifier.weight(1f))
        ContactInfoSection(phone, socialHandle, email)
    }
}

@Composable
fun CardHeader(profileImage: Painter, profileName: String, jobTitle: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = profileImage,
            contentDescription = null,
            Modifier
                .background(color = Color(0xFF073042))
                .height(120.dp)
                .width(120.dp)
        )
        Text(
            text = profileName,
            fontSize = 38.sp
        )
        Text(
            text = jobTitle,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF006D3B)
        )
    }
}

@Composable
fun ContactInfoSection(phone: String, socialHandle: String, email: String) {
    val businessCardIcon = Icons.Rounded
    Column {
        ContactRow(businessCardIcon.Phone, phone, Color(0xFF006D3B))
        ContactRow(businessCardIcon.Share, socialHandle, Color(0xFF006D3B))
        ContactRow(businessCardIcon.Email, email, Color(0xFF006D3B))
    }
}

@Composable
fun ContactRow(
    icon: ImageVector,
    text: String,
    tint: Color
) {
    Row(modifier = Modifier.padding(bottom = 10.dp)) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = tint
        )
        Text(
            text = text,
            Modifier.padding(start = 14.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardScreenPreview() {
    LabsAppTheme() {
        BusinessCardScreen(
            painterResource(R.drawable.android_logo),
            stringResource(R.string.profile_name),
            stringResource(R.string.job_title),
            stringResource(R.string.phone_number),
            stringResource(R.string.social_handle),
            stringResource(R.string.email_address),
            modifier = Modifier.fillMaxSize().background(Color(0xFFD2E8D4))
        )
    }
}