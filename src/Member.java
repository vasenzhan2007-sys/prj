public class Member {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Member(String name, int age, int weight, int height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Member(){
        this.name = "unknown";
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()){
            this.name = name;
        } else {
            System.out.println("member name cannot be empty");
            this.name = "unknown";
        }
    }

    public void setAge(int age) {
        if (age >= 0){
            this.age = age;
        } else {
            System.out.println("member age cannot be negative");
            this.age = 0;
        }
    }

    public void setWeight(int weight) {
        if (weight >= 0){
            this.weight = weight;
        } else {
            System.out.println("member weight cannot be negative");
            this.weight = 0;
        }
    }

    public void setHeight(int height) {
        if (height >= 0){
            this.height = height;
        } else {
            System.out.println("member height cannot ne negative");
            this.height = 0;
        }
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public boolean isTall() {
        return height >= 185;
    }

    @Override
    public String toString() {
        return "Member{name =" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + "}";
    }
}