package com.rest.reclameunip.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "university")

public class university {
    @Id
    @GeneratedValue
    private long id;

    @NotBlank
    private String student_name;

    @NotBlank
    private String email;

    @NotBlank
    private String urgency;

    @NotBlank
    private String campus;

    @NotBlank
    private String coordinator_name;

public university(){
    super();
}

    public university(long id, String student_name, String email, String urgency, String campus, String coordinator_name) {
        this.id = id;
        this.student_name = student_name;
        this.email = email;
        this.urgency = urgency;
        this.campus = campus;
        this.coordinator_name = coordinator_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getCoordinator_name() {
        return coordinator_name;
    }

    public void setCoordinator_name(String coordinator_name) {
        this.coordinator_name = coordinator_name;
    }
}


