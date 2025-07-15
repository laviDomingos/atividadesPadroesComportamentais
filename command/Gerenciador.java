package command;

import java.util.Stack;

public class Gerenciador {
    
    private Stack<Comando> comandos;

    public Gerenciador() {
        comandos = new Stack<>();
    }

    public void adicionarComando(Comando comando) {
        comandos.push(comando);
    }

    public void executarComando() {
        if (!comandos.isEmpty()) {
            Comando comando = comandos.pop();
            comando.executar();
        } else {
            System.out.println("Nenhum comando para executar.");
        }
    }

    public void desfazerComando() {
        if (!comandos.isEmpty()) {
            comandos.pop();
            System.out.println("Último comando desfeito.");
        } else {
            System.out.println("Nenhum comando para desfazer.");
        }
    }
}
