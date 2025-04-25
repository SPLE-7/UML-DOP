package LibraryManagementSystem.statistik.core;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import java.util.*;

public interface Statistik {
	public int getJumlahBukuStatistik();
	public void setJumlahBukuStatistik(int jumlahBukuStatistik);
	public String getNamaChart();
	public void setNamaChart(String namaChart);
	HashMap<String, Object> toHashMap();
}
