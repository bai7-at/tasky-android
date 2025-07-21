package defpackage;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes3.dex */
public class pbc {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private int e;
    private int f;
    private boolean g;
    private final zzgaa h;
    private final zzgaa i;
    private final int j;
    private final int k;
    private final zzgaa l;
    private final kac m;
    private zzgaa n;
    private int o;
    private final HashMap p;
    private final HashSet q;

    public pbc() {
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.f = Integer.MAX_VALUE;
        this.g = true;
        this.h = zzgaa.t();
        this.i = zzgaa.t();
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.l = zzgaa.t();
        this.m = kac.b;
        this.n = zzgaa.t();
        this.o = 0;
        this.p = new HashMap();
        this.q = new HashSet();
    }

    public final pbc e(Context context) {
        CaptioningManager captioningManager;
        if ((khe.a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.o = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.n = zzgaa.u(locale.toLanguageTag());
            }
        }
        return this;
    }

    public pbc f(int i, int i2, boolean z) {
        this.e = i;
        this.f = i2;
        this.g = true;
        return this;
    }

    protected pbc(ucc uccVar) {
        this.a = Integer.MAX_VALUE;
        this.b = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MAX_VALUE;
        this.e = uccVar.i;
        this.f = uccVar.j;
        this.g = uccVar.k;
        this.h = uccVar.l;
        this.i = uccVar.n;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.l = uccVar.r;
        this.m = uccVar.s;
        this.n = uccVar.t;
        this.o = uccVar.u;
        this.q = new HashSet(uccVar.B);
        this.p = new HashMap(uccVar.A);
    }
}
