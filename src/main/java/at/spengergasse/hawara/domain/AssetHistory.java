package at.spengergasse.hawara.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.time.LocalDate;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "asset_history")
public class AssetHistory extends AbstractPersistable<Long> {

    @Column(length = 64, nullable = false)
    private  LocalDate date;

    @Column(length = 64, nullable = false)
    private  Float totalValue;
}
