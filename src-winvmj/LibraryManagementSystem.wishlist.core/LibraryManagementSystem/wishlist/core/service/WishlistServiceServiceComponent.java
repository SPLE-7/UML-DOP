package LibraryManagementSystem.wishlist.core;
import java.util.*;

import vmj.hibernate.integrator.RepositoryUtil;
import vmj.routing.route.VMJExchange;
//add other required packages

public abstract class WishlistServiceServiceComponent implements WishlistServiceService{
	protected RepositoryUtil<WishlistService> Repository;

    public WishlistServiceServiceComponent(){
        this.Repository = new RepositoryUtil<WishlistService>(LibraryManagementSystem.wishlist.core.WishlistServiceComponent.class);
    }	

    public abstract List<HashMap<String,Object>> saveWishlistService(VMJExchange vmjExchange);
    public abstract WishlistService createWishlistService(Map<String, Object> requestBodye);
	public abstract WishlistService createWishlistService(Map<String, Object> requestBody, Map<String, Object> response);    
	public abstract HashMap<String, Object> updateWishlistService(Map<String, Object> requestBody);
    public abstract HashMap<String, Object> getWishlistService(Map<String, Object> requestBody);
    public abstract List<HashMap<String,Object>> getAllWishlistService(Map<String, Object> requestBody);
    public abstract List<HashMap<String,Object>> transformListToHashMap(List<WishlistService> List);
    public abstract List<HashMap<String,Object>> deleteWishlistService(Map<String, Object> requestBody);
	public abstract HashMap<String, Object> getWishlistServiceById(int id);

	public abstract void AddBookToWishlist();

	public abstract void RemoveBookFromWishlist();

	public abstract void getWishlist();
}
