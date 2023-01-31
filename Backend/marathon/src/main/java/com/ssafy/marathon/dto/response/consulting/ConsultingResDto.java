package com.ssafy.marathon.dto.response.consulting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConsultingResDto {

    private Long seq;
    private String name;
    private char sex;
    private LocalDate birthDate;
    private String email;
    private String phone1;
    private String phone2;
    private String phone2Relationship;
    private String phone3;
    private String phone3Relationship;
    private LocalDateTime hopeDate;
    private boolean checked;
}
