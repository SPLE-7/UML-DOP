package LibraryManagementSystem.statistik.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.OneToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.CascadeType;
//add other required packages

@MappedSuperclass
public abstract class StatistikDecorator extends StatistikComponent{
    @OneToOne(cascade=CascadeType.ALL)
	protected StatistikComponent record;

	public StatistikDecorator () {
		super();
		this.record = record;
		this. =  .randomUUID();
		
	public StatistikDecorator (StatistikComponent record) {
		this. =  .randomUUID();
		this.record = record;
	}

	public StatistikDecorator (, StatistikComponent record) {
		this. =  ;
		this.record = record;
	}
	
	public StatistikDecorator (StatistikComponent record, String objectName) {
		this. =  .randomUUID();
		this.record = record;	
		this.objectName=objectName;
	}

	public StatistikDecorator() { }

	public String getNamaChart() {
		return record.getNamaChart();
	}
	public void setNamaChart(String namaChart) {
		record.setNamaChart(namaChart);
	}

	protected void hitungJumlahBuku() {
		return record.hitungJumlahBuku();
	}

	public HashMap<String, Object> toHashMap() {
        return this.record.toHashMap();
    }

}
