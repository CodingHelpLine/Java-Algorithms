
/**
 * The <code>Task</code> class represents an Event having a Priority. The class 
 * encapsulates Event name and Priority as its fields. 
 *
 * @author CodingHelpLine
 * Web: https://codinghelpline.org 
 */
public class Event {

    // Name of event
    private String eventName;
    
    // Priority of the Event. 
    private int priority; 
    
    
    /**
     * Default Constructor to initialize the Objects of Task class with
     * default values. 
     * 
     * @param eventName name of event
     * @param priority of the event. 
     */
    public Event(String eventName, int priority) {
        this.eventName = eventName;
        this.priority = priority; 
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    @Override
    /**
     * Return the String representation. 
     */
    public String toString() {
        return String.format("(%s, %d)", eventName, priority);
    }
}
