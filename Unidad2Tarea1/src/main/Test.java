package main;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepositorioConsumible.addConsumible(new Refresco("Impactum", "Bebida energetica sabor coco", "Carrefus", "2020-12-12", "lata", "si"));
		RepositorioConsumible.addConsumible(new Bolleria("Palmera de chocolate", "Palmera de huevo cubierto de chocolate", "Carrefus", "fresca"));
		RepositorioConsumible.addConsumible(new Refresco("Agua", "Botella de agua natural", "Mercaflona", "2022-01-01", "botella"),
				new Bolleria("Bollicao", "Bollicao verde relleno de Matcha", "Una tienda rara"),
				new Consumible("Chocolate","Tableta de chocolate","Mercaflona","2019-01-01"),
				new Refresco("Leche", "Leche entera", "CoVacaLechera","2021-02-28","brick","si"));
		
		for(Consumible cons:RepositorioConsumible.findAllConsumibles()) System.out.println(cons);
		System.out.println("Los consumibles que han caducado son: ");
		for(Consumible cons:RepositorioConsumible.findAllCaducados()) System.out.println(cons);
		System.out.println("Los refrescos que se tienen que guardar en la nevera son: ");
		for(Consumible cons:RepositorioConsumible.findAllGuardarEnNevera()) System.out.println(cons);
		
	}

}
