package com.example.officemanager.floor;


import com.example.officemanager.desk.Desk;
import com.example.officemanager.internalapi.CrudEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Floor extends CrudEntity {


    private String flooreName;

    @OneToMany
    private List<Desk> desks;

    public void addDesk() {
        desks.add(new Desk());
    }

    public void removeDesk(Long id) {
        desks.remove(id);
    }
}
