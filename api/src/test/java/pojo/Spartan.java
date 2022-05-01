package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@JsonIgnoreProperties(value="id",allowSetters = true)
public class Spartan {

    private int id;
    private String name;
    private String gender;
    private long phone;



}
