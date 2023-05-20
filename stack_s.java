import java.util.Stack;

public class s
{
    public static void main(String[] args)
    {
        Stack<String> animals = new Stack<>();
        
        animals.push("lion");
        animals.push("tiger");
        animals.push("bear");
        animals.push("elephant");

        System.out.println(animals.peek());  
        animals.pop();
        // System.out.println(animals.peek());  
        while(!animals.empty())
        {
        System.out.println(animals.peek());  
         animals.pop();   
        }
    }
}