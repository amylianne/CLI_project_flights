public class ExceptionsDemo {
    public static void main(String[] args) {
//        if (doSomething(100)){
//            System.out.println("input is valid");
//        }
//        else {
//            System.out.println("invalid input");
//        }
//    }
        // alt method
        try {
            doSomething(1);
            System.out.println("operation successful");
            //catch - executed if an error occurs in the try block.
        } catch (Exception exception) {
            System.out.println("something went wrong");
        }
    }

//
    public static boolean doSomething (int input) throws Exception{
        if (input > 10){
            return true;
        }
        throw new Exception("invalid input");
    }
}
