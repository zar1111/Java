

class DemoPower {
	public static void main (String[] args){
	
	Power x = new Power(4.0, -1);
	System.out.println(x.getPwr());
	}
}
//x.b + x.e + 
class Power {
	double b;
	int e;
	double val;
	Power(double base, int exp){
		this.b = base;
		this.e = exp;
		val = 1;
		if (exp == 0) return;
		for( ; exp>0; exp--) val = val * base;
	}
	
	double getPwr() {
		return val;
	}
}