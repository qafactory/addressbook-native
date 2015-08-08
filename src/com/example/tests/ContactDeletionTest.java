package com.example.tests;

import org.testng.annotations.Test;

/**
 * Created by Emma on 8/4/2015.
 */
public class ContactDeletionTest extends TestBase {

    @Test
    public void shouldDeleteFirstContact() throws InterruptedException {
        Thread.sleep(2000);
        app.getContactHelper().deleteFirstContact();
        Thread.sleep(2000);
    }
}
