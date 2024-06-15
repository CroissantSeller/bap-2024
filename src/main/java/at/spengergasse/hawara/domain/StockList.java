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
@Table(name = "Stock_List")
public class StockList extends AbstractPersistable<Long> {

    @Column(length = 64, nullable = false)
    @Id @GeneratedValue
    private Long id;
    //Placeholder
    @Column(name = "List_of_Stock")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "FK_StockList_Stock"))
    private List<Stock> ListOfStock = new ArrayList<>();

}
