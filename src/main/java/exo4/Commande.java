package exo4;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Commande {
  private int id;
  private LocalDate dateCommande;
  private Client client;
}
