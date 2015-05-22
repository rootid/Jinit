
public static int evalRPN (String result[]) {

    //
    String expression = "+-*/";

    Stack<String> evalStack = new Stack<String> ();
    for (String s : result) {

       if (expression.contains(s))  {
           int swIdx = expression.IndexOf(s);
           int a = Interger.valueOf (evalStack.pop() ) ;
           int b = Interger.valueOf (evalStack.pop() ) ;
           switch (swIdx) {
               case 0 :
                   evalStack.push(String.valueOf(b+a));
               break;

               case 1 :
                   evalStack.push(String.valueOf(b-a));
               break;

               case 2 :
                   evalStack.push(String.valueOf(b*a));
               break;

               case 3 :
                   evalStack.push(String.valueOf(b/a));
               break;

               default :
               break;
           }

       } else {
           evalStack.push(s);
       }

    }

    Integer result = Integer.valueOf ( evalStack.pop() ) ;
    return result ;
}
