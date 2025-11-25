public class Park {
    public class Attraction {
        private String name;
        private String horsWorking;
        private double price;

        public Attraction(String name, String horsWorking, double price) {
            this.name = name;
            this.horsWorking = horsWorking;
            this.price = price;
        }

        public void info() {
            System.out.println(name);
            System.out.println(horsWorking);
            System.out.println(price);
        }
    }

    public void showAttractions() {
        Attraction[] attractions = new Attraction[3];
        attractions[0] = new Attraction("Пчела", "10:00 - 18:00", 15);
        attractions[1] = new Attraction("Ракушка", "09:00 - 20:00", 10);
        attractions[2] = new Attraction("Колесо обозрения", "12:00 - 23:00", 8);
        for (Attraction a : attractions) {
            a.info();
        }
    }
}
