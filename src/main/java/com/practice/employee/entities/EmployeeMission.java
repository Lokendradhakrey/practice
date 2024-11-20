package com.practice.employee.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee_mission")
@IdClass(EmployeeMission.EmployeeMissionId.class)
public class EmployeeMission {

    @Id
    @Column(name = "employee_id")
    private Integer employeeId;

    @Id
    @Column(name = "mission_id")
    private Integer missionId;

    @ManyToOne
    @JoinColumn(name = "employee_id", insertable = false, updatable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "mission_id", insertable = false, updatable = false)
    private Mission mission;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class EmployeeMissionId implements java.io.Serializable {
        private Integer employeeId;
        private Integer missionId;
    }
}
