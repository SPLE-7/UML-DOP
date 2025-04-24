package LibraryManagementSystem.daftarbuku.core;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import java.util.*;

public interface DaftarBuku {
	public int getIdBuku();
	public void setIdBuku(int idBuku);
	public String getJudulBuku();
	public void setJudulBuku(String judulBuku);
	public String getPenulis();
	public void setPenulis(String penulis);
	public String getPenerbit();
	public void setPenerbit(String penerbit);
	public int getJumlahHalaman();
	public void setJumlahHalaman(int jumlahHalaman);
	HashMap<String, Object> toHashMap();
}
