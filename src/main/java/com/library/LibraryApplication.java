package com.library;

import com.library.domain.Members;
import com.library.domain.MembersDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class LibraryApplication {

    public static void main(String[] args) {
        //SpringApplication.run(LibraryApplication.class, args);
        MembersDto membersDto = new MembersDto(
                1L,
                "Piotr",
                "Stel",
                LocalDate.of(2000, 10,2)
        );

        Long id = membersDto.getId();
        String fn = membersDto.getFirstName();
        String ln = membersDto.getLastName();
        LocalDate localDate = membersDto.getJoinDate();
        System.out.print(id + " " + fn + " " + ln + " " + localDate);
    }
}
