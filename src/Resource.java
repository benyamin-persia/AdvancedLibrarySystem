public abstract class Resource { // LEVEL 4: Abstraction → class is abstract (cannot create Resource directly)

    private String id; // LEVEL 2: Encapsulation → hidden field
    private String title; // LEVEL 2: Encapsulation → hidden field
    private boolean available; // LEVEL 2: Encapsulation → hidden field (true/false state)

    public Resource(String id, String title) { // LEVEL 3: Constructor → initialize object
        this.id = id; // assign id
        this.title = title; // assign title
        this.available = true; // default: resource is available
    }

    public String getId() {
        return id;
    } // LEVEL 2: Encapsulation → controlled read access

    public void setId(String id) {
        this.id = id;
    } // LEVEL 2: Encapsulation → controlled write access

    public String getTitle() {
        return title;
    } // LEVEL 2: Encapsulation → controlled read access

    public void setTitle(String title) {
        this.title = title;
    } // LEVEL 2: Encapsulation → controlled write access

    public boolean isAvailable() {
        return available;
    } // LEVEL 2: Encapsulation → boolean getter (is)

    public void setAvailable(boolean available) {
        this.available = available;
    } // controlled update (used internally)

    public abstract void borrow(); // LEVEL 4: Abstraction → no implementation, child must define

    public abstract void returnResource(); // LEVEL 4: Abstraction → no implementation, child must define
}