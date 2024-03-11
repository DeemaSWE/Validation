package com.example.lab5.ProjectTrackerSystem.Model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Project {

    @NotEmpty(message = "Id cannot be empty")
    @Size(min = 3, message = "Id length must be more than 2 characters")
    private String id;

    @NotEmpty(message = "Title cannot be empty")
    @Size(min = 9, message = "Title length must be more than 8 characters")
    private String title;

    @NotEmpty(message = "Description cannot be empty")
    @Size(min = 16, message = "Description length must be more than 15 characters")
    private String description;

    @NotEmpty(message = "Status cannot be empty")
    @Pattern(regexp = "^(Not Started|In Progress|Completed)$",
            message = "Project status must be 'Not Started' or 'In Progress' or 'Completed'")
    private String status;

    @NotEmpty(message = "Company name cannot be empty")
    @Size(min = 7, message = "Company name length must be more than 6 characters")
    private String companyName;
}
