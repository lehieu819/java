package com.company;

import java.util.ArrayList;
import java.util.List;

public class ZumbaClass implements Manager {

    private List<Member> members = new ArrayList<>();


    @Override
    public void addMember(Member member) {
        this.members.add(member);
        member.setManager(this);
    }

    @Override
    public void removeMember(Member member) {
        this.members.remove(member);
    }


    @Override
    public void updateStatus(int status, Member member) {
        for(Member mem : this.members){
            if(mem != member && !mem.getClass().getSimpleName().equals(member.getClass().getSimpleName())) {
                mem.check(status);
            }
        }
    }
}
