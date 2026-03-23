public class Main {

    public static void main(String[] args){

        Book one = new Book("Lord of the Rings", "Talkien", 1000, true);
        Book two = new Book("Harry Potter", "J.K Rowling", 500, true);
        Book three = new Book("Percy Jackson", "Rick Roidian", 360, true);


        Reader first = new Reader("Jan", "Kowalski", "S001");
        Reader second = new Reader("Anna", "Nowak", "S002");

        first.printData();
        second.printData();
    }
}