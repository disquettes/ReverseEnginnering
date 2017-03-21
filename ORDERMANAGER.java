
import java.util.ArrayList;

public class ORDERMANAGER {

	public static ORDERMANAGER instance;

	public ArrayList<ORDER> orderArray = new ArrayList<ORDER>();

	public ArrayList<Table> tableArray = new ArrayList<Table>();

	private ORDERMANAGER() {

	}

	public static ORDERMANAGER getInstance() {
		if (instance == null) {
			instance = new ORDERMANAGER();
		}
		return instance;
	}

	public void setOrderArray() {
	}

	public boolean checkAvailable() {
		for (int i = 0; i < tableArray.size(); i++) {
			if (!tableArray.get(i).checkStatus()) {
				return true;
			}
		}
		return false;
	}

	public void addTable(Table table) {
		tableArray.add(table);
	}

}