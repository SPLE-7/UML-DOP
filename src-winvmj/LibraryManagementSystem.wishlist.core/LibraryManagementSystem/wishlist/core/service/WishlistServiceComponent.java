package LibraryManagementSystem.wishlist.core;
import java.util.*;

import vmj.hibernate.integrator.RepositoryUtil;
import vmj.routing.route.VMJExchange;
//add other required packages

public abstract class WishlistServiceComponent implements WishlistService{
	protected RepositoryUtil<Wishlist> Repository;

    public WishlistServiceComponent(){
        this.Repository = new RepositoryUtil<Wishlist>(LibraryManagementSystem.wishlist.core.WishlistComponent.class);
    }	

    public abstract List<HashMap<String,Object>> saveWishlist(VMJExchange vmjExchange);
    public abstract Wishlist createWishlist(Map<String, Object> requestBodye);
	public abstract Wishlist createWishlist(Map<String, Object> requestBody, Map<String, Object> response);    
	public abstract HashMap<String, Object> updateWishlist(Map<String, Object> requestBody);
    public abstract HashMap<String, Object> getWishlist(Map<String, Object> requestBody);
    public abstract List<HashMap<String,Object>> getAllWishlist(Map<String, Object> requestBody);
    public abstract List<HashMap<String,Object>> transformListToHashMap(List<Wishlist> List);
    public abstract List<HashMap<String,Object>> deleteWishlist(Map<String, Object> requestBody);
	public abstract HashMap<String, Object> getWishlistById(int id);

	public abstract void addBookToWishlist();

	public abstract void removeBookFromWishlist();

	public abstract void getWishlist();
}
