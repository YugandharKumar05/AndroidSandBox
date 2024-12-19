package project.yugandhar_kumar.androidsandbox

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import project.yugandhar_kumar.androidsandbox.Screens.AccordionListScreen
import project.yugandhar_kumar.androidsandbox.Screens.AlertScreen
import project.yugandhar_kumar.androidsandbox.Screens.BadgeScreen
import project.yugandhar_kumar.androidsandbox.Screens.BottomNavigationScreen
import project.yugandhar_kumar.androidsandbox.Screens.BottomSheetScreen
import project.yugandhar_kumar.androidsandbox.Screens.CarouselScreen
import project.yugandhar_kumar.androidsandbox.Screens.CheckboxScreen
import project.yugandhar_kumar.androidsandbox.Screens.ChipsSelectionScreen
import project.yugandhar_kumar.androidsandbox.Screens.DateTimePickerScreen
import project.yugandhar_kumar.androidsandbox.Screens.DialogScreen
import project.yugandhar_kumar.androidsandbox.Screens.DropDownCheckboxScreen
import project.yugandhar_kumar.androidsandbox.Screens.DropdownMenuScreen
import project.yugandhar_kumar.androidsandbox.Screens.EmptyStateScreen
import project.yugandhar_kumar.androidsandbox.Screens.ExpandableCardsScreen
import project.yugandhar_kumar.androidsandbox.Screens.FabMenuScreen
import project.yugandhar_kumar.androidsandbox.Screens.FullScreenLoadingIndicator
import project.yugandhar_kumar.androidsandbox.Screens.ImagePickerScreen
import project.yugandhar_kumar.androidsandbox.Screens.NetworkErrorScreen
import project.yugandhar_kumar.androidsandbox.Screens.PaginationLoaderScreen
import project.yugandhar_kumar.androidsandbox.Screens.PopupScreen
import project.yugandhar_kumar.androidsandbox.Screens.ProgressBarScreen
import project.yugandhar_kumar.androidsandbox.Screens.ProgressIndicatorScreen
import project.yugandhar_kumar.androidsandbox.Screens.PullToRefreshScreen
import project.yugandhar_kumar.androidsandbox.Screens.RatingReviewScreen
import project.yugandhar_kumar.androidsandbox.Screens.SearchBarScreen
import project.yugandhar_kumar.androidsandbox.Screens.SegmentedButtonsScreen
import project.yugandhar_kumar.androidsandbox.Screens.SnackBarScreen
import project.yugandhar_kumar.androidsandbox.Screens.StepperScreen
import project.yugandhar_kumar.androidsandbox.Screens.SwipeToDeleteScreen
import project.yugandhar_kumar.androidsandbox.Screens.TabLayoutWithViewPager
import project.yugandhar_kumar.androidsandbox.Screens.ToastMessageScreen
import project.yugandhar_kumar.androidsandbox.Screens.TooltipScreen

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
        composable("chipSelection") { ChipsSelectionScreen(navController) }
        composable("carousel") { CarouselScreen(navController) }
        composable("dateTimePicker") { DateTimePickerScreen(navController) }
        composable("imagePicker") { ImagePickerScreen(navController) }
        composable("swipeToDelete") { SwipeToDeleteScreen(navController) }
        composable("fabMenu") { FabMenuScreen(navController) }
        composable("bottomNavigation") { BottomNavigationScreen(navController) }
        composable("tabLayoutWithViewPager") { TabLayoutWithViewPager(navController) }
        composable("tooltip") { TooltipScreen(navController) }
        composable("networkError") { NetworkErrorScreen(navController) }
        composable("fullScreenLoading") { FullScreenLoadingIndicator(navController) }
        composable("emptyState") { EmptyStateScreen(navController) }
        composable("ratingReview") { RatingReviewScreen(navController) }
        composable("accordionList") { AccordionListScreen(navController) }
        composable("segmentedButtons") { SegmentedButtonsScreen(navController) }
        composable("badge") { BadgeScreen(navController) }
    }
}

fun NavGraphBuilder.mainScreen(navController: NavHostController) {
    composable("mainScreen") { MainScreen(navController) }
}