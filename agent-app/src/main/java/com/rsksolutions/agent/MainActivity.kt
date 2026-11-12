
package com.rsksolutions.agent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
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
                title = {
                    Text("RSK Solutions Agent")
                }
            )
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            Text(
                text = "Agent Dashboard",
                style = MaterialTheme.typography.headlineMedium
            )

            Card(
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.padding(20.dp)
                ) {
                    Text("Agent Wallet")

                    Text(
                        text = "৳ 0.00",
                        style = MaterialTheme.typography.headlineLarge
                    )
                }
            }

            val menuItems = listOf(
                "My Customers",
                "Create Customer Account",
                "DID & Number Management",
                "Cloud PBX Extensions",
                "Call History & CDR",
                "Wallet & Transactions"
            )

            menuItems.forEach { item ->
                Card(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = item,
                        modifier = Modifier.padding(18.dp)
                    )
                }
            }
        }
    }
}
