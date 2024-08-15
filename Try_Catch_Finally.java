/*Write a java program that usage of try, catch, finally*/

public class Try_Catch_Finally{
    static void check(int age) throws IllegalAccessException{
        System.out.println("Inside check function");
        if(age < 18)
            throw new IllegalAccessException("Demo");
    }
    public static void main(String []args){
        try{
        check(13);
        }
        catch(IllegalAccessException e){
        System.out.println("Caught"+e);
        }
        finally{
        System.out.println("Always Executed.");
        }
        }
    }
