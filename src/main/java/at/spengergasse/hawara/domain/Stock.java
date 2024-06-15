package at.spengergasse.hawara.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder

@Entity
@Table(name = "stock")
public class Stock {

    @Column(length = 64, nullable = false)
    @Id
    private @NotBlank String stockName;

    @Column(length = 64, nullable = false)
    private Float value;

    @Column(length = 12, nullable = false)
    private LocalDate sellDate;

    @Column(length = 12, nullable = false)
    private LocalDate buyDate;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users user;

}
