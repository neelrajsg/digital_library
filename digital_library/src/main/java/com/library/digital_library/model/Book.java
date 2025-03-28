package com.library.digital_library.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title cannot be empty")
    private String title;

    @NotBlank(message = "Author cannot be empty")
    private String author;

    private String genre;
    
    @Enumerated(EnumType.STRING)
    private AvailabilityStatus availability;
}

enum AvailabilityStatus {
    AVAILABLE, CHECKED_OUT
}
