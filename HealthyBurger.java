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
            System.out.println("Added " + healthyExtra1Name + " for " + healthyExtra1Price);
        }
    }

    public void addHealthyAddition2 (String type, double pricee) {
        if(!type.isEmpty()){
            this.healthyExtra2Name = type;
            this.healthyExtra2Price = pricee;
            System.out.println("Added " + healthyExtra2Name + " for " + healthyExtra2Price);
        }
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price;
    }
}
