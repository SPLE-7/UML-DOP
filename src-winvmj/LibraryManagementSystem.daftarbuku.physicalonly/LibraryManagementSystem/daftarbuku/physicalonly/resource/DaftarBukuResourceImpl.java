package LibraryManagementSystem.daftarbuku.physicalonly;
import java.util.*;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import LibraryManagementSystem.daftarbuku.core.DaftarBukuResourceDecorator;
import LibraryManagementSystem.daftarbuku.core.DaftarBukuImpl;
import LibraryManagementSystem.daftarbuku.core.DaftarBukuResourceComponent;

public class DaftarBukuResourceImpl extends DaftarBukuResourceDecorator {
    public DaftarBukuResourceImpl (DaftarBukuResourceComponent record) {
        super(record);
    }

    // @Restriced(permission = "")
    @Route(url="call/physicalonly/save")
    public List<HashMap<String,Object>> save(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		  = create(vmjExchange);
		Repository.saveObject();
		return getAll(vmjExchange);
	}

    public DaftarBuku create(VMJExchange vmjExchange){
		String jumlahBukuStr = (String) vmjExchange.getRequestBodyForm("jumlahBuku");
		int jumlahBuku = Integer.parseInt(jumlahBukuStr);
		
		  = record.create(vmjExchange);
		 deco = Factory.create("LibraryManagementSystem.physicalonly.core.DaftarBukuImpl", , jumlahBuku);
			return deco;
	}

    public DaftarBuku create(VMJExchange vmjExchange, int id){
		String jumlahBukuStr = (String) vmjExchange.getRequestBodyForm("jumlahBuku");
		int jumlahBuku = Integer.parseInt(jumlahBukuStr);
		  = Repository.getObject(id);
		int recordId = (((Decorator) saved.getRecord()).getId();
		
		  = record.create(vmjExchange);
		 deco = Factory.create("LibraryManagementSystem.physicalonly.core.DaftarBukuImpl", id, , jumlahBuku);
			return deco;
	}

    // @Restriced(permission = "")
    @Route(url="call/physicalonly/update")
    public HashMap<String, Object> update(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		String idStr = (String) vmjExchange.getRequestBodyForm("");
		int id = Integer.parseInt(idStr);
		
		  = Repository.getObject(id);
		 = create(vmjExchange, id);
		
		Repository.updateObject();
		 = Repository.getObject(id);
		//to do: fix association attributes
		
		return .toHashMap();
		
	}

	// @Restriced(permission = "")
    @Route(url="call/physicalonly/detail")
    public HashMap<String, Object> get(VMJExchange vmjExchange){
		return record.getDaftarBuku(vmjExchange);
	}

	// @Restriced(permission = "")
    @Route(url="call/physicalonly/list")
    public List<HashMap<String,Object>> getAll(VMJExchange vmjExchange){
		List<> List = Repository.getAllObject("_impl");
		return transformListToHashMap(List);
	}

    public List<HashMap<String,Object>> transformListToHashMap(List<> List){
		List<HashMap<String,Object>> resultList = new ArrayList<HashMap<String,Object>>();
        for(int i = 0; i < List.size(); i++) {
            resultList.add(List.get(i).toHashMap());
        }

        return resultList;
	}

	// @Restriced(permission = "")
    @Route(url="call/physicalonly/delete")
    public List<HashMap<String,Object>> deleteDaftarBuku(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		
		String idStr = (String) vmjExchange.getRequestBodyForm("");
		int id = Integer.parseInt(idStr);
		Repository.deleteObject(id);
		return getAll(vmjExchange);
	}

}
