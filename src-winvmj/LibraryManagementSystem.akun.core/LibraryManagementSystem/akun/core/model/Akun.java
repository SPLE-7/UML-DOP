package LibraryManagementSystem.akun.core;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import java.util.*;

public interface Akun {
	public int getIdAkun();
	public void setIdAkun(int idAkun);
	public String getNama();
	public void setNama(String nama);
	HashMap<String, Object> toHashMap();
}
