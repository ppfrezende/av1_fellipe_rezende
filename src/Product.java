
public class Product {
	
	private int id = 0;
	private String barCode;
	private String sku;
	private String name;
	private String description;
	private String category;
	private double price;
	private double weight;
	private String manufacturer;
	
	public Product (String barCode, String sku, String name, String description, String category, double price, double weight, String manufacturer) {
		
		this.id =+ id;
		this.barCode = barCode;
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;
		this.weight = weight;
		this.manufacturer = manufacturer;
	}
	
	public int getId( ) {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getBarCode( ) {
		return barCode;
	}
	
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	
	public String getSku( ) {
		return sku;
	}
	
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	public String getName( ) {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription( ) {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getCategory( ) {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public double getPrice( ) {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getWeight( ) {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getManufacturer( ) {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public void getProducts() {
        System.out.println("\nID: " + this.id); 
        System.out.println("Código de barras: " + this.barCode); 
        System.out.println("SKU: " + this.sku); 
        System.out.println("Nome: " + this.name); 
        System.out.println("Descrição: " + this.description); 
        System.out.println("Categoria: " + this.category); 
        System.out.println("Preço: R$" + this.price); 
        System.out.println("Peso: " + this.weight); 
        System.out.println("Fabricante: " + this.manufacturer + "\n"); 
    }
}
