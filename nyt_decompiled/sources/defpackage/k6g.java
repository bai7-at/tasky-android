package defpackage;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.h9;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class k6g extends u6g implements yff {
    private static final ga k = ga.b(new Comparator() { // from class: u3g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = k6g.m;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    private static final ga l = ga.b(new Comparator() { // from class: x3g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i = k6g.m;
            return 0;
        }
    });
    public static final /* synthetic */ int m = 0;
    private final Object d;
    public final Context e;
    private final boolean f;
    private d5g g;
    private m5g h;
    private waf i;
    private final f3g j;

    public k6g(Context context) {
        f3g f3gVar = new f3g();
        d5g d = d5g.d(context);
        this.d = new Object();
        this.e = context != null ? context.getApplicationContext() : null;
        this.j = f3gVar;
        this.g = d;
        this.i = waf.b;
        boolean z = false;
        if (context != null && khe.j(context)) {
            z = true;
        }
        this.f = z;
        if (!z && context != null && khe.a >= 32) {
            this.h = m5g.a(context);
        }
        if (this.g.u0 && context == null) {
            ezd.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    static /* bridge */ /* synthetic */ int k(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    protected static int l(l6a l6aVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(l6aVar.c)) {
            return 4;
        }
        String p = p(str);
        String p2 = p(l6aVar.c);
        if (p2 == null || p == null) {
            return (z && p2 == null) ? 1 : 0;
        }
        if (p2.startsWith(p) || p.startsWith(p2)) {
            return 3;
        }
        int i = khe.a;
        return p2.split("-", 2)[0].equals(p.split("-", 2)[0]) ? 2 : 0;
    }

    protected static String p(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        if (r1 != 3) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ boolean s(defpackage.k6g r8, defpackage.l6a r9) {
        /*
            java.lang.Object r0 = r8.d
            monitor-enter(r0)
            d5g r1 = r8.g     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.u0     // Catch: java.lang.Throwable -> L8e
            r2 = 1
            if (r1 == 0) goto L90
            boolean r1 = r8.f     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L90
            int r1 = r9.y     // Catch: java.lang.Throwable -> L8e
            r3 = 2
            if (r1 <= r3) goto L90
            java.lang.String r1 = r9.l     // Catch: java.lang.Throwable -> L8e
            r4 = 32
            r5 = 0
            if (r1 != 0) goto L1b
            goto L65
        L1b:
            int r6 = r1.hashCode()     // Catch: java.lang.Throwable -> L8e
            r7 = 3
            switch(r6) {
                case -2123537834: goto L42;
                case 187078296: goto L38;
                case 187078297: goto L2e;
                case 1504578661: goto L24;
                default: goto L23;
            }
        L23:
            goto L4c
        L24:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r2
            goto L4d
        L2e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r7
            goto L4d
        L38:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r5
            goto L4d
        L42:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r3
            goto L4d
        L4c:
            r1 = -1
        L4d:
            if (r1 == 0) goto L56
            if (r1 == r2) goto L56
            if (r1 == r3) goto L56
            if (r1 == r7) goto L56
            goto L65
        L56:
            int r1 = defpackage.khe.a     // Catch: java.lang.Throwable -> L8e
            if (r1 < r4) goto L90
            m5g r1 = r8.h     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L90
            boolean r1 = r1.g()     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L65
            goto L90
        L65:
            int r1 = defpackage.khe.a     // Catch: java.lang.Throwable -> L8e
            if (r1 < r4) goto L8c
            m5g r1 = r8.h     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            boolean r3 = r1.g()     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L8c
            boolean r1 = r1.e()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            m5g r1 = r8.h     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.f()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            m5g r1 = r8.h     // Catch: java.lang.Throwable -> L8e
            waf r8 = r8.i     // Catch: java.lang.Throwable -> L8e
            boolean r8 = r1.d(r8, r9)     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto L8c
            goto L90
        L8c:
            r2 = r5
            goto L90
        L8e:
            r8 = move-exception
            goto L92
        L90:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            return r2
        L92:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k6g.s(k6g, l6a):boolean");
    }

    protected static boolean t(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    private static void u(z2g z2gVar, ucc uccVar, Map map) {
        for (int i = 0; i < z2gVar.a; i++) {
            lh4.a(uccVar.A.get(z2gVar.b(i)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        boolean z;
        m5g m5gVar;
        synchronized (this.d) {
            try {
                z = false;
                if (this.g.u0 && !this.f && khe.a >= 32 && (m5gVar = this.h) != null && m5gVar.g()) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            i();
        }
    }

    private static final Pair w(int i, s6g s6gVar, int[][][] iArr, a6g a6gVar, Comparator comparator) {
        int i2;
        List arrayList;
        int i3;
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < 2; i4++) {
            if (i == s6gVar.c(i4)) {
                z2g d = s6gVar.d(i4);
                for (int i5 = 0; i5 < d.a; i5++) {
                    v3c b = d.b(i5);
                    List a = a6gVar.a(i4, b, iArr[i4][i5]);
                    int i6 = b.a;
                    int i7 = 1;
                    boolean[] zArr = new boolean[1];
                    int i8 = 0;
                    while (i8 <= 0) {
                        int i9 = i8 + 1;
                        c6g c6gVar = (c6g) a.get(i8);
                        int a2 = c6gVar.a();
                        if (zArr[i8] || a2 == 0) {
                            i2 = i7;
                        } else {
                            if (a2 == i7) {
                                arrayList = zzgaa.u(c6gVar);
                            } else {
                                arrayList = new ArrayList();
                                arrayList.add(c6gVar);
                                int i10 = i9;
                                while (i10 <= 0) {
                                    c6g c6gVar2 = (c6g) a.get(i10);
                                    if (c6gVar2.a() == 2 && c6gVar.b(c6gVar2)) {
                                        arrayList.add(c6gVar2);
                                        i3 = 1;
                                        zArr[i10] = true;
                                    } else {
                                        i3 = 1;
                                    }
                                    i10++;
                                    i7 = i3;
                                }
                            }
                            i2 = i7;
                            arrayList2.add(arrayList);
                        }
                        i7 = i2;
                        i8 = i9;
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList2, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr2[i11] = ((c6g) list.get(i11)).c;
        }
        c6g c6gVar3 = (c6g) list.get(0);
        return Pair.create(new m6g(c6gVar3.b, iArr2, 0), Integer.valueOf(c6gVar3.a));
    }

    @Override // defpackage.a7g
    public final yff a() {
        return this;
    }

    @Override // defpackage.a7g
    public final void b() {
        m5g m5gVar;
        synchronized (this.d) {
            try {
                if (khe.a >= 32 && (m5gVar = this.h) != null) {
                    m5gVar.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.b();
    }

    @Override // defpackage.a7g
    public final void c(waf wafVar) {
        boolean equals;
        synchronized (this.d) {
            equals = this.i.equals(wafVar);
            this.i = wafVar;
        }
        if (equals) {
            return;
        }
        v();
    }

    @Override // defpackage.a7g
    public final boolean d() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.u6g
    protected final Pair j(s6g s6gVar, int[][][] iArr, final int[] iArr2, zzf zzfVar, n1c n1cVar) {
        final d5g d5gVar;
        int i;
        final boolean z;
        final String str;
        int[] iArr3;
        int length;
        m5g m5gVar;
        synchronized (this.d) {
            try {
                d5gVar = this.g;
                if (d5gVar.u0 && khe.a >= 32 && (m5gVar = this.h) != null) {
                    Looper myLooper = Looper.myLooper();
                    wad.b(myLooper);
                    m5gVar.b(this, myLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i2 = 2;
        m6g[] m6gVarArr = new m6g[2];
        Pair w = w(2, s6gVar, iArr, new a6g() { // from class: j4g
            /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
            @Override // defpackage.a6g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List a(int r17, defpackage.v3c r18, int[] r19) {
                /*
                    Method dump skipped, instructions count: 187
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.j4g.a(int, v3c, int[]):java.util.List");
            }
        }, new Comparator() { // from class: l4g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                she j = she.j();
                e6g e6gVar = new Comparator() { // from class: e6g
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return i6g.d((i6g) obj3, (i6g) obj4);
                    }
                };
                she b = j.d((i6g) Collections.max(list, e6gVar), (i6g) Collections.max(list2, e6gVar), e6gVar).b(list.size(), list2.size());
                g6g g6gVar = new Comparator() { // from class: g6g
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return i6g.c((i6g) obj3, (i6g) obj4);
                    }
                };
                return b.d((i6g) Collections.max(list, g6gVar), (i6g) Collections.max(list2, g6gVar), g6gVar).a();
            }
        });
        int i3 = 4;
        Pair w2 = w == null ? w(4, s6gVar, iArr, new a6g() { // from class: z3g
            @Override // defpackage.a6g
            public final List a(int i4, v3c v3cVar, int[] iArr4) {
                int i5 = k6g.m;
                h9 h9Var = new h9();
                int i6 = 0;
                while (true) {
                    int i7 = v3cVar.a;
                    if (i6 > 0) {
                        return h9Var.j();
                    }
                    h9Var.g(new r4g(i4, v3cVar, i6, d5g.this, iArr4[i6]));
                    i6++;
                }
            }
        }, new Comparator() { // from class: b4g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((r4g) ((List) obj).get(0)).c((r4g) ((List) obj2).get(0));
            }
        }) : null;
        if (w2 != null) {
            m6gVarArr[((Integer) w2.second).intValue()] = (m6g) w2.first;
        } else if (w != null) {
            m6gVarArr[((Integer) w.second).intValue()] = (m6g) w.first;
        }
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= 2) {
                z = false;
                break;
            }
            if (s6gVar.c(i4) == 2 && s6gVar.d(i4).a > 0) {
                z = true;
                break;
            }
            i4++;
        }
        Pair w3 = w(1, s6gVar, iArr, new a6g() { // from class: f4g
            @Override // defpackage.a6g
            public final List a(int i5, v3c v3cVar, int[] iArr4) {
                final k6g k6gVar = k6g.this;
                uge ugeVar = new uge() { // from class: d4g
                    @Override // defpackage.uge
                    public final boolean zza(Object obj) {
                        return k6g.s(k6g.this, (l6a) obj);
                    }
                };
                int i6 = iArr2[i5];
                h9 h9Var = new h9();
                int i7 = 0;
                while (true) {
                    int i8 = v3cVar.a;
                    if (i7 > 0) {
                        return h9Var.j();
                    }
                    h9Var.g(new p4g(i5, v3cVar, i7, d5gVar, iArr4[i7], z, ugeVar, i6));
                    i7++;
                }
            }
        }, new Comparator() { // from class: h4g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((p4g) Collections.max((List) obj)).c((p4g) Collections.max((List) obj2));
            }
        });
        if (w3 != null) {
            m6gVarArr[((Integer) w3.second).intValue()] = (m6g) w3.first;
        }
        if (w3 == null) {
            str = null;
        } else {
            Object obj = w3.first;
            str = ((m6g) obj).a.b(((m6g) obj).b[0]).c;
        }
        int i5 = 3;
        Pair w4 = w(3, s6gVar, iArr, new a6g() { // from class: n4g
            @Override // defpackage.a6g
            public final List a(int i6, v3c v3cVar, int[] iArr4) {
                int i7 = k6g.m;
                h9 h9Var = new h9();
                int i8 = 0;
                while (true) {
                    int i9 = v3cVar.a;
                    if (i8 > 0) {
                        return h9Var.j();
                    }
                    int i10 = i8;
                    h9Var.g(new y5g(i6, v3cVar, i10, d5g.this, iArr4[i8], str));
                    i8++;
                }
            }
        }, new Comparator() { // from class: v3g
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((y5g) ((List) obj2).get(0)).c((y5g) ((List) obj3).get(0));
            }
        });
        if (w4 != null) {
            m6gVarArr[((Integer) w4.second).intValue()] = (m6g) w4.first;
        }
        int i6 = 0;
        while (i6 < i2) {
            int c = s6gVar.c(i6);
            if (c != i2 && c != i && c != i5 && c != i3) {
                z2g d = s6gVar.d(i6);
                int[][] iArr4 = iArr[i6];
                int i7 = 0;
                v3c v3cVar = null;
                t4g t4gVar = null;
                while (i7 < d.a) {
                    v3c b = d.b(i7);
                    int[] iArr5 = iArr4[i7];
                    t4g t4gVar2 = t4gVar;
                    char c2 = 0;
                    while (true) {
                        int i8 = b.a;
                        if (c2 <= 0) {
                            if (t(iArr5[0], d5gVar.v0)) {
                                t4g t4gVar3 = new t4g(b.b(0), iArr5[0]);
                                if (t4gVar2 == null || t4gVar3.compareTo(t4gVar2) > 0) {
                                    v3cVar = b;
                                    t4gVar2 = t4gVar3;
                                }
                            }
                            c2 = 1;
                        }
                    }
                    i7++;
                    t4gVar = t4gVar2;
                }
                m6gVarArr[i6] = v3cVar == null ? null : new m6g(v3cVar, new int[]{0}, 0);
            }
            i6++;
            i2 = 2;
            i3 = 4;
            i = 1;
            i5 = 3;
        }
        HashMap hashMap = new HashMap();
        int i9 = 2;
        for (int i10 = 0; i10 < 2; i10++) {
            u(s6gVar.d(i10), d5gVar, hashMap);
        }
        u(s6gVar.e(), d5gVar, hashMap);
        for (int i11 = 0; i11 < 2; i11++) {
            lh4.a(hashMap.get(Integer.valueOf(s6gVar.c(i11))));
        }
        int i12 = 0;
        while (i12 < i9) {
            z2g d2 = s6gVar.d(i12);
            if (d5gVar.g(i12, d2)) {
                d5gVar.e(i12, d2);
                m6gVarArr[i12] = null;
            }
            i12++;
            i9 = 2;
        }
        int i13 = 0;
        for (int i14 = i9; i13 < i14; i14 = 2) {
            int c3 = s6gVar.c(i13);
            if (d5gVar.f(i13) || d5gVar.B.contains(Integer.valueOf(c3))) {
                m6gVarArr[i13] = null;
            }
            i13++;
        }
        f3g f3gVar = this.j;
        q7g g = g();
        zzgaa a = g3g.a(m6gVarArr);
        int i15 = 2;
        o6g[] o6gVarArr = new o6g[2];
        int i16 = 0;
        while (i16 < i15) {
            m6g m6gVar = m6gVarArr[i16];
            if (m6gVar != null && (length = (iArr3 = m6gVar.b).length) != 0) {
                o6gVarArr[i16] = length == 1 ? new q6g(m6gVar.a, iArr3[0], 0, 0, null) : f3gVar.a(m6gVar.a, iArr3, 0, g, (zzgaa) a.get(i16));
            }
            i16++;
            i15 = 2;
        }
        bgf[] bgfVarArr = new bgf[i15];
        for (int i17 = 0; i17 < i15; i17++) {
            bgfVarArr[i17] = (d5gVar.f(i17) || d5gVar.B.contains(Integer.valueOf(s6gVar.c(i17))) || (s6gVar.c(i17) != -2 && o6gVarArr[i17] == null)) ? null : bgf.b;
        }
        return Pair.create(bgfVarArr, o6gVarArr);
    }

    public final d5g m() {
        d5g d5gVar;
        synchronized (this.d) {
            d5gVar = this.g;
        }
        return d5gVar;
    }

    public final void r(z4g z4gVar) {
        boolean equals;
        d5g d5gVar = new d5g(z4gVar);
        synchronized (this.d) {
            equals = this.g.equals(d5gVar);
            this.g = d5gVar;
        }
        if (equals) {
            return;
        }
        if (d5gVar.u0 && this.e == null) {
            ezd.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        i();
    }
}
