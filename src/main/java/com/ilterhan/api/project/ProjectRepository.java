package com.ilterhan.api.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//propertiesde ddl auto
//create her seyi yeniden silip olusturuyor
//update yoksa olusturuyor varsa update ediyor
@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {

}
