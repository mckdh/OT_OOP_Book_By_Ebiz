package mckdh.default1.test;

import mckdh.default1.airplane.Airplane;
import mckdh.default1.pilot.Pilot;
import mckdh.default1.stealth.NormalStealth;
import mckdh.default1.stealth.NotDoStealth;
import mckdh.default1.stealth.UltraStealth;

public class LauncherWW2 {

	public static void main(String[] args) {
		Airplane airplane = new Airplane(new UltraStealth());
		airplane.doingStealthFunction();
		
		Airplane airplane2 = new Airplane(new NormalStealth());
		airplane2.doingStealthFunction();
		
		Airplane airplane3 = new Airplane(new NotDoStealth());
		airplane3.doingStealthFunction();
		
		
//		Pilot pilot = new Pilot();
//		pilot.intoCockpit();
//		pilot.checkAirplane();
//       	pilot.turnOnAirplane();
//        pilot.increaseSpeedOnLand();
//        pilot.takeOff();
//        pilot.wheelIntoBody();
	}

}
