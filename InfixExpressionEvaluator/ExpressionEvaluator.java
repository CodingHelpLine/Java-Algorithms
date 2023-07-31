import java.util.Stack;

public class ExpressionEvaluator {

    // +, -, * and / 

    // a function to find out the precedence of an operator
    private int getPriority(char operator) {
        if(operator == '*' || operator == '/') {
            return 2; 
        } else if(operator == '+' || operator == '-') {
            return 1;
        }

        // otherwise 
        return 0; 
    }

    // A function to find out whether a character is an operator
    private boolean isOperator(char operator) {
        return (operator == '*' || operator == '/' || operator == '+'
                || operator == '-');
    }

    // to check wether the character is operand or not
    private boolean isOperand(char operand) {
        return Character.isDigit(operand);
    }

    // DoArithemtic - here we operate function
    private int doArithmetic(int left, int right, char operator) 
        throws ExpressionException {
        int result = 0; 

        switch(operator) {
            case '*': result = left * right; break; 
            case '/': 
                if(right == 0) {
                    throw new ExpressionException("Math ERROR - Divide by zero");
                }

                result = left / right; break; 
            case '+': result = left + right; break; 
            case '-': result = left - right; break; 
        }
        return result; 
    }

    // A function to evalute 
    public int evaluate(String expression) throws ExpressionException {
        int result = 0;
        int left, right; 

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for(int i=0; i<expression.length(); i++) {
            
            // Step 1: Take current character from expression
            char token = expression.charAt(i);

            // Step 2: is it an operand
            if(isOperand(token)) {
                operands.push(Integer.parseInt(String.valueOf(token)));
            } else if(token == '(') {
                operators.push('(');
            } else if(token == ')') {
                while(operators.peek() != '(') {
                    // check size of operands stack, must be 2
                    if(operands.size() < 2) {
                        throw new ExpressionException("Invalid Expression");
                    }

                    right = operands.pop();
                    left = operands.pop();
                    result = doArithmetic(left, right, operators.pop()); 
                    operands.push(result);
                }
                
                operators.pop(); // remove '('
            } else if (isOperator(token)) {
                while(!operators.isEmpty() && getPriority(operators.peek())
                        >= getPriority(token)) {
                            // operand stock if we have two operands
                            // we operate the operator with most precedence
                            if(operands.size() < 2) {
                                throw new ExpressionException("Invalid Expression");  
                            }

                            right = operands.pop();
                            left = operands.pop();
                            result = doArithmetic(left, right, operators.pop());
                            operands.push(result);
                        }

                        // push current operrator to operators stack
                operators.push(token);
            }
        } // end of scannig loop

        // We will handle the left overs
        while(!operators.isEmpty()) {

            // check operands stack musth ave 2 operands
            if(operands.size() < 2) {
                throw new ExpressionException("Invalid Expression");  
            }

            right = operands.pop();
            left = operands.pop();
            result = doArithmetic(left, right, operators.pop());
            operands.push(result);
        }

        // We check how many operands are left
        if(operands.size() == 1) {
            return operands.pop();
        }

        throw new ExpressionException("Invalid Expression");
    }
}