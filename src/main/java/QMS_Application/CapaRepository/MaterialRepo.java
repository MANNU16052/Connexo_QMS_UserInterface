package QMS_Application.CapaRepository;


import QMS_Application.CapaEntity.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepo extends JpaRepository<Material,Long> {
}
