package _03_smurf;

public class smurfSmurfer {
public static void main(String[] args) {
	Smurf s1 = new Smurf("Handy Smurf");
	System.out.println(s1.getName());	
	s1.eat();
	Smurf s2 = new Smurf("Papa Smurf");
	System.out.println(s2.getName());
	System.out.println(s2.getHatColor());
	System.out.println(s2.isGirlOrBoy());
	Smurf s3 = new Smurf("Smurfette");
	System.out.println(s3.getName());
	System.out.println(s3.getHatColor());
	System.out.println(s3.isGirlOrBoy());
}
}
