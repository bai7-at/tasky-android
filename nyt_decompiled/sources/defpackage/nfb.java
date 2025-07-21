package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class nfb implements vja {
    private final hie b;
    final lfb d;
    private final Object a = new Object();
    final HashSet e = new HashSet();
    final HashSet f = new HashSet();
    private boolean g = false;
    private final mfb c = new mfb();

    public nfb(String str, hie hieVar) {
        this.d = new lfb(str, hieVar);
        this.b = hieVar;
    }

    @Override // defpackage.vja
    public final void a(boolean z) {
        long currentTimeMillis = dyf.b().currentTimeMillis();
        if (!z) {
            this.b.d(currentTimeMillis);
            this.b.k(this.d.d);
            return;
        }
        if (currentTimeMillis - this.b.zzd() > ((Long) pla.c().a(mpa.T0)).longValue()) {
            this.d.d = -1;
        } else {
            this.d.d = this.b.zzc();
        }
        this.g = true;
    }

    public final int b() {
        int a;
        synchronized (this.a) {
            a = this.d.a();
        }
        return a;
    }

    public final dfb c(Clock clock, String str) {
        return new dfb(clock, this, this.c.a(), str);
    }

    public final String d() {
        return this.c.b();
    }

    public final void e(dfb dfbVar) {
        synchronized (this.a) {
            this.e.add(dfbVar);
        }
    }

    public final void f() {
        synchronized (this.a) {
            this.d.c();
        }
    }

    public final void g() {
        synchronized (this.a) {
            this.d.d();
        }
    }

    public final void h() {
        synchronized (this.a) {
            this.d.e();
        }
    }

    public final void i() {
        synchronized (this.a) {
            this.d.f();
        }
    }

    public final void j(zzl zzlVar, long j) {
        synchronized (this.a) {
            this.d.g(zzlVar, j);
        }
    }

    public final void k() {
        synchronized (this.a) {
            this.d.h();
        }
    }

    public final void l(HashSet hashSet) {
        synchronized (this.a) {
            this.e.addAll(hashSet);
        }
    }

    public final boolean m() {
        return this.g;
    }

    public final Bundle n(Context context, c3e c3eVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.a) {
            hashSet.addAll(this.e);
            this.e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.d.b(context, this.c.b()));
        Bundle bundle2 = new Bundle();
        Iterator it2 = this.f.iterator();
        if (it2.hasNext()) {
            lh4.a(it2.next());
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            arrayList.add(((dfb) it3.next()).a());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        c3eVar.b(hashSet);
        return bundle;
    }
}
