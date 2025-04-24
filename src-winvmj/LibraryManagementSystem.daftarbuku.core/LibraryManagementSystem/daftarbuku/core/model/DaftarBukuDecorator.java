package LibraryManagementSystem.daftarbuku.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.OneToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.CascadeType;
//add other required packages

@MappedSuperclass
public abstract class DaftarBukuDecorator extends DaftarBukuComponent{
    @OneToOne(cascade=CascadeType.ALL)
	protected DaftarBukuComponent record;

	public DaftarBukuDecorator () {
		super();
		this.record = record;
		this.idBuku =  idBuku.randomUUID();
		
	public DaftarBukuDecorator (DaftarBukuComponent record) {
		this.idBuku =  idBuku.randomUUID();
		this.record = record;
	}

	public DaftarBukuDecorator (int idBuku, DaftarBukuComponent record) {
		this.idBuku =  idBuku;
		this.record = record;
	}
	
	public DaftarBukuDecorator (DaftarBukuComponent record, String objectName) {
		this.idBuku =  idBuku.randomUUID();
		this.record = record;	
		this.objectName=objectName;
	}

	public DaftarBukuDecorator() { }

	public int getIdBuku() {
		return record.getIdBuku();
	}
	public void setIdBuku(int idBuku) {
		record.setIdBuku(idBuku);
	}
	public String getJudulBuku() {
		return record.getJudulBuku();
	}
	public void setJudulBuku(String judulBuku) {
		record.setJudulBuku(judulBuku);
	}
	public String getPenulis() {
		return record.getPenulis();
	}
	public void setPenulis(String penulis) {
		record.setPenulis(penulis);
	}
	public String getPenerbit() {
		return record.getPenerbit();
	}
	public void setPenerbit(String penerbit) {
		record.setPenerbit(penerbit);
	}
	public int getJumlahHalaman() {
		return record.getJumlahHalaman();
	}
	public void setJumlahHalaman(int jumlahHalaman) {
		record.setJumlahHalaman(jumlahHalaman);
	}
	public String getDeskripsiBuku() {
		return record.getDeskripsiBuku();
	}
	public void setDeskripsiBuku(String deskripsiBuku) {
		record.setDeskripsiBuku(deskripsiBuku);
	}


	public HashMap<String, Object> toHashMap() {
        return this.record.toHashMap();
    }

}
