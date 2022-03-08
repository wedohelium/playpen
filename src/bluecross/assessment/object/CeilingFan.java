package bluecross.assessment.object;

/**
//* <h1>Ceiling Fan Object</h1>
*  POJO that represents a basic ceiling fan.
*  state : can be OFF or ON
*  speed : 0 (for off). 1/2/3 for the three speed settings.
*  direction : CLOCKWISE or COUNTER-CLOCKWISE
*  Upon initialisation, it is off. 
*  You can either pull the chain to turns it on/off or set the speed (p),
*  or reverse the rotation(r), or exit the program (e).
*  For option r and e, the new status of the fan will be displayed (on/off/speed/direction)
* <p>
*
* @author  Stephen MacIsaac
* @version 1.0
* @since   2022-03-01
*/

public class CeilingFan {

	private String state;
	
	private int speed;
	
	private String direction;
	
   /**
   * Public default constructor.
   * the fan is off, with no speed, and default direction
   */
	public CeilingFan(){
		state = "OFF";
		speed = 0;
		direction="CLOCKWISE";
	}

   /**
   * This method mimics pulling "speed" cord.
   * it will either turn on,turn off, or increase speed , depending 
   * on current state/speed 
   * @param none
   * @return void 
   */
	public void pull(){
		
		if(this.speed == 3){
			speed= 0;
			state="OFF";
		}else{
			speed++;
			state="ON";
		}
	}
	
	   /**
	   * This method mimics spulling "direction" cord.
	   * it will change direction of fan. 
	   * on current state/speed 
	   * @param none
	   * @return void 
	   */
   public void reverse(){
		if (this.direction.equals("CLOCKWISE")){
			this.direction = "COUNTER-CLOCKWISE";
		}else{
			this.direction = "CLOCKWISE";
		}
	}

	
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	
	public String toString(){
		
		return "Ceiling Fan " + this.state +". Speed: " + speed + ", Direction " + this.direction;
		
	}
	
}
