package alexrm84.testPattern.repositories;

import alexrm84.testPattern.entities.InfoMSG;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfoMSGRepository extends JpaRepository<InfoMSG, Integer> {
}
