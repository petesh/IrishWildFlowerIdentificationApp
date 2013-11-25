package ie.thegreenapron.irishwildfloweridentificationapp.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

	static {
		// Add 3 sample items.
		addItem(new DummyItem("Meadowsweet", "filipendula ulmaria", "white", "broad"));
		addItem(new DummyItem("Gorse", "ulex europaeus", "yellow", "thorny"));
		addItem(new DummyItem("Red Clover", "trifolium pratense", "red", "broad"));
	}

	private static void addItem(DummyItem item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.plantName, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class DummyItem {
		public String plantName;
		public String latinName;
		public String color;
		public String leafType;

		public DummyItem(String plantName,
				String latinName,
				String color,
				String leafType) {
			this.plantName = plantName;
			this.latinName = latinName;
			this.color = color;
			this.leafType = leafType;
		}

		@Override
		public String toString() {
			return plantName + "(" + latinName + ") " + color + " leaf: " + leafType;
		}
	}
}
