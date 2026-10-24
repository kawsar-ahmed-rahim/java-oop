package bank;

class Account {
    public String name;
    //! use of private access modifier
    private String password;

    public String getPassword(){//getters
        return this.password;
    }

    public void setPassword(String pass){//setters
        this.password = pass;
    }
}

public class Bank {
    public static void main(String args[]){
        Account acc1 = new Account();
        acc1.setPassword("abcd");
        System.out.println(acc1.getPassword());
    }

}