package pregunta4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Documento doc2=new Documento("titulo del documento",Tipo.libro);
		doc2.setParrafo(0, "parrafo1");
		doc2.setParrafo(0, "parrafo2");
		System.out.println(doc2.toString());
		doc2.setParrafo(3, "parrafo3");
		doc2.setParrafo(1, "otro parrafo 1");
		doc2.agregarParrafo("un parrafo mas");
		System.out.println(doc2);
	}

}
