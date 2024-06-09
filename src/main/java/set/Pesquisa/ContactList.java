package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ContactList {
    private Set<Contact> contactList;

    public ContactList() {
        this.contactList = new HashSet<>();
    }
    public void addContact(String name, int phoneNumber) {
        this.contactList.add(new Contact(name, phoneNumber));
    }
    public Set<Contact> displayContacts() {
            return this.contactList;
    }
    public Set<Contact> findByName(String name) {
        Set<Contact> contactByName = new HashSet<>();
        if (!this.contactList.isEmpty()) {
            for (Contact c : contactList) {
                if (c.getName().startsWith(name)) {
                    contactByName.add(c);
                    break;
                }
            }
            return contactByName;
        }
        else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }
    public Contact updatePhoneNumber(String name, int newPhoneNumber) {
        Contact updatedContact = null;
        if (!this.contactList.isEmpty()) {
            for (Contact c : this.contactList) {
                if (c.getName().equalsIgnoreCase(name)) {
                    c.setPhoneNumber(newPhoneNumber);
                    updatedContact = c;
                    break;
                }
            }
            return updatedContact;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public static void main(String[] args) {
       ContactList c = new ContactList();
       System.out.println(c.displayContacts());
       c.addContact("Ian", 999824116);
       c.addContact("Marcia", 999848187);
       System.out.println(c.updatePhoneNumber("Ian", 11111111));
       System.out.println(c.displayContacts());
       System.out.println(c.findByName("an"));
    }
}
