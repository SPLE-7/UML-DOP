package LibraryManagementSystem.peminjamanbuku.core;

import java.lang.Math;
import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity(name="peminjamanbuku_impl")
@Table(name="peminjamanbuku_impl")
public class PeminjamanBukuImpl extends PeminjamanBukuComponent {

	public PeminjamanBukuImpl(int idPeminjamanBuku, String status, AkunImpl akunimpl, DaftarBukuImpl daftarbukuimpl) {
		this.idPeminjamanBuku = idPeminjamanBuku;
		this.status = status;
		this.akunimpl = akunimpl;
		this.daftarbukuimpl = daftarbukuimpl;
	}

	public PeminjamanBukuImpl(String status, AkunImpl akunimpl, DaftarBukuImpl daftarbukuimpl) {
		this.idPeminjamanBuku =  idPeminjamanBuku.randomUUID();;
		this.status = status;
		this.akunimpl = akunimpl;
		this.daftarbukuimpl = daftarbukuimpl;
	}

	public PeminjamanBukuImpl() { }

	public int getIdPeminjamanBuku() {
		return this.idPeminjamanBuku;
	}

	public void setIdPeminjamanBuku(int idPeminjamanBuku) {
		this.idPeminjamanBuku = idPeminjamanBuku;
	}
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> peminjamanbukuMap = new HashMap<String,Object>();
		peminjamanbukuMap.put("idPeminjamanBuku",getIdPeminjamanBuku());
		peminjamanbukuMap.put("status",getStatus());
		peminjamanbukuMap.put("akunimpl",getAkunimpl());
		peminjamanbukuMap.put("daftarbukuimpl",getDaftarbukuimpl());

        return peminjamanbukuMap;
    }

}
