package pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Regions {


//    "hasMore": false,
//            "limit": 25,
//            "offset": 0,
//            "count": 19,
//    private String hasMore;
//    private int limit;
//    private int offset;
    //i am taking only two fields


    private  int count;
    private List<Region> items;
}
