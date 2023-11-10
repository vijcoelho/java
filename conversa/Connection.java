package conversa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class Connection {
    
    private final Socket socket;
    private final PrintWriter out;
    private final BufferedReader in;

    public Connection(Socket s) throws Exception {
        if(s == null) { throw new Exception("Socket Invalido!"); }
        
        this.socket = s;
        this.out = new PrintWriter(s.getOutputStream());
        this.in = new BufferedReader(new InputStreamReader(s.getInputStream()));
    }

    public String getMessage() {
        try {
            return this.in.readLine();
        } catch(IOException e) {
            return null;
        }
    }

    public boolean sendMessage(String msg) {
        this.out.println(msg);
        return !out.checkError();
    }

    public void close() throws IOException {
        this.in.close();
        this.out.close();
        this.socket.close();
    }
}