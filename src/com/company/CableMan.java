package com.company;

import com.company.impl.CopperCableMan;
import com.company.impl.OpticalCableMan;

public abstract class CableMan {
    CopperCableMan copperCableMan;
    OpticalCableMan opticalCableMan;

    public void dig(){
        System.out.println("I dig earth to put cable there");
    }

    public void workingCopperCable(){
        copperCableMan = new CopperCableMan();
        copperCableMan.work();
    }

    public void workingOpticalCable(){
        opticalCableMan = new OpticalCableMan();
        opticalCableMan.work();
    }

    public void setCopperCableMan(CopperCableMan ccm){
        copperCableMan = ccm;
    }
}
