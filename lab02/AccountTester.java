package lab02;

public class AccountTester{

    public static Account maxAccount(Account[] accounts){
      Account maxAccount = accounts [0];
      for (int i = 1; i < accounts.length ;i++ ) {
        if(maxAccount.money < accounts[i].money){
          maxAccount = accounts[i];
        }
      }
      return maxAccount;
    }

    public static Account enhancedMaxAccount(Account[] accounts){
      Account maxAccount = accounts[0];
      for(Account a: accounts){
        if (maxAccount.money < a.money) {
          maxAccount = a;
        }
      }
      return maxAccount;
    }

    public static Account enhancedMinAccount(Account[] accounts){
      Account minAccount = accounts[0];
      for(Account a: accounts){
        if (minAccount.money > a.money) {
          minAccount = a;
        }
      }
      return minAccount;
    }

    public static Account minAccount(Account[] accounts){
      Account minAccount = accounts [0];
      for (int i = 1; i < accounts.length ;i++ ) {
        if(minAccount.money > accounts[i].money){
          minAccount = accounts[i];
        }
      }
      return minAccount;
    }

    public static void deposit(Account[] accounts, int deposit){
      for (Account a : accounts){
        a.deposit(deposit);
      }
    }

    public static void main(String[] args) {
      Account test1 = new Account(10);
      Account test2 = new Account(5);
      Account test3 = new Account(12);
      Account test4 = new Account(16);
      Account test5 = new Account(15);
      Account test6 = new Account(22);
      Account test7 = new Account(33);
      Account test8 = new Account(44);
      Account test9 = new Account(11);
      Account test10 = new Account(10);
      Account [] accountArray = {test10,test9,test8,test7,
                                 test6, test5,test4,test3,
                                  test2,test1};
      System.out.println("Balance in each account");
      for (Account a : accountArray){
        System.out.println(a.money);
      }

      Account maxAccount = maxAccount(accountArray);
      Account enhancedMA = enhancedMaxAccount(accountArray);
      Account minAccount = minAccount(accountArray);
      Account enhancedMin = enhancedMinAccount(accountArray);
      System.out.println("Expected Max: 44");
      System.out.println("Regular for loop: "+maxAccount.money);
      System.out.println("Enhanced for loop: "+enhancedMA.money);
      System.out.println("Expected Min: 5");
      System.out.println("Regular for loop: "+minAccount.money);
      System.out.println("Enhanced for loop: "+enhancedMin.money);

      deposit(accountArray,10);
      System.out.println("Balance in each account after deposit");
      for (Account a : accountArray){
        System.out.println(a.money);
      }

      Account[] arr = null;

      if (arr != null) {
        for (int i = 0; i < arr.length; ++i) {
        System.out.println(arr[i]);
      }
      }


    }
}
