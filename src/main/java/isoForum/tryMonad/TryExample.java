package isoForum.tryMonad;

import java.net.Socket;

import static isoForum.tryMonad.TryFactory.attempt;

public class TryExample {
    public static boolean doStuff(String host, int port) {
        return attempt(() -> new Socket(host, port))
            .map(Socket::isConnected)
            .getOrElse(false);
    }
}
