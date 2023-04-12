package com.ilterhan.api.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //Disardan gelen http dinleyen bir obje JSON
@RequestMapping("projects")
public class ProjectController {
    @Autowired //obje olusturmamizaa yardim ediyor
    ProjectRepository projectRepository;

    @GetMapping
    public List<Project> readProjects(){
        return projectRepository.findAll();

    }

    @GetMapping("{id}")
    public Project readProject(@PathVariable Long id,@RequestParam("username") String uname,@RequestParam("password") String pass){ //path variable projects/id
        System.out.println(uname);
        System.out.println(pass);
        Optional<Project> optionalProject = projectRepository.findById(id);
        return optionalProject.orElseGet(Project::new);
        // ? soru isareti pathin bittigi yerden username password valuelari giriyoz

    }


    @PostMapping
    public Long addProject(@RequestBody Project project){
        Project p = projectRepository.save(project);
        return p.getId();
    }

    @PutMapping("{id}")
    public Project updateProject(@PathVariable Long id,@RequestBody Project project){
        project.setId(id);
        return projectRepository.save(project);

    }
    @DeleteMapping("{id}")
    public String deleteProject(@PathVariable Long id){
        projectRepository.deleteById(id);
        return "deleted";
    }



}
