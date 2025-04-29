package LibraryManagementSystem.wishlist.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.OneToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.CascadeType;
//add other required packages

@MappedSuperclass
public abstract class WishlistServiceDecorator extends WishlistServiceComponent{
    @OneToOne(cascade=CascadeType.ALL)
	protected WishlistServiceComponent record;

	public WishlistServiceDecorator () {
		super();
		this.record = record;
		this. =  .randomUUID();
		
	public WishlistServiceDecorator (WishlistServiceComponent record) {
		this. =  .randomUUID();
		this.record = record;
	}

	public WishlistServiceDecorator (, WishlistServiceComponent record) {
		this. =  ;
		this.record = record;
	}
	
	public WishlistServiceDecorator (WishlistServiceComponent record, String objectName) {
		this. =  .randomUUID();
		this.record = record;	
		this.objectName=objectName;
	}

	public WishlistServiceDecorator() { }


	public void AddBookToWishlist() {
		return record.AddBookToWishlist();
	}

	public void RemoveBookFromWishlist() {
		return record.RemoveBookFromWishlist();
	}

	public void getWishlist() {
		return record.getWishlist();
	}

	public HashMap<String, Object> toHashMap() {
        return this.record.toHashMap();
    }

}
