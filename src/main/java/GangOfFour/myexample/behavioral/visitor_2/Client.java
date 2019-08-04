package GangOfFour.myexample.behavioral.visitor_2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class Client {

	public static void main(String[] args) {
		LinkedHashMap<String, Product> productMap = ShoppingMallProducts.productMap;
		Set<String> products = productMap.keySet();
		System.out.println("Products Available \n");
		for (String string : products) {
			System.out.println(productMap.get(string));
		}
		System.out
				.println(" \n############################################################# \n");
		ArrayList<Product> purchasedProductList = new ArrayList<Product>();
		purchasedProductList.add(productMap.get("weArebackBook"));
		purchasedProductList.add(productMap.get("jesusStoryBook"));
		purchasedProductList.add(productMap.get("dieHard2Dvd"));
		purchasedProductList.add(productMap.get("terminatorDvd"));
		purchasedProductList.add(productMap.get("zeroShirt"));
		purchasedProductList.add(productMap.get("peterEnglandShirt"));
		ShoppingMallProducts shoppingMallProducts = new ShoppingMallProducts();
		System.out.println("Total Amount : "
				+ shoppingMallProducts.getTotalAmount(purchasedProductList)
				+ "Rs");
	}

}


/*
Products Available

Book [name=We are Back, isbnNumber=ISBN-999, price=200]
Book [name=Jesus Story, isbnNumber=ISBN-1999, price=500]
Book [name=Moral Story, isbnNumber=ISBN-2999, price=600]
DVD [name=Die Hard 2, price=100]
DVD [name=The Terminator, price=150]
DVD [name=Titanic, price=120]
Shirt [brandName=Zero, size=42, price=1500]
Shirt [brandName=Peter England, size=42, price=2500]
Shirt [brandName=John Players, size=40, price=2500]

#############################################################

Puschased Products details :

Book [name=We are Back, isbnNumber=ISBN-999, price=200]

Book [name=Jesus Story, isbnNumber=ISBN-1999, price=500]

DVD [name=Die Hard 2, price=100]

DVD [name=The Terminator, price=150]

Shirt [brandName=Zero, size=42, price=1500]

Shirt [brandName=Peter England, size=42, price=2500]

Total Amount : 4950Rs
 */


/*
Products Available

Book [name=We are Back, isbnNumber=ISBN-999, price=200]
Book [name=Jesus Story, isbnNumber=ISBN-1999, price=500]
Book [name=Moral Story, isbnNumber=ISBN-2999, price=600]
DVD [name=Die Hard 2, price=100]
DVD [name=The Terminator, price=150]
DVD [name=Titanic, price=120]
Shirt [brandName=Zero, size=42, price=1500]
Shirt [brandName=Peter England, size=42, price=2500]
Shirt [brandName=John Players, size=40, price=2500]

#############################################################

Puschased Products details :

Book [name=We are Back, isbnNumber=ISBN-999, price=200]

Book [name=Jesus Story, isbnNumber=ISBN-1999, price=500]

DVD [name=Die Hard 2, price=100]

DVD [name=The Terminator, price=150]

Shirt [brandName=Zero, size=42, price=1500]

Shirt [brandName=Peter England, size=42, price=2500]

Total Amount : 4950Rs

 */