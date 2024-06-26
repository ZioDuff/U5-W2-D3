package JacopoDeMaio.SpringWeb3.entities;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class BlogPostPayload {

    private String categoria;

    private String titolo;

    private String cover;

    private String contenuto;

    private int tempoDiLettura;

    private String autoreId;


}
