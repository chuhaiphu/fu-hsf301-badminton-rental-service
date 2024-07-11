package hsf.HSF301_BigAssignment.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Entity
@Data
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "final_price")
    private Double finalPrice;

    @Column(name = "pay_at")
    private LocalDate payAt = LocalDate.now();

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "court_id")
    private Court court;
}
