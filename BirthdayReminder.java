package assignment6.comparable;

import java.util.Date;

public class BirthdayReminder implements Comparable<BirthdayReminder>{

    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public BirthdayReminder(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "BirthdayReminder{" +
                "birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(BirthdayReminder obj) {
        if(birthday.equals(obj.getBirthday())){
            return 0;
        }else if(birthday.after(obj.getBirthday())){
            return 1;
        }else{
            return -1;
        }
    }
}
