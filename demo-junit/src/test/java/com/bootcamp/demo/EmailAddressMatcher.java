package com.bootcamp.demo;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class EmailAddressMatcher extends TypeSafeMatcher<String> {
    @Override
    protected boolean matchesSafely(String item) {
        return item.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"); //
    }

    @Override
    public void describeTo(Description errorMsg) {
        errorMsg.appendText("Invalid Email Address Format.");
    }

    public static EmailAddressMatcher create() {
        return new EmailAddressMatcher();
    }
}