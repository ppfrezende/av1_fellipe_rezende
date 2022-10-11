import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CRUD {
	

	public class InsertProduct {
		
		List<Product> products = new ArrayList<>();
		
		public void addProduct() {
			
			Product moto_gp = new Product("1010111","1545","Yamaha R3","320 cilindradas","GP",30000,170.0,"Yamaha");
			Product moto_trail = new Product("000110110","5578","GS800","800 cilindradas","Trail",70000,210.0,"BMW");
			Product moto_custom = new Product("010111110","3698","Harley1200","1200 cilindradas","Custom",150000,310.0,"Harley Davidson");
			
			products.add(moto_gp);
			products.add(moto_trail);
			products.add(moto_custom);
		}
		
	}

	public List<Product> products;
	
	public class ListProducts {
		
		public void listProduct() {
		
			for(int i = 0; i<products.size(); i++) {
				System.out.println("\nID: " + products[i].id); 
		        System.out.println("Código de barras: " + products[i].barCode); 
		        System.out.println("SKU: " + products[i].sku); 
		        System.out.println("Nome: " + products[i].name); 
		        System.out.println("Descrição: " + products[i].description); 
		        System.out.println("Categoria: " + products[i].category); 
		        System.out.println("Preço: R$" + products[i].price); 
		        System.out.println("Peso: " + products[i].weight); 
		        System.out.println("Fabricante: " + products[i].manufacturer + "\n");
			}
		}
		
	}
	
	public class ListOne {
		
		public void listOneProduct() {
			
			Scanner read = new Scanner(System.in);
			
			int option;
			System.out.printf("Selecione um produto: ");
			option = read.nextInt();
			products.get(option).getProducts();
		}
	}
	
	public class RemoveProduct {
			
		public void removeProduct() {
		
			products.remove(0);
			products.remove(1);
			products.remove(2);
		}
		
	}
	
	

	
}
