public class Book extends Resource { // LEVEL 5: Inheritance → Book is a type of Resource

    private int pages; // LEVEL 2: Encapsulation → specific property for Book (not all resources have pages)

    public Book(String id, String title, int pages) { // LEVEL 3: Constructor → initialize Book object
        super(id, title); // call parent (Resource) constructor to set id and title
        this.pages = pages; // assign pages specific to Book
    }

    public int getPages() {
        return pages;
    } // LEVEL 2: Encapsulation → read access

    public void setPages(int pages) {
        this.pages = pages;
    } // LEVEL 2: Encapsulation → write access

    @Override
    public void borrow() { // LEVEL 6: Polymorphism → Book defines its own borrowing behavior

        if (isAvailable()) { // check if the book is currently available

            setAvailable(false); // mark as NOT available → someone is now using the book

            System.out.println("Book borrowed. Due date in 14 days."); // normal borrowing rule for physical books

        } else { // if already borrowed

            System.out.println("Book is not available."); // prevent multiple users from borrowing same book
        }
    }

    @Override
    public void returnResource() { // LEVEL 6: Polymorphism → Book return behavior

        setAvailable(true); // mark as available again → ready for next user

        System.out.println("Book returned."); // confirmation message
    }
}