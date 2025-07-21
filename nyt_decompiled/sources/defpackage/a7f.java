package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzhz;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public final class a7f extends qve {
    private final byte[] e;
    private final DatagramPacket f;
    private Uri g;
    private DatagramSocket h;
    private MulticastSocket i;
    private InetAddress j;
    private boolean k;
    private int l;

    public a7f(int i) {
        super(true);
        byte[] bArr = new byte[2000];
        this.e = bArr;
        this.f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // defpackage.xyf
    public final int b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.l == 0) {
            try {
                DatagramSocket datagramSocket = this.h;
                if (datagramSocket == null) {
                    throw null;
                }
                datagramSocket.receive(this.f);
                int length = this.f.getLength();
                this.l = length;
                zzg(length);
            } catch (SocketTimeoutException e) {
                throw new zzhz(e, 2002);
            } catch (IOException e2) {
                throw new zzhz(e2, 2001);
            }
        }
        int length2 = this.f.getLength();
        int i3 = this.l;
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, length2 - i3, bArr, i, min);
        this.l -= min;
        return min;
    }

    @Override // defpackage.kye
    public final long e(u1f u1fVar) {
        Uri uri = u1fVar.a;
        this.g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.g.getPort();
        l(u1fVar);
        try {
            this.j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.j, port);
            if (this.j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.i = multicastSocket;
                multicastSocket.joinGroup(this.j);
                this.h = this.i;
            } else {
                this.h = new DatagramSocket(inetSocketAddress);
            }
            this.h.setSoTimeout(8000);
            this.k = true;
            m(u1fVar);
            return -1L;
        } catch (IOException e) {
            throw new zzhz(e, 2001);
        } catch (SecurityException e2) {
            throw new zzhz(e2, 2006);
        }
    }

    @Override // defpackage.kye
    public final Uri zzc() {
        return this.g;
    }

    @Override // defpackage.kye
    public final void zzd() {
        InetAddress inetAddress;
        this.g = null;
        MulticastSocket multicastSocket = this.i;
        if (multicastSocket != null) {
            try {
                inetAddress = this.j;
            } catch (IOException unused) {
            }
            if (inetAddress == null) {
                throw null;
            }
            multicastSocket.leaveGroup(inetAddress);
            this.i = null;
        }
        DatagramSocket datagramSocket = this.h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.h = null;
        }
        this.j = null;
        this.l = 0;
        if (this.k) {
            this.k = false;
            k();
        }
    }
}
