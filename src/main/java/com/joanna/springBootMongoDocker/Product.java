package com.joanna.springBootMongoDocker;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.UUID;

@Data //from Lombok (to create getters and setters, and constructor for every class member)
@Document //for MongoDB mapping
public class Product {
    @Id
    int id; //! here we cannot use UUID (because of: @Id)
    ProductName productName;
    double price; //String price
    double weight;
    Producer producer;
    //@Indexed(unique = true) - anotacja MongoDB, ktora ma zapewnic indeksowanie (a wiec unikatowosc) wartosci poniszego parametru (key)
    //String email; - cecha, ktora ma sie w naszej bazie nie powtarzac (i dzieki temu mozemy po niej wyszukac wiersza/dokumentu)

    //static NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

    public Product(ProductName productName, double priceDouble, double weight, Producer producer){ //we create constructor, because we don't want to create constructor for uuid
        this.productName = productName;
        //this.price = nf.format(priceDouble);
        this.price = priceDouble;
        this.weight = weight;
        this.producer = producer;
    }
}

