package LibraryManagementSystem.recommendation.core;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import java.util.*;

public interface Recommendation {
	public DaftarBukuImpl getDaftarbukuimpl();
	public void setDaftarbukuimpl(DaftarBukuImpl daftarbukuimpl);
	public AkunImpl getAkunimpl();
	public void setAkunimpl(AkunImpl akunimpl);
	public WishlistServiceImpl getWishlistserviceimpl();
	public void setWishlistserviceimpl(WishlistServiceImpl wishlistserviceimpl);
	HashMap<String, Object> toHashMap();
}
