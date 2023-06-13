package nube.model;

public class Item {
	private String itemCode;
	private String name;
	private String description;
	private String size;
	private double unitPrice;
	
	public Item(String itemCode, String name, String description, String size, double unitPrice) { // String description, double srp
		this.itemCode = itemCode;
		this.name = name;
		this.description = description;
		this.size = size;
		this.unitPrice = unitPrice;
	}


	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
