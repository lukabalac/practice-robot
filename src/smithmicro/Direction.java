package smithmicro;

public enum Direction {
	NORTH(90),WEST(180),SOUTH(270),EAST(0);
	
	private int value;

	/**
	 * @param value
	 */
	private Direction(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static Direction getPreviousDirection(Direction current) {
		switch (current) {
		case NORTH:{
			return Direction.EAST;
		}
		case WEST:{
			return Direction.NORTH;
		}
		case SOUTH:{
			return Direction.WEST;
		}
		case EAST:{
			return Direction.SOUTH;
		}
		default : return null;
		}
	}
	public static Direction getNextDirection(Direction current) {
		switch (current) {
		case NORTH:{
			return Direction.WEST;
		}
		case WEST:{
			return Direction.SOUTH;
		}
		case SOUTH:{
			return Direction.EAST;
		}
		case EAST:{
			return Direction.NORTH;
		}
		default : return null;
		}
	}
	
	
}
