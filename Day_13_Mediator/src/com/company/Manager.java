package com.company;


public interface Manager {
    void addMember(Member member);
    void removeMember(Member member);
    public void updateStatus(int status,Member member);
}