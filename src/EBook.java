public class EBook extends Resource { // LEVEL 5: Inheritance → EBook is a Resource

    private double fileSize; // LEVEL 2: Encapsulation → digital property (size in MB)

    public EBook(String id, String title, double fileSize) { // LEVEL 3: Constructor
        super(id, title); // initialize common fields (id, title)
        this.fileSize = fileSize; // assign file size
    }

    public double getFileSize() {
        return fileSize;
    } // LEVEL 2: Encapsulation → read access

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    } // LEVEL 2: Encapsulation → write access

    @Override
    public void borrow() { // LEVEL 6: Polymorphism → EBook behavior (auto return)

        if (isAvailable()) { // check if access is allowed

            setAvailable(false); // mark as temporarily in use

            System.out.println("EBook accessed instantly"); // digital access message

            setAvailable(true); // 🔥 auto return → immediately available again

        } else {

            System.out.println("EBook is currently in use"); // rare case (controlled system)
        }
    }

    @Override
    public void returnResource() { // LEVEL 6: Polymorphism → required by abstraction

        setAvailable(true); // ensure it is available

        System.out.println("EBook access ended"); // confirmation message
    }
}