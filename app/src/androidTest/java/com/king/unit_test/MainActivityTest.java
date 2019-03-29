package com.king.unit_test;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;

import  static  android.support.test.espresso.action.ViewActions.click;
import static  android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity>activityTestRule=new ActivityTestRule<>(MainActivity.class);
    private  MainActivity mainActivity=null;

    @Before
    public void setUp() throws Exception {
        mainActivity = activityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void onCreate() {
        Log.i("dddd","onCreate()");
    }

    @Test
    public void btn_click() {
        Log.i("dddd","btn_click()");

    }
    @Test
    public void testClickButton(){
        mainActivity.findViewById(R.id.btn);
        Espresso.onView(withId(R.id.btn)).perform(click());
        Log.i("dddd","testClickButton()");

    }
}