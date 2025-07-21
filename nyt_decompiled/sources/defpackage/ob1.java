package defpackage;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/* loaded from: classes3.dex */
public final class ob1 implements nb1 {
    @Override // defpackage.nb1
    public DatagramSocket a() {
        return new DatagramSocket();
    }

    @Override // defpackage.nb1
    public DatagramPacket b(byte[] bArr) {
        zq3.h(bArr, "buffer");
        return new DatagramPacket(bArr, bArr.length);
    }

    @Override // defpackage.nb1
    public DatagramPacket c(byte[] bArr, InetAddress inetAddress, int i) {
        zq3.h(bArr, "buffer");
        zq3.h(inetAddress, "address");
        return new DatagramPacket(bArr, bArr.length, inetAddress, i);
    }
}
