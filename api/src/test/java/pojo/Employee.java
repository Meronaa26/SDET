package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {

    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private int salary;
    @JsonProperty("job_id")
    private String jobId;



    //this are all the fields we have   ==> @JsonIgnoreProperties(ignoreUnknown = true)  annotation help us to ignore the fields that we don't want
//    "employee_id": 100,
//            "first_name": "Steven",
//            "last_name": "King",
//            "email": "SKING",
//            "phone_number": "515.123.4567",
//            "hire_date": "2003-06-17T00:00:00Z",
//            "job_id": "AD_PRES",
//            "salary": 24000,
//            "commission_pct": null,
//            "manager_id": null,
//            "department_id": 90,
}
