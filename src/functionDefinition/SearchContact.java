package functionDefinition;

import LinkList.LinkListClass;
import person.Person;

import LinkList.LinkListClass;
import person.Person;

import java.util.Scanner;

public class SearchContact {
    public void seach(LinkListClass person) {
        ViewContact view = new ViewContact();
        Scanner tell = new Scanner(System.in);
        LinkListClass<Person> matchedContact = new LinkListClass<>();
        System.out.println("You could search for a contact from their first names:");
        String element = tell.nextLine();
        int match = 0;
        for (int i = 0; i < person.getSize(); i++) {
            Person person1 = (Person) person.dataAtIndex(i);
            if (element.equals(person1.getFrsitName())) {
                match++;
                matchedContact.add(person1);
            }
        }
        if (match > 0) {
            System.out.println(match + " match found!");
        } else {
            System.out.println("NO RESULTS FOUND!");
        }
        view.printContact(matchedContact, match);

    }

}
