public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("HUAWEI Pura80", "11.06.2025", "Huawei Technologies Co. Ltd", "China", 587, false);
        productsArray[1] = new Product("iPhone 17 Pro Max", "09.09.2025", "Apple Inc.", "USA", 1479, true);
        productsArray[2] = new Product("Samsung Galaxy A56", "02.03.2025", "Samsung Electronics", "Vietnam", 471, true);
        productsArray[3] = new Product("Infinix Smart 10", "16.06.2025", "Transsion Holdings", "China", 79, false);
        productsArray[4] = new Product("HONOR 400 Pro", "23.05.2025", "Honor Device Co., Ltd.", "China", 569, false);

        for (Product product : productsArray) {
            product.info();
        }
        System.out.println("\nЗадание 2");
        Park park = new Park();
        park.showAttractions();
    }
}
