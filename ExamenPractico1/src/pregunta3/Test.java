package pregunta3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Documento doc1=new Documento();
		doc1.setParrafo(10, "Ola");
		doc1.setParrafo(10, "k");
		doc1.setParrafo(0, "ase");
		System.out.println(doc1.getNumeroParrafos());
		System.out.println(doc1.getParrafo(1)+doc1.getParrafo(2)+doc1.getParrafo(3)+doc1.getParrafo(4)+doc1.getParrafo(5));
	}

}
