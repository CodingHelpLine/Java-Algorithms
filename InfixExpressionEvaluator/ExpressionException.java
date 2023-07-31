public class ExpressionException extends Exception {
    
    public ExpressionException() {
        super("ExpressionException: Invalid Expression");
    }

    public ExpressionException(String message) {
        super(message); 
    }
}
