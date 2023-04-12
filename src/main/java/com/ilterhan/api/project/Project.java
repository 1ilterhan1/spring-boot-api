package com.ilterhan.api.project;

import javax.persistence.*;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;
    @Column(nullable = false)
    private String projectName;
    @Column(nullable = false)
    private String projectDescription;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }
}
