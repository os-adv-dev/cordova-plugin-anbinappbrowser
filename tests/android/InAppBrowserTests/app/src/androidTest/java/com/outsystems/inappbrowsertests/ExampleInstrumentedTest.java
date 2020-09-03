package com.outsystems.inappbrowsertests;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.outsystems.inappbrowsertests", appContext.getPackageName());
    }

    @Test
    public void usingSomethingAndroid() {
        // Context of the app under test.
        System.out.println("Check test");
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.outsystems.inappbrowsertests", appContext.getPackageName());
    }
}