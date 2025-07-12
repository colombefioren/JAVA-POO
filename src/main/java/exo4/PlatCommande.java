package exo4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PlatCommande {
  private int id;
  private Plat plat;
  private Commande commande;
  private int quantiteAchete;
}
