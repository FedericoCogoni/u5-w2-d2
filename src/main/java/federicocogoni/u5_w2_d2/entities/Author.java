package federicocogoni.u5_w2_d2.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Author {

    private long id;
    private String name;
    private String lastName;
    private String email;
    private LocalDate dateOfBirth;
    private String avatar;

}
