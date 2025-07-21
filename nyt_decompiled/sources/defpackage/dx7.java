package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
final class dx7 extends mu {
    private final Socket a;

    public dx7(Socket socket) {
        zq3.h(socket, "socket");
        this.a = socket;
    }

    @Override // defpackage.mu
    protected IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // defpackage.mu
    protected void timedOut() {
        Logger logger;
        Logger logger2;
        try {
            this.a.close();
        } catch (AssertionError e) {
            if (!wd5.e(e)) {
                throw e;
            }
            logger2 = xd5.a;
            logger2.log(Level.WARNING, "Failed to close timed out socket " + this.a, (Throwable) e);
        } catch (Exception e2) {
            logger = xd5.a;
            logger.log(Level.WARNING, "Failed to close timed out socket " + this.a, (Throwable) e2);
        }
    }
}
