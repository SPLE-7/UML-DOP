package LibraryManagementSystem.daftarbuku.bukufisik;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import LibraryManagementSystem.daftarbuku.core.DaftarBukuDecorator;
import LibraryManagementSystem.daftarbuku.core.DaftarBuku;
import LibraryManagementSystem.daftarbuku.core.DaftarBukuComponent;

@Entity(name="daftarbuku_bukufisik")
@Table(name="daftarbuku_bukufisik")
public class DaftarBukuImpl extends DaftarBukuDecorator {

	public DaftarBukuImpl(
        super();
        this.objectName = DaftarBukuImpl.class.getName();
    }
    
    public DaftarBukuImpl(int jumlahBuku) {
    	super();
		this.objectName = DaftarBukuImpl.class.getName();
    }
	
	public DaftarBukuImpl(DaftarBukuComponent record, int jumlahBuku) {
		super(record);
		this.objectName = DaftarBukuImpl.class.getName();
	}



}
