package QMS_Application.CapaDtos;

import QMS_Application.CapaEntity.EntityMain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CapaRequest {

    private EntityMain entityMain;

}
