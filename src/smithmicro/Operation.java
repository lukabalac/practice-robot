package smithmicro;

public enum Operation {
	P("Move one unit"),L("Roatate counter clockwise"),D("Roatate clockwise");
	
	private String name;

	/**
	 * @param name
	 */
	private Operation(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
}
