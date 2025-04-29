package LibraryManagementSystem.review.core;

import java.util.*;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="review_comp")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class ReviewComponent implements Review{
	@Id
	protected UUID idReview; 
	protected EDate postedAt;
	@ManyToOne(targetEntity=LibraryManagementSystem.daftarbuku.core.DaftarBukuComponent.class)
	public DaftarBuku daftarbukuimpl;
	protected String objectName = ReviewComponent.class.getName();

	public ReviewComponent() {

	} 

	public ReviewComponent(
        UUID idReview, EDate postedAt, DaftarBukuImpl daftarbukuimpl
    ) {
        this.idReview = idReview;
        this.postedAt = postedAt;
        this.daftarbukuimpl = daftarbukuimpl;
    }

	public UUID getIdReview() {
		return this.idReview;
	}

	public void setIdReview(UUID idReview) {
		this.idReview = idReview;
	}
	public EDate getPostedAt() {
		return this.postedAt;
	}

	public void setPostedAt(EDate postedAt) {
		this.postedAt = postedAt;
	}
	public abstract DaftarBukuImpl getDaftarbukuimpl();
	public abstract void setDaftarbukuimpl(DaftarBukuImpl daftarbukuimpl);
	
 

	@Override
    public String toString() {
        return "{" +
            " idReview='" + getIdReview() + "'" +
            " postedAt='" + getPostedAt() + "'" +
            " daftarbukuimpl='" + getDaftarbukuimpl() + "'" +
            "}";
    }
	
}
