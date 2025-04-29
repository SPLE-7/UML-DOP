package LibraryManagementSystem.wishlist.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public interface WishlistServiceService {
	WishlistService createWishlistService(Map<String, Object> requestBody);
	WishlistService createWishlistService(Map<String, Object> requestBody, Map<String, Object> response);
	HashMap<String, Object> getWishlistService(Map<String, Object> requestBody);
    List<HashMap<String,Object>> saveWishlistService(Map<String, Object> requestBody);
    HashMap<String, Object> updateWishlistService(Map<String, Object> requestBody);
    HashMap<String, Object> getWishlistServiceById(int id);
    List<HashMap<String,Object>> getAllWishlistService(Map<String, Object> requestBody);
    List<HashMap<String,Object>> deleteWishlistService(Map<String, Object> requestBody);
	List<HashMap<String, Object>> transformListToHashMap(List<Disbursement> List);
}
