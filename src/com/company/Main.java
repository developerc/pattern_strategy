package com.company;

import com.company.impl.CopperCableMan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CoolCableMan coolCableMan = new CoolCableMan();
        coolCableMan.dig();
        //coolCableMan.copperCableMan.work();
        coolCableMan.workingCopperCable();
        coolCableMan.workingOpticalCable();

       /* GoodCableMan goodCableMan = new GoodCableMan();
        coolCableMan.setCopperCableMan( goodCableMan);*/
       /* CableMan myCableMan = new CoolCableMan();
        myCableMan.workingCopperCable();*/
    }
}
