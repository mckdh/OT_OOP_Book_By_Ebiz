package mckdh.etc.polymorphism.anti;

import mckdh.etc.polymorphism.JetAirplane;
import mckdh.etc.polymorphism.PropellerAirplane;
import mckdh.etc.polymorphism.StealthAirplane;

public class Pilot {
	String code = "";
	
	public Pilot(String codeReceived) {
		this.code = codeReceived;
	}
	
	// 비행기 타기
	public void intoAirplane() {
		if(code.equals("프로펠러 비행기")) {
			PropellerAirplane pAirplane = new PropellerAirplane();
			pAirplane.airplaneFeature();
		} else if(code.equals("제트 비행기")) {
			JetAirplane jAirplane = new JetAirplane();
			jAirplane.airplaneFeature();
		} else if(code.equals("스텔스 비행기")) {
			StealthAirplane pAirplane = new StealthAirplane();
			pAirplane.airplaneFeature();
		}  else if(code.equals("스텔스 비행기")) {
			// 관련 로직 
		}  else if(code.equals("스텔스 비행기")) {
			// 관련 로직 
		}      
	}
}	
