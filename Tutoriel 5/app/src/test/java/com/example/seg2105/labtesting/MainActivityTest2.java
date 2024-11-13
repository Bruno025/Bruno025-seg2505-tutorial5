package com.example.seg2105.labtesting;

import static java.util.regex.Pattern.matches;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest2 {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void emailIsInvalid(){
        onView(withId(R.id.username)).perform(typeText("user"), closeSoftkeyboard());
        onView(withId(R.id.Lastname)).perform(typeText("test"), closeSoftkeyboard());
        onView(withId(R.id.email)).perform(typeText("@email"), closeSoftkeyboard());
        onView(withId(R.id.loginbtn)).perform(click());
        onView(withId("Invalid Email")).check(matches(isDisplayed()));

    }

    @Test
    public void firstIsValid(){
        onView(withId(R.id.username)).perform(typeText("user1"), closeSoftkeyboard());
        onView(withId(R.id.loginbtn)).perform(click());
        onView(withId("Invalid First Name")).check(matches(isDisplayed()));
    }
}
