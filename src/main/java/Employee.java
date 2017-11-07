/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /**
     * hi.
     */
    private String name;
    /**
     * hi.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param name2 hi.
     * @param manager2 hi.
     */
    public Employee(final String name2, final String manager2) {
        this.name = name2;
        this.manager = manager2;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param name2 hi.
     */
    public void setName(final String name2) {
        this.name = name2;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param manager2 hi.
     */
    public void setManager(final String manager2) {
        this.manager = manager2;
    }
}
