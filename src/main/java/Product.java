public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean reservationStatus;

    public Product(String name, String productionDate, String manufacturer, String countryOfOrigin, double price, boolean reservationStatus) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.reservationStatus = reservationStatus;
    }

    public void info() {
        System.out.println(name);
        System.out.println(productionDate);
        System.out.println(manufacturer);
        System.out.println(countryOfOrigin);
        System.out.println(price);
        System.out.println(reservationStatus);
    }
}

