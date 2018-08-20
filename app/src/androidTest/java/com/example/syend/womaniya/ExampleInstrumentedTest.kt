package com.example.syend.womaniya

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import android.content.Intent
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import com.example.syend.womaniya.features.MainActivity
import org.junit.Rule



/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Rule
    @JvmField
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(
            MainActivity::class.java,
            false, // initialTouchMode
            true)   // launchActivity. False to customize the intent

    @Test
    fun intent() {
        val intent = Intent()
        intent.putExtra("your_key", "your_value")

        activityRule.launchActivity(intent)

        Thread.sleep(10000)
        onView(withId(R.id.rvRecycler))
                .check(matches(hasChildCount(26)))

        // Continue with your test
    }



    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.example.syend.womaniya", appContext.packageName)
    }
}
