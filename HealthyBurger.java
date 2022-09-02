public class HealthyBurger extends Hamburger{


    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye roll");
    }


    public void addHealthyAddition1 (String type, double pricee){
        if(!type.isEmpty()){
            this.healthyExtra1Name = type;
            this.healthyExtra1Price = pricee;
        }
    }

    public void addHealthyAddition2 (String type, double pricee) {
        if(!type.isEmpty()){
            this.healthyExtra2Name = type;
            this.healthyExtra2Price = pricee;
        }
    }

    @Override
    public double itemizeHamburger() {
        double healthyHamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtra1Name != null){
            healthyHamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for " + this.healthyExtra1Price);
        }
        if(this.healthyExtra2Name != null){
            healthyHamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra2Name + " for " + this.healthyExtra2Price);
        }
        return  healthyHamburgerPrice;
    }
}
