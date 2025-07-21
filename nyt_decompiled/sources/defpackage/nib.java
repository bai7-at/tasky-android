package defpackage;

import android.net.Uri;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public abstract class nib {
    private static final AtomicInteger a = new AtomicInteger(0);
    private static final AtomicInteger b = new AtomicInteger(0);

    public static int O() {
        return a.get();
    }

    public static int Q() {
        return b.get();
    }

    protected static AtomicInteger u() {
        return a;
    }

    protected static AtomicInteger v() {
        return b;
    }

    public abstract void A(int i);

    public abstract void B(int i);

    public abstract void C(mib mibVar);

    public abstract void D(int i);

    public abstract void E(int i);

    public abstract void F(boolean z);

    public abstract void G(Integer num);

    public abstract void H(boolean z);

    public abstract void I(int i);

    public abstract void J(Surface surface, boolean z);

    public abstract void K(float f, boolean z);

    public abstract void L();

    public abstract boolean M();

    public abstract int N();

    public abstract int P();

    public abstract long R();

    public abstract long S();

    public abstract long T();

    public abstract long U();

    public abstract long V();

    public abstract long r();

    public abstract long s();

    public abstract Integer t();

    public abstract void w(Uri[] uriArr, String str);

    public abstract void x(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z);

    public abstract void y();

    public abstract void z(long j);
}
