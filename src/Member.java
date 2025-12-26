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
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
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