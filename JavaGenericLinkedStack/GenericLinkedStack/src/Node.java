
/**
 * Node Class 
 * 
 * @author CodingHelpLine
 * Website: http://codinghelpline.org
 */
public class Node<T> {
    
    // Data fields
    private T data;
    private Node<T> top; 
    
    public Node(T data) {
        this.data = data; 
        this.top = null; 
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getTop() {
        return top;
    }

    public void setTop(Node<T> top) {
        this.top = top;
    }
}
