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
        if (name != null && !name.trim().isEmpty()){
            this.name = name;
        } else {
            System.out.println("trainer name cannot be empty");
            this.name = "unknown";
        }
    }

    public void setAge(int age){
        if (age >= 0){
            this.age = age;
        } else {
            System.out.println("trainer age cannot be negative");
            this.age = 0;
        }
    }

    public void setGender(String gender){
        if (gender != null && !gender.trim().isEmpty()){
            this.gender = gender;
        } else {
            System.out.println("trainer gender cannot be empty");
            this.gender = "unknown";
        }
    }

    public void setExperienceYears(int experienceYears){
        if (experienceYears >= 0){
            this.experienceYears = experienceYears;
        } else {
            System.out.println("trainer experience years cannot be negative");
            this.experienceYears = 0;
        }
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