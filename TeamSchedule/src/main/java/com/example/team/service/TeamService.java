package com.example.team.service;

import com.example.team.domain.Employee;
import com.example.team.domain.Programmer;

/**
 * @author wansui
 * @version 1.0
 * @date 2023/9/16 20:43
 */
public class TeamService {
    private int counter = 1;
    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total = 0;

    public Programmer[] getTeam() {
        return team;
    }

    public void addMember(Employee e) {

    }

    public void removeMember(int memberId) {

    }
}
