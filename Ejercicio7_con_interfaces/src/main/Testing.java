package main;

import java.util.Arrays;
import java.util.Objects;

public class Testing {

    public static void main(String[] args){
        ProductRepository repository= new ProductRepository();
        repository.addObj(createProduct("zanahoria","Una zanahoria normal"));
        repository.addObj(createProduct("zanahoria","Una zanahoria normal"));
        Products[] allProducts=repository.findAllObj();
        Arrays.stream(allProducts).forEach(System.out::println);
        System.out.println("___\n");
        repository.addObj(createProduct());
        repository.addObj(createProduct("agua embotellada","Una botella de agua"));
        repository.addObj(createProduct("te en polvo","Un paquete de te hecho polvo"));
        repository.addObj(createProduct("piña","Una piña debajo del mar"));
        allProducts=repository.findAllObj();
        Arrays.stream(allProducts).forEach(System.out::println);
        System.out.println("___\n");
        repository.editObj(repository.findObj((Arrays.stream(allProducts).filter(a->a.getName().equals("te en polvo")).toArray(Products[]::new))[0]),createProduct("te en bolsita","Te dentro de una bolsita"));
        allProducts=repository.findAllObj();
        Arrays.stream(allProducts).forEach(System.out::println);
        System.out.println("___\n");
        repository.removeObj((Arrays.stream(allProducts).filter(a->a.getName().equals("te en bolsita")).toArray(Products[]::new))[0]);
        allProducts=repository.findAllObj();
        Arrays.stream(allProducts).forEach(System.out::println);
        System.out.println("___\n");
        Products[] zanahoria=repository.findObjByName("zanahoria");
        Arrays.stream(zanahoria).forEach(System.out::println);
        System.out.println("___\n");
        Products[] code=repository.findObjByCode(allProducts[0].getCode().charAt(0));
        Arrays.stream(code).forEach(System.out::println);
        System.out.println("___\n");
    }

    private static Products createProduct(String name, String description){
        return new Products(name, description);
    }

    private static Products createProduct(String description){
        return new Products(description);
    }

    private static Products createProduct(){
        return new Products();
    }
}
