public class Eagle extends Bird {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

	public void takeOff() {
		if (!this.flying && this.altitude == 0) {
			this.flying=true;
			System.out.println(this.getName() + " takes off in the sky");
		}
	}

	public void ascend(int metre) {
		if (this.flying) {
			this.altitude += metre;
			System.out.println(this.getName() + " flies upward, altitude : " + this.altitude);
		}
	}
	
	public void descend(int metre) {
		if (this.flying) {
			this.altitude = Math.max(this.altitude - metre, 0);
			if (this.altitude > 0) {
				System.out.println(this.getName() + " flies downward, altitude : " + this.altitude);
			} else {
				this.land();
			}
		}
	}

	public void glide() {
		// planer
		if (this.flying && this.altitude !=0 ) {
			System.out.println("it glides on the air");
		}
	}

	public void land() {
		// terre
		if ( (!this.flying && this.altitude ==0 ) || (this.flying && this.altitude <2) ) {
			System.out.println(this.getName() + " lands on the groung . ");
		} else {
			System.out.println(this.getName() + " is toot hight, it can't lands ");
		}
	}
}
