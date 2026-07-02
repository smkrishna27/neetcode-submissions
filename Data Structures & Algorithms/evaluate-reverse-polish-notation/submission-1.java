class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack=new Stack();
        Set<String> operators=Set.of("+", "-", "*","/");

        for(String token:tokens){
            if(operators.contains(token)){
                int a= stack.pop();
                int b= stack.pop();
                calculator(a, b,stack, token);
                
            } else{
                stack.push(Integer.valueOf(token));
            }

        }

        return stack.pop();
    }
    private void calculator(int a, int b,Stack stack, String token){
        switch(token)
        {
            case "+":
            stack.push(a+b);
            break;
             case "-":
            stack.push(b-a);
            break;
             case "*":
            stack.push(a*b);
            break;
             case "/":
            stack.push(b/a);
            break;
            default:

        }


    }
}
