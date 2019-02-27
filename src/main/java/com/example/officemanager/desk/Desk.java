package com.example.officemanager.desk;

import com.example.officemanager.internalapi.CrudEntity;
import com.example.officemanager.person.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Desk extends CrudEntity {

    @OneToMany
    private List<Person> persons;

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void removePerson(Long id) {
        persons.remove(id);
    }
}
