package exo5;

import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Commande {
  private int id;
  private LocalDateTime date;
  private Client client;
  private List<BoissonCommande> listeBoissonCommande;

  public double totalQuantite() {
    double total = 0;
    for (BoissonCommande bc : listeBoissonCommande) {
      total += bc.getQuantiteAchete() * bc.getBoisson().conversionQuantite(Unite.L);
    }
    return total;
  }

  public double totalQuantite(Unite wantedUnite) {
    double total = 0;
    for (BoissonCommande bc : listeBoissonCommande) {
      total += bc.getQuantiteAchete() * bc.getBoisson().conversionQuantite(wantedUnite);
    }
    return total;
  }
}
