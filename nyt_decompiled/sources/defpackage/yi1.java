package defpackage;

import android.util.Base64;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.o;
import defpackage.ad;
import defpackage.pv5;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes2.dex */
public final class yi1 implements pv5 {
    public static final gc8 i = new gc8() { // from class: xi1
        @Override // defpackage.gc8
        public final Object get() {
            String l;
            l = yi1.l();
            return l;
        }
    };
    private static final Random j = new Random();
    private final g2.d a;
    private final g2.b b;
    private final HashMap c;
    private final gc8 d;
    private pv5.a e;
    private g2 f;
    private String g;
    private long h;

    private final class a {
        private final String a;
        private int b;
        private long c;
        private o.b d;
        private boolean e;
        private boolean f;

        public a(String str, int i, o.b bVar) {
            this.a = str;
            this.b = i;
            this.c = bVar == null ? -1L : bVar.d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.d = bVar;
        }

        private int l(g2 g2Var, g2 g2Var2, int i) {
            if (i >= g2Var.u()) {
                if (i < g2Var2.u()) {
                    return i;
                }
                return -1;
            }
            g2Var.s(i, yi1.this.a);
            for (int i2 = yi1.this.a.r; i2 <= yi1.this.a.s; i2++) {
                int g = g2Var2.g(g2Var.r(i2));
                if (g != -1) {
                    return g2Var2.k(g, yi1.this.b).c;
                }
            }
            return -1;
        }

        public boolean i(int i, o.b bVar) {
            if (bVar == null) {
                return i == this.b;
            }
            o.b bVar2 = this.d;
            return bVar2 == null ? !bVar.b() && bVar.d == this.c : bVar.d == bVar2.d && bVar.b == bVar2.b && bVar.c == bVar2.c;
        }

        public boolean j(ad.a aVar) {
            o.b bVar = aVar.d;
            if (bVar == null) {
                return this.b != aVar.c;
            }
            long j = this.c;
            if (j == -1) {
                return false;
            }
            if (bVar.d > j) {
                return true;
            }
            if (this.d == null) {
                return false;
            }
            int g = aVar.b.g(bVar.a);
            int g2 = aVar.b.g(this.d.a);
            o.b bVar2 = aVar.d;
            if (bVar2.d < this.d.d || g < g2) {
                return false;
            }
            if (g > g2) {
                return true;
            }
            if (!bVar2.b()) {
                int i = aVar.d.e;
                return i == -1 || i > this.d.b;
            }
            o.b bVar3 = aVar.d;
            int i2 = bVar3.b;
            int i3 = bVar3.c;
            o.b bVar4 = this.d;
            int i4 = bVar4.b;
            if (i2 <= i4) {
                return i2 == i4 && i3 > bVar4.c;
            }
            return true;
        }

        public void k(int i, o.b bVar) {
            if (this.c != -1 || i != this.b || bVar == null || bVar.d < yi1.this.m()) {
                return;
            }
            this.c = bVar.d;
        }

        public boolean m(g2 g2Var, g2 g2Var2) {
            int l = l(g2Var, g2Var2, this.b);
            this.b = l;
            if (l == -1) {
                return false;
            }
            o.b bVar = this.d;
            return bVar == null || g2Var2.g(bVar.a) != -1;
        }
    }

    public yi1() {
        this(i);
    }

    private void k(a aVar) {
        if (aVar.c != -1) {
            this.h = aVar.c;
        }
        this.g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String l() {
        byte[] bArr = new byte[12];
        j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long m() {
        a aVar = (a) this.c.get(this.g);
        return (aVar == null || aVar.c == -1) ? this.h + 1 : aVar.c;
    }

    private a n(int i2, o.b bVar) {
        a aVar = null;
        long j2 = Long.MAX_VALUE;
        for (a aVar2 : this.c.values()) {
            aVar2.k(i2, bVar);
            if (aVar2.i(i2, bVar)) {
                long j3 = aVar2.c;
                if (j3 == -1 || j3 < j2) {
                    aVar = aVar2;
                    j2 = j3;
                } else if (j3 == j2 && ((a) z19.j(aVar)).d != null && aVar2.d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) this.d.get();
        a aVar3 = new a(str, i2, bVar);
        this.c.put(str, aVar3);
        return aVar3;
    }

    private void o(ad.a aVar) {
        if (aVar.b.v()) {
            String str = this.g;
            if (str != null) {
                k((a) ur.e((a) this.c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = (a) this.c.get(this.g);
        a n = n(aVar.c, aVar.d);
        this.g = n.a;
        b(aVar);
        o.b bVar = aVar.d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.c == aVar.d.d && aVar2.d != null && aVar2.d.b == aVar.d.b && aVar2.d.c == aVar.d.c) {
            return;
        }
        o.b bVar2 = aVar.d;
        this.e.u(aVar, n(aVar.c, new o.b(bVar2.a, bVar2.d)).a, n.a);
    }

    @Override // defpackage.pv5
    public synchronized void a(ad.a aVar) {
        try {
            ur.e(this.e);
            g2 g2Var = this.f;
            this.f = aVar.b;
            Iterator it2 = this.c.values().iterator();
            while (it2.hasNext()) {
                a aVar2 = (a) it2.next();
                if (aVar2.m(g2Var, this.f) && !aVar2.j(aVar)) {
                }
                it2.remove();
                if (aVar2.e) {
                    if (aVar2.a.equals(this.g)) {
                        k(aVar2);
                    }
                    this.e.G(aVar, aVar2.a, false);
                }
            }
            o(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00de A[Catch: all -> 0x0044, TryCatch #0 {, blocks: (B:4:0x0005, B:9:0x0014, B:11:0x0018, B:16:0x0024, B:18:0x0030, B:20:0x003a, B:24:0x0047, B:26:0x0053, B:27:0x0059, B:29:0x005e, B:31:0x0064, B:33:0x007d, B:34:0x00d8, B:36:0x00de, B:37:0x00f4, B:39:0x0100, B:41:0x0106), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    @Override // defpackage.pv5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void b(ad.a r25) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yi1.b(ad$a):void");
    }

    @Override // defpackage.pv5
    public synchronized void c(ad.a aVar, int i2) {
        try {
            ur.e(this.e);
            boolean z = i2 == 0;
            Iterator it2 = this.c.values().iterator();
            while (it2.hasNext()) {
                a aVar2 = (a) it2.next();
                if (aVar2.j(aVar)) {
                    it2.remove();
                    if (aVar2.e) {
                        boolean equals = aVar2.a.equals(this.g);
                        boolean z2 = z && equals && aVar2.f;
                        if (equals) {
                            k(aVar2);
                        }
                        this.e.G(aVar, aVar2.a, z2);
                    }
                }
            }
            o(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.pv5
    public synchronized void d(ad.a aVar) {
        pv5.a aVar2;
        try {
            String str = this.g;
            if (str != null) {
                k((a) ur.e((a) this.c.get(str)));
            }
            Iterator it2 = this.c.values().iterator();
            while (it2.hasNext()) {
                a aVar3 = (a) it2.next();
                it2.remove();
                if (aVar3.e && (aVar2 = this.e) != null) {
                    aVar2.G(aVar, aVar3.a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.pv5
    public synchronized String e(g2 g2Var, o.b bVar) {
        return n(g2Var.m(bVar.a, this.b).c, bVar).a;
    }

    @Override // defpackage.pv5
    public void f(pv5.a aVar) {
        this.e = aVar;
    }

    @Override // defpackage.pv5
    public synchronized String getActiveSessionId() {
        return this.g;
    }

    public yi1(gc8 gc8Var) {
        this.d = gc8Var;
        this.a = new g2.d();
        this.b = new g2.b();
        this.c = new HashMap();
        this.f = g2.a;
        this.h = -1L;
    }
}
