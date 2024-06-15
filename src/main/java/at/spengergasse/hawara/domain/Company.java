package at.spengergasse.hawara.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.time.LocalDate;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder

@Entity
@Table(name = "Company")
public class Company extends AbstractPersistable<Long> {

    @Column(length = 64, nullable = false)
    @Id @GeneratedValue
    private Long id;

    @Column(length = 64, nullable = false)
    private @NotBlank String name;

    @Column(length = 64, nullable = false)
    private Float amountOfShares;

    @Column(length = 64, nullable = false)
    private Float valuePerShare;

    @Column(length = 64, nullable = false)
    private LocalDate lastDividendPayment;
}