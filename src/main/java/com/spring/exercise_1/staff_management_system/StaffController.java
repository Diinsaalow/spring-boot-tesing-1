package com.spring.exercise_1.staff_management_system;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/staffs")
public class StaffController {

    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    //    Get All Staffs
    @GetMapping()
    public Collection<StaffModel> getAllStaffs() {
        return staffService.getAllStaffs();
    }

    //    Add New Staff
    @PostMapping()
    public void addStaff(@RequestBody StaffModel newStaff) {
        staffService.addStaff(newStaff);
    }

    //    Get Single Staff By ID
    @GetMapping("/{id}")
    public StaffModel getStaffById(@PathVariable Long id) {
        return staffService.getStaffById(id);
    }

    @PutMapping("/{id}")
    public StaffModel updateStaffById(@PathVariable Long id, @RequestBody StaffModel updatedStaff) {
        return staffService.updateStaffById(id, updatedStaff);
    }

    //    Delete Single Staff By ID
    @DeleteMapping("/{id}")
    public void deleteStaff(@PathVariable Long id) {
         staffService.deleteStaffById(id);
    }

}
