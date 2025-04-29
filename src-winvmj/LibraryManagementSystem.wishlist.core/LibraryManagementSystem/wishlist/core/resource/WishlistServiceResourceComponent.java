package LibraryManagementSystem.wishlist.core;
import java.util.*;

import vmj.hibernate.integrator.RepositoryUtil;
import vmj.routing.route.VMJExchange;
//add other required packages

public abstract class WishlistServiceResourceComponent implements WishlistServiceResource{
	
	public WishlistServiceResourceComponent() { }
 
    public abstract WishlistService createWishlistService(VMJExchange vmjExchange);    
	public abstract HashMap<String, Object> updateWishlistService(VMJExchange vmjExchange);
    public abstract HashMap<String, Object> getWishlistService(VMJExchange vmjExchange);
    public abstract List<HashMap<String,Object>> getAllWishlistService(VMJExchange vmjExchange);
    public abstract List<HashMap<String,Object>> deleteWishlistService(VMJExchange vmjExchange);

	public abstract void AddBookToWishlist();

	public abstract void RemoveBookFromWishlist();

	public abstract void getWishlist();
}
