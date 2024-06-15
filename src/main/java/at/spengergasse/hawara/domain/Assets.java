package at.spengergasse.hawara.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Assets")
public class Assets extends AbstractPersistable<Long> {

    @Column(length = 64, nullable = false)
    @Id @GeneratedValue
    private  Long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "assets_id")
    private List<AssetHistory> history = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "assets_id")
    private List<ExpensesSources> expenses = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "assets_id")
    private List<IncomeSources> income = new ArrayList<>();

    @Column(length = 64, nullable = false)
    private @NotBlank Float totalAssets;
}
