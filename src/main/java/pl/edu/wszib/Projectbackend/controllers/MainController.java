package pl.edu.wszib.Projectbackend.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.Projectbackend.dbmodels.Application;
import pl.edu.wszib.Projectbackend.repositories.ApplicationsRepository;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/applications")
public class MainController
{
    private final ApplicationsRepository applicationsRepository;

    @PostMapping("send")
    public boolean sendApplication(@RequestBody Application application)
    {
        try {
            applicationsRepository.save(application);
            return true;
        } catch(Exception e) {
            return false;
        }
    }

    @GetMapping("")
    public List<Application> getAllApplications()
    {
        return applicationsRepository.findAll();
    }

    @GetMapping("{position}")
    public List<Application> getAllApplicationsByPosition (@PathVariable String position)
    {
        return applicationsRepository.findAllByPosition(position);
    }


}
