package LibraryManagementSystem.akun.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="akun_comp")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class AkunComponent implements Akun{
	@Id
	protected int idAkun; 
	protected String nama;
	@ManyToOne(targetEntity=LibraryManagementSystem.daftarbuku.core.DaftarBukuComponent.class)
	public DaftarBuku daftarbukuimpl;
	protected String objectName = AkunComponent.class.getName();

	public AkunComponent() {

	} 

	public AkunComponent(
        int idAkun, String nama, DaftarBukuImpl daftarbukuimpl
    ) {
        this.idAkun = idAkun;
        this.nama = nama;
        this.daftarbukuimpl = daftarbukuimpl;
    }

	public int getIdAkun() {
		return this.idAkun;
	}

	public void setIdAkun(int idAkun) {
		this.idAkun = idAkun;
	}
	public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	public abstract DaftarBukuImpl getDaftarbukuimpl();
	public abstract void setDaftarbukuimpl(DaftarBukuImpl daftarbukuimpl);
	
 

	@Override
    public String toString() {
        return "{" +
            " idAkun='" + getIdAkun() + "'" +
            " nama='" + getNama() + "'" +
            " daftarbukuimpl='" + getDaftarbukuimpl() + "'" +
            "}";
    }
	
}
