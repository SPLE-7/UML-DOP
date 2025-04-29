package LibraryManagementSystem.wishlist.core;
import java.util.*;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import vmj.routing.route.exceptions.*;
import LibraryManagementSystem.wishlist.WishlistServiceFactory;
//import prices.auth.vmj.annotations.Restricted;
//add other required packages

public class WishlistServiceResourceImpl extends WishlistServiceResourceComponent{
	
	private WishlistServiceServiceImpl wishlistserviceServiceImpl = new WishlistServiceServiceImpl();

	// @Restriced(permission = "")
    @Route(url="call/wishlist")
    public HashMap<String,Object> createwishlistservice(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("POST")) {
		    Map<String, Object> requestBody = vmjExchange.getPayload(); 
			WishlistService result = wishlistserviceServiceImpl.createWishlistService(requestBody);
			return result.toHashMap();
		}
		throw new NotFoundException("Route tidak ditemukan");
	}

    // @Restriced(permission = "")
    @Route(url="call/wishlist/update")
    public HashMap<String, Object> updateWishlistService(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		if (vmjExchange.getHttpMethod().equals("OPTIONS")){
			return null;
		}
		return wishlistserviceServiceImpl.updateWishlistService(requestBody);
		
	}

	// @Restriced(permission = "")
    @Route(url="call/wishlist/detail")
    public HashMap<String, Object> getWishlistService(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		return wishlistserviceServiceImpl.getWishlistService(requestBody);
	}

	// @Restriced(permission = "")
    @Route(url="call/wishlist/list")
    public List<HashMap<String,Object>> getAllWishlistService(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		return wishlistserviceServiceImpl.getAllWishlistService(requestBody);
	}

    
	// @Restriced(permission = "")
    @Route(url="call/wishlist/delete")
    public List<HashMap<String,Object>> deleteWishlistService(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		
		return wishlistserviceServiceImpl.deleteWishlistService(requestBody);
	}

	public void AddBookToWishlist() {
		// TODO: implement this method
	}

	public void RemoveBookFromWishlist() {
		// TODO: implement this method
	}

	public void getWishlist() {
		// TODO: implement this method
	}
}
