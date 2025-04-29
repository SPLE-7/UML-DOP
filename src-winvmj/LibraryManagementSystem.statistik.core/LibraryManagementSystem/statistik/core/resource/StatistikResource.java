package LibraryManagementSystem.statistik.core;
import java.util.*;

import vmj.routing.route.VMJExchange;

public interface StatistikResource {
    List<HashMap<String,Object>> saveStatistik(VMJExchange vmjExchange);
    HashMap<String, Object> updateStatistik(VMJExchange vmjExchange);
    HashMap<String, Object> getStatistik(VMJExchange vmjExchange);
    List<HashMap<String,Object>> getAllStatistik(VMJExchange vmjExchange);
    List<HashMap<String,Object>> deleteStatistik(VMJExchange vmjExchange);
	HashMap<String, Object> createStatistik(VMJExchange vmjExhange);
}
