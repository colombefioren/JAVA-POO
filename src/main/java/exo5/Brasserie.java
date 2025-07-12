package exo5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

  public Map<String, Integer> operateurClient() {
    Map<String, Integer> listeOperateurClient = new HashMap<>();
    for (Client c : listeClient) {
      String operateur = "";
      if (c.getTelephone().startsWith("032")) {
        operateur = "orange";
      } else if (c.getTelephone().startsWith("033")) {
        operateur = "airtel";
      } else if (c.getTelephone().startsWith("034") || c.getTelephone().startsWith("038")) {
        operateur = "yas";
      }

      listeOperateurClient.put(operateur, listeOperateurClient.getOrDefault(operateur, 0) + 1);
    }
    return listeOperateurClient;
  }
}
