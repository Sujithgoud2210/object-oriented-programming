package com.java.oop.productassignment;

public class main {
    public static void main(String[] args) {
        String[] productsData = {
                "prod-101,Lenovo Laptop,58999.00,10.5",
                "prod-102,Dell Inspiron 15,54999.00,8.0",
                "prod-103,HP Pavilion 14,62999.00,12.0",
                "prod-104,Apple iPhone 14,79999.00,5.0",
                "prod-105,Samsung Galaxy S23,74999.00,7.5",
                "prod-106,OnePlus 11R,45999.00,9.0",
                "prod-107,Boat Rockerz Headphones,2999.00,15.0",
                "prod-108,Sony Bravia 43inch TV,52999.00,11.5",
                "prod-109,LG Double Door Refrigerator,38999.00,13.0",
                "prod-110,Canon EOS 1500D Camera,41999.00,6.5"
        };
        ProductRepository productRepository=new ProductRepository();
        productRepository.loadProducts(productsData);
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Display (For-Each)");
            System.out.println("2. Display (Iterator)");
            System.out.println("3. Sort Ascending");
            System.out.println("4. Sort Descending");
            System.out.println("5. Highest Price Product");
            System.out.println("6. Least Price Product");
            System.out.println("7. Max Discount Product");
            System.out.println("8. Total Value");
            System.out.println("9. Average Price");
            System.out.println("10. Count Above Price");
            System.out.println("11. Discount Above");
            System.out.println("12. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    repo.displayUsingForEach();
                    break;

                case 2:
                    repo.displayUsingIterator();
                    break;

                case 3:
                    repo.sortByPriceAscending();
                    repo.displayUsingForEach();
                    break;

                case 4:
                    repo.sortByPriceDescending();
                    repo.displayUsingForEach();
                    break;

                case 5:
                    System.out.println(repo.getHighestPriceProduct());
                    break;

                case 6:
                    System.out.println(repo.getLeastPriceProduct());
                    break;

                case 7:
                    System.out.println(repo.getMaxDiscountProduct());
                    break;

                case 8:
                    System.out.println("Total Value: " + repo.getTotalValue());
                    break;

                case 9:
                    System.out.println("Average Price: " + repo.getAveragePrice());
                    break;

                case 10:
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.println("Count: " +
                            repo.countProductsAbovePrice(price));
                    break;

                case 11:
                    System.out.print("Enter Discount: ");
                    float discount = sc.nextFloat();
                    System.out.println(productRepository.getProductsWithDiscountAbove(discount));
                    break;

                case 12:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 12);
    }
    }
}
