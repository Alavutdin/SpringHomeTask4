package gb.spring.sem4TaskHome4.domain;

import lombok.Data;

@Data
public class Product {
    private int id; // Идентификатор ID
    private String phoneModel; // Модель телефона
    private String manufacturer; // Производитель продукта
    private double price; // Цена за товар

}
