public class User {
    private String name;
    private Account account;
    private Feature[] features;
    private Card card;
    private News[] news;
    
    public User(String name, Account account, Feature[] features, Card card, News[] news) {
        this.name = name;
        this.account = account;
        this.features = features;
        this.card = card;
        this.news = news;
    }
    
 
    public double getAvailableBalance() {
        return account.getBalance() - card.getLimit();
    }
    
    
}

public class Account {
    private String number;
    private String agency;
    private double balance;
    private double limit;
    
    public Account(String number, String agency, double balance, double limit) {
        this.number = number;
        this.agency = agency;
        this.balance = balance;
        this.limit = limit;
    }
    
   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (balance + limit)) {
            balance -= amount;
        }
    }
}

public class Feature {
    private String icon;
    private String description;
    
    public Feature(String icon, String description) {
        this.icon = icon;
        this.description = description;
    }
    

}

public class Card {
    private String number;
    private double limit;
    private String icon;
    private String description;
    
    public Card(String number, double limit, String icon, String description) {
        this.number = number;
        this.limit = limit;
        this.icon = icon;
        this.description = description;
    }
    
}

public class News {
    private String icon;
    private String description;
    
    public News(String icon, String description) {
        this.icon = icon;
        this.description = description;
    }
    
}