package com.lyft.kronos.internal.ntp;

import com.comscore.streaming.ContentType;
import defpackage.nb1;
import defpackage.xl0;
import defpackage.xs1;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class SntpClient {
    private final xl0 a;
    private final xs1 b;
    private final nb1 c;

    private static class InvalidServerReplyException extends IOException {
        public InvalidServerReplyException(String str) {
            super(str);
        }
    }

    public static final class a {
        private final long a;
        private final long b;
        private final long c;
        private final xl0 d;

        a(long j, long j2, long j3, xl0 xl0Var) {
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = xl0Var;
        }

        public long a() {
            return this.a + this.c + e();
        }

        long b() {
            return this.a;
        }

        long c() {
            return this.b;
        }

        public long d() {
            return this.c;
        }

        public long e() {
            return this.d.c() - this.b;
        }

        boolean f() {
            return Math.abs((this.a - this.b) - (this.d.b() - this.d.c())) < 1000;
        }
    }

    public SntpClient(xl0 xl0Var, xs1 xs1Var, nb1 nb1Var) {
        this.a = xl0Var;
        this.b = xs1Var;
        this.c = nb1Var;
    }

    private static void a(byte b, byte b2, int i, long j) {
        if (b == 3) {
            throw new InvalidServerReplyException("unsynchronized server");
        }
        if (b2 != 4 && b2 != 5) {
            throw new InvalidServerReplyException("untrusted mode: " + ((int) b2));
        }
        if (i != 0 && i <= 15) {
            if (j == 0) {
                throw new InvalidServerReplyException("zero transmitTime");
            }
        } else {
            throw new InvalidServerReplyException("untrusted stratum: " + i);
        }
    }

    private static long b(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
    }

    static long c(byte[] bArr, int i) {
        return ((b(bArr, i) - 2208988800L) * 1000) + ((b(bArr, i + 4) * 1000) / 4294967296L);
    }

    private static void e(byte[] bArr, int i, long j) {
        long j2 = j / 1000;
        long j3 = j - (j2 * 1000);
        bArr[i] = (byte) (r2 >> 24);
        bArr[i + 1] = (byte) (r2 >> 16);
        bArr[i + 2] = (byte) (r2 >> 8);
        bArr[i + 3] = (byte) (j2 + 2208988800L);
        long j4 = (j3 * 4294967296L) / 1000;
        bArr[i + 4] = (byte) (j4 >> 24);
        bArr[i + 5] = (byte) (j4 >> 16);
        bArr[i + 6] = (byte) (j4 >> 8);
        bArr[i + 7] = (byte) (Math.random() * 255.0d);
    }

    public a d(String str, Long l) {
        byte[] copyOf;
        long c;
        long j;
        byte b;
        byte b2;
        int i;
        long c2;
        long c3;
        DatagramSocket datagramSocket = null;
        try {
            InetAddress a2 = this.b.a(str);
            datagramSocket = this.c.a();
            try {
                datagramSocket.setSoTimeout(l.intValue());
                byte[] bArr = new byte[48];
                DatagramPacket c4 = this.c.c(bArr, a2, ContentType.USER_GENERATED_LIVE);
                bArr[0] = 27;
                long b3 = this.a.b();
                long c5 = this.a.c();
                e(bArr, 40, b3);
                datagramSocket.send(c4);
                copyOf = Arrays.copyOf(bArr, 48);
                datagramSocket.receive(this.c.b(copyOf));
                c = this.a.c();
                j = b3 + (c - c5);
                byte b4 = copyOf[0];
                b = (byte) ((b4 >> 6) & 3);
                b2 = (byte) (b4 & 7);
                i = copyOf[1] & 255;
                c2 = c(copyOf, 24);
                c3 = c(copyOf, 32);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            long c6 = c(copyOf, 40);
            a(b, b2, i, c6);
            a aVar = new a(j, c, ((c3 - c2) + (c6 - j)) / 2, this.a);
            datagramSocket.close();
            return aVar;
        } catch (Throwable th3) {
            th = th3;
            datagramSocket = datagramSocket;
            if (datagramSocket != null) {
                datagramSocket.close();
            }
            throw th;
        }
    }
}
