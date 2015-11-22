package Adapter;

/**
 * Created by Serhat CAN on 22.11.2015.
 */
public class Account {

    private String id;
    private String name;
    private boolean valid;

    public Account(String id, String name, boolean valid) {
        this.id = id;
        this.name = name;
        this.valid = valid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Used to determine weather this object should be copied or not!
     * Should be set on object creation
     *
     * @return true if object should be copied
     */
    public boolean isValid() {
        return valid;
    }

}
