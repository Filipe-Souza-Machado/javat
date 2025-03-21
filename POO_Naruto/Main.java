public class Main {
     
      public static void main(String[] args) {
            Aldeia folha = new Aldeia("Aldeia da folha");
            Aldeia areia = new Aldeia("Aldeia da areia");
            Aldeia nuvem = new Aldeia("Aldeia da nuvem");
            Aldeia pedra = new Aldeia("Aldeia da pedra");
      
            //Pessoas
            Pessoa ichirako = new Pessoa("Ichirako", "1.75", 65.2, "Cozinheiro");
      
            // Ninjas
            Naruto naruto = new Naruto("Naruto", "1.69", 60.0, "ninja", "Uzumaki", "folha", 2);
            Sasuke sasuke = new Sasuke("Sasuke", "1.70", 60.0, "nukenin", "uchiha", "folha", 3);
            
            folha.adicionarPessoas(ichirako);

            folha.adicionarNinjas(naruto);
            folha.adicionarNinjas(sasuke);

            Time time7 = new Time("Time 7");
      }
      
}
