package com.designpattern.composite;

public class CompositeDemo {

    public static void main(String args[]){

        EmployeeComposite CEO = new EmployeeComposite("John","CEO", 30000);

        EmployeeComposite headSales = new EmployeeComposite("Robert","Head Sales", 20000);

        EmployeeComposite headMarketing = new EmployeeComposite("Michel","Head Marketing", 20000);

        EmployeeComposite clerk1 = new EmployeeComposite("Laura","Marketing", 10000);
        EmployeeComposite clerk2 = new EmployeeComposite("Bob","Marketing", 10000);

        EmployeeComposite salesExecutive1 = new EmployeeComposite("Richard","Sales", 10000);
        EmployeeComposite salesExecutive2 = new EmployeeComposite("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        clerk2.show();

    }

}
