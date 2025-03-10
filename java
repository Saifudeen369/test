Product.java: 
------------
package Module1;

public class Product {

	String pname,pcode;
	int price;
	public Product() {}
	public Product(String pname, String pcode, int price) {
		this.pname=pname;
		this.pcode=pcode;
		this.price=price;
	}
	public void setPname(String pname) {
		this.pname=pname;
	}
	public String getPcode() {
		return pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setpcode(String pcode) {
		this.pcode=pcode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void display() {
		System.out.println("pcode: "+ this.pcode);
		System.out.println("pname: "+ this.pname);
		System.out.println("price: "+ this.price);
	}
}

cars.java: 
----------
package Module1;

import java.util.Scanner;

public class cars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Product 1:");
        System.out.print("Enter Product Code: ");
        String pcode1 = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String pname1 = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        int price1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Product p1 = new Product(pname1, pcode1, price1);

        System.out.println("\nEnter details for Product 2:");
        System.out.print("Enter Product Code: ");
        String pcode2 = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String pname2 = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        int price2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Product p2 = new Product(pname2, pcode2, price2);

        System.out.println("\nEnter details for Product 3:");
        System.out.print("Enter Product Code: ");
        String pcode3 = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String pname3 = scanner.nextLine();
        System.out.print("Enter Product Price: ");
        int price3 = scanner.nextInt();

        Product p3 = new Product(pname3, pcode3, price3);

        System.out.println("\nDisplaying Product 1:");
        p1.display();
        System.out.println("\nDisplaying Product 2:");
        p2.display();
        System.out.println("\nDisplaying Product 3:");
        p3.display();

        Product p = p3.getPrice() < (p1.getPrice() < p2.getPrice() ? p1.getPrice() : p2.getPrice()) ? p3 : (p1.getPrice() < p2.getPrice() ? p1 : p2);
        System.out.println("\nDisplaying product with the lowest price:");
        p.display();

        scanner.close();
    }
}




output:
-------
Enter details for Product 1:
Enter Product Code: car123
Enter Product Name: Benz
Enter Product Price: 1000

Enter details for Product 2:
Enter Product Code: car800
Enter Product Name: Maruthi
Enter Product Price: 25000

Enter details for Product 3:
Enter Product Code: car454
Enter Product Name: Jaguar
Enter Product Price: 50000

Displaying Product 1:
pcode: car123
pname: Benz
price: 1000

Displaying Product 2:
pcode: car800
pname: Maruthi
price: 25000

Displaying Product 3:
pcode: car454
pname: Jaguar
price: 50000

Displaying product with the lowest price:
pcode: car123
pname: Benz
price: 1000



