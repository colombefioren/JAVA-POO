package exo5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BoissonCommande {
  private int id;
  private Boisson boisson;
  private Commande commande;
  private int quantiteAchete;
}
