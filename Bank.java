class Bank{
    int count = 0;
    Account[] accounts = new Account[100];
    public int createAccount(Customer owner, double overdraftLimit){
        if (count < 100){
            accounts[count] = new Account(count, overdraftLimit, owner);
            count++;
            return (count-1);
        }
        else{
            return -1;
        }
    }
    public boolean deposit(int accountNo, double amount){
        if (accountNo <= 100 && accountNo >=0 && accountNo <= count){
            accounts[accountNo].deposit(amount);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean withdraw(int accountNo, double amount){
        if (accountNo <= 100 && accountNo >=0 && accounts[accountNo].kontoStand - amount >= 0 - accounts[accountNo].uberziehungsRahmen && accountNo < count){
            accounts[accountNo].withdraw(amount);
            return true;
        }
        else{
            return false;
        }
    }
    public boolean transfer(int fromAccountNo, int toAccountNo, double amount){
        if (fromAccountNo <= 100 && fromAccountNo >=0 && fromAccountNo <= count && accounts[fromAccountNo].kontoStand - amount >= 0 - accounts[fromAccountNo].uberziehungsRahmen ){
            if(toAccountNo <= 100 && toAccountNo >=0 && toAccountNo <= count){
                accounts[fromAccountNo].withdraw(amount);
                accounts[toAccountNo].deposit(amount);
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    public double getAccountBalance(int accountNo){
        return accounts[accountNo].getBalance();
    }
    public double getBalance(){
        double sum = 0;
        for (int i = 0; i < count; i++){
            sum += accounts[i].getBalance();
        }
        return sum;
    }
    public void printAccounts(){
        Out.println("-------------\nBankauszug\n-------------");
        for (int i = 0; i < count; i++){
            Out.println("Kontonummer: " + accounts[i].kontoNummer);
            Out.println("Kontoinhaber: " + accounts[i].inhaber.name);
            Out.println("Adresse: " + accounts[i].inhaber.addresse);
            Out.println("Telefonnummer: " + accounts[i].inhaber.telefonNr);
            Out.println("Kontostand: " + accounts[i].kontoStand);
            Out.println("Ueberziehungsrahmen: " + accounts[i].uberziehungsRahmen);
            Out.println("---------------------------------------");
        }
        Out.println("Bilanzsumme: \n" + this.getBalance() + "\n---------------------------------------");
    }
    public void printAccount(String customerName){
        Out.println("-------- Konten von \"" + customerName +"\" --------" );
        for (int i = 0; i < count; i++){
            if (accounts[i].inhaber.name.indexOf(customerName) != -1){
                Out.println("Kontonummer: " + accounts[i].kontoNummer);
                Out.println("Kontoinhaber: " + accounts[i].inhaber.name);
                Out.println("Adresse: " + accounts[i].inhaber.addresse);
                Out.println("Telefonnummer: " + accounts[i].inhaber.telefonNr);
                Out.println("Kontostand: " + accounts[i].kontoStand);
                Out.println("Ueberziehungsrahmen: " + accounts[i].uberziehungsRahmen);
                Out.println("---------------------------------------");
            }
        }

    }





}
