public class Car {

    private String plate,tradeMark,color;
	private short model,speed,speedMax,unitsSpeed;
	private boolean state;
	public static final byte WARRANTY = 5;
	
	public Car() {
	}

	public Car(String plate, String tradeMark, String color, short model, short speed, boolean state, short speedMax) {
		this.plate = plate;
		this.tradeMark = tradeMark;
		this.color = color;
		this.model = model;
		this.speed = speed;
		this.state = state;
		this.speedMax = speedMax;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getTradeMark() {
		return tradeMark;
	}

	public void setTradeMark(String tradeMark) {
		this.tradeMark = tradeMark;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public short getModel() {
		return model;
	}

	public void setModel(short model) {
		this.model = model;
	}

	public short getSpeed() {
		return speed;
	}

	public void setSpeed(short speed) {
		this.speed = speed;
	}
	public boolean start() {
		if(!state) {
			state = true;
			return state;
		}
		return false;
	}
	public short speedUp (short unitsSpeed) throws Exception {
		this.speed += unitsSpeed;
		if (!state){
			throw new Exception("Off " + state);
		}else if (this.speed > speedMax) {
			this.speed = speedMax;
			throw new Exception("Cuidado " + speedMax);
		}
		return this.speed;
	}
	
	public short speedDown (short unitsSpeed) {
		this.speed -= unitsSpeed;
		if (this.speed <= 0) {
			this.speed = 0;
		}
		return this.speed;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	public void setSpeedMax(short speedMax) {
		this.speedMax = speedMax;
	}
	public String toString() {
		return "Car [plate=" + plate + ", tradeMark=" + tradeMark + ", color=" + color + ", model=" + model + ", speed="
				+ speed + ", speedMax=" + speedMax + ", unitsSpeed=" + unitsSpeed + ", state=" + state + "]";
	}
}

