package smithmicro;

public class Figure {
	
	private Point currentPosition;
	private Point initialPosition;
	private int samePositionCount;
	private Direction currentDirection;

	/**
	 * @param currentPosition
	 */
	public Figure(Point initialPosition, Direction currentDirection) {
		super();
		this.currentPosition = initialPosition;
		this.currentDirection = currentDirection;
		this.initialPosition = initialPosition;
		System.out.println(initialPosition.toString());
	}

	public Point getCurrentPosition() {
		return currentPosition;
	}

	public Direction getCurrentDirection() {
		return currentDirection;
	}

	public Point getInitialPosition() {
		return initialPosition;
	}

	public int getSamePositionCount() {
		return samePositionCount;
	}

	public Figure operate(Operation operation) {
		switch (operation) {
		case P: {
			//Should move figure
			switch (currentDirection) {
			case NORTH: {
				currentPosition = new Point(currentPosition.getX(), currentPosition.getY() + 1);
				break;
			}
			case WEST: {
				currentPosition = new Point(currentPosition.getX() - 1, currentPosition.getY());
			
				break;
			}
			case SOUTH: {
				currentPosition = new Point(currentPosition.getX(), currentPosition.getY() - 1);
				
				break;
			}
			case EAST: {
				currentPosition = new Point(currentPosition.getX()+1, currentPosition.getY());
			
				break;
			}
			}
			//Checking if the initial position is same as the current position
			if (currentPosition.equals(initialPosition))
				//It is, increment counter
				samePositionCount = samePositionCount+1;
			break;
		}
		case L: {
			//Should rotate direction counter clockwise
			decideDirection(false);
			break;
		}
		case D: {
			//Should rotate direction clockwise
			decideDirection(true);
			break;
		}
		}
		
		return this;
	}
	
	private void decideDirection(boolean clockwise) {
		if (clockwise) {
			// Turning right
			currentDirection = Direction.getPreviousDirection(currentDirection);
		} else {
			// Turning left
			currentDirection = Direction.getNextDirection(currentDirection);
		}
	}

	public void reset() {
		var newPosition = new Point(0, 0);
		this.currentPosition = newPosition;
		this.currentDirection = Direction.NORTH;
		this.initialPosition = newPosition;
		this.samePositionCount = 0;
		
	}

	@Override
	public String toString() {
		return "Figure [currentPosition=" + currentPosition + ", initialPosition=" + initialPosition
				+ ", samePositionCount=" + samePositionCount + ", currentDirection=" + currentDirection + "]";
	}

	

}
