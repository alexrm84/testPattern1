package alexrm84.testPattern.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "info_msg")
@Data
public class InfoMSG implements Serializable {
    private static final long serialVersionUID = -8308096259407757431L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "pc_name")
    private String pcName;

    @Column(name = "datetime")
    private LocalDateTime dateTime;

    @OneToOne
    @JoinColumn(name = "smart_id")
    private Smart smart;

    @OneToOne
    @JoinColumn(name = "temperature_id")
    private Temperature temperature;
}
