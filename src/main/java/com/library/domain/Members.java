package com.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Members {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate joinDate;
}
