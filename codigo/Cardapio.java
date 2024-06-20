import java.util.ArrayList;
import java.util.List;

public class Cardapio{
    private List<Item> comidas;
    private List<Item> bebidas;

   public Cardapio() {
        comidas = new ArrayList<>();
        bebidas = new ArrayList<>();
    }

    public void adicionarComida(String nome, double preco) {
        comidas.add(new Item(nome, preco, "Comida"));
    }

    public void adicionarBebida(String nome, double preco) {
        bebidas.add(new Item(nome, preco, "Bebida"));
    }

    public void mostrarOpcoes() {
        System.out.println("Comidas:");
        for (int i = 0; i < comidas.size(); i++) {
            System.out.println((i + 1) + ". " + comidas.get(i));
        }
        System.out.println("\nBebidas:");
        for (int i = 0; i < bebidas.size(); i++) {
            System.out.println((i + 1) + ". " + bebidas.get(i));
        }
    }

    public Item pegarItem(String nome) {
        for (Item item : comidas) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                return item;
            }
        }
        for (Item item : bebidas) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                return item;
            }
        }
        return null;
    }
    public void mostrarItem(String nome) {
        Item item = pegarItem(nome);
        if (item != null) {
            System.out.println("Item: " + item.getNome());
            System.out.println("Preço: R$ " + String.format("%.2f", item.getPreco()));
        } else {
            System.out.println("Item não encontrado");
        }
    }
}