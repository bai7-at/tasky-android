package defpackage;

import com.google.android.gms.ads.internal.client.g0;
import com.google.android.gms.ads.internal.client.i0;
import com.google.android.gms.ads.internal.client.n;
import com.google.android.gms.internal.ads.zzcei;
import java.util.Random;

/* loaded from: classes2.dex */
public final class kia {
    private static final kia f = new kia();
    private final tfb a;
    private final n b;
    private final String c;
    private final zzcei d;
    private final Random e;

    protected kia() {
        tfb tfbVar = new tfb();
        n nVar = new n(new i0(), new g0(), new thd(), new rva(), new ocb(), new h7b(), new sva());
        String f2 = tfb.f();
        zzcei zzceiVar = new zzcei(0, 240304000, true, false, false);
        Random random = new Random();
        this.a = tfbVar;
        this.b = nVar;
        this.c = f2;
        this.d = zzceiVar;
        this.e = random;
    }

    public static n a() {
        return f.b;
    }

    public static tfb b() {
        return f.a;
    }

    public static zzcei c() {
        return f.d;
    }

    public static String d() {
        return f.c;
    }

    public static Random e() {
        return f.e;
    }
}
