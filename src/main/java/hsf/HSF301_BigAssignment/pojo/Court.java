package hsf.HSF301_BigAssignment.pojo;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.List;
@Entity
public class Court {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "open_time")
    private LocalTime openTime;

    @Column(name = "close_time")
    private LocalTime closeTime;

    @ManyToOne
    @JoinColumn(name = "create_by")
    private Admin createBy;

    @OneToMany(mappedBy = "court", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Payment> payments;

}
