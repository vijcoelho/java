package conversa;

import java.net.Socket;

class Cliente {
    public static void main(String[] args) throws Exception {
        Socket meuSocket = new Socket("127.0.0.1", Servidor.DEFAULT_PORT_NUMBER);
        Connection minhaConversaParticular = new Connection(meuSocket);

        minhaConversaParticular.sendMessage("Oi Server!!");

        meuSocket.close();
        minhaConversaParticular.close();
    }
}
