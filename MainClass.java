package assignment6.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        AppleBasket b1 = new AppleBasket(10);
        AppleBasket b2 = new AppleBasket(5);
        AppleBasket b3 = new AppleBasket(2);
        List<AppleBasket> appleBasketslist = new ArrayList<>();
        appleBasketslist.add(b1);appleBasketslist.add(b2);appleBasketslist.add(b3);
        Collections.sort(appleBasketslist);
        for(AppleBasket appleBasket : appleBasketslist){
            System.out.println(appleBasket);
        }

        Person p1 = new Person("John","Snow");
        Person p2 = new Person("Arya","Stark");
        Person p3 = new Person("Brandon","Stark");
        Person p4 = new Person("Sansa","Stark");

        List<Person> personList = new ArrayList<>();
        personList.add(p1);personList.add(p2);personList.add(p3);personList.add(p4);
        Collections.sort(personList);
        for(Person person : personList){
            System.out.println(person);
        }

        BirthdayReminder br1 = new BirthdayReminder(new Date());
        BirthdayReminder br2 = new BirthdayReminder(new Date(System.currentTimeMillis()-100000l));
        BirthdayReminder br3 = new BirthdayReminder(new Date(System.currentTimeMillis()-1000000l));
        List<BirthdayReminder> birthdayReminderList = new ArrayList<>();
        birthdayReminderList.add(br1);birthdayReminderList.add(br2);birthdayReminderList.add(br3);
        Collections.sort(birthdayReminderList);
        for(BirthdayReminder birthdayReminder : birthdayReminderList){
            System.out.println(birthdayReminder);
        }

        _3DPoint point1 = new _3DPoint(1,1,1);
        _3DPoint point2 = new _3DPoint(1,0,0);
        _3DPoint point3 = new _3DPoint(0,1,1);

        List<_3DPoint> _3dpointList = new ArrayList<>();
        _3dpointList.add(point1);_3dpointList.add(point2);_3dpointList.add(point3);
        Collections.sort(_3dpointList);
        for(_3DPoint obj : _3dpointList){
            System.out.println(obj);
        }
    }
}
