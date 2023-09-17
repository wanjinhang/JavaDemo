package com.example.team.service;

import com.example.team.domain.*;

import static com.example.team.service.Data.*;

/**
 * /**
 *
 * @projectName: demo
 * @package: com.example.team.service
 * @className: NameListService
 * @author: wansui
 * @description: TODO
 * @date: 2023/9/16 20:37
 * @version: 1.0
 */
public class NameListService {
    private final Employee[] employees;

    public NameListService() {
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            Equipment equipment;
            double bonus;
            int stock;
            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
                    equipment = creatEquipment(i);
                    employees[i] = new Programmer(id, name, age,salary,equipment);
                    break;
                case DESIGNER:
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary, bonus);
                    break;
                case ARCHITECT:
                    bonus = Double.parseDouble(EQUIPMENTS[i][5]);
                    stock = Integer.parseInt(EQUIPMENTS[i][6]);
                    employees[i] = new Architect(id, name, age,salary, bonus,stock);
                    break;
            }
        }
    }

    private Equipment creatEquipment(int index) {
        int type = Integer.parseInt(EQUIPMENTS[index][0]);
        return switch (type) {
            case PC -> new PC(EQUIPMENTS[index][1], EQUIPMENTS[index][2]);
            case NOTEBOOK -> new NoteBook(EQUIPMENTS[index][1], Integer.parseInt(EQUIPMENTS[index][2]));
            case PRINTER -> new Printer(EQUIPMENTS[index][1], EQUIPMENTS[index][2]);
            default -> null;
        };

    }

    public Employee getEmployee(int id) throws TeamException {
        for (Employee e:employees) {
               if ( e.getId() ==id){
                   return e;
               }
        }
        throw new TeamException("该员工不存在");
    }

    public Employee[] getAllEmployees() {
        return employees;
    }

}
