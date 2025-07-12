package exo5;

import java.util.List;
import java.util.stream.Collectors;
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

  public List<Boisson> rechercheBoisson(String mot) {
    return listeBoisson.stream()
        .filter(b -> b.getNom().toLowerCase().contains(mot.toLowerCase()))
        .collect(Collectors.toList());
  }

  public List<Client> rechercheClient(String mot) {
    return listeClient.stream()
        .filter(
            c ->
                (c.getNom().toLowerCase().contains(mot.toLowerCase())
                    || (c.getPrenom().toLowerCase().contains(mot.toLowerCase()))
                    || (c.getEmail().toLowerCase().contains(mot.toLowerCase()))))
        .collect(Collectors.toList());
  }
}
