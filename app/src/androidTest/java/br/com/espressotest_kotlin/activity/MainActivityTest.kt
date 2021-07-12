package br.com.espressotest_kotlin.activity

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import br.com.espressotest_kotlin.MainActivity
import br.com.espressotest_kotlin.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author RubioAlves
 * Created 12/07/2021 at 09:43
 */
@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test_isActivityInView() {
        //val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        Espresso.onView(ViewMatchers.withId(R.id.main)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun test_visibility_title_nextButton() {
        //val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        Espresso.onView(ViewMatchers.withId(R.id.activity_main_title)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.next)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.next)).check(ViewAssertions.matches(ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)))
    }

    @Test
    fun test_isTitleTextDisplayed() {
        //val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        Espresso.onView(ViewMatchers.withId(R.id.activity_main_title)).check(ViewAssertions.matches(ViewMatchers.withText(
            R.string.activity_main_title
        )))
    }
    @Test
    fun test_navSecondaryActivity() {
        //val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        Espresso
            .onView(ViewMatchers.withId(R.id.next))
            .perform(ViewActions.click())
        Espresso
            .onView(ViewMatchers.withId(R.id.secondary))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun test_backPress_toMainActivity() {
        //val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        Espresso
            .onView(ViewMatchers.withId(R.id.next))
            .perform(ViewActions.click())
        Espresso
            .onView(ViewMatchers.withId(R.id.secondary))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        Espresso.pressBack()

        Espresso
            .onView(ViewMatchers.withId(R.id.main))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))


    }
}