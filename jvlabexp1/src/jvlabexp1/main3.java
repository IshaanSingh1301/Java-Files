package jvlabexp1;

public class main3 {
	private int unknown;
	public int getunknown() {
		return this.unknown;
	}
	public void setunknown(int num) {
        this.unknown = num;
    }

	public static void main(String[] args) {
		main3 ob = new main3();
		ob.setunknown(10);  
		int num = ob.getunknown();
		System.out.println("private variable is"+ob.unknown);

	}

}
