package homework.hrms.dataAccess;

import homework.hrms.entities.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
}
