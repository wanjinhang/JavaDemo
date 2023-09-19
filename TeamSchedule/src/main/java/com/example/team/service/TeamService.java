package com.example.team.service;

import com.example.team.domain.Architect;
import com.example.team.domain.Designer;
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

    public void addMember(Employee e) throws TeamException{
        if(total>MAX_MEMBER){
            throw new TeamException("队伍已经人满，无法添加");
        }
        if(!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员,无法添加");
        }

        Programmer p = (Programmer) e;

        if (isExist(p)){
            throw new TeamException("该成员已存在,无法添加");
        }

        if("BUSY".equals(p.getStatus().getName())){
            throw new TeamException("该成员已是某团队成员");
        }else if ("VOCATION".equals(p.getStatus().getName())){
            throw new TeamException("该成员正在休假,无法添加");
        }

        int numOfArchives = 0;
        int numOfProgrammer = 0;
        int numOfDesigner = 0;
        for (int i = 0; i <total ; i++) {
            if(team[i] instanceof Architect){
                numOfArchives++;
            }else if (team[i] instanceof Designer){
                numOfDesigner++;
            }else{

                numOfProgrammer++;
            }
        }
        if(p instanceof Architect){
            if(numOfArchives>=1){
                throw new TeamException("团队中至多只能有一名架构师");
            }
        }else if (p instanceof Designer){
            if (numOfDesigner>=2){
                throw new TeamException("团队中至多只能有二名设计师");
            }
        }else{
            if(numOfProgrammer>=3){
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }

        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);
        team[total] =p;


    }

    /**
     * @Description 检查成员是否存在
     * @param p
     * @return boolean
     */
    private boolean isExist(Programmer p) {
        for (int i = 0; i <total ; i++) {
            if (team[i].getId() == p.getId()){
                return true;
            }
        }
        return false;
    }

    /**
     * @param memberId
     * @throws TeamException
     *///删除指定memberId的程序员
    public void removeMember(int memberId) throws TeamException {
        int n = 0;
        //找到指定memberId的员工，并删除
        for (; n < total; n++) {
            if (team[n].getMemberId() == memberId) {
                team[n].setStatus(Status.FREE);
                break;
            }
        }
        //如果遍历一遍，都找不到，则报异常
        if (n == total)
            throw new TeamException("找不到该成员，无法删除");
        //后面的元素覆盖前面的元素
        for (int i = n + 1; i < total; i++) {
            team[i - 1] = team[i];
        }
        team[--total] = null;
    }
}
