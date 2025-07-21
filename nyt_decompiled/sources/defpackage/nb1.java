package defpackage;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/* loaded from: classes3.dex */
public interface nb1 {
    DatagramSocket a();

    DatagramPacket b(byte[] bArr);

    DatagramPacket c(byte[] bArr, InetAddress inetAddress, int i);
}
