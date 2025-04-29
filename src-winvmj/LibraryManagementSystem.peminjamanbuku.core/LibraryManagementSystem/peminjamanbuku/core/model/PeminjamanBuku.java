package LibraryManagementSystem.peminjamanbuku.core;
import vmj.routing.route.Route;
import vmj.routing.route.VMJExchange;
import java.util.*;

public interface PeminjamanBuku {
	public UUID getIdPeminjamanBuku();
	public void setIdPeminjamanBuku(UUID idPeminjamanBuku);
	public String getStatus();
	public void setStatus(String status);
	public AkunImpl getAkunimpl();
	public void setAkunimpl(AkunImpl akunimpl);
	public DaftarBukuImpl getDaftarbukuimpl();
	public void setDaftarbukuimpl(DaftarBukuImpl daftarbukuimpl);
	public EDate getTanggalPeminjaman();
	public void setTanggalPeminjaman(EDate tanggalPeminjaman);
	public EDate getTanggalPengembalian();
	public void setTanggalPengembalian(EDate tanggalPengembalian);
	HashMap<String, Object> toHashMap();
}
