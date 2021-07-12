package br.com.espressotest_kotlin.activity

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import br.com.espressotest_kotlin.R
import br.com.espressotest_kotlin.SecondaryActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author RubioAlves
 * Created 12/07/2021 at 10:11
 */
@RunWith(AndroidJUnit4ClassRunner::class)
class SecondaryActivityTest{

    @get:Rule
    val activityRule = ActivityScenarioRule(SecondaryActivity::class.java)

    @Test
    fun test_isActivityInView() {
        Espresso.
        onView(ViewMatchers.withId(R.id.secondary))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun test_visibility_title_backButton() {
        Espresso.onView(ViewMatchers.withId(R.id.activity_secondary_title)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(ViewMatchers.withId(R.id.back)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

    }

    @Test
    fun test_isTitleTextDisplayed() {
        Espresso.onView(ViewMatchers.withId(R.id.activity_secondary_title)).check(ViewAssertions.matches(ViewMatchers.withText(
            R.string.activity_secondary_title
        )))
    }
}