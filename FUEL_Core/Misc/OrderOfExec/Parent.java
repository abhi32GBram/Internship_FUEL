package com.example.demo;

`Parent.java`
public class Parent {
    private int Pid;
    private String Pname;
    private String PFater;
    private String PMother;
    private String P_ChildGender;


    // WE CAN ADD MULTIPLE STATIC BLOCKS BTW
    static {
        System.out.println("this is the static block of the parent class : EXEC'd finish 1st");
    }

    {
        System.out.println("this is the static block :  2 of the parent class  EXEC'd finish 1st and 2nd lol  ");
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int pid) {
        Pid = pid;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public String getPFater() {
        return PFater;
    }

    public void setPFater(String PFater) {
        this.PFater = PFater;
    }

    public String getPMother() {
        return PMother;
    }

    public void setPMother(String PMother) {
        this.PMother = PMother;
    }

    public String getP_ChildGender() {
        return P_ChildGender;
    }

    public void setP_ChildGender(String p_ChildGender) {
        P_ChildGender = p_ChildGender;
    }

    public static void main(String[] args) {
        System.out.println("this is the entrypoint of the parent Class - PARENT CLASS");

    }
}
