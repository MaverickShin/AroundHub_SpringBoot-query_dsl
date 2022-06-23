package studio.thinkground.aroundhub.data.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberCopyDTO {

    private String name;
    private String email;
    private String organiztion;
}
