public class Person {
    private String name;
    private String sex;
    private String jobTitle;
    private String birthDay;

    public Person(String name, String sex, String jobTitle, String birthDay){
        this.name = name;
        this.sex = sex;
        this.jobTitle = jobTitle;
        this.birthDay = birthDay;
    }

    public String getName(){
        return this.name;
    }

    public String getSex(){
        return this.sex;
    }

    public String getJobTitle(){
        return this.jobTitle;
    }

    public String getBirthDay(){
        return this.birthDay;
    }
}
