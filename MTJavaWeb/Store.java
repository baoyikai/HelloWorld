public class Store{
    String productType;
    double price;
    //构造方法
    public Store(String product,double initialPrice){
        productType = product;
        price = initialPrice;
    }
    //广告方法
    public void advertise(){
        System.out.println("Selling " + productType + "!");
        System.out.println("Come and spend some money!");
    }
    //欢迎顾客的方法
    public void greetCustomers(String customer){
        System.out.println("Welcome to the store, " + customer + "!");
    }
    //涨价的方法
    public void increasePrice(double priceToAdd){
        double newPrice = priceToAdd + price;
        price = newPrice;
        System.out.println("The " + productType + " is increase $" + priceToAdd + " to " + price);
    }
    //打印价格方法加税
    public void getPriceWithTax(){
        double tax = 0.08;
        double totalPrice = price + price * tax;
        System.out.println("The price of " + productType + "with tax is $" + totalPrice);
    }

    //toString（）方法
    public String toString(){
        return "This store sells " + productType + " at a price of " + price + ".";
    }

    public static void main(String[] args){
        Store lemonadeStand = new Store("lemonade",3.75);
        System.out.println(lemonadeStand);
        lemonadeStand.advertise();
        lemonadeStand.greetCustomers("Bao yikai");
        lemonadeStand.increasePrice(1.5);
        lemonadeStand.getPriceWithTax();


        System.out.println("––––––––––––––––––––––");
        String cookie = "cookies";
        Store cookieShop = new Store(cookie,1.75);
        System.out.println(cookieShop);
        cookieShop.advertise();
        cookieShop.greetCustomers("Bao Yikai");
        cookieShop.increasePrice(1.2);
        cookieShop.getPriceWithTax();  
    }
}