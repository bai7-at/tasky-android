package defpackage;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbpp;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class q1e {
    private zzl a;
    private zzq b;
    private String c;
    private zzfk d;
    private boolean e;
    private ArrayList f;
    private ArrayList g;
    private zzbjb h;
    private zzw i;
    private AdManagerAdViewOptions j;
    private PublisherAdViewOptions k;
    private ucb l;
    private zzbpp n;
    private yhd q;
    private fhb s;
    private int m = 1;
    private final a1e o = new a1e();
    private boolean p = false;
    private boolean r = false;

    public final a1e F() {
        return this.o;
    }

    public final q1e G(s1e s1eVar) {
        this.o.a(s1eVar.o.a);
        this.a = s1eVar.d;
        this.b = s1eVar.e;
        this.s = s1eVar.r;
        this.c = s1eVar.f;
        this.d = s1eVar.a;
        this.f = s1eVar.g;
        this.g = s1eVar.h;
        this.h = s1eVar.i;
        this.i = s1eVar.j;
        H(s1eVar.l);
        d(s1eVar.m);
        this.p = s1eVar.p;
        this.q = s1eVar.c;
        this.r = s1eVar.q;
        return this;
    }

    public final q1e H(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.e = adManagerAdViewOptions.t0();
        }
        return this;
    }

    public final q1e I(zzq zzqVar) {
        this.b = zzqVar;
        return this;
    }

    public final q1e J(String str) {
        this.c = str;
        return this;
    }

    public final q1e K(zzw zzwVar) {
        this.i = zzwVar;
        return this;
    }

    public final q1e L(yhd yhdVar) {
        this.q = yhdVar;
        return this;
    }

    public final q1e M(zzbpp zzbppVar) {
        this.n = zzbppVar;
        this.d = new zzfk(false, true, false);
        return this;
    }

    public final q1e N(boolean z) {
        this.p = z;
        return this;
    }

    public final q1e O(boolean z) {
        this.r = true;
        return this;
    }

    public final q1e P(boolean z) {
        this.e = z;
        return this;
    }

    public final q1e Q(int i) {
        this.m = i;
        return this;
    }

    public final q1e a(zzbjb zzbjbVar) {
        this.h = zzbjbVar;
        return this;
    }

    public final q1e b(ArrayList arrayList) {
        this.f = arrayList;
        return this;
    }

    public final q1e c(ArrayList arrayList) {
        this.g = arrayList;
        return this;
    }

    public final q1e d(PublisherAdViewOptions publisherAdViewOptions) {
        this.k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.e = publisherAdViewOptions.zzc();
            this.l = publisherAdViewOptions.t0();
        }
        return this;
    }

    public final q1e e(zzl zzlVar) {
        this.a = zzlVar;
        return this;
    }

    public final q1e f(zzfk zzfkVar) {
        this.d = zzfkVar;
        return this;
    }

    public final s1e g() {
        Preconditions.checkNotNull(this.c, "ad unit must not be null");
        Preconditions.checkNotNull(this.b, "ad size must not be null");
        Preconditions.checkNotNull(this.a, "ad request must not be null");
        return new s1e(this, null);
    }

    public final String i() {
        return this.c;
    }

    public final boolean o() {
        return this.p;
    }

    public final q1e q(fhb fhbVar) {
        this.s = fhbVar;
        return this;
    }

    public final zzl v() {
        return this.a;
    }

    public final zzq x() {
        return this.b;
    }
}
