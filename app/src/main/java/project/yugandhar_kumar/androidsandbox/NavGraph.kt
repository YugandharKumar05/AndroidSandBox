package project.yugandhar_kumar.androidsandbox

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import project.yugandhar_kumar.androidsandbox.Screens.AlertScreen
import project.yugandhar_kumar.androidsandbox.Screens.BottomSheetScreen
import project.yugandhar_kumar.androidsandbox.Screens.CheckboxScreen
import project.yugandhar_kumar.androidsandbox.Screens.DialogScreen
import project.yugandhar_kumar.androidsandbox.Screens.DropDownCheckboxScreen
import project.yugandhar_kumar.androidsandbox.Screens.DropdownMenuScreen
import project.yugandhar_kumar.androidsandbox.Screens.ExpandableCardsScreen
import project.yugandhar_kumar.androidsandbox.Screens.PaginationLoaderScreen
import project.yugandhar_kumar.androidsandbox.Screens.PopupScreen
import project.yugandhar_kumar.androidsandbox.Screens.ProgressBarScreen
import project.yugandhar_kumar.androidsandbox.Screens.ProgressIndicatorScreen
import project.yugandhar_kumar.androidsandbox.Screens.PullToRefreshScreen
import project.yugandhar_kumar.androidsandbox.Screens.SnackBarScreen
import project.yugandhar_kumar.androidsandbox.Screens.StepperScreen
import project.yugandhar_kumar.androidsandbox.Screens.ToastMessageScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "mainScreen") {
        mainScreen(navController)
        composable("toastMessage") { ToastMessageScreen(navController) }
        composable("snackBar") { SnackBarScreen(navController) }
        composable("Alert") { AlertScreen(navController) }
        composable("Dialog") { DialogScreen(navController) }
        composable("bottomSheet") { BottomSheetScreen(navController) }
        composable("dropdownMenu") { DropdownMenuScreen(navController) }
        composable("popup") { PopupScreen(navController) }
        composable("progressIndicator") { ProgressIndicatorScreen(navController) }
        composable("checkboxScreen") { CheckboxScreen(navController) }
        composable("dropDownCheckboxScreen") { DropDownCheckboxScreen(navController) }
        composable("searchBar") { SearchBarScreen(navController) }
        composable("expandableCards") { ExpandableCardsScreen(navController) }
        composable("paginationLoader") { PaginationLoaderScreen(navController) }
        composable("pullToRefresh") { PullToRefreshScreen(navController) }
        composable("stepper") { StepperScreen(navController) }
        composable("progressBar") { ProgressBarScreen(navController) }
    }
}

fun NavGraphBuilder.mainScreen(navController: NavHostController) {
    composable("mainScreen") { MainScreen(navController) }
}