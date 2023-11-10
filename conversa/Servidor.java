package conversa;

import java.net.ServerSocket;
import java.net.Socket;

class Servidor {
    
    public static final int DEFAULT_PORT_NUMBER = 9000;
    private ServerSocket servidor;

    public Servidor(int porta) throws Exception {
        if (porta < 2000) {
            porta = DEFAULT_PORT_NUMBER;
        }
        servidor = new ServerSocket(porta);
    }

    public Servidor() throws Exception {
        this(DEFAULT_PORT_NUMBER);
    }

    public void esperaConversas() {
        try {
            while (true) {
                Socket s = servidor.accept();
                System.out.println("Conectado");
                
                Connection conn = new Connection(s);
                
                try {
                    while (true) {
                        String msg = conn.getMessage();
                        System.out.println("MESSAGE ==> " + msg);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    conn.close();
                    s.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void close() throws Exception {
        this.servidor.close();
    }
}
