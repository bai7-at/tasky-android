package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.drm.i;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import com.google.android.exoplayer2.source.n;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.upstream.h;
import com.google.common.collect.Maps;
import com.google.common.primitives.Ints;
import defpackage.cy6;
import defpackage.d52;
import defpackage.dr5;
import defpackage.f8;
import defpackage.fi7;
import defpackage.k60;
import defpackage.mm0;
import defpackage.ob;
import defpackage.p02;
import defpackage.q72;
import defpackage.sq8;
import defpackage.sv5;
import defpackage.t81;
import defpackage.tk0;
import defpackage.up8;
import defpackage.us0;
import defpackage.wp8;
import defpackage.x64;
import defpackage.xm1;
import defpackage.y77;
import defpackage.z19;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class b implements n, c0.a, tk0.b {
    private static final Pattern M = Pattern.compile("CC([1-4])=(.+)");
    private static final Pattern N = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    private t81 B;
    private int H;
    private List L;
    final int a;
    private final a.InterfaceC0184a b;
    private final sq8 c;
    private final i d;
    private final h e;
    private final k60 f;
    private final long g;
    private final x64 h;
    private final ob i;
    private final wp8 j;
    private final a[] k;
    private final us0 l;
    private final e m;
    private final p.a r;
    private final h.a s;
    private final sv5 t;
    private n.a u;
    private c0 y;
    private tk0[] w = F(0);
    private d[] x = new d[0];
    private final IdentityHashMap n = new IdentityHashMap();

    private static final class a {
        public final int[] a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;

        private a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
            this.b = i;
            this.a = iArr;
            this.c = i2;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.d = i6;
        }

        public static a a(int[] iArr, int i) {
            return new a(3, 1, iArr, i, -1, -1, -1);
        }

        public static a b(int[] iArr, int i) {
            return new a(5, 1, iArr, i, -1, -1, -1);
        }

        public static a c(int i) {
            return new a(5, 2, new int[0], -1, -1, -1, i);
        }

        public static a d(int i, int[] iArr, int i2, int i3, int i4) {
            return new a(i, 0, iArr, i2, i3, i4, -1);
        }
    }

    public b(int i, t81 t81Var, k60 k60Var, int i2, a.InterfaceC0184a interfaceC0184a, sq8 sq8Var, mm0 mm0Var, i iVar, h.a aVar, com.google.android.exoplayer2.upstream.h hVar, p.a aVar2, long j, x64 x64Var, ob obVar, us0 us0Var, e.b bVar, sv5 sv5Var) {
        this.a = i;
        this.B = t81Var;
        this.f = k60Var;
        this.H = i2;
        this.b = interfaceC0184a;
        this.c = sq8Var;
        this.d = iVar;
        this.s = aVar;
        this.e = hVar;
        this.r = aVar2;
        this.g = j;
        this.h = x64Var;
        this.i = obVar;
        this.l = us0Var;
        this.t = sv5Var;
        this.m = new e(t81Var, bVar, obVar);
        this.y = us0Var.a(this.w);
        dr5 d = t81Var.d(i2);
        List list = d.d;
        this.L = list;
        Pair v = v(iVar, d.c, list);
        this.j = (wp8) v.first;
        this.k = (a[]) v.second;
    }

    private static int[][] A(List list) {
        xm1 w;
        Integer num;
        int size = list.size();
        HashMap f = Maps.f(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i = 0; i < size; i++) {
            f.put(Long.valueOf(((f8) list.get(i)).a), Integer.valueOf(i));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i));
            arrayList.add(arrayList2);
            sparseArray.put(i, arrayList2);
        }
        for (int i2 = 0; i2 < size; i2++) {
            f8 f8Var = (f8) list.get(i2);
            xm1 y = y(f8Var.e);
            if (y == null) {
                y = y(f8Var.f);
            }
            int intValue = (y == null || (num = (Integer) f.get(Long.valueOf(Long.parseLong(y.b)))) == null) ? i2 : num.intValue();
            if (intValue == i2 && (w = w(f8Var.f)) != null) {
                for (String str : z19.V0(w.b, ",")) {
                    Integer num2 = (Integer) f.get(Long.valueOf(Long.parseLong(str)));
                    if (num2 != null) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i2) {
                List list2 = (List) sparseArray.get(i2);
                List list3 = (List) sparseArray.get(intValue);
                list3.addAll(list2);
                sparseArray.put(i2, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i3 = 0; i3 < size2; i3++) {
            int[] l = Ints.l((Collection) arrayList.get(i3));
            iArr[i3] = l;
            Arrays.sort(l);
        }
        return iArr;
    }

    private int B(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.k[i2].e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.k[i5].c == 0) {
                return i4;
            }
        }
        return -1;
    }

    private int[] C(q72[] q72VarArr) {
        int[] iArr = new int[q72VarArr.length];
        for (int i = 0; i < q72VarArr.length; i++) {
            q72 q72Var = q72VarArr[i];
            if (q72Var != null) {
                iArr[i] = this.j.d(q72Var.n());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }

    private static boolean D(List list, int[] iArr) {
        for (int i : iArr) {
            List list2 = ((f8) list.get(i)).c;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!((cy6) list2.get(i2)).e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int E(int i, List list, int[][] iArr, boolean[] zArr, t0[][] t0VarArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (D(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            t0[] z = z(list, iArr[i3]);
            t0VarArr[i3] = z;
            if (z.length != 0) {
                i2++;
            }
        }
        return i2;
    }

    private static tk0[] F(int i) {
        return new tk0[i];
    }

    private static t0[] H(xm1 xm1Var, Pattern pattern, t0 t0Var) {
        String str = xm1Var.b;
        if (str == null) {
            return new t0[]{t0Var};
        }
        String[] V0 = z19.V0(str, ";");
        t0[] t0VarArr = new t0[V0.length];
        for (int i = 0; i < V0.length; i++) {
            Matcher matcher = pattern.matcher(V0[i]);
            if (!matcher.matches()) {
                return new t0[]{t0Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            t0VarArr[i] = t0Var.c().U(t0Var.a + ":" + parseInt).H(parseInt).X(matcher.group(2)).G();
        }
        return t0VarArr;
    }

    private void J(q72[] q72VarArr, boolean[] zArr, y77[] y77VarArr) {
        for (int i = 0; i < q72VarArr.length; i++) {
            if (q72VarArr[i] == null || !zArr[i]) {
                y77 y77Var = y77VarArr[i];
                if (y77Var instanceof tk0) {
                    ((tk0) y77Var).Q(this);
                } else if (y77Var instanceof tk0.a) {
                    ((tk0.a) y77Var).c();
                }
                y77VarArr[i] = null;
            }
        }
    }

    private void K(q72[] q72VarArr, y77[] y77VarArr, int[] iArr) {
        boolean z;
        for (int i = 0; i < q72VarArr.length; i++) {
            y77 y77Var = y77VarArr[i];
            if ((y77Var instanceof p02) || (y77Var instanceof tk0.a)) {
                int B = B(i, iArr);
                if (B == -1) {
                    z = y77VarArr[i] instanceof p02;
                } else {
                    y77 y77Var2 = y77VarArr[i];
                    z = (y77Var2 instanceof tk0.a) && ((tk0.a) y77Var2).a == y77VarArr[B];
                }
                if (!z) {
                    y77 y77Var3 = y77VarArr[i];
                    if (y77Var3 instanceof tk0.a) {
                        ((tk0.a) y77Var3).c();
                    }
                    y77VarArr[i] = null;
                }
            }
        }
    }

    private void L(q72[] q72VarArr, y77[] y77VarArr, boolean[] zArr, long j, int[] iArr) {
        for (int i = 0; i < q72VarArr.length; i++) {
            q72 q72Var = q72VarArr[i];
            if (q72Var != null) {
                y77 y77Var = y77VarArr[i];
                if (y77Var == null) {
                    zArr[i] = true;
                    a aVar = this.k[iArr[i]];
                    int i2 = aVar.c;
                    if (i2 == 0) {
                        y77VarArr[i] = s(aVar, q72Var, j);
                    } else if (i2 == 2) {
                        y77VarArr[i] = new d((d52) this.L.get(aVar.d), q72Var.n().d(0), this.B.d);
                    }
                } else if (y77Var instanceof tk0) {
                    ((com.google.android.exoplayer2.source.dash.a) ((tk0) y77Var).E()).b(q72Var);
                }
            }
        }
        for (int i3 = 0; i3 < q72VarArr.length; i3++) {
            if (y77VarArr[i3] == null && q72VarArr[i3] != null) {
                a aVar2 = this.k[iArr[i3]];
                if (aVar2.c == 1) {
                    int B = B(i3, iArr);
                    if (B == -1) {
                        y77VarArr[i3] = new p02();
                    } else {
                        y77VarArr[i3] = ((tk0) y77VarArr[B]).T(j, aVar2.b);
                    }
                }
            }
        }
    }

    private static void p(List list, up8[] up8VarArr, a[] aVarArr, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            d52 d52Var = (d52) list.get(i2);
            up8VarArr[i] = new up8(d52Var.a() + ":" + i2, new t0.b().U(d52Var.a()).g0("application/x-emsg").G());
            aVarArr[i] = a.c(i2);
            i2++;
            i++;
        }
    }

    private static int q(i iVar, List list, int[][] iArr, int i, boolean[] zArr, t0[][] t0VarArr, up8[] up8VarArr, a[] aVarArr) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int[] iArr2 = iArr[i4];
            ArrayList arrayList = new ArrayList();
            for (int i6 : iArr2) {
                arrayList.addAll(((f8) list.get(i6)).c);
            }
            int size = arrayList.size();
            t0[] t0VarArr2 = new t0[size];
            for (int i7 = 0; i7 < size; i7++) {
                t0 t0Var = ((cy6) arrayList.get(i7)).b;
                t0VarArr2[i7] = t0Var.d(iVar.a(t0Var));
            }
            f8 f8Var = (f8) list.get(iArr2[0]);
            long j = f8Var.a;
            String l = j != -1 ? Long.toString(j) : "unset:" + i4;
            int i8 = i5 + 1;
            if (zArr[i4]) {
                i2 = i5 + 2;
            } else {
                i2 = i8;
                i8 = -1;
            }
            if (t0VarArr[i4].length != 0) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
                i2 = -1;
            }
            up8VarArr[i5] = new up8(l, t0VarArr2);
            aVarArr[i5] = a.d(f8Var.b, iArr2, i5, i8, i2);
            if (i8 != -1) {
                String str = l + ":emsg";
                up8VarArr[i8] = new up8(str, new t0.b().U(str).g0("application/x-emsg").G());
                aVarArr[i8] = a.b(iArr2, i5);
            }
            if (i2 != -1) {
                up8VarArr[i2] = new up8(l + ":cc", t0VarArr[i4]);
                aVarArr[i2] = a.a(iArr2, i5);
            }
            i4++;
            i5 = i3;
        }
        return i5;
    }

    private tk0 s(a aVar, q72 q72Var, long j) {
        int i;
        up8 up8Var;
        up8 up8Var2;
        int i2;
        int i3 = aVar.f;
        boolean z = i3 != -1;
        e.c cVar = null;
        if (z) {
            up8Var = this.j.c(i3);
            i = 1;
        } else {
            i = 0;
            up8Var = null;
        }
        int i4 = aVar.g;
        boolean z2 = i4 != -1;
        if (z2) {
            up8Var2 = this.j.c(i4);
            i += up8Var2.a;
        } else {
            up8Var2 = null;
        }
        t0[] t0VarArr = new t0[i];
        int[] iArr = new int[i];
        if (z) {
            t0VarArr[0] = up8Var.d(0);
            iArr[0] = 5;
            i2 = 1;
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            for (int i5 = 0; i5 < up8Var2.a; i5++) {
                t0 d = up8Var2.d(i5);
                t0VarArr[i2] = d;
                iArr[i2] = 3;
                arrayList.add(d);
                i2++;
            }
        }
        if (this.B.d && z) {
            cVar = this.m.k();
        }
        e.c cVar2 = cVar;
        tk0 tk0Var = new tk0(aVar.b, iArr, t0VarArr, this.b.a(this.h, this.B, this.f, this.H, aVar.a, q72Var, aVar.b, this.g, z, arrayList, cVar2, this.c, this.t, null), this, this.i, j, this.d, this.s, this.e, this.r);
        synchronized (this) {
            this.n.put(tk0Var, cVar2);
        }
        return tk0Var;
    }

    private static Pair v(i iVar, List list, List list2) {
        int[][] A = A(list);
        int length = A.length;
        boolean[] zArr = new boolean[length];
        t0[][] t0VarArr = new t0[length][];
        int E = E(length, list, A, zArr, t0VarArr) + length + list2.size();
        up8[] up8VarArr = new up8[E];
        a[] aVarArr = new a[E];
        p(list2, up8VarArr, aVarArr, q(iVar, list, A, length, zArr, t0VarArr, up8VarArr, aVarArr));
        return Pair.create(new wp8(up8VarArr), aVarArr);
    }

    private static xm1 w(List list) {
        return x(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static xm1 x(List list, String str) {
        for (int i = 0; i < list.size(); i++) {
            xm1 xm1Var = (xm1) list.get(i);
            if (str.equals(xm1Var.a)) {
                return xm1Var;
            }
        }
        return null;
    }

    private static xm1 y(List list) {
        return x(list, "http://dashif.org/guidelines/trickmode");
    }

    private static t0[] z(List list, int[] iArr) {
        for (int i : iArr) {
            f8 f8Var = (f8) list.get(i);
            List list2 = ((f8) list.get(i)).d;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                xm1 xm1Var = (xm1) list2.get(i2);
                if ("urn:scte:dash:cc:cea-608:2015".equals(xm1Var.a)) {
                    return H(xm1Var, M, new t0.b().g0("application/cea-608").U(f8Var.a + ":cea608").G());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(xm1Var.a)) {
                    return H(xm1Var, N, new t0.b().g0("application/cea-708").U(f8Var.a + ":cea708").G());
                }
            }
        }
        return new t0[0];
    }

    @Override // com.google.android.exoplayer2.source.c0.a
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void g(tk0 tk0Var) {
        this.u.g(this);
    }

    public void I() {
        this.m.o();
        for (tk0 tk0Var : this.w) {
            tk0Var.Q(this);
        }
        this.u = null;
    }

    public void M(t81 t81Var, int i) {
        this.B = t81Var;
        this.H = i;
        this.m.q(t81Var);
        tk0[] tk0VarArr = this.w;
        if (tk0VarArr != null) {
            for (tk0 tk0Var : tk0VarArr) {
                ((com.google.android.exoplayer2.source.dash.a) tk0Var.E()).g(t81Var, i);
            }
            this.u.g(this);
        }
        this.L = t81Var.d(i).d;
        for (d dVar : this.x) {
            Iterator it2 = this.L.iterator();
            while (true) {
                if (it2.hasNext()) {
                    d52 d52Var = (d52) it2.next();
                    if (d52Var.a().equals(dVar.b())) {
                        dVar.d(d52Var, t81Var.d && i == t81Var.e() - 1);
                    }
                }
            }
        }
    }

    @Override // tk0.b
    public synchronized void a(tk0 tk0Var) {
        e.c cVar = (e.c) this.n.remove(tk0Var);
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean b() {
        return this.y.b();
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long c() {
        return this.y.c();
    }

    @Override // com.google.android.exoplayer2.source.n
    public long d(long j, fi7 fi7Var) {
        for (tk0 tk0Var : this.w) {
            if (tk0Var.a == 2) {
                return tk0Var.d(j, fi7Var);
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public boolean f(long j) {
        return this.y.f(j);
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public long h() {
        return this.y.h();
    }

    @Override // com.google.android.exoplayer2.source.n, com.google.android.exoplayer2.source.c0
    public void i(long j) {
        this.y.i(j);
    }

    @Override // com.google.android.exoplayer2.source.n
    public long j(q72[] q72VarArr, boolean[] zArr, y77[] y77VarArr, boolean[] zArr2, long j) {
        int[] C = C(q72VarArr);
        J(q72VarArr, zArr, y77VarArr);
        K(q72VarArr, y77VarArr, C);
        L(q72VarArr, y77VarArr, zArr2, j, C);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (y77 y77Var : y77VarArr) {
            if (y77Var instanceof tk0) {
                arrayList.add((tk0) y77Var);
            } else if (y77Var instanceof d) {
                arrayList2.add((d) y77Var);
            }
        }
        tk0[] F = F(arrayList.size());
        this.w = F;
        arrayList.toArray(F);
        d[] dVarArr = new d[arrayList2.size()];
        this.x = dVarArr;
        arrayList2.toArray(dVarArr);
        this.y = this.l.a(this.w);
        return j;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long l(long j) {
        for (tk0 tk0Var : this.w) {
            tk0Var.S(j);
        }
        for (d dVar : this.x) {
            dVar.c(j);
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.n
    public long m() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void n(n.a aVar, long j) {
        this.u = aVar;
        aVar.o(this);
    }

    @Override // com.google.android.exoplayer2.source.n
    public void r() {
        this.h.a();
    }

    @Override // com.google.android.exoplayer2.source.n
    public wp8 t() {
        return this.j;
    }

    @Override // com.google.android.exoplayer2.source.n
    public void u(long j, boolean z) {
        for (tk0 tk0Var : this.w) {
            tk0Var.u(j, z);
        }
    }
}
