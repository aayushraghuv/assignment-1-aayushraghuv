package functionDefinition;

import LinkList.LinkListClass;
import person.Person;

import LinkList.LinkListClass;
import person.Person;

public class ViewContact {
    public boolean viewList(LinkListClass person) {
        System.out.println("--------------Here are all your Contacts---------");
        int size = person.getSize();
        printContact(person, size);
        return true;
    }

    public void printContact(LinkListClass<Person> totalContact, int size) {
        for (int i = 0; i < size; i++) {
            Person person = totalContact.dataAtIndex(i);
            System.out.println("------*------------*---------**--------\n" +
                    "First Name :" + person.getFrsitName() + "\n" +
                    "Last Name :" + person.getLastName());
            if (person.getContactNo().getSize() > 1) {
                System.out.println("Contact Number(S): ");
                for (int j = 0; j < person.getContactNo().getSize(); j++) {
                    System.out.print(person.getContactNo().dataAtIndex(i) + (j < person.getContactNo().getSize() - 1 ? "," : ""));
                }
            } else {
                System.out.print("Contact Number :" + person.getContactNo().dataAtIndex(0));
            }
            System.out.println("\nEmail Address :" + person.getEmailAddress());
            System.out.println("----------*--------------*---------------*");
        }

    }

}
