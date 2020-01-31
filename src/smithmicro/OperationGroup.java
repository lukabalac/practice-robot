package smithmicro;

public class OperationGroup {
	
	private Operation[] operations = new Operation[4];
	private Operation o1;
	private Operation o2;
	private Operation o3;
	private Operation o4;

	/**
	 * @param operations
	 */
	public OperationGroup(Operation o1,Operation o2,Operation o3,Operation o4) {
		super();
		operations[0] = o1;
		operations[1] = o2;
		operations[2] = o3;
		operations[3] = o4;
		this.o1 = o1;
		this.o2 = o2;
		this.o3 = o3;
		this.o4 = o4;
	}

	


	public Operation[] getOperations() {
		return operations;
	}







	public Operation getO1() {
		return o1;
	}







	public Operation getO2() {
		return o2;
	}







	public Operation getO3() {
		return o3;
	}







	public Operation getO4() {
		return o4;
	}

	
	
	
	
}
