package at.spengergasse.hawara.domain;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
@Table(name = "Users")
public class Users extends AbstractPersistable<Long> {

    @Column(length = 64, nullable = false)
    @Id @GeneratedValue
    private Long id;
    @Embedded
    @Column(length = 64, nullable = false)
    private @Valid Username username;
    @Embedded
    @Column(length = 64, nullable = false)
    private @Valid Password password;
    @Embedded
    @Column(length = 64, nullable = false)
    private @Valid Email email;
}
