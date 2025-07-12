package exo5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VenteBoissonTest {
  Boisson boisson1;
  Boisson boisson2;
  Boisson boisson3;
  Commande commande1;
  Commande commande2;
  BoissonCommande boissonCommande1;
  BoissonCommande boissonCommande2;
  BoissonCommande boissonCommande3;
  Client client1;
  Client client2;
  Client client3;
  Brasserie brasserie;

  @BeforeEach
  void setUp() {
    client1 = new Client(1, "Danarson", "Hiratra", "0321234567");
    client2 = new Client(2, "Fioren", "Colombe", "0381234567", "cocobrowniees@gmail.com");
    client3 = new Client(3, "Mioty", "Soa", "0341234567");

    boisson1 = new Boisson(1, "Coca Cola", new Quantite(1, Unite.L), 10000);
    boisson2 = new Boisson(2, "Fanta", new Quantite(500, Unite.ML), 900);
    boisson3 = new Boisson(3, "Sprite", new Quantite(2, Unite.L), 25000);

    commande1 = new Commande(1, LocalDateTime.now(), client1, new ArrayList<>());
    commande2 = new Commande(2, LocalDateTime.now(), client2, new ArrayList<>());

    boissonCommande1 = new BoissonCommande(1, boisson1, commande1, 2);
    boissonCommande3 = new BoissonCommande(3, boisson3, commande1, 1);
    boissonCommande2 = new BoissonCommande(2, boisson2, commande2, 17);

    commande1.getListeBoissonCommande().addAll(Arrays.asList(boissonCommande1, boissonCommande3));
    commande2.getListeBoissonCommande().add(boissonCommande2);

    brasserie =
        new Brasserie(
            Arrays.asList(boisson1, boisson2, boisson3),
            Arrays.asList(client1, client2, client3),
            Arrays.asList(commande1, commande2));
  }

  @Test
  void chercherBoisson() {
    List<Boisson> expectedArray = new ArrayList<>(Arrays.asList(boisson1, boisson2));
    List<Boisson> returnedArray = brasserie.rechercheBoisson("a");
    assertEquals(expectedArray, returnedArray);
  }

  @Test
  void chercherClient() {
    List<Client> expectedArray = new ArrayList<>(Collections.singletonList(client2));
    List<Client> returnedArray = brasserie.rechercheClient("COCO");
    assertEquals(expectedArray, returnedArray);
  }

  @Test
  void operateurClient() {
    Map<String, Integer> expectedMap = new HashMap<>();
    expectedMap.put("orange", 1);
    expectedMap.put("yas", 2);
    assertEquals(expectedMap, brasserie.operateurClient());
  }

  @Test
  void totalLitre1() {
    assertEquals(4, commande1.totalQuantite(Unite.L));
  }

  @Test
  void totalLitre2() {
    assertEquals(400, commande1.totalQuantite(Unite.CL));
  }

  @Test
  void totalLitre3() {
    assertEquals(8.5, commande2.totalQuantite());
  }
}
