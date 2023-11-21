//
public class Main {
   public static void main(String[] args){
//       BookDatabase bookDatabase = new BookDatabase();
//
//       Book book1 = new Book("CS21", "Pakita Shamoi", "OOP","Programming");
//       Book book2 = new Book("CS30", "Jen Kenly", "Java","Programming");
//       Book book3 = new Book("MATH234", "Alex Galmart", "Combinatorika", "Mathematic");
//
//       bookDatabase.addBook(book1);
//       bookDatabase.addBook(book2);
//       bookDatabase.addBook(book3);
//
//
//       Student student1 = new Student(21030767, "Didar","Alikhan");
//       Student student2 = new Student(21030768, "Beknur","Altynbek");
//
//       Librarian librarian = new Librarian();
//
//       librarian.processBorrowRequest(student1,book1);
//
//
//
//
//       for(Book book: student1.getBookList()){
//           System.out.println(book.toString());
//       }
//


       // Date class examples
//       Date currenDate = new Date();
//       Date birthday = new Date(2003,9,1);
//       Date dedline = new Date(2023, 11,24, new Time(23,59,0));
//
//       currenDate.displaysDate();
//       birthday.displaysDate();
//       dedline.displaysDate();
//
//       currenDate.moveByDays(5);
//       currenDate.displaysDate();
//
//
//       StarTriangle starTriangle = new StarTriangle(3);
//       System.out.println(starTriangle.toString());

       double[] coefficients = {2, -1, 3};
       Polynomial polynomial = new Polynomial(coefficients);

       System.out.println("Original Polynomial: " + polynomial);

       Polynomial multipliedPolynomial = polynomial.multiply(3);
       System.out.println("Multiplied polynomial by 3" + multipliedPolynomial );

       double xValue = 3;
       double result = polynomial.evaluate(xValue);
       System.out.println("Polynomial evaluated at x = " + xValue + ":" + result);

       // Find the first derivative of the polynomial
       Polynomial derivative = polynomial.getFirstDerivative();
       System.out.println("First Derivative: " + derivative);


   }
}