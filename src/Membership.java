public class Membership {
    private int membershipId;
    private String type;
    private double price;
    private int durationMonths;

    public Membership(int membershipId, String type, double price, int durationMonths){
        this.membershipId = membershipId;
        this.type = type;
        this.price = price;
        this.durationMonths = durationMonths;
    }

    public Membership(){
        this.membershipId = 0;
        this.type = "unknown";
        this.price = 0.0;
        this.durationMonths = 0;
    }

    public int getMembershipId(){
        return membershipId;
    }

    public String getType(){
        return type;
    }

    public double getPrice(){
        return price;
    }

    public int getDurationMonths(){
        return durationMonths;
    }

    public void setMembershipId(int membershipId){
        if (membershipId >= 0){
            this.membershipId = membershipId;
        } else {
            System.out.println("membership Id cannot be negative");
            this.membershipId = 0;
        }
    }

    public void setType(String type){
        if (type != null && !type.trim().isEmpty()){
            this.type = type;
        } else {
            System.out.println("membership type cannot be empty");
            this.type = "unknown";
        }
    }

    public void setPrice(double price){
        if (price >= 0){
            this.price = price;
        } else {
            System.out.println("membership price cannot be negative");
            this.price = 0;
        }
    }

    public void setDurationMonths(int durationMonths){
        if (durationMonths >= 0){
            this.durationMonths = durationMonths;
        } else {
            System.out.println("membership duration cannot be negative");
            this.durationMonths = 0;
        }
    }

    public boolean isExpensive(){
        return price >= 20000.00;
    }

    public boolean isLongTerm(){
        return durationMonths >= 6;
    }

    @Override
    public String toString(){
        return "Membership{membership Id =" + membershipId + ", type=" + type + ", price=" + price + ", duration months=" + durationMonths + "}";
    }
}