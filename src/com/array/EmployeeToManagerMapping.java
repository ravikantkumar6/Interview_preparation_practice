package com.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeToManagerMapping {
    public static void main(String... s) {
        Map<Character, Character> employeeToManagerMapping = new HashMap<Character, Character>();
        employeeToManagerMapping.put('A', 'A');
        employeeToManagerMapping.put('B', 'A');
        employeeToManagerMapping.put('C', 'B');
        employeeToManagerMapping.put('D', 'B');
        employeeToManagerMapping.put('E', 'D');
        employeeToManagerMapping.put('F', 'E');
        findEmployee(employeeToManagerMapping);
    }

    private static void findEmployee(Map<Character, Character> employeeToManagerMapping) {
        Map<Character, List<Character>> managerToEmployeeMapping = new HashMap<Character, List<Character>>();
        for (Map.Entry<Character, Character> entry : employeeToManagerMapping.entrySet()) {
            char employee = entry.getKey();
            char manager = entry.getValue();
            if (employee != manager) {
                managerToEmployeeMapping.putIfAbsent(manager, new ArrayList<Character>());
                managerToEmployeeMapping.get(manager).add(employee);
            }
        }
        Map<Character, List<Character>> results = new HashMap<Character, List<Character>>();
        for (Map.Entry<Character, Character> entry : employeeToManagerMapping.entrySet()) {
            findAllReportingEmployee(entry.getKey(), managerToEmployeeMapping, results);
        }

        for (Map.Entry<Character, List<Character>> entry : results.entrySet()) {
            printList(entry.getKey(), entry.getValue());
        }
    }

    private static void printList(Character c, List<Character> list) {
        System.out.println(c + "-->" + list);
    }

    private static List<Character> findAllReportingEmployee(Character manager,
                                                            Map<Character, List<Character>> managerToEmployeeMapping, Map<Character, List<Character>> results) {
        if (results.containsKey(manager)) {
            return results.get(manager);
        }
        List<Character> managerEmployees = new ArrayList<Character>();
        if (managerEmployees != null) {
            for (char repotee : new ArrayList<>(managerEmployees)) {
                List<Character> employees = findAllReportingEmployee(repotee, managerToEmployeeMapping,
                        results);
                if (employees != null) {
                    managerEmployees.addAll(employees);
                }
            }
        }
        results.put(manager, managerEmployees);
        return managerEmployees;
    }

}
