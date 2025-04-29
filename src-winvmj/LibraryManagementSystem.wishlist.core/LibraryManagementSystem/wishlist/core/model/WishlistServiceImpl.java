package LibraryManagementSystem.wishlist.core;

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


@Entity(name="wishlistservice_impl")
@Table(name="wishlistservice_impl")
public class WishlistServiceImpl extends WishlistServiceComponent {

	public WishlistServiceImpl(AkunImpl akunimpl, DaftarBukuImpl daftarbukuimpl, AkunImpl akunimpl, AkunImpl akunimpl) {
		this.akunimpl = akunimpl;
		this.daftarbukuimpl = daftarbukuimpl;
		this.akunimpl = akunimpl;
		this.akunimpl = akunimpl;
	}

	public WishlistServiceImpl(AkunImpl akunimpl, DaftarBukuImpl daftarbukuimpl, AkunImpl akunimpl, AkunImpl akunimpl) {
		this. =  .randomUUID();;
		this.akunimpl = akunimpl;
		this.daftarbukuimpl = daftarbukuimpl;
		this.akunimpl = akunimpl;
		this.akunimpl = akunimpl;
	}

	public WishlistServiceImpl() { }


	public void AddBookToWishlist() {
		// TODO: implement this method
	}

	public void RemoveBookFromWishlist() {
		// TODO: implement this method
	}

	public void getWishlist() {
		// TODO: implement this method
	}
	
	public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> wishlistserviceMap = new HashMap<String,Object>();
		wishlistserviceMap.put("akunimpl",getAkunimpl());
		wishlistserviceMap.put("daftarbukuimpl",getDaftarbukuimpl());
		wishlistserviceMap.put("akunimpl",getAkunimpl());
		wishlistserviceMap.put("akunimpl",getAkunimpl());

        return wishlistserviceMap;
    }

}
