package com.example.lab5.EventSystem.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Event {

    @NotEmpty(message = "Id cannot be empty")
    @Size(min = 3, message = "Id length must be more than 2 characters")
    private String id;

    @NotEmpty(message = "Description cannot be empty")
    @Size(min = 16, message = "Description length must be more than 15 characters")
    private String description;

    @NotNull(message = "Capacity cannot be empty")
    @Min(value = 26, message = "Capacity must be more than 25")
    private Integer capacity;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime startDate;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime endDate;

}
