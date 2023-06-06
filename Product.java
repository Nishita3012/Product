package product;

public class Product {
	

	
	    String name;
	    double price;
	    int quantity ;
	    static int totalSold=0;
	    
	    public Product(String name, double price, int quantity){
	        this.name = name;
	        this.price = price;
	        this.quantity = quantity;
	    }
	    public void sell(int quantity){
	      if(quantity<=this.quantity){
	        this.quantity -= quantity;
	            totalSold += quantity;
	            System.out.println(quantity + " " + name + " sold.");
	      }
	      else{
	        System.out.println("Insufficient quantity of " + name + " to sell.");
	      }
	    }
	    
	    static int getTotalSold(){
	        return totalSold;
	    }
	
	public class Q2 {
	    public static void main(String[] args) {
	        
	        Product product1 = new Product("Book", 99.99, 50);
	        Product product2 = new Product("Pen", 1.99, 100);
	        Product product3 = new Product("Notebook", 19.99, 30);
	        product1.sell(20);
	        product2.sell(50);
	        product3.sell(10);
	        int totalSold = Product.getTotalSold();
	        System.out.println("Total quantity of products sold: " + totalSold);
	    }

	}

}
