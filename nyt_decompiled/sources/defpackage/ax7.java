package defpackage;

import android.os.SystemClock;
import com.amazonaws.services.s3.internal.Constants;
import com.comscore.streaming.ContentType;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* loaded from: classes2.dex */
public abstract class ax7 {
    private static final Object a = new Object();
    private static final Object b = new Object();
    private static boolean c = false;
    private static long d = 0;
    private static String e = "time.android.com";

    public interface b {
        void a();

        void b(IOException iOException);
    }

    private static final class c implements Loader.b {
        private final b a;

        public c(b bVar) {
            this.a = bVar;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public void e(Loader.e eVar, long j, long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public void k(Loader.e eVar, long j, long j2) {
            if (this.a != null) {
                if (ax7.k()) {
                    this.a.a();
                } else {
                    this.a.b(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        public Loader.c o(Loader.e eVar, long j, long j2, IOException iOException, int i) {
            b bVar = this.a;
            if (bVar != null) {
                bVar.b(iOException);
            }
            return Loader.f;
        }
    }

    private static final class d implements Loader.e {
        private d() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void a() {
            synchronized (ax7.a) {
                synchronized (ax7.b) {
                    if (ax7.c) {
                        return;
                    }
                    long l = ax7.l();
                    synchronized (ax7.b) {
                        long unused = ax7.d = l;
                        boolean unused2 = ax7.c = true;
                    }
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void c() {
        }
    }

    private static void g(byte b2, byte b3, int i, long j) {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b3 != 4 && b3 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b3));
        }
        if (i != 0 && i <= 15) {
            if (j == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i);
        }
    }

    public static long h() {
        long j;
        synchronized (b) {
            try {
                j = c ? d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    public static String i() {
        String str;
        synchronized (b) {
            str = e;
        }
        return str;
    }

    public static void j(Loader loader, b bVar) {
        if (k()) {
            if (bVar != null) {
                bVar.a();
            }
        } else {
            if (loader == null) {
                loader = new Loader("SntpClient");
            }
            loader.n(new d(), new c(bVar), 1);
        }
    }

    public static boolean k() {
        boolean z;
        synchronized (b) {
            z = c;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long l() {
        InetAddress byName = InetAddress.getByName(i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(Constants.MAXIMUM_UPLOAD_PARTS);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, ContentType.USER_GENERATED_LIVE);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            o(bArr, 40, currentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            byte b2 = bArr[0];
            int i = bArr[1] & 255;
            long n = n(bArr, 24);
            long n2 = n(bArr, 32);
            long n3 = n(bArr, 40);
            g((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), i, n3);
            long j2 = (j + (((n2 - n) + (n3 - j)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j2;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static long m(byte[] bArr, int i) {
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

    private static long n(byte[] bArr, int i) {
        long m = m(bArr, i);
        long m2 = m(bArr, i + 4);
        if (m == 0 && m2 == 0) {
            return 0L;
        }
        return ((m - 2208988800L) * 1000) + ((m2 * 1000) / 4294967296L);
    }

    private static void o(byte[] bArr, int i, long j) {
        if (j == 0) {
            Arrays.fill(bArr, i, i + 8, (byte) 0);
            return;
        }
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
}
