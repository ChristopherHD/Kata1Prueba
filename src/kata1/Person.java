
package kata1;

import java.util.Date;

public class Person {
    private final String name;
    private final Date birthDay;
    
    public Person(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }
    
    public Date getBirthDay() {
        return birthDay;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return (int)((new Date().getTime()-birthDay.getTime())/31536000000l);
    }
    
}
