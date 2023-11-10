package conversa;

class TestaServidor {
    public static void main(String[] args) throws Exception {
        Servidor meuServidor = new Servidor();
        meuServidor.esperaConversas();

        meuServidor.close();
    }
}
