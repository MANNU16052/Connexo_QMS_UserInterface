package QMS_Application.CapaRepository;


import QMS_Application.CapaEntity.EntityMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityMainRepo extends JpaRepository<EntityMain, Long> {
}
