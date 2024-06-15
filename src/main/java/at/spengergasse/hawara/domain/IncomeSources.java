package at.spengergasse.hawara.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.time.LocalDate;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Income_Sources")
public class IncomeSources extends AbstractPersistable<Long> {
    @Column(length = 64, nullable = false)
    @Id @GeneratedValue
    private  Long id;

    @Column(length = 64, nullable = false)
    private  LocalDate date;

    @Column(length = 64, nullable = false)
    private  Float amount;

    @Enumerated(EnumType.STRING)
    @Column(length = 64, nullable = false)
    private  IncomeCategories IncomeCategory;
}
