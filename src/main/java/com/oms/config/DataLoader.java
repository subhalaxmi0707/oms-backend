package com.oms.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.oms.entity.Product;
import com.oms.repository.ProductRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProductRepository productRepository;

    public DataLoader(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if(productRepository.count()==0){

            productRepository.save(new Product(null,
                    "iPhone 15",
                    "Apple 128GB Smartphone",
                    69999.0,
                    20,
                    "Mobiles",
                    "https://images.unsplash.com/photo-1592750475338-74b7b21085ab",
                    "Available"));

            productRepository.save(new Product(null,
                    "Samsung Galaxy S25",
                    "Samsung Flagship",
                    65999.0,
                    15,
                    "Mobiles",
                    "https://images.unsplash.com/photo-1511707171634-5f897ff02aa9",
                    "Available"));

            productRepository.save(new Product(null,
                    "Boat Headphone",
                    "Wireless Bluetooth Headphone",
                    2499.0,
                    50,
                    "Electronics",
                    "https://images.unsplash.com/photo-1505740420928-5e560c06d30e",
                    "Available"));

            productRepository.save(new Product(null,
                    "Dell Laptop",
                    "Core i7 16GB RAM",
                    75999.0,
                    10,
                    "Laptop",
                    "https://images.unsplash.com/photo-1496181133206-80ce9b88a853",
                    "Available"));


			productRepository.save(new Product(null,
			        "Sony LED TV",
			        "43 Inch Smart TV",
			        38999.0,
			        8,
			        "Electronics",
			        "https://images.unsplash.com/photo-1593784991095-a205069470b6",
			        "Available"));
			
			productRepository.save(new Product(null,
			        "Apple Watch",
			        "Series 10 Smart Watch",
			        45999.0,
			        12,
			        "Wearables",
			        "https://images.unsplash.com/photo-1546868871-7041f2a55e12",
			        "Available"));
			
			productRepository.save(new Product(null,
			        "Canon DSLR",
			        "EOS 1500D Camera",
			        42999.0,
			        5,
			        "Camera",
			        "https://images.unsplash.com/photo-1516035069371-29a1b244cc32",
			        "Available"));
			
			productRepository.save(new Product(null,
			        "Nike Shoes",
			        "Running Shoes",
			        4999.0,
			        30,
			        "Footwear",
			        "https://images.unsplash.com/photo-1542291026-7eec264c27ff",
			        "Available"));
			
			productRepository.save(new Product(null,
			        "Puma T-Shirt",
			        "Cotton T-Shirt",
			        999.0,
			        60,
			        "Fashion",
			        "https://images.unsplash.com/photo-1521572163474-6864f9cf17ab",
			        "Available"));
			
			productRepository.save(new Product(null,
			        "HP Printer",
			        "LaserJet Printer",
			        12499.0,
			        10,
			        "Electronics",
			        "https://images.unsplash.com/photo-1612817159949-195b6eb9e31a",
			        "Available"));
			
			productRepository.save(new Product(null,
			        "Lenovo Laptop",
			        "Core i5 16GB RAM 512GB SSD",
			        58999.0,
			        15,
			        "Laptop",
			        "https://images.unsplash.com/photo-1496181133206-80ce9b88a853",
			        "Available"));
			
			productRepository.save(new Product(null,
			        "Realme Buds",
			        "Wireless Earbuds",
			        2999.0,
			        40,
			        "Electronics",
			        "https://images.unsplash.com/photo-1606220588913-b3aacb4d2f46",
			        "Available"));
			
			productRepository.save(new Product(null,
			        "LG Refrigerator",
			        "Double Door Refrigerator",
			        35999.0,
			        8,
			        "Home Appliances",
			        "https://images.unsplash.com/photo-1584568694244-14fbdf83bd30",
			        "Available"));
			
			productRepository.save(new Product(null,
			        "Whirlpool Washing Machine",
			        "7 Kg Fully Automatic",
			        22999.0,
			        10,
			        "Home Appliances",
			        "https://images.unsplash.com/photo-1626806787461-102c1bfaaea1",
			        "Available"));
			
			productRepository.save(new Product(null,
			        "Wooden Study Table",
			        "Office & Study Table",
			        6999.0,
			        18,
			        "Furniture",
			        "https://images.unsplash.com/photo-1505693416388-ac5ce068fe85",
			        "Available"));
			
			productRepository.save(new Product(null,
			        "Office Chair",
			        "Ergonomic Chair",
			        5999.0,
			        20,
			        "Furniture",
			        "https://images.unsplash.com/photo-1505843513577-22bb7d21e455",
			        "Available"));
			
			productRepository.save(new Product(null,
			        "Mi Power Bank",
			        "20000mAh Fast Charging",
			        1999.0,
			        35,
			        "Accessories",
			        "https://images.unsplash.com/photo-1609592806787-3d9f0f2dfc2e",
			        "Available"));
			
			productRepository.save(new Product(null,
			        "JBL Bluetooth Speaker",
			        "Portable Speaker",
			        3499.0,
			        25,
			        "Electronics",
			        "https://images.unsplash.com/photo-1589003077984-894e133dabab",
			        "Available"));
			
			productRepository.save(new Product(null,
			        "Casual Backpack",
			        "Travel Backpack",
			        1499.0,
			        50,
			        "Bags",
			        "https://images.unsplash.com/photo-1553062407-98eeb64c6a62",
			        "Available"));
			
			productRepository.save(new Product(null,
			        "Gaming Mouse",
			        "RGB Wired Mouse",
			        1299.0,
			        45,
			        "Accessories",
			        "https://images.unsplash.com/photo-1527814050087-3793815479db",
			        "Available"));

        	}
        
    }
}










