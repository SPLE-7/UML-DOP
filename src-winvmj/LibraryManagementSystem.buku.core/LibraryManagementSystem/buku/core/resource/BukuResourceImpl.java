package LibraryManagementSystem.buku.core;
import java.util.*;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import vmj.routing.route.exceptions.*;
import LibraryManagementSystem.buku.BukuFactory;
//import prices.auth.vmj.annotations.Restricted;
//add other required packages

public class BukuResourceImpl extends BukuResourceComponent{
	
	private BukuServiceImpl bukuServiceImpl = new BukuServiceImpl();

	// @Restriced(permission = "")
    @Route(url="call/buku")
    public HashMap<String,Object> createbuku(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("POST")) {
		    Map<String, Object> requestBody = vmjExchange.getPayload(); 
			Buku result = bukuServiceImpl.createBuku(requestBody);
			return result.toHashMap();
		}
		throw new NotFoundException("Route tidak ditemukan");
	}

    // @Restriced(permission = "")
    @Route(url="call/buku/update")
    public HashMap<String, Object> updateBuku(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		if (vmjExchange.getHttpMethod().equals("OPTIONS")){
			return null;
		}
		return bukuServiceImpl.updateBuku(requestBody);
		
	}

	// @Restriced(permission = "")
    @Route(url="call/buku/detail")
    public HashMap<String, Object> getBuku(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		return bukuServiceImpl.getBuku(requestBody);
	}

	// @Restriced(permission = "")
    @Route(url="call/buku/list")
    public List<HashMap<String,Object>> getAllBuku(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		return bukuServiceImpl.getAllBuku(requestBody);
	}

    
	// @Restriced(permission = "")
    @Route(url="call/buku/delete")
    public List<HashMap<String,Object>> deleteBuku(VMJExchange vmjExchange){
		Map<String, Object> requestBody = vmjExchange.getPayload(); 
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		
		return bukuServiceImpl.deleteBuku(requestBody);
	}

}
