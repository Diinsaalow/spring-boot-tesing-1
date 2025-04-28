package com.spring.exercise_1.staff_management_system;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StaffModel {
    private String name;
    private Long id;
    private String department;

}
