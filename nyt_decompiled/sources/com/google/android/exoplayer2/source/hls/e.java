package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.hls.i;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.source.n;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.h;
import com.google.common.primitives.Ints;
import defpackage.b93;
import defpackage.c93;
import defpackage.fi7;
import defpackage.ku4;
import defpackage.mm0;
import defpackage.ob;
import defpackage.q72;
import defpackage.rm8;
import defpackage.sq8;
import defpackage.sv5;
import defpackage.up8;
import defpackage.ur;
import defpackage.us0;
import defpackage.wp8;
import defpackage.y77;
import defpackage.z19;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e implements n, HlsPlaylistTracker.b {
    private int M;
    private c0 N;
    private final c93 a;
    private final HlsPlaylistTracker b;
    private final b93 c;
    private final sq8 d;
    private final com.google.android.exoplayer2.drm.i e;
    private final h.a f;
    private final com.google.android.exoplayer2.upstream.h g;
    private final p.a h;
    private final ob i;
    private final us0 l;
    private final boolean m;
    private final int n;
    private final boolean r;
    private final sv5 s;
    private final long u;
    private n.a w;
    private int x;
    private wp8 y;
    private final i.b t = new b();
    private final IdentityHashMap j = new IdentityHashMap();
    private final rm8 k = new rm8();
    private i[] B = new i[0];
    private i[] H = new i[0];
    private int[][] L = new int[0][];

    private class b implements i.b {
        private b() {
        }

        @Override // com.google.android.exoplayer2.source.c0.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void g(i iVar) {
            e.this.w.g(e.this);
        }

        @Override // com.google.android.exoplayer2.source.hls.i.b
        public void e() {
            if (e.g(e.this) > 0) {
                return;
            }
            int i = 0;
            for (i iVar : e.this.B) {
                i += iVar.t().a;
            }
            up8[] up8VarArr = new up8[i];
            int i2 = 0;
            for (i iVar2 : e.this.B) {
                int i3 = iVar2.t().a;
                int i4 = 0;
                while (i4 < i3) {
                    up8VarArr[i2] = iVar2.t().c(i4);
                    i4++;
                    i2++;
                }
            }
            e.this.y = new wp8(up8VarArr);
            e.this.w.o(e.this);
        }

        @Override // com.google.android.exoplayer2.source.hls.i.b
        public void k(Uri uri) {
            e.this.b.f(uri);
        }
    }

    public e(c93 c93Var, HlsPlaylistTracker hlsPlaylistTracker, b93 b93Var, sq8 sq8Var, mm0 mm0Var, com.google.android.exoplayer2.drm.i iVar, h.a aVar, com.google.android.exoplayer2.upstream.h hVar, p.a aVar2, ob obVar, us0 us0Var, boolean z, int i, boolean z2, sv5 sv5Var, long j) {
        this.a = c93Var;
        this.b = hlsPlaylistTracker;
        this.c = b93Var;
        this.d = sq8Var;
        this.e = iVar;
        this.f = aVar;
        this.g = hVar;
        this.h = aVar2;
        this.i = obVar;
        this.l = us0Var;
        this.m = z;
        this.n = i;
        this.r = z2;
        this.s = sv5Var;
        this.u = j;
        this.N = us0Var.a(new c0[0]);
    }

    private static t0 A(t0 t0Var) {
        String M = z19.M(t0Var.i, 2);
        return new t0.b().U(t0Var.a).W(t0Var.b).M(t0Var.k).g0(ku4.g(M)).K(M).Z(t0Var.j).I(t0Var.f).b0(t0Var.g).n0(t0Var.t).S(t0Var.u).R(t0Var.w).i0(t0Var.d).e0(t0Var.e).G();
    }

    static /* synthetic */ int g(e eVar) {
        int i = eVar.x - 1;
        eVar.x = i;
        return i;
    }

    private void s(long j, List list, List list2, List list3, Map map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String str = ((d.a) list.get(i)).d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z = true;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (z19.c(str, ((d.a) list.get(i2)).d)) {
                        d.a aVar = (d.a) list.get(i2);
                        arrayList3.add(Integer.valueOf(i2));
                        arrayList.add(aVar.a);
                        arrayList2.add(aVar.b);
                        z &= z19.L(aVar.b.i, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                i x = x(str2, 1, (Uri[]) arrayList.toArray((Uri[]) z19.k(new Uri[0])), (t0[]) arrayList2.toArray(new t0[0]), null, Collections.emptyList(), map, j);
                list3.add(Ints.l(arrayList3));
                list2.add(x);
                if (this.m && z) {
                    x.d0(new up8[]{new up8(str2, (t0[]) arrayList2.toArray(new t0[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private void v(com.google.android.exoplayer2.source.hls.playlist.d dVar, long j, List list, List list2, Map map) {
        boolean z;
        boolean z2;
        int size = dVar.e.size();
        int[] iArr = new int[size];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < dVar.e.size(); i3++) {
            t0 t0Var = ((d.b) dVar.e.get(i3)).b;
            if (t0Var.u > 0 || z19.M(t0Var.i, 2) != null) {
                iArr[i3] = 2;
                i++;
            } else if (z19.M(t0Var.i, 1) != null) {
                iArr[i3] = 1;
                i2++;
            } else {
                iArr[i3] = -1;
            }
        }
        if (i > 0) {
            size = i;
            z = true;
            z2 = false;
        } else if (i2 < size) {
            size -= i2;
            z = false;
            z2 = true;
        } else {
            z = false;
            z2 = false;
        }
        Uri[] uriArr = new Uri[size];
        t0[] t0VarArr = new t0[size];
        int[] iArr2 = new int[size];
        int i4 = 0;
        for (int i5 = 0; i5 < dVar.e.size(); i5++) {
            if ((!z || iArr[i5] == 2) && (!z2 || iArr[i5] != 1)) {
                d.b bVar = (d.b) dVar.e.get(i5);
                uriArr[i4] = bVar.a;
                t0VarArr[i4] = bVar.b;
                iArr2[i4] = i5;
                i4++;
            }
        }
        String str = t0VarArr[0].i;
        int L = z19.L(str, 2);
        int L2 = z19.L(str, 1);
        boolean z3 = (L2 == 1 || (L2 == 0 && dVar.g.isEmpty())) && L <= 1 && L2 + L > 0;
        i x = x("main", (z || L2 <= 0) ? 0 : 1, uriArr, t0VarArr, dVar.j, dVar.k, map, j);
        list.add(x);
        list2.add(iArr2);
        if (this.m && z3) {
            ArrayList arrayList = new ArrayList();
            if (L > 0) {
                t0[] t0VarArr2 = new t0[size];
                for (int i6 = 0; i6 < size; i6++) {
                    t0VarArr2[i6] = A(t0VarArr[i6]);
                }
                arrayList.add(new up8("main", t0VarArr2));
                if (L2 > 0 && (dVar.j != null || dVar.g.isEmpty())) {
                    arrayList.add(new up8("main:audio", y(t0VarArr[0], dVar.j, false)));
                }
                List list3 = dVar.k;
                if (list3 != null) {
                    for (int i7 = 0; i7 < list3.size(); i7++) {
                        arrayList.add(new up8("main:cc:" + i7, (t0) list3.get(i7)));
                    }
                }
            } else {
                t0[] t0VarArr3 = new t0[size];
                for (int i8 = 0; i8 < size; i8++) {
                    t0VarArr3[i8] = y(t0VarArr[i8], dVar.j, true);
                }
                arrayList.add(new up8("main", t0VarArr3));
            }
            up8 up8Var = new up8("main:id3", new t0.b().U("ID3").g0("application/id3").G());
            arrayList.add(up8Var);
            x.d0((up8[]) arrayList.toArray(new up8[0]), 0, arrayList.indexOf(up8Var));
        }
    }

    private void w(long j) {
        com.google.android.exoplayer2.source.hls.playlist.d dVar = (com.google.android.exoplayer2.source.hls.playlist.d) ur.e(this.b.d());
        Map z = this.r ? z(dVar.m) : Collections.emptyMap();
        boolean isEmpty = dVar.e.isEmpty();
        List list = dVar.g;
        List list2 = dVar.h;
        int i = 0;
        this.x = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!isEmpty) {
            v(dVar, j, arrayList, arrayList2, z);
        }
        s(j, list, arrayList, arrayList2, z);
        this.M = arrayList.size();
        int i2 = 0;
        while (i2 < list2.size()) {
            d.a aVar = (d.a) list2.get(i2);
            String str = "subtitle:" + i2 + ":" + aVar.d;
            int i3 = i2;
            i x = x(str, 3, new Uri[]{aVar.a}, new t0[]{aVar.b}, null, Collections.emptyList(), z, j);
            arrayList2.add(new int[]{i3});
            arrayList.add(x);
            x.d0(new up8[]{new up8(str, aVar.b)}, 0, new int[0]);
            i2 = i3 + 1;
            i = 0;
            z = z;
        }
        int i4 = i;
        this.B = (i[]) arrayList.toArray(new i[i4]);
        this.L = (int[][]) arrayList2.toArray(new int[i4][]);
        this.x = this.B.length;
        for (int i5 = i4; i5 < this.M; i5++) {
            this.B[i5].m0(true);
        }
        i[] iVarArr = this.B;
        int length = iVarArr.length;
        for (int i6 = i4; i6 < length; i6++) {
            iVarArr[i6].B();
        }
        this.H = this.B;
    }

    private i x(String str, int i, Uri[] uriArr, t0[] t0VarArr, t0 t0Var, List list, Map map, long j) {
        return new i(str, i, this.t, new com.google.android.exoplayer2.source.hls.b(this.a, this.b, uriArr, t0VarArr, this.c, this.d, this.k, this.u, list, this.s, null), map, this.i, j, t0Var, this.e, this.f, this.g, this.h, this.n);
    }

    private static t0 y(t0 t0Var, t0 t0Var2, boolean z) {
        String M;
        Metadata metadata;
        int i;
        String str;
        int i2;
        int i3;
        String str2;
        if (t0Var2 != null) {
            M = t0Var2.i;
            metadata = t0Var2.j;
            i2 = t0Var2.M;
            i = t0Var2.d;
            i3 = t0Var2.e;
            str = t0Var2.c;
            str2 = t0Var2.b;
        } else {
            M = z19.M(t0Var.i, 1);
            metadata = t0Var.j;
            if (z) {
                i2 = t0Var.M;
                i = t0Var.d;
                i3 = t0Var.e;
                str = t0Var.c;
                str2 = t0Var.b;
            } else {
                i = 0;
                str = null;
                i2 = -1;
                i3 = 0;
                str2 = null;
            }
        }
        return new t0.b().U(t0Var.a).W(str2).M(t0Var.k).g0(ku4.g(M)).K(M).Z(metadata).I(z ? t0Var.f : -1).b0(z ? t0Var.g : -1).J(i2).i0(i).e0(i3).X(str).G();
    }

    private static Map z(List list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < arrayList.size()) {
            DrmInitData drmInitData = (DrmInitData) list.get(i);
            String str = drmInitData.schemeType;
            i++;
            int i2 = i;
            while (i2 < arrayList.size()) {
                DrmInitData drmInitData2 = (DrmInitData) arrayList.get(i2);
                if (TextUtils.equals(drmInitData2.schemeType, str)) {
                    drmInitData = drmInitData.f(drmInitData2);
                    arrayList.remove(i2);
                } else {
                    i2++;
                }
            }
            hashMap.put(str, drmInitData);
        }
        return hashMap;
    }

    public void B() {
        this.b.a(this);
        for (i iVar : this.B) {
            iVar.f0();
        }
        this.w = null;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
    public void a() {
        for (i iVar : this.B) {
            iVar.b0();
        }
        this.w.g(this);
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean b() {
        return this.N.b();
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long c() {
        return this.N.c();
    }

    @Override // com.google.android.exoplayer2.source.n
    public long d(long j, fi7 fi7Var) {
        for (i iVar : this.H) {
            if (iVar.R()) {
                return iVar.d(j, fi7Var);
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
    public boolean e(Uri uri, h.c cVar, boolean z) {
        boolean z2 = true;
        for (i iVar : this.B) {
            z2 &= iVar.a0(uri, cVar, z);
        }
        this.w.g(this);
        return z2;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean f(long j) {
        if (this.y != null) {
            return this.N.f(j);
        }
        for (i iVar : this.B) {
            iVar.B();
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long h() {
        return this.N.h();
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public void i(long j) {
        this.N.i(j);
    }

    @Override // com.google.android.exoplayer2.source.n
    public long j(q72[] q72VarArr, boolean[] zArr, y77[] y77VarArr, boolean[] zArr2, long j) {
        y77[] y77VarArr2 = y77VarArr;
        int[] iArr = new int[q72VarArr.length];
        int[] iArr2 = new int[q72VarArr.length];
        for (int i = 0; i < q72VarArr.length; i++) {
            y77 y77Var = y77VarArr2[i];
            iArr[i] = y77Var == null ? -1 : ((Integer) this.j.get(y77Var)).intValue();
            iArr2[i] = -1;
            q72 q72Var = q72VarArr[i];
            if (q72Var != null) {
                up8 n = q72Var.n();
                int i2 = 0;
                while (true) {
                    i[] iVarArr = this.B;
                    if (i2 >= iVarArr.length) {
                        break;
                    }
                    if (iVarArr[i2].t().d(n) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
        }
        this.j.clear();
        int length = q72VarArr.length;
        y77[] y77VarArr3 = new y77[length];
        y77[] y77VarArr4 = new y77[q72VarArr.length];
        q72[] q72VarArr2 = new q72[q72VarArr.length];
        i[] iVarArr2 = new i[this.B.length];
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i4 < this.B.length) {
            for (int i5 = 0; i5 < q72VarArr.length; i5++) {
                q72 q72Var2 = null;
                y77VarArr4[i5] = iArr[i5] == i4 ? y77VarArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    q72Var2 = q72VarArr[i5];
                }
                q72VarArr2[i5] = q72Var2;
            }
            i iVar = this.B[i4];
            int i6 = i3;
            int i7 = length;
            int i8 = i4;
            q72[] q72VarArr3 = q72VarArr2;
            i[] iVarArr3 = iVarArr2;
            boolean j0 = iVar.j0(q72VarArr2, zArr, y77VarArr4, zArr2, j, z);
            int i9 = 0;
            boolean z2 = false;
            while (true) {
                if (i9 >= q72VarArr.length) {
                    break;
                }
                y77 y77Var2 = y77VarArr4[i9];
                if (iArr2[i9] == i8) {
                    ur.e(y77Var2);
                    y77VarArr3[i9] = y77Var2;
                    this.j.put(y77Var2, Integer.valueOf(i8));
                    z2 = true;
                } else if (iArr[i9] == i8) {
                    ur.g(y77Var2 == null);
                }
                i9++;
            }
            if (z2) {
                iVarArr3[i6] = iVar;
                i3 = i6 + 1;
                if (i6 == 0) {
                    iVar.m0(true);
                    if (!j0) {
                        i[] iVarArr4 = this.H;
                        if (iVarArr4.length != 0 && iVar == iVarArr4[0]) {
                        }
                    }
                    this.k.b();
                    z = true;
                } else {
                    iVar.m0(i8 < this.M);
                }
            } else {
                i3 = i6;
            }
            i4 = i8 + 1;
            y77VarArr2 = y77VarArr;
            iVarArr2 = iVarArr3;
            length = i7;
            q72VarArr2 = q72VarArr3;
        }
        System.arraycopy(y77VarArr3, 0, y77VarArr2, 0, length);
        i[] iVarArr5 = (i[]) z19.I0(iVarArr2, i3);
        this.H = iVarArr5;
        this.N = this.l.a(iVarArr5);
        return j;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long l(long j) {
        i[] iVarArr = this.H;
        if (iVarArr.length > 0) {
            boolean i0 = iVarArr[0].i0(j, false);
            int i = 1;
            while (true) {
                i[] iVarArr2 = this.H;
                if (i >= iVarArr2.length) {
                    break;
                }
                iVarArr2[i].i0(j, i0);
                i++;
            }
            if (i0) {
                this.k.b();
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long m() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void n(n.a aVar, long j) {
        this.w = aVar;
        this.b.g(this);
        w(j);
    }

    @Override // com.google.android.exoplayer2.source.n
    public void r() {
        for (i iVar : this.B) {
            iVar.r();
        }
    }

    @Override // com.google.android.exoplayer2.source.n
    public wp8 t() {
        return (wp8) ur.e(this.y);
    }

    @Override // com.google.android.exoplayer2.source.n
    public void u(long j, boolean z) {
        for (i iVar : this.H) {
            iVar.u(j, z);
        }
    }
}
