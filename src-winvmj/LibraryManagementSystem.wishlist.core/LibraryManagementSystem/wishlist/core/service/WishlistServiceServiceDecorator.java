package LibraryManagementSystem.wishlist.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public abstract class WishlistServiceServiceDecorator extends WishlistServiceServiceComponent{
	protected WishlistServiceServiceComponent record;

    public WishlistServiceServiceDecorator(WishlistServiceServiceComponent record) {
        this.record = record;
    }

	public WishlistServiceImpl createWishlistService(Map<String, Object> requestBody){
		return record.createWishlistService(requestBody);
	}

    public WishlistService createWishlistService(Map<String, Object> requestBody, Map<String, Object> response){
		return record.createWishlistService(requestBody, response);
	}

	public HashMap<String, Object> getWishlistService(Map<String, Object> requestBody){
		return record.getWishlistService(requestBody);
	}

	public List<HashMap<String,Object>> getAllWishlistService(Map<String, Object> requestBody){
		return record.getAllWishlistService(requestBody);
	}

    public List<HashMap<String,Object>> saveWishlistService(VMJExchange vmjExchange){
		return record.saveWishlistService(vmjExchange);
	}

    public HashMap<String, Object> updateWishlistService(Map<String, Object> requestBody){
		return record.updateWishlistService(requestBody);
	}

    public List<HashMap<String,Object>> transformListToHashMap(List<WishlistService> List){
		return record.transformListToHashMap(List);
	}

    public List<HashMap<String,Object>> deleteWishlistService(Map<String, Object> requestBody){
		return record.deleteWishlistService(requestBody);
	}

	public HashMap<String, Object> getWishlistServiceById(int id){
        return record.getWishlistServiceById(id);
    }

	public void AddBookToWishlist() {
		return record.AddBookToWishlist();
	}

	public void RemoveBookFromWishlist() {
		return record.RemoveBookFromWishlist();
	}

	public void getWishlist() {
		return record.getWishlist();
	}
}
