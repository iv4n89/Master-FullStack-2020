package pregunta4;

public class Parrafo {
	private int ordinal;
	private final String text;
	
	public Parrafo(int ordinal, String text) {
		this.ordinal=ordinal;
		this.text=text;
	}
	
	public void setOrdinal(int ordinal) {
		this.ordinal=ordinal;
	}
	
	public int getOrdinal() {
		return this.ordinal;
	}
	
	public String getText() {
		return this.text;
	}
	
	@Override
	public String toString() {
		//return this.ordinal + " " + this.getText();
		return String.format("%d %s",getOrdinal(),this.getText());
	}
}
