package LibraryManagementSystem.akun.peminjamanbuku;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import LibraryManagementSystem.akun.core.AkunDecorator;
import LibraryManagementSystem.akun.core.Akun;
import LibraryManagementSystem.akun.core.AkunComponent;

@Entity(name="akun_peminjamanbuku")
@Table(name="akun_peminjamanbuku")
public class AkunImpl extends AkunDecorator {

	protected int jumlahBukuPinjaman;
	public AkunImpl(
        super();
        this.objectName = AkunImpl.class.getName();
    }
    
    public AkunImpl(int jumlahBukuPinjaman) {
    	super();
		this.jumlahBukuPinjaman = jumlahBukuPinjaman;
		this.objectName = AkunImpl.class.getName();
    }
	
	public AkunImpl(AkunComponent record, int jumlahBukuPinjaman) {
		super(record);
		this.jumlahBukuPinjaman = jumlahBukuPinjaman;
		this.objectName = AkunImpl.class.getName();
	}

	public int getJumlahBukuPinjaman() {
		return this.jumlahBukuPinjaman;
	}

	public void setJumlahBukuPinjaman(int jumlahBukuPinjaman) {
		this.jumlahBukuPinjaman = jumlahBukuPinjaman;
	}

	public void tambahBuku(int x) {
		// TODO: implement this method
	}

}
