package dev.trindadedev.swupdater.ui.screens.github

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.input.nestedscroll.*
import androidx.compose.ui.layout.*
import androidx.compose.ui.res.*

import dev.trindadedev.swupdater.Strings
import dev.trindadedev.swupdater.ui.components.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GitHubCommitsScreen() {
  val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
  val scrollState = rememberScrollState()

  Scaffold(
    modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
    topBar = {
      TopBar(
        title = { Text(stringResource(id = Strings.label_github_commits)) },
        scrollBehavior = scrollBehavior,
        isLarge = true
      )
    },
  ) { innerPadding ->
    Column(
      Modifier
        .padding(innerPadding)
        .verticalScroll(scrollState)
    ) {
      
    }
  }
}