package dev.pulkit.expense.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Map;

@Getter
@Setter
@Entity
@Table(name = "expenses")
public class Expense extends  BaseModel {

    @ManyToOne
    private User createdBy;

    private Long amount;

    private String currency;
    @ElementCollection
    Map<User,Long> paidBy;
    @ElementCollection
    Map <User,Long> owedBy;
//    Map<>

}
