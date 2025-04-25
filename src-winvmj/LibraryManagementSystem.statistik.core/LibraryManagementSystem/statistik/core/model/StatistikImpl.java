package LibraryManagementSystem.statistik.core;

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


@Entity(name="statistik_impl")
@Table(name="statistik_impl")
public class StatistikImpl extends StatistikComponent {

	public StatistikImpl(int jumlahBukuStatistik, String namaChart) {
		this.jumlahBukuStatistik = jumlahBukuStatistik;
		this.namaChart = namaChart;
	}

	public StatistikImpl(int jumlahBukuStatistik, String namaChart) {
		this. =  .randomUUID();;
		this.jumlahBukuStatistik = jumlahBukuStatistik;
		this.namaChart = namaChart;
	}

	public StatistikImpl() { }

	public String getNamaChart() {
		return this.namaChart;
	}

	public void setNamaChart(String namaChart) {
		this.namaChart = namaChart;
	}

	protected void hitungJumlahBuku() {
		// TODO: implement this method
	}
	
	public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> statistikMap = new HashMap<String,Object>();
		statistikMap.put("jumlahBukuStatistik",getJumlahBukuStatistik());
		statistikMap.put("namaChart",getNamaChart());

        return statistikMap;
    }

}
