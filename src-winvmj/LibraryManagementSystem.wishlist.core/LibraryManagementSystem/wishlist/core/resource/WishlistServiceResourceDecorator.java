package LibraryManagementSystem.wishlist.core;
import java.util.*;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

public abstract class WishlistServiceResourceDecorator extends WishlistServiceResourceComponent{
	protected WishlistServiceResourceComponent record;

    public WishlistServiceResourceDecorator(WishlistServiceResourceComponent record) {
        this.record = record;
    }

    public WishlistService createWishlistService(VMJExchange vmjExchange){
		return record.createWishlistService(vmjExchange);
	}

    public HashMap<String, Object> updateWishlistService(VMJExchange vmjExchange){
		return record.updateWishlistService(vmjExchange);
	}

    public HashMap<String, Object> getWishlistService(VMJExchange vmjExchange){
		return record.getWishlistService(vmjExchange);
	}

    public List<HashMap<String,Object>> getAllWishlistService(VMJExchange vmjExchange){
		return record.getAllWishlistService(vmjExchange);
	}

    public List<HashMap<String,Object>> deleteWishlistService(VMJExchange vmjExchange){
		return record.deleteWishlistService(vmjExchange);
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
