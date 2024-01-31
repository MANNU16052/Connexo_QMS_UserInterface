package QMS_Application.CapaRepository;


import QMS_Application.CapaEntity.CapaClosureInfoAttach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapaClosureInfoAttachRepo extends JpaRepository<CapaClosureInfoAttach,Long> {
}
