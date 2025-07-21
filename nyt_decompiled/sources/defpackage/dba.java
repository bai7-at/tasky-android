package defpackage;

import com.google.android.gms.internal.ads.zzaqj;

/* loaded from: classes3.dex */
public final class dba {
    public final Object a;
    public final faa b;
    public final zzaqj c;
    public boolean d;

    private dba(zzaqj zzaqjVar) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = zzaqjVar;
    }

    public static dba a(zzaqj zzaqjVar) {
        return new dba(zzaqjVar);
    }

    public static dba b(Object obj, faa faaVar) {
        return new dba(obj, faaVar);
    }

    public final boolean c() {
        return this.c == null;
    }

    private dba(Object obj, faa faaVar) {
        this.d = false;
        this.a = obj;
        this.b = faaVar;
        this.c = null;
    }
}
