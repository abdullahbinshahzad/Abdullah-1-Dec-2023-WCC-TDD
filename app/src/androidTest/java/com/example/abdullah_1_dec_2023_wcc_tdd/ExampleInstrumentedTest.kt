package com.example.abdullah_1_dec_2023_wcc_tdd

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isChecked
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.isNotChecked
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.ext.junit.rules.ActivityScenarioRule

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.abdullah_1_dec_2023_wcc_tdd", appContext.packageName)
    }
}
class HomeScreenTest {

    @Rule
    @JvmField
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun navigateToSettingsPage() {
        // Find the button and perform a click
        onView(withId(R.id.button)).perform(click())

        // Verify that the SettingsActivity is launched
        onView(withId(R.id.settingsTitle)).check(matches(isDisplayed()))
    }
}

class SettingsScreenTest {

    @Rule
    @JvmField
    val activityRule = ActivityScenarioRule(SettingsActivity::class.java)

    @Test
    fun validateInitialToggleState() {
        // Find the toggle buttons and verify their initial state
        onView(withId(R.id.dark_modeS)).check(matches(isNotChecked()))
        onView(withId(R.id.screen_tapsS)).check(matches(isNotChecked()))
        // Add similar checks for other toggle buttons
    }
}