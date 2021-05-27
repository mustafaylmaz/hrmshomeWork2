package homework.hrms.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;


@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "employers")
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Employer extends User{



    @Column(name = "company_name")
    private String company_name;

    @Column(name = "web_address")
    private String web_address;

}
