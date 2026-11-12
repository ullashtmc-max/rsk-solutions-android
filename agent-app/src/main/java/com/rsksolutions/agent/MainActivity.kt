package com.rsksolutions.agent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                AgentDashboard()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AgentDashboard() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("RSK Solutions Agent") }
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
                "Agent Dashboard",
                style = MaterialTheme.typography.headlineMedium
            )

            Card(Modifier.fillMaxWidth()) {
                Column(Modifier.padding(20.dp)) {
                    Text("Agent Wallet")
                    Text(
                        "৳ 0.00",
                        style = MaterialTheme.typography.headlineLarge
                    )
                }
            }

            listOf(
                "My Customers",
                "Create Customer Account",
                "DID & Number Management",
                "Cloud PBX Extensions",
                "Call History & CDR",
                "Wallet & Transactions"
            ).forEach { item ->
                Card(Modifier.fillMaxWidth()) {
                    Text(item, Modifier.padding(18.dp))
                }
            }
        }
    }
}
