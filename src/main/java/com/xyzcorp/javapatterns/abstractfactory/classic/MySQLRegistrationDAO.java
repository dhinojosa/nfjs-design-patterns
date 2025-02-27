package com.xyzcorp.javapatterns.abstractfactory.classic;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/29/12
 * Time: 5:55 PM
 */
public class MySQLRegistrationDAO extends RegistrationDAO {
    @Override
    public void persist(Registration registration) {
        System.out.println( "MySQLRegistrationDAO.persist()");
    }

    @Override
    public void update(Registration registration) {
        System.out.println( "MySQLRegistrationDAO.update()");
    }
}
