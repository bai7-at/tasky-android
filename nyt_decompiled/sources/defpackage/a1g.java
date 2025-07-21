package defpackage;

import com.google.android.gms.internal.ads.ho;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes3.dex */
final class a1g implements xzf, wzf {
    private final xzf[] a;
    private wzf e;
    private z2g f;
    private final fzf i;
    private final ArrayList c = new ArrayList();
    private final HashMap d = new HashMap();
    private r2g h = new ezf(new r2g[0]);
    private final IdentityHashMap b = new IdentityHashMap();
    private xzf[] g = new xzf[0];

    public a1g(fzf fzfVar, long[] jArr, xzf... xzfVarArr) {
        this.i = fzfVar;
        this.a = xzfVarArr;
        for (int i = 0; i < xzfVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.a[i] = new w2g(xzfVarArr[i], j);
            }
        }
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final boolean a(ho hoVar) {
        if (this.c.isEmpty()) {
            return this.h.a(hoVar);
        }
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ((xzf) this.c.get(i)).a(hoVar);
        }
        return false;
    }

    @Override // defpackage.q2g
    public final /* bridge */ /* synthetic */ void b(r2g r2gVar) {
        wzf wzfVar = this.e;
        wzfVar.getClass();
        wzfVar.b(this);
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final void c(long j) {
        this.h.c(j);
    }

    @Override // defpackage.wzf
    public final void d(xzf xzfVar) {
        this.c.remove(xzfVar);
        if (!this.c.isEmpty()) {
            return;
        }
        int i = 0;
        for (xzf xzfVar2 : this.a) {
            i += xzfVar2.zzh().a;
        }
        v3c[] v3cVarArr = new v3c[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            xzf[] xzfVarArr = this.a;
            if (i2 >= xzfVarArr.length) {
                this.f = new z2g(v3cVarArr);
                wzf wzfVar = this.e;
                wzfVar.getClass();
                wzfVar.d(this);
                return;
            }
            z2g zzh = xzfVarArr[i2].zzh();
            int i4 = zzh.a;
            int i5 = 0;
            while (i5 < i4) {
                v3c b = zzh.b(i5);
                v3c c = b.c(i2 + ":" + b.b);
                this.d.put(c, b);
                v3cVarArr[i3] = c;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // defpackage.xzf
    public final long e(o6g[] o6gVarArr, boolean[] zArr, p2g[] p2gVarArr, boolean[] zArr2, long j) {
        int length;
        int length2 = o6gVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = o6gVarArr.length;
            if (i2 >= length) {
                break;
            }
            p2g p2gVar = p2gVarArr[i2];
            Integer num = p2gVar != null ? (Integer) this.b.get(p2gVar) : null;
            iArr[i2] = num == null ? -1 : num.intValue();
            o6g o6gVar = o6gVarArr[i2];
            if (o6gVar != null) {
                String str = o6gVar.zze().b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        this.b.clear();
        p2g[] p2gVarArr2 = new p2g[length];
        p2g[] p2gVarArr3 = new p2g[length];
        o6g[] o6gVarArr2 = new o6g[length];
        ArrayList arrayList = new ArrayList(this.a.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.a.length) {
            for (int i4 = i; i4 < o6gVarArr.length; i4++) {
                p2gVarArr3[i4] = iArr[i4] == i3 ? p2gVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    o6g o6gVar2 = o6gVarArr[i4];
                    o6gVar2.getClass();
                    v3c v3cVar = (v3c) this.d.get(o6gVar2.zze());
                    v3cVar.getClass();
                    o6gVarArr2[i4] = new z0g(o6gVar2, v3cVar);
                } else {
                    o6gVarArr2[i4] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            o6g[] o6gVarArr3 = o6gVarArr2;
            p2g[] p2gVarArr4 = p2gVarArr3;
            long e = this.a[i3].e(o6gVarArr2, zArr, p2gVarArr3, zArr2, j2);
            if (i3 == 0) {
                j2 = e;
            } else if (e != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < o6gVarArr.length; i5++) {
                if (iArr2[i5] == i3) {
                    p2g p2gVar2 = p2gVarArr4[i5];
                    p2gVar2.getClass();
                    p2gVarArr2[i5] = p2gVar2;
                    this.b.put(p2gVar2, Integer.valueOf(i3));
                    z = true;
                } else if (iArr[i5] == i3) {
                    wad.f(p2gVarArr4[i5] == null);
                }
            }
            if (z) {
                arrayList2.add(this.a[i3]);
            }
            i3++;
            arrayList = arrayList2;
            o6gVarArr2 = o6gVarArr3;
            p2gVarArr3 = p2gVarArr4;
            i = 0;
        }
        int i6 = i;
        System.arraycopy(p2gVarArr2, i6, p2gVarArr, i6, length);
        xzf[] xzfVarArr = (xzf[]) arrayList.toArray(new xzf[i6]);
        this.g = xzfVarArr;
        this.h = new ezf(xzfVarArr);
        return j2;
    }

    @Override // defpackage.xzf
    public final long f(long j) {
        long f = this.g[0].f(j);
        int i = 1;
        while (true) {
            xzf[] xzfVarArr = this.g;
            if (i >= xzfVarArr.length) {
                return f;
            }
            if (xzfVarArr[i].f(f) != f) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    public final xzf g(int i) {
        xzf xzfVar = this.a[i];
        return xzfVar instanceof w2g ? ((w2g) xzfVar).g() : xzfVar;
    }

    @Override // defpackage.xzf
    public final void i(long j, boolean z) {
        for (xzf xzfVar : this.g) {
            xzfVar.i(j, false);
        }
    }

    @Override // defpackage.xzf
    public final long j(long j, ggf ggfVar) {
        xzf[] xzfVarArr = this.g;
        return (xzfVarArr.length > 0 ? xzfVarArr[0] : this.a[0]).j(j, ggfVar);
    }

    @Override // defpackage.xzf
    public final void l(wzf wzfVar, long j) {
        this.e = wzfVar;
        Collections.addAll(this.c, this.a);
        int i = 0;
        while (true) {
            xzf[] xzfVarArr = this.a;
            if (i >= xzfVarArr.length) {
                return;
            }
            xzfVarArr[i].l(this, j);
            i++;
        }
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final long zzb() {
        return this.h.zzb();
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final long zzc() {
        return this.h.zzc();
    }

    @Override // defpackage.xzf
    public final long zzd() {
        long j = -9223372036854775807L;
        for (xzf xzfVar : this.g) {
            long zzd = xzfVar.zzd();
            if (zzd != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (xzf xzfVar2 : this.g) {
                        if (xzfVar2 == xzfVar) {
                            break;
                        }
                        if (xzfVar2.f(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzd;
                } else if (zzd != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && xzfVar.f(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // defpackage.xzf
    public final z2g zzh() {
        z2g z2gVar = this.f;
        z2gVar.getClass();
        return z2gVar;
    }

    @Override // defpackage.xzf
    public final void zzk() {
        int i = 0;
        while (true) {
            xzf[] xzfVarArr = this.a;
            if (i >= xzfVarArr.length) {
                return;
            }
            xzfVarArr[i].zzk();
            i++;
        }
    }

    @Override // defpackage.xzf, defpackage.r2g
    public final boolean zzp() {
        return this.h.zzp();
    }
}
