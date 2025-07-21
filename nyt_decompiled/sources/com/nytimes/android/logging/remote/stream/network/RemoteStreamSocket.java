package com.nytimes.android.logging.remote.stream.network;

import defpackage.by0;
import defpackage.zq3;
import java.io.PrintWriter;
import java.net.Socket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class RemoteStreamSocket {
    public static final a Companion = new a(null);
    public static final int g = 8;
    private boolean a;
    private String b = "192.168.1.44";
    private int c = 9002;
    private boolean d;
    private Socket e;
    private PrintWriter f;

    public static final class InvalidIpAddressException extends RuntimeException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidIpAddressException(String str) {
            super(str);
            zq3.h(str, "message");
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final Socket a() {
        if (this.e == null) {
            this.e = new Socket(this.b, this.c);
        }
        Socket socket = this.e;
        zq3.e(socket);
        return socket;
    }

    public final PrintWriter b() {
        if (this.d && this.f == null) {
            this.f = new PrintWriter(a().getOutputStream());
        }
        return this.f;
    }

    public final Object c(by0 by0Var) {
        return BuildersKt.withContext(Dispatchers.getIO(), new RemoteStreamSocket$isRemoteStreamSocketConnected$2(this, null), by0Var);
    }

    public final Object d(String str, int i, by0 by0Var) {
        if (h.d0(str) || str.length() == 0) {
            this.d = false;
            throw new InvalidIpAddressException("Invalid ip address: " + str);
        }
        this.b = str;
        this.c = i;
        e();
        this.d = true;
        return c(by0Var);
    }

    public final void e() {
        PrintWriter printWriter = this.f;
        if (printWriter != null) {
            printWriter.close();
        }
        Socket socket = this.e;
        if (socket != null) {
            socket.close();
        }
        if (this.a) {
            return;
        }
        this.f = null;
        this.e = null;
    }
}
