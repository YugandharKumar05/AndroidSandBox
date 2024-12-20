package project.yugandhar_kumar.androidsandbox

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavHostController) {
    val items = listOf(
        "Toast",
        "SnackBar",
        "Alert",
        "Dialog",
        "Bottom Sheet",
        "Dropdown Menu",
        "Popup",
        "Progress Indicator",
        "Checkbox Screen",
        "Dropdown with Checkboxes",
        "Search Bar",
        "Expandable Cards",
        "Pagination Loader",
        "Pull To Refresh",
        "Stepper",
        "Progress Bar",
        "Chip Selection",
        "Carousel",
        "Date Time Picker",
        "Image Picker",
        "Swipe TO Delete",
        "Floating Action Button",
        "Bottom Navigation",
        "Tab Layout With View Pager",
        "Tools Tips",
        "Network Error",
        "Full Screen Loading",
        "Empty State",
        "Rating Review",
        "Accordion List",
        "Segmented Buttons",
        "Badge",
        "Onboarding",
        "Scroll To Top",
        "Drag And Drop",
        "Bottom App Bar With Actions",
        "Side Navigation Drawer",
        "Stepper With Progress",
        "Circular Image Loader",
        "Custom Dialog Loading"
    )

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Main Screen") })
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .padding(paddingValues)
                .padding(start = 6.dp, end = 6.dp)
                .fillMaxSize(),
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            itemsIndexed(items.chunked(2)) { _, rowItems ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    rowItems.forEach { item ->
                        Card(
                            modifier = Modifier
                                .weight(1f)
                                .height(120.dp)
                                .clickable {
                                    when (item) {
                                        "Toast" -> navController.navigate("toastMessage")
                                        "SnackBar" -> navController.navigate("snackBar")
                                        "Alert" -> navController.navigate("alert")
                                        "Bottom Sheet" -> navController.navigate("bottomSheet")
                                        "Dropdown Menu" -> navController.navigate("dropdownMenu")
                                        "Popup" -> navController.navigate("popup")
                                        "Progress Indicator" -> navController.navigate("progressIndicator")
                                        "Dialog" -> navController.navigate("dialog")
                                        "Checkbox Screen" -> navController.navigate("checkboxScreen")
                                        "Dropdown with Checkboxes" -> navController.navigate("dropDownCheckboxScreen")
                                        "Search Bar" -> navController.navigate("searchBar")
                                        "Expandable Cards" -> navController.navigate("expandableCards")
                                        "Pagination Loader" -> navController.navigate("paginationLoader")
                                        "Pull To Refresh" -> navController.navigate("pullToRefresh")
                                        "Stepper" -> navController.navigate("stepper")
                                        "Progress Bar" -> navController.navigate("progressBar")
                                        "Chip Selection" -> navController.navigate("chipSelection")
                                        "Carousel" -> navController.navigate("carousel")
                                        "Date Time Picker" -> navController.navigate("dateTimePicker")
                                        "Image Picker" -> navController.navigate("imagePicker")
                                        "Swipe TO Delete" -> navController.navigate("swipeToDelete")
                                        "Floating Action Button" -> navController.navigate("fabMenu")
                                        "Bottom Navigation" -> navController.navigate("bottomNavigation")
                                        "Tab Layout With View Pager" -> navController.navigate("tabLayoutWithViewPager")
                                        "Tools Tips" -> navController.navigate("tooltip")
                                        "Network Error" -> navController.navigate("networkError")
                                        "Full Screen Loading" -> navController.navigate("fullScreenLoading")
                                        "Empty State" -> navController.navigate("emptyState")
                                        "Rating Review" -> navController.navigate("ratingReview")
                                        "Accordion List" -> navController.navigate("accordionList")
                                        "Segmented Buttons" -> navController.navigate("segmentedButtons")
                                        "Badge" -> navController.navigate("badge")
                                        "Onboarding" -> navController.navigate("onboarding")
                                        "Scroll To Top" -> navController.navigate("scrollToTop")
                                        "Drag And Drop" -> navController.navigate("dragAndDrop")
                                        "Bottom App Bar With Actions" -> navController.navigate("bottomAppBarWithActions")
                                        "Side Navigation Drawer" -> navController.navigate("sideNavigationDrawer")
                                        "Stepper With Progress" -> navController.navigate("stepperWithProgress")
                                        "Circular Image Loader" -> navController.navigate("circularImageLoader")
                                        "Custom Dialog Loading" -> navController.navigate("customLoadingDialog")
                                    }
                                },
                            shape = RoundedCornerShape(8.dp),
                            elevation = CardDefaults.cardElevation(4.dp)
                        ) {
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Text(
                                    text = item,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                    if (rowItems.size == 1) Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}