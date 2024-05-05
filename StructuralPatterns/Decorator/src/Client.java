import components.Coffee;
import concreteComponents.BlackCoffee;
import concreteDecorators.Cream;
import concreteDecorators.Sugar;
import decorators.AddOn;

/*
    Suponha que você esteja desenvolvendo um sistema de gerenciamento de pedidos em uma cafeteria.
    Atualmente, o sistema permite que os clientes façam pedidos de café simples, como café preto,
    café com leite, entre outros. Cada tipo de café é representado por uma classe que implementa
    a interface Coffee, que possui um método getDescription() para obter a descrição do café e
    um método getCost() para obter o custo do café.

    Recentemente, a cafeteria decidiu oferecer a opção de adicionar ingredientes extras aos cafés,
    como creme, açúcar, xarope de baunilha, entre outros. Esses ingredientes extras devem ser adicionados
    dinamicamente aos pedidos de café, sem modificar as classes existentes de café.

    Sua tarefa é implementar o padrão de projeto Decorator para permitir a adição dinâmica de ingredientes
    extras aos pedidos de café, garantindo que o sistema seja flexível e fácil de estender para novos tipos
    de ingredientes.

    Você deve criar classes decoradoras para os ingredientes extras, como creme, açúcar, xarope de baunilha,
    etc., e implementar a lógica necessária para adicionar esses ingredientes aos pedidos de café de forma dinâmica.
    Certifique-se de que a adição de ingredientes extras não exija modificações nas classes existentes de café
    e que os custos e descrições dos pedidos sejam atualizados corretamente. Boa sorte!
*/
public class Client {
    public static void main(String[] args) {
        System.out.println(new Cream(
                                new Sugar(
                                        new BlackCoffee(), 10), 5)
        );
    }
}