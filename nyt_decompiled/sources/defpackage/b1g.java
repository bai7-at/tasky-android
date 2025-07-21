package defpackage;

import com.google.android.gms.internal.ads.ea;
import com.google.android.gms.internal.ads.zzvg;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b1g extends dzf {
    private static final cza t;
    private final b0g[] k;
    private final n1c[] l;
    private final ArrayList m;
    private final Map n;
    private final qie o;
    private int p;
    private long[][] q;
    private zzvg r;
    private final fzf s;

    static {
        wba wbaVar = new wba();
        wbaVar.a("MergingMediaSource");
        t = wbaVar.c();
    }

    public b1g(boolean z, boolean z2, b0g... b0gVarArr) {
        fzf fzfVar = new fzf();
        this.k = b0gVarArr;
        this.s = fzfVar;
        this.m = new ArrayList(Arrays.asList(b0gVarArr));
        this.p = -1;
        this.l = new n1c[b0gVarArr.length];
        this.q = new long[0][];
        this.n = new HashMap();
        this.o = ea.a(8).b(2).c();
    }

    @Override // defpackage.dzf
    protected final /* bridge */ /* synthetic */ void A(Object obj, b0g b0gVar, n1c n1cVar) {
        int i;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            i = n1cVar.b();
            this.p = i;
        } else {
            int b = n1cVar.b();
            int i2 = this.p;
            if (b != i2) {
                this.r = new zzvg(0);
                return;
            }
            i = i2;
        }
        if (this.q.length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, i, this.l.length);
        }
        this.m.remove(b0gVar);
        this.l[((Integer) obj).intValue()] = n1cVar;
        if (this.m.isEmpty()) {
            w(this.l[0]);
        }
    }

    @Override // defpackage.dzf
    protected final /* bridge */ /* synthetic */ zzf E(Object obj, zzf zzfVar) {
        if (((Integer) obj).intValue() == 0) {
            return zzfVar;
        }
        return null;
    }

    @Override // defpackage.b0g
    public final cza d() {
        b0g[] b0gVarArr = this.k;
        return b0gVarArr.length > 0 ? b0gVarArr[0].d() : t;
    }

    @Override // defpackage.nyf, defpackage.b0g
    public final void h(cza czaVar) {
        this.k[0].h(czaVar);
    }

    @Override // defpackage.b0g
    public final void j(xzf xzfVar) {
        a1g a1gVar = (a1g) xzfVar;
        int i = 0;
        while (true) {
            b0g[] b0gVarArr = this.k;
            if (i >= b0gVarArr.length) {
                return;
            }
            b0gVarArr[i].j(a1gVar.g(i));
            i++;
        }
    }

    @Override // defpackage.b0g
    public final xzf l(zzf zzfVar, s7g s7gVar, long j) {
        n1c[] n1cVarArr = this.l;
        int length = this.k.length;
        xzf[] xzfVarArr = new xzf[length];
        int a = n1cVarArr[0].a(zzfVar.a);
        for (int i = 0; i < length; i++) {
            xzfVarArr[i] = this.k[i].l(zzfVar.a(this.l[i].f(a)), s7gVar, j - this.q[a][i]);
        }
        return new a1g(this.s, this.q[a], xzfVarArr);
    }

    @Override // defpackage.dzf, defpackage.nyf
    protected final void v(f6f f6fVar) {
        super.v(f6fVar);
        int i = 0;
        while (true) {
            b0g[] b0gVarArr = this.k;
            if (i >= b0gVarArr.length) {
                return;
            }
            B(Integer.valueOf(i), b0gVarArr[i]);
            i++;
        }
    }

    @Override // defpackage.dzf, defpackage.nyf
    protected final void x() {
        super.x();
        Arrays.fill(this.l, (Object) null);
        this.p = -1;
        this.r = null;
        this.m.clear();
        Collections.addAll(this.m, this.k);
    }

    @Override // defpackage.dzf, defpackage.b0g
    public final void z() {
        zzvg zzvgVar = this.r;
        if (zzvgVar != null) {
            throw zzvgVar;
        }
        super.z();
    }
}
