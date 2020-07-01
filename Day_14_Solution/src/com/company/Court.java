package com.company;

public class Court implements Chain {
	//http://www.newthinktank.com/2012/10/chain-of-responsibility-design-pattern-tutorial/
    protected String name;
    protected int status = 0;
    public Court(String name){
        this.name = name;
    }
    public void getName(){
        System.out.println(this.name);
    }
    public void setStatus(int status){
        this.status = status;
    }
    public int getStatus(){
        return status;
    }
    private Court nextInChain;
    private 
    @Override
    public void setNextChain(Court nextChain) {
        nextInChain = nextChain;

    }

    @Override
    public void check(Court court) {
        if (court.getStatus() == 0){
            court.getName();
            court.setStatus(1);
        }
        else{
            nextInChain.check(nextInChain);
        }

    }


}