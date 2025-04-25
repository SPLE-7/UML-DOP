package LibraryManagementSystem.akun.peminjamanbuku;
import java.util.*;

import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import LibraryManagementSystem.akun.core.AkunResourceDecorator;
import LibraryManagementSystem.akun.core.AkunImpl;
import LibraryManagementSystem.akun.core.AkunResourceComponent;

public class AkunResourceImpl extends AkunResourceDecorator {
    public AkunResourceImpl (AkunResourceComponent record) {
        super(record);
    }

    // @Restriced(permission = "")
    @Route(url="call/peminjamanbuku/save")
    public List<HashMap<String,Object>> save(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		  = create(vmjExchange);
		Repository.saveObject();
		return getAll(vmjExchange);
	}

    public Akun create(VMJExchange vmjExchange){
		String jumlahBukuPinjamanStr = (String) vmjExchange.getRequestBodyForm("jumlahBukuPinjaman");
		int jumlahBukuPinjaman = Integer.parseInt(jumlahBukuPinjamanStr);
		
		  = record.create(vmjExchange);
		 deco = Factory.create("LibraryManagementSystem.peminjamanbuku.core.AkunImpl", , jumlahBukuPinjaman);
			return deco;
	}

    public Akun create(VMJExchange vmjExchange, int id){
		String jumlahBukuPinjamanStr = (String) vmjExchange.getRequestBodyForm("jumlahBukuPinjaman");
		int jumlahBukuPinjaman = Integer.parseInt(jumlahBukuPinjamanStr);
		  = Repository.getObject(id);
		int recordId = (((Decorator) saved.getRecord()).getId();
		
		  = record.create(vmjExchange);
		 deco = Factory.create("LibraryManagementSystem.peminjamanbuku.core.AkunImpl", id, , jumlahBukuPinjaman);
			return deco;
	}

    // @Restriced(permission = "")
    @Route(url="call/peminjamanbuku/update")
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
    @Route(url="call/peminjamanbuku/detail")
    public HashMap<String, Object> get(VMJExchange vmjExchange){
		return record.getAkun(vmjExchange);
	}

	// @Restriced(permission = "")
    @Route(url="call/peminjamanbuku/list")
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
    @Route(url="call/peminjamanbuku/delete")
    public List<HashMap<String,Object>> deleteAkun(VMJExchange vmjExchange){
		if (vmjExchange.getHttpMethod().equals("OPTIONS")) {
			return null;
		}
		
		String idStr = (String) vmjExchange.getRequestBodyForm("");
		int id = Integer.parseInt(idStr);
		Repository.deleteObject(id);
		return getAll(vmjExchange);
	}

	public void tambahBuku(int x) {
		// TODO: implement this method
	}
}
