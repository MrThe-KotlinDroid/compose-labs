package com.abrar.labsapp.ui.codelabs

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abrar.labsapp.R
import com.abrar.labsapp.ui.theme.LabsAppTheme

@Composable
fun TaskManager(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(
            painter = image,
            contentDescription = null,
        )
        Text(
            text = stringResource(R.string.task_completed_status),
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp)
            ,
        )
        Text(
            text = stringResource(R.string.task_completed_feedback),
            fontSize = 16.sp,
        )
    }
}

@Preview
@Composable
fun TaskManagerPreview() {
    LabsAppTheme {
        TaskManager()
    }
}