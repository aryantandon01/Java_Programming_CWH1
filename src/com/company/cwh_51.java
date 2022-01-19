package com.company;
import java.util.Arrays;
import java.util.Scanner;

class onlineLibrary
{
    Scanner sc = new Scanner(System.in);
    public String [] availBooks = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    int noOfBooks = 0;
    public String [] collectedBooks = new String[100];
    public int i;

    public void showAvailableBooks()
    {
        System.out.println("\nHere's the list of the books that are available: ");
        for (i=0; i<availBooks.length-1; i++)
        {
            System.out.print(availBooks[i]+", ");
        }
        System.out.println(availBooks[availBooks.length-1]+"\n");
    }

    public void issueBook()
    {
        System.out.print("\nEnter the book you want: ");
        String book = sc.nextLine();
        String bookUpper = book.toUpperCase();
        for (i=0; i<availBooks.length; i++)
        {
            if (bookUpper.equals(availBooks[i]))
            {
                System.out.println("The book has been added.");
                collectedBooks[0] = availBooks[i];
                noOfBooks++;
                break;
            }
        }
        System.out.println(Arrays.toString(collectedBooks)+"\n");
    }

    public void addBook()
    {
        if (noOfBooks==0)
        {
            System.out.println("Issue a book first.");
        }
        else
        {
            System.out.println("Enter the book you want to add: ");
            String newBook = sc.nextLine();
            String newBookUpper = newBook.toUpperCase();
            for (int j=0; j<availBooks.length; j++)
            {
                if (newBookUpper.equals(availBooks[j]))
                {
                    System.out.println("The book has been added.");
                    collectedBooks[noOfBooks] = availBooks[j];
                    noOfBooks++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(collectedBooks)+"\n");
    }

    public void returnBook()
    {
        System.out.println("Which book do you want to return?");
        String retBook = sc.nextLine();
        String retBookUpper = retBook.toUpperCase();
        for (i=0; i<noOfBooks; i++)
        {
            if (retBookUpper.equals(collectedBooks[i]))
            {
                System.out.println("The book has been returned.");
                noOfBooks--;
                for (int j = i; i < collectedBooks.length-1; i++)
                {
                    collectedBooks[i] = collectedBooks[i + 1];
                }
                break;
            }
        }
        System.out.println(Arrays.toString(collectedBooks)+"\n");
    }

    public void showMyCollection()
    {
        for (i=0; i<noOfBooks; i++)
        {
            System.out.print(collectedBooks[i]+", ");
        }
        System.out.println(collectedBooks[noOfBooks] + "\n");
    }
}

public class cwh_51 {
    public static void main(String[] args) {

//        Implement a library using Java Class Library
//        Methods: addBook(), issueBook(), returnBook(), showAvailableBooks()
//        Properties: Array to store the available book
//                    Array to store the issued books
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the online library!\n");

        for (int i = 1; i > 0; i++)
        {
            System.out.println("Select any of the following options:");
            System.out.println("1. Show available books");
            System.out.println("2. Issue a book");
            System.out.println("3. Add a book");
            System.out.println("4. Return a book");
            System.out.println("5. Show my collection");
            System.out.println("6. Exit\n");

            onlineLibrary obj = new onlineLibrary();
            int ans = sc.nextInt();

            if (ans==1)
            {
                obj.showAvailableBooks();
            }
            else if (ans==2)
            {
                obj.issueBook();
            }
            else if (ans==3)
            {
                obj.addBook();
            }
            else if (ans==4)
            {
                obj.returnBook();
            }
            else if (ans==5)
            {
                obj.showMyCollection();
            }
            else if (ans==6)
            {
                System.out.println("Happy Reading!\n");
                break;
            }
            else
            {
                System.out.println("Incorrect option.");
            }
        }
    }
}
