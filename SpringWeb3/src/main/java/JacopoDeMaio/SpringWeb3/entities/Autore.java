package JacopoDeMaio.SpringWeb3.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "autori")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Autore {
    @Id
    @GeneratedValue

    private UUID id;

    private String nome;

    private String cognome;

    private String email;

    @Column(name = "data_di_nascita")
    private LocalDate dataDiNascita;

    private String avatar;


    public Autore(String nome, String cognome, String email, LocalDate dataDiNascita, String avatar) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.avatar = avatar;
    }
}
