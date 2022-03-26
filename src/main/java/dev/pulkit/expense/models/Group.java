package dev.pulkit.expense.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "groups")
public class Group extends  BaseModel {

    private String name;

    @ManyToOne
    private User admin;

    @ManyToMany
    private List<User> member;
    @OneToMany
    private List <Expense>  expenses;

}
