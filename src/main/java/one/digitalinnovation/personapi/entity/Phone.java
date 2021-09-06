package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //incrementa a geração do ID no BD
    private Long id;

    @Enumerated(EnumType.STRING)
    //definição pelos nomes na classe enum phonetype
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false)
    private String number;
}
