package com.spring.exercise_1.staff_management_system;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class StaffService {

    Map<Long, StaffModel> staffMap = new HashMap<>();

    AtomicLong idGenerator = new AtomicLong();

    //    Get All staffs
    public Collection<StaffModel> getAllStaffs() {
        return staffMap.values();
    }

    //    Add Staff
    public void addStaff(StaffModel staffModel) {
        Long staffId = staffModel.getId() == null ? idGenerator.incrementAndGet() : staffModel.getId();
        staffModel.setId(staffId);
        staffMap.put(staffModel.getId(), staffModel);
    }

    //   Get Single Staff By ID
    public StaffModel getStaffById(Long id) {
        return staffMap.get(id);
    }

    //    Update Staff By ID
    public StaffModel updateStaffById(Long id, StaffModel updatedStaff) {
        if (staffMap.containsKey(id)) {

            StaffModel odlStaff = getStaffById(id);

            odlStaff.setName(updatedStaff.getName());
            odlStaff.setDepartment(updatedStaff.getDepartment());

            staffMap.put(id, odlStaff);
            return odlStaff;

        }
        return null;
    }

    //   Delete Single Staff By ID
    public void deleteStaffById(Long id) {
        staffMap.remove(id);
    }

}
