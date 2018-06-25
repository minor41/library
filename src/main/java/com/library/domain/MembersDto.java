package com.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class MembersDto {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate joinDate;
}
