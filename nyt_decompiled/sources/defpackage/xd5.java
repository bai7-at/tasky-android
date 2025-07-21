package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.text.h;

/* loaded from: classes5.dex */
abstract /* synthetic */ class xd5 {
    private static final Logger a = Logger.getLogger("okio.Okio");

    public static final yt7 b(File file) {
        zq3.h(file, "<this>");
        return wd5.h(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        zq3.h(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? h.P(message, "getsockname failed", false, 2, null) : false;
    }

    public static final yt7 d(File file) {
        zq3.h(file, "<this>");
        return h(file, false, 1, null);
    }

    public static final yt7 e(File file, boolean z) {
        zq3.h(file, "<this>");
        return wd5.h(new FileOutputStream(file, z));
    }

    public static final yt7 f(OutputStream outputStream) {
        zq3.h(outputStream, "<this>");
        return new il5(outputStream, new pm8());
    }

    public static final yt7 g(Socket socket) {
        zq3.h(socket, "<this>");
        dx7 dx7Var = new dx7(socket);
        OutputStream outputStream = socket.getOutputStream();
        zq3.g(outputStream, "getOutputStream(...)");
        return dx7Var.sink(new il5(outputStream, dx7Var));
    }

    public static /* synthetic */ yt7 h(File file, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return wd5.g(file, z);
    }

    public static final px7 i(File file) {
        zq3.h(file, "<this>");
        return new hl3(new FileInputStream(file), pm8.NONE);
    }

    public static final px7 j(InputStream inputStream) {
        zq3.h(inputStream, "<this>");
        return new hl3(inputStream, new pm8());
    }

    public static final px7 k(Socket socket) {
        zq3.h(socket, "<this>");
        dx7 dx7Var = new dx7(socket);
        InputStream inputStream = socket.getInputStream();
        zq3.g(inputStream, "getInputStream(...)");
        return dx7Var.source(new hl3(inputStream, dx7Var));
    }
}
