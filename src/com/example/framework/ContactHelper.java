package com.example.framework;

/**
 * Created by Emma on 8/4/2015.
 */
public class ContactHelper extends HelperBase{

    public ContactHelper(ApplicationManager applicationManager) {
        super(applicationManager);
    }

    public void createContact(Contact contact) {
        initContactCreation();
        fillContactForm(contact);
        confirmContactCreation();
    }

    private void initContactCreation() {
        manager.getAutoItHelper()
                .winWaitAndActivate("AddressBook Portable", "", 5000)
                .click("TRbButton4").winWaitAndActivate("Add Contact", "", 5000);
    }

    private void fillContactForm(Contact contact) {
        manager.getAutoItHelper()
                .send("TDBEdit12", contact.getFirstname())
                .send("TDBEdit11", contact.getLastname())
                .send("TDBEdit4", contact.getPhone());
    }

    private void confirmContactCreation() {
        manager.getAutoItHelper()
                .click("TRbButton1")
                .winWaitAndActivate("AddressBook Portable", "", 5000);
    }

    public Contact getFirstContact() {
        manager.getAutoItHelper()
                .winWaitAndActivate("AddressBook Portable", "", 5000)
                .click("TListView1")
                .send("{DOWN}{SPACE}")
                .click("Edit")
                .winWaitAndActivate("Update Contact", "", 5000);
        Contact contact = new Contact()
                .setFirstName(manager.getAutoItHelper().getText("TDBEdit12"))
                .setLastName(manager.getAutoItHelper().getText("TDBEdit11"))
                .setPhone(manager.getAutoItHelper().getText("TDBEdit4"));
        manager.getAutoItHelper()
                .click("Cancel")
                .winWaitAndActivate("AddressBook Portable", "", 5000)
                .click("TRbButton9");
        return contact;
    }

    public void deleteFirstContact() {
        manager.getAutoItHelper()
                .winWaitAndActivate("AddressBook Portable", "", 5000)
                .click("TListView1")
                .send("{DOWN}{SPACE}")
                .click("Delete")
                .winWaitAndActivate("Confirm", "", 5000)
                .click("TButton2")
                .winWaitAndActivate("AddressBook Portable", "", 5000)
                .click("TRbButton9");
    }
}
