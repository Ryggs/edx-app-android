package org.edx.mobile.test.screenshot.test;

import android.app.Activity;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.facebook.testing.screenshot.Screenshot;

import org.edx.mobile.view.LaunchActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class LaunchScreenshotTests {

    @Rule
    public ActivityTestRule<LaunchActivity> mActivityRule =
            new ActivityTestRule<>(LaunchActivity.class, true, true);

    @Test
    public void testScreenshot_recordLaunchActivity() throws Throwable {
        Activity activity = mActivityRule.getActivity();
        activity.runOnUiThread(() -> {
            Screenshot.snap(activity.findViewById(android.R.id.content)).record();
        });
    }
}
