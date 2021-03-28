package co.edu.unbosque.model.persistence;

public class Arreglos {

	private String p1[];
	private String p2[];
	private String p3[];
	private String p4[];
	private String p5[];
	private String p6[];
	
	public Arreglos() {
		
	p1 = new String[4];
	p2 = new String[4];
	p3 = new String[4];
	p4 = new String[4];
	p5 = new String[4];
	p6 = new String[4];
	
	llenarP1();
	llenarP2();
	llenarP3();
	llenarP4();
	llenarP5();
	llenarP6();
	
	}
	
	public void llenarP1() {
		p1[0] = "Mami";
		p1[1] = "Bebé";
		p1[2] = "Princess";
		p1[3] = "Mami";
	}
	
	public void llenarP2() {
		p2[0] = "yo quielo";
		p2[1] = "yo puedo";
		p2[2] = "yo vengo a";
		p2[3] = "voy a";
	}
	
	public void llenarP3() {
		p3[0] = "encendelte";
		p3[1] = "amalte";
		p3[2] = "ligal";
		p3[3] = "jugal";
	}
	
	public void llenarP4() {
		p4[0] = "suave";
		p4[1] = "lento";
		p4[2] = "rapido";
		p4[3] = "fuelte";
	}
	
	public void llenarP5() {
		p5[0] = "hasta que salga el sol";
		p5[1] = "toda la noche";
		p5[2] = "hasta el amanecel";
		p5[3] = "todo el dia";
	}
	
	public void llenarP6() {
		p6[0] = "sin anestesia";
		p6[1] = "sin complomiso";
		p6[2] = "feis to feis";
		p6[3] = "sin miedo";
	}

	public String getP1(int i) {
		return p1[i];
	}

	public void setP1(String[] p1) {
		this.p1 = p1;
	}

	public String getP2(int i) {
		return p2[i];
	}

	public void setP2(String[] p2) {
		this.p2 = p2;
	}

	public String getP3(int i) {
		return p3[i];
	}

	public void setP3(String[] p3) {
		this.p3 = p3;
	}

	public String getP4(int i) {
		return p4[i];
	}

	public void setP4(String[] p4) {
		this.p4 = p4;
	}

	public String getP5(int i) {
		return p5[i];
	}

	public void setP5(String[] p5) {
		this.p5 = p5;
	}

	public String getP6(int i) {
		return p6[i];
	}

	public void setP6(String[] p6) {
		this.p6 = p6;
	}
	
}

