package exo5;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Brasserie {
  private List<Boisson> listeBoisson;
  private List<Client> listeClient;
  private List<Commande> listeCommande;
}
