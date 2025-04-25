package LibraryManagementSystem.statistik.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="statistik_comp")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class StatistikComponent implements Statistik{
	@Id
	
	package int jumlahBukuStatistik;
	protected String namaChart;
	protected String objectName = StatistikComponent.class.getName();

	public StatistikComponent() {

	} 

	public StatistikComponent(
        int jumlahBukuStatistik, String namaChart
    ) {
        this.jumlahBukuStatistik = jumlahBukuStatistik;
        this.namaChart = namaChart;
    }

	public abstract int getJumlahBukuStatistik();
	public abstract void setJumlahBukuStatistik(int jumlahBukuStatistik);
	
	public String getNamaChart() {
		return this.namaChart;
	}

	public void setNamaChart(String namaChart) {
		this.namaChart = namaChart;
	}
 
	protected abstract void hitungJumlahBuku();

	@Override
    public String toString() {
        return "{" +
            " jumlahBukuStatistik='" + getJumlahBukuStatistik() + "'" +
            " namaChart='" + getNamaChart() + "'" +
            "}";
    }
	
}
