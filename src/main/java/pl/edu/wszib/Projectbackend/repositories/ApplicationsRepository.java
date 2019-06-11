package pl.edu.wszib.Projectbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.wszib.Projectbackend.dbmodels.Application;

import java.util.List;

public interface ApplicationsRepository extends JpaRepository<Application, Long>
{
    List<Application> findAllByPosition(String position);
}
