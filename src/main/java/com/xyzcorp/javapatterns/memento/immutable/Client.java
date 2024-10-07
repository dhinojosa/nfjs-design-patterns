package com.xyzcorp.javapatterns.memento.immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/30/12
 * Time: 11:46 AM
 */
public class Client {
    public static void main(String[] args) {
        List<Messenger> caretaker = new ArrayList<Messenger>();

        Messenger messenger = new Messenger();
        caretaker.add(messenger.postNextMessage(createMessageWithTheName("Dan")));
        caretaker.add(messenger.postNextMessage(createMessageWithTheName("John")));
        caretaker.add(messenger.postNextMessage(createMessageWithTheName("Dwight")));

        //rollback?
        assert caretaker.get(0).getCurrentMessage().getReceiver().equals("Dan");
    }

    private static Message createMessageWithTheName(String name) {
        return new Message(new Date(), "Hello", name);
    }
}
