public class Main{
    public static void main(String[] args){
        System.out.println("===Gym Management System===");
        System.out.println( );

        Member member1 = new Member("Dias", 26, 70, 187);
        Member member2 = new Member("Merey", 19, 50, 165);

        Trainer trainer1 = new Trainer("Azamat", 25, "Male", 2);
        Trainer trainer2 = new Trainer("Aizada", 32, "Female", 6);

        Membership membership1 = new Membership(01, "Basic", 15000.00, 3);
        Membership membership2 = new Membership(02, "Premium", 25000.00, 8);

        System.out.println("===Members===");
        System.out.println(member1);
        System.out.println(member2);

        System.out.println("===Trainers===");
        System.out.println(trainer1);
        System.out.println(trainer2);

        System.out.println("===Memberships===");
        System.out.println(membership1);
        System.out.println(membership2);

        System.out.println("===Testing methods===");
        System.out.println("Member1 is tall: " + member1.isTall());
        System.out.println("Member2 is adult: " + member2.isAdult());

        System.out.println("Trainer1 is experienced: " + trainer1.isExperienced());
        System.out.println("Trainer2 is young: " + trainer2.isYoung());

        System.out.println("Membership1 is expensive: " + membership1.isExpensive());
        System.out.println("Membership2 is long term: " + membership2.isLongTerm());

        System.out.println("===Program complete===");
    }
}