public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }



    public void addHamburgerAddition1 (String type, double price){
            this.addition1Name = type;
            this.addition1Price = price;
    }
    public void addHamburgerAddition2 (String type, double price){
            this.addition2Name = type;
            this.addition2Price = price;
    }
    public void addHamburgerAddition3 (String type, double price) {
            this.addition3Name = type;
            this.addition3Price = price;
    }
    public void addHamburgerAddition4 (String type, double price) {
            this.addition4Name = type;
            this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " with " + this.meat + ", price is " + this.price);
        if(this.addition1Name != null){
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for " + this.addition1Price);
        }
        if(this.addition2Name != null){
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for " + this.addition2Price);
        }
        if(this.addition3Name != null){
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for " + this.addition3Price);
        }
        if(this.addition4Name != null){
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for " + this.addition4Price);
        }
        return hamburgerPrice;
    }
}


