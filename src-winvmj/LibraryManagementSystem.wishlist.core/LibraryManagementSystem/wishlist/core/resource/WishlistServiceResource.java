package LibraryManagementSystem.wishlist.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public interface WishlistServiceResource {
    List<HashMap<String,Object>> saveWishlistService(VMJExchange vmjExchange);
    HashMap<String, Object> updateWishlistService(VMJExchange vmjExchange);
    HashMap<String, Object> getWishlistService(VMJExchange vmjExchange);
    List<HashMap<String,Object>> getAllWishlistService(VMJExchange vmjExchange);
    List<HashMap<String,Object>> deleteWishlistService(VMJExchange vmjExchange);
	HashMap<String, Object> createWishlistService(VMJExchange vmjExhange);
}
