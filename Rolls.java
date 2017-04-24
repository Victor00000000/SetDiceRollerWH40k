/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setdiceroller;

/**
 *
 * @author Phoenix Lord
 */



public class Rolls {
    
    private int Rolls1, Rolls2, Rolls3, Rolls4, Rolls5, Rolls6;
    
    public Rolls() {
        this.clearRollsAll();
    }
    
    public int getRolls1() {
        return Rolls1;
    }
    public int getRolls2() {
        return Rolls2;
    }
    public int getRolls3() {
        return Rolls3;
    }
    public int getRolls4() {
        return Rolls4;
    }
    public int getRolls5() {
        return Rolls5;
    }
    public int getRolls6() {
        return Rolls6;
    }
    
    public int getRollsAll() {
        return (Rolls1 + Rolls2 + Rolls3 + Rolls4 + Rolls5 + Rolls6);
    }
    
    public int getRolls2plus() {
        return (Rolls2 + Rolls3 + Rolls4 + Rolls5 + Rolls6);
    }
    public int getRolls3plus() {
        return (Rolls3 + Rolls4 + Rolls5 + Rolls6);
    }
    public int getRolls4plus() {
        return (Rolls4 + Rolls5 + Rolls6);
    }
    public int getRolls5plus() {
        return (Rolls5 + Rolls6);
    }
    
    public int getRolls5minus() {
        return (Rolls1 + Rolls2 + Rolls3 + Rolls4 + Rolls5);
    }
    public int getRolls4minus() {
        return (Rolls1 + Rolls2 + Rolls3 + Rolls4);
    }
    public int getRolls3minus() {
        return (Rolls1 + Rolls2 + Rolls3);
    }
    public int getRolls2minus() {
        return (Rolls1 + Rolls2);
    }
    
    public void addOneToRolls1() {
        Rolls1++;
    }
    public void addOneToRolls2() {
        Rolls2++;
    }
    public void addOneToRolls3() {
        Rolls3++;
    }
    public void addOneToRolls4() {
        Rolls4++;
    }
    public void addOneToRolls5() {
        Rolls5++;
    }
    public void addOneToRolls6() {
        Rolls6++;
    }
    
    public void clearRolls1() {
        Rolls1 = 0;
    }
    public void clearRolls2() {
        Rolls2 = 0;
    }
    public void clearRolls3() {
        Rolls3 = 0;
    }
    public void clearRolls4() {
        Rolls4 = 0;
    }
    public void clearRolls5() {
        Rolls5 = 0;
    }
    public void clearRolls6() {
        Rolls6 = 0;
    }
    
    public void clearRollsAll() {
        this.clearRolls1();
        this.clearRolls2();
        this.clearRolls3();
        this.clearRolls4();
        this.clearRolls5();
        this.clearRolls6();
    }
}
