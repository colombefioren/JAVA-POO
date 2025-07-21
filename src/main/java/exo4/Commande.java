package exo4;

import java.time.LocalDate;
import java.util.List;
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
  private List<PlatCommande> listePlatCommande;

  public boolean commandeVide() {
    return listePlatCommande.isEmpty();
  }
}
