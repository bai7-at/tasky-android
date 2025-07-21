package com.instacart.library.truetime;

import android.os.SystemClock;
import com.comscore.streaming.ContentType;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public class b {
    private static final String d = "b";
    private AtomicLong a = new AtomicLong();
    private AtomicLong b = new AtomicLong();
    private AtomicBoolean c = new AtomicBoolean(false);

    private double b(long j) {
        return j / 65.536d;
    }

    public static long e(long[] jArr) {
        return ((jArr[1] - jArr[0]) + (jArr[2] - jArr[3])) / 2;
    }

    private long f(byte[] bArr, int i) {
        return (j(bArr[i]) << 24) + (j(bArr[i + 1]) << 16) + (j(bArr[i + 2]) << 8) + j(bArr[i + 3]);
    }

    private long g(byte[] bArr, int i) {
        return ((f(bArr, i) - 2208988800L) * 1000) + ((f(bArr, i + 4) * 1000) / 4294967296L);
    }

    private int j(byte b) {
        return b & 255;
    }

    private void l(byte[] bArr, int i, long j) {
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

    private void m(byte[] bArr) {
        bArr[0] = 27;
    }

    void a(long[] jArr) {
        this.b.set(i(jArr));
        this.a.set(jArr[7]);
    }

    long c() {
        return this.a.get();
    }

    long d() {
        return this.b.get();
    }

    synchronized long[] h(String str, float f, float f2, int i, int i2) {
        byte[] bArr;
        DatagramPacket datagramPacket;
        long currentTimeMillis;
        long elapsedRealtime;
        DatagramSocket datagramSocket;
        long[] jArr;
        DatagramSocket datagramSocket2 = null;
        try {
            try {
                bArr = new byte[48];
                datagramPacket = new DatagramPacket(bArr, 48, InetAddress.getByName(str), ContentType.USER_GENERATED_LIVE);
                m(bArr);
                currentTimeMillis = System.currentTimeMillis();
                elapsedRealtime = SystemClock.elapsedRealtime();
                l(bArr, 40, currentTimeMillis);
                datagramSocket = new DatagramSocket();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            datagramSocket.setSoTimeout(i2);
            datagramSocket.send(datagramPacket);
            jArr = new long[8];
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            jArr[7] = elapsedRealtime2;
            long g = g(bArr, 24);
            long g2 = g(bArr, 32);
            long g3 = g(bArr, 40);
            long j = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
            jArr[0] = g;
            jArr[1] = g2;
            jArr[2] = g3;
            jArr[3] = j;
            long f3 = f(bArr, 4);
            jArr[4] = f3;
            double b = b(f3);
            if (b > f) {
                throw new InvalidNtpServerResponseException("Invalid response from NTP server. %s violation. %f [actual] > %f [expected]", "root_delay", (float) b, f);
            }
            long f4 = f(bArr, 8);
            jArr[5] = f4;
            double b2 = b(f4);
            if (b2 > f2) {
                throw new InvalidNtpServerResponseException("Invalid response from NTP server. %s violation. %f [actual] > %f [expected]", "root_dispersion", (float) b2, f2);
            }
            byte b3 = bArr[0];
            byte b4 = (byte) (b3 & 7);
            if (b4 != 4 && b4 != 5) {
                throw new InvalidNtpServerResponseException("untrusted mode value for TrueTime: " + ((int) b4));
            }
            int i3 = bArr[1] & 255;
            jArr[6] = i3;
            if (i3 < 1 || i3 > 15) {
                throw new InvalidNtpServerResponseException("untrusted stratum value for TrueTime: " + i3);
            }
            if (((byte) ((b3 >> 6) & 3)) == 3) {
                throw new InvalidNtpServerResponseException("unsynchronized server responded for TrueTime");
            }
            double abs = Math.abs((j - g) - (g3 - g2));
            if (abs >= i) {
                throw new InvalidNtpServerResponseException("%s too large for comfort %f [actual] >= %f [expected]", "server_response_delay", (float) abs, i);
            }
            long abs2 = Math.abs(g - System.currentTimeMillis());
            if (abs2 >= 10000) {
                throw new InvalidNtpServerResponseException("Request was sent more than 10 seconds back " + abs2);
            }
            this.c.set(true);
            c.b(d, "---- SNTP successful response from " + str);
            a(jArr);
            datagramSocket.close();
        } catch (Exception e2) {
            e = e2;
            datagramSocket2 = datagramSocket;
            c.a(d, "---- SNTP request failed for " + str);
            throw e;
        } catch (Throwable th2) {
            th = th2;
            datagramSocket2 = datagramSocket;
            if (datagramSocket2 != null) {
                datagramSocket2.close();
            }
            throw th;
        }
        return jArr;
    }

    long i(long[] jArr) {
        return jArr[3] + e(jArr);
    }

    boolean k() {
        return this.c.get();
    }
}
