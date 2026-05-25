package com.mcpe.toolbox.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mcpe.toolbox.ui.screen.HomeScreen
import com.mcpe.toolbox.ui.screen.CombatScreen
import com.mcpe.toolbox.ui.screen.MovementScreen
import com.mcpe.toolbox.ui.screen.WorldScreen
import com.mcpe.toolbox.ui.screen.ItemScreen
import com.mcpe.toolbox.ui.screen.NBTEditorScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(navController)
        }
        composable("combat") {
            CombatScreen(navController)
        }
        composable("movement") {
            MovementScreen(navController)
        }
        composable("world") {
            WorldScreen(navController)
        }
        composable("items") {
            ItemScreen(navController)
        }
        composable("nbt") {
            NBTEditorScreen(navController)
        }
    }
}
