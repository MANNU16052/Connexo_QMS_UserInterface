package QMS_Application.CapaRepository;


import QMS_Application.CapaEntity.GroupCommentAttach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupCommentAttachRepo extends JpaRepository<GroupCommentAttach,Long> {
}
