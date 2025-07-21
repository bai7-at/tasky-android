package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.h9;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.List;

/* loaded from: classes3.dex */
public final class rra {
    private static final String i = Integer.toString(0, 36);
    private static final String j = Integer.toString(1, 36);
    private static final String k = Integer.toString(2, 36);
    private static final String l = Integer.toString(3, 36);
    private static final String m = Integer.toString(4, 36);
    private static final String n = Integer.toString(5, 36);
    private static final String o = Integer.toString(6, 36);
    private static final String p = Integer.toString(7, 36);
    public static final zhf q = new zhf() { // from class: gpa
    };
    public final Uri a;
    public final String b;
    public final List c;
    public final String d;
    public final zzgaa e;
    public final List f;
    public final Object g;
    public final long h;

    /* synthetic */ rra(Uri uri, String str, qma qmaVar, vaa vaaVar, List list, String str2, zzgaa zzgaaVar, Object obj, long j2, lqa lqaVar) {
        this.a = uri;
        int i2 = qcb.c;
        this.b = null;
        this.c = list;
        this.d = null;
        this.e = zzgaaVar;
        h9 h9Var = new h9();
        if (zzgaaVar.size() > 0) {
            lh4.a(zzgaaVar.get(0));
            throw null;
        }
        this.f = h9Var.j();
        this.g = null;
        this.h = -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rra)) {
            return false;
        }
        rra rraVar = (rra) obj;
        return this.a.equals(rraVar.a) && khe.f(null, null) && khe.f(null, null) && khe.f(null, null) && this.c.equals(rraVar.c) && khe.f(null, null) && this.e.equals(rraVar.e) && khe.f(null, null) && khe.f(-9223372036854775807L, -9223372036854775807L);
    }

    public final int hashCode() {
        return (int) (((((((this.a.hashCode() * 923521) + this.c.hashCode()) * 961) + this.e.hashCode()) * 31) * 31) - Long.MAX_VALUE);
    }
}
