package com.example.onboardingcompose.navigation

sealed class Screen(val route: String) {

    object WelcomeScreen : Screen(route = "welcome_screen")
    object HomeScreen : Screen(route = "home_screen")

}
