package duke.extensions;

/**
 * Enum priority that allows labelling of tasks by priority levels
 */
public enum Priority {
    LOW, MEDIUM, HIGH;

    /**
     * Method to get priority level of a task
     *
     * @return integer value representing the priority level of the task
     */
    public int priorityLevel() {
        switch (this) {
        case LOW:
            return 0;
        case MEDIUM:
            return 1;
        default:
            return 2;
        }
    }

    /**
     * Method to get String version of each priority
     *
     * @return String corresponding to each priority
     */
    public String priorityCode() {
        switch (this) {
        case LOW:
            return "Low";
        case MEDIUM:
            return "Medium";
        default:
            return "High";
        }
    }
}
