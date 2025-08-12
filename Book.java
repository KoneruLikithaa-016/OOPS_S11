package teacher;
//Book.java
public class Book {
 // Private fields
 private String title;
 private String author;
 private double price;

 // Initialization block (runs before constructor)
 {
     System.out.println("Welcome to the Online Bookstore!");
 }

 // Constructor
 public Book(String title, String author, double price) {
     this.title = title;
     this.author = author;
     setPrice(price);  // use setter to apply validation
 }

 // Getter for title
 public String getTitle() {
     return title;
 }

 // Setter for title
 public void setTitle(String title) {
     this.title = title;
 }

 // Getter for author
 public String getAuthor() {
     return author;
 }

 // Setter for author
 public void setAuthor(String author) {
     this.author = author;
 }

 // Getter for price
 public double getPrice() {
     return price;
 }

 // Setter for price with validation
 public void setPrice(double price) {
     if (price > 0) {
         this.price = price;
     } else {
         System.out.println("Invalid price. Price must be positive.");
     }
 }

 // Method to display book details
 public void displayDetails() {
     System.out.println("Title  : " + title);
     System.out.println("Author : " + author);
     System.out.println("Price  : ₹" + price);
 }

 // Main method for testing
 public static void main(String[] args) {
     Book b1 = new Book("Java Programming", "Herbert Schildt", 599);
     b1.displayDetails();

     // Trying to set invalid price
     b1.setPrice(-100); // Should display error

     // Updating price properly
     b1.setPrice(649);
     System.out.println("Updated Price: ₹" + b1.getPrice());
 }
}
