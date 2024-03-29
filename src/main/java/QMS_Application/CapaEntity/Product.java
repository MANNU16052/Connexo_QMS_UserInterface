package QMS_Application.CapaEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String ProductName;
    private String BatchNo;
    private Date ManufacturingDate;
    private Date DateOfExpiry;
    private String BatchDispositionDecision;
    private String Remark;
    private String BatchStatus;



}
