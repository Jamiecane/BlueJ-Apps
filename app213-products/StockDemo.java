import java.util.Random;
/**
 * Demonstrate the StockList and Product classes.
 * The demonstration becomes properly functional as
 * the StockList class is completed.
 * 
 * @author Jamie Cane
 * @version 2021-11-12
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    
    private Random generator = new Random();

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
    
        this.stock = stock;
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
    stock.add(new Product(100, "Xbox One: Red Dead Redemption 2"));
    stock.add(new Product(101, "PS4: Fifa 22"));
    stock.add(new Product(102, "Nintendo Wii: Wii Sports"));
    stock.add(new Product(103, "Nintendo Switch: Mario Kart 8"));
    stock.add(new Product(104, "PS5: Call Of Duty - Vanguard"));
    stock.add(new Product(105, "Xbox Series S: Halo Infinite"));
    stock.add(new Product(106, "PS4: FarCry 6"));
    stock.add(new Product(107, "Nintendo Switch: Metroid Dread"));
    stock.add(new Product(108, "Xbox 360: Fallout New Vegas"));
    stock.add(new Product(109, "Xbox One: Crash Team Racing - Remastered"));    
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    /**
     * These methods will buy different quantities of
     * each of the products in the stock list.
     */
    private void buyProducts()
    {
        Product product;
        int quantity = 1;
        
        for(int id = 100; id <= 109; id++)
        {
            product = stock.findProduct(id);
            
            if(product == null)
            {
                System.out.println("Product " + id + " Not found");
            }
            else
            {
               quantity = generator.nextInt(15);
               stock.buyProduct(id, quantity);
            }
        }
    }

    /**
     * Thise method will sell different quantities of
     * each of the products in the stock list.
     */    
    private void sellProducts()
    {
        Product product;
        int quantity = 1;
        
        for(int id = 100; id <= 110; id++)
        {
            product = stock.findProduct(id);
            
            if(product == null)
            {
                System.out.println("Product " + id + " Not found");
            }
            else
            {
               quantity = generator.nextInt(16);
               stock.sellProduct(id, quantity);
            }
        }
        
    }    
}