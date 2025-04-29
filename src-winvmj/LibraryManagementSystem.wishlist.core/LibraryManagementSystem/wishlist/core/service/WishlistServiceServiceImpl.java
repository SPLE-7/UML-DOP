package LibraryManagementSystem.wishlist.core;
import java.util.*;
import com.google.gson.Gson;
import java.util.*;
import java.util.logging.Logger;
import java.io.File;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import vmj.routing.route.exceptions.*;
import LibraryManagementSystem.wishlist.WishlistServiceFactory;
import prices.auth.vmj.annotations.Restricted;
//add other required packages

public class WishlistServiceServiceImpl extends WishlistServiceServiceComponent{

    public List<HashMap<String,Object>> saveWishlistService(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		WishlistService wishlistservice = createWishlistService(vmjExchange);
		wishlistserviceRepository.saveObject(wishlistservice);
		return getAllWishlistService(vmjExchange);
	}

    public WishlistService createWishlistService(Map<String, Object> requestBody){
		
		//to do: fix association attributes
		WishlistService WishlistService = WishlistServiceFactory.createWishlistService(
			"LibraryManagementSystem.wishlist.core.WishlistServiceImpl",
		akunimpl
		, daftarbukuimpl
		, akunimpl
		, akunimpl
		);
		Repository.saveObject(wishlistservice);
		return wishlistservice;
	}

    public WishlistService createWishlistService(Map<String, Object> requestBody, int id){
		
		//to do: fix association attributes
		
		WishlistService wishlistservice = WishlistServiceFactory.createWishlistService("LibraryManagementSystem.wishlist.core.WishlistServiceImpl", akunimpl, daftarbukuimpl, akunimpl, akunimpl);
		return wishlistservice;
	}

    public HashMap<String, Object> updateWishlistService(Map<String, Object> requestBody){
		String idStr = (String) requestBody.get("");
		int id = Integer.parseInt(idStr);
		WishlistService wishlistservice = Repository.getObject(id);
		
		
		Repository.updateObject(wishlistservice);
		
		//to do: fix association attributes
		
		return wishlistservice.toHashMap();
		
	}

    public HashMap<String, Object> getWishlistService(Map<String, Object> requestBody){
		List<HashMap<String, Object>> wishlistserviceList = getAllWishlistService("wishlistservice_impl");
		for (HashMap<String, Object> wishlistservice : wishlistserviceList){
			int record_id = ((Double) wishlistservice.get("record_id")).intValue();
			if (record_id == id){
				return wishlistservice;
			}
		}
		return null;
	}

	public HashMap<String, Object> getWishlistServiceById(int id){
		String idStr = vmjExchange.getGETParam(""); 
		int id = Integer.parseInt(idStr);
		WishlistService wishlistservice = wishlistserviceRepository.getObject(id);
		return wishlistservice.toHashMap();
	}

    public List<HashMap<String,Object>> getAllWishlistService(Map<String, Object> requestBody){
		String table = (String) requestBody.get("table_name");
		List<WishlistService> List = Repository.getAllObject(table);
		return transformListToHashMap(List);
	}

    public List<HashMap<String,Object>> transformListToHashMap(List<WishlistService> List){
		List<HashMap<String,Object>> resultList = new ArrayList<HashMap<String,Object>>();
        for(int i = 0; i < List.size(); i++) {
            resultList.add(List.get(i).toHashMap());
        }

        return resultList;
	}

    public List<HashMap<String,Object>> deleteWishlistService(Map<String, Object> requestBody){
		String idStr = ((String) requestBody.get("id"));
		int id = Integer.parseInt(idStr);
		Repository.deleteObject(id);
		return getAllWishlistService(requestBody);
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
