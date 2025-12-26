public class Trainer {
    private String name;
    private int age;
    private String gender;
    private int experienceYears;

    public Trainer(String name, int age, String gender, int experienceYears) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.experienceYears = experienceYears;
    }

    public Trainer() {
        this.name = "unknown";
        this.age = 0;
        this.gender = "unknown";
        this.experienceYears = 0;
    }

    public String gerName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public int getExperienceYears(){
        return experienceYears;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setExperienceYears(int experienceYears){
        this.experienceYears = experienceYears;
    }

    public boolean isExperienced(){
        return experienceYears >= 5;
    }

    public boolean isYoung(){
        return age <= 35;
    }

    @Override
    public String toString() {
        return "Trainer{name =" + name + ", age=" + age + ", gender=" + gender + ", experience years=" + experienceYears + "}";
    }
}