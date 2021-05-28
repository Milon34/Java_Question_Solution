package Solution;

import java.util.List;

public class Person {
    public String Passport_Number, First_Name, Last_Name, NID, Date_Of_Birth;

    public Person(List<String> l)
    {
        Passport_Number = l.get(0);
        First_Name = l.get(1);
        Last_Name = l.get(2);
        NID = l.get(3);
        Date_Of_Birth =l.get(4);

    }
}
