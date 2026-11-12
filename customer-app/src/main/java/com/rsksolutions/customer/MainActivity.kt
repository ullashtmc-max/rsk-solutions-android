package com.rsksolutions.customer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                CustomerDashboard()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomerDashboard() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("RSK Solutions")
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Customer Dashboard",
                style = MaterialTheme.typography.headlineMedium
            )

            Card(
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.padding(20.dp)
                ) {
                    Text("Wallet Balance")
                    Text(
                        "৳ 0.00",
                        style = MaterialTheme.typography.headlineLarge
                    )
                }
            }

            DashboardItem("Agni DID Management")
            DashboardItem("Cloud PBX Extensions")
            DashboardItem("Call History & CDR")
            DashboardItem("Recharge History")
        }
    }
}

@Composable
fun DashboardItem(title: String) {
    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(18.dp)
        )
    }
}
