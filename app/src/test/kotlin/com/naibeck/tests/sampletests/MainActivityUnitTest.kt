package com.naibeck.tests.sampletests

import android.widget.Button
import android.widget.TextView
import junit.framework.Assert.assertTrue
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class MainActivityUnitTest {

    @Test
    fun textHasChangedAfterClicked() {
        val activity = Robolectric.setupActivity(MainActivity::class.java)

        val sampleText = activity.findViewById<TextView>(R.id.sampleTextView)
        sampleText.performClick()

        assertTrue(sampleText.text == "Text clicked")
    }
}
