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
        this.membershipId = membershipId;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setDurationMonths(int durationMonths){
        this.durationMonths = durationMonths;
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