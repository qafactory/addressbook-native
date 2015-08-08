package com.example.tests;

import com.example.framework.Contact;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Emma on 8/4/2015.
 */
public class ContactCreationTest extends TestBase {

    @Test
    public void shouldCreateContactWithValidData() throws InterruptedException {
        Thread.sleep(2000);
        Contact contact = new Contact().setFirstName("Fox").setLastName("Fox").setPhone("0980298509235");
        app.getContactHelper().createContact(contact);

        Contact createdContact = app.getContactHelper().getFirstContact();
        Assert.assertEquals(contact, createdContact);
        Thread.sleep(2000);
    }
}
