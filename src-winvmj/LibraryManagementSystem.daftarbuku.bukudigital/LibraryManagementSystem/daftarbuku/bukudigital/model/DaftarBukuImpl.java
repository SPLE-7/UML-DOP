package LibraryManagementSystem.daftarbuku.bukudigital;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import LibraryManagementSystem.daftarbuku.core.DaftarBukuDecorator;
import LibraryManagementSystem.daftarbuku.core.DaftarBuku;
import LibraryManagementSystem.daftarbuku.core.DaftarBukuComponent;

@Entity(name="daftarbuku_bukudigital")
@Table(name="daftarbuku_bukudigital")
public class DaftarBukuImpl extends DaftarBukuDecorator {

	public DaftarBukuImpl(
        super();
        this.objectName = DaftarBukuImpl.class.getName();
    }
    
    public DaftarBukuImpl(String linkBuku) {
    	super();
		this.objectName = DaftarBukuImpl.class.getName();
    }
	
	public DaftarBukuImpl(DaftarBukuComponent record, String linkBuku) {
		super(record);
		this.objectName = DaftarBukuImpl.class.getName();
	}



}
