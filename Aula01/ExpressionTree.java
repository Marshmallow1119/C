import java.util.Scanner;

public class ExpressionTree {

    public static class Tree {
        String valor;
        Tree left, right;

        Tree(String valor, Tree left, Tree right) {
            this.valor = valor;
            this.left = left;
            this.right = right;
        }

        Tree(String valor) {
            this(valor, null, null);
        }
        
    }

    public static Tree createTree(Scanner input) {
        if (input.hasNextDouble()) {
            return new Tree(Double.toString(input.nextDouble()));
        }
        else {
            String val = input.next();
            Tree left = createTree(input);
            Tree right = createTree(input);
            return new Tree(val, left, right);
        }
    }

    public static void printTree(Tree root) {
        if (root == null) {
            return;
        }
        // Print left subtree
        if (root.left != null || root.right != null) {
            System.out.print("(");
        }
        printTree(root.left);
        // Print root value
        System.out.print(root.valor + " ");
        // Print right subtree
        printTree(root.right);
        if (root.left != null || root.right != null) {
            System.out.print(")");
        }
    }
    public static double calculateValue(Tree root){
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null){
            return Double.parseDouble(root.valor);
        }
        double left = calculateValue(root.left);
        double right = calculateValue(root.right);
        switch (root.valor){
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "/":
                return left / right;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        // Example usage
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression in postfix notation:");
        Tree expressionTree = createTree(scanner);
        System.out.println("Expression tree created.");
        printTree(expressionTree);
        double result = calculateValue(expressionTree);
        System.out.println(" = " + result);
    }
}
