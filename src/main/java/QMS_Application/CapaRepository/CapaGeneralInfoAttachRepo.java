package QMS_Application.CapaRepository;



import QMS_Application.CapaEntity.CapaGeneralInfoAttach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapaGeneralInfoAttachRepo extends JpaRepository<CapaGeneralInfoAttach,Long> {
}
