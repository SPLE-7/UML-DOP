package LibraryManagementSystem.review.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.OneToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.CascadeType;
//add other required packages

@MappedSuperclass
public abstract class ReviewDecorator extends ReviewComponent{
    @OneToOne(cascade=CascadeType.ALL)
	protected ReviewComponent record;

	public ReviewDecorator () {
		super();
		this.record = record;
		this.idReview =  idReview.randomUUID();
		
	public ReviewDecorator (ReviewComponent record) {
		this.idReview =  idReview.randomUUID();
		this.record = record;
	}

	public ReviewDecorator (UUID idReview, ReviewComponent record) {
		this.idReview =  idReview;
		this.record = record;
	}
	
	public ReviewDecorator (ReviewComponent record, String objectName) {
		this.idReview =  idReview.randomUUID();
		this.record = record;	
		this.objectName=objectName;
	}

	public ReviewDecorator() { }

	public UUID getIdReview() {
		return record.getIdReview();
	}
	public void setIdReview(UUID idReview) {
		record.setIdReview(idReview);
	}
	public EDate getPostedAt() {
		return record.getPostedAt();
	}
	public void setPostedAt(EDate postedAt) {
		record.setPostedAt(postedAt);
	}


	public HashMap<String, Object> toHashMap() {
        return this.record.toHashMap();
    }

}
