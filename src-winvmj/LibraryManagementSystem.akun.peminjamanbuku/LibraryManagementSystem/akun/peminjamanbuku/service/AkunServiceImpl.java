package LibraryManagementSystem.akun.peminjamanbuku;

import java.util.*;

import vmj.routing.route.VMJExchange;

import LibraryManagementSystem.akun.core.AkunServiceDecorator;
import LibraryManagementSystem.akun.core.AkunImpl;
import LibraryManagementSystem.akun.core.AkunServiceComponent;

public class AkunServiceImpl extends AkunServiceDecorator {
    public AkunServiceImpl (AkunServiceComponent record) {
        super(record);
    }

    
	public void tambahBuku(int x) {
		// TODO: implement this method
	}
}
