package defpackage;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes3.dex */
public final class znf implements lof {
    public static final fhe i = new fhe() { // from class: tnf
        @Override // defpackage.fhe
        public final Object zza() {
            String m;
            m = znf.m();
            return m;
        }
    };
    private static final Random j = new Random();
    private final fhe d;
    private iof e;
    private String g;
    private final l0c a = new l0c();
    private final fyb b = new fyb();
    private final HashMap c = new HashMap();
    private n1c f = n1c.a;
    private long h = -1;

    public znf(fhe fheVar) {
        this.d = fheVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long k() {
        wnf wnfVar = (wnf) this.c.get(this.g);
        return (wnfVar == null || wnfVar.c == -1) ? this.h + 1 : wnfVar.c;
    }

    private final wnf l(int i2, zzf zzfVar) {
        long j2 = Long.MAX_VALUE;
        wnf wnfVar = null;
        for (wnf wnfVar2 : this.c.values()) {
            wnfVar2.g(i2, zzfVar);
            if (wnfVar2.j(i2, zzfVar)) {
                long j3 = wnfVar2.c;
                if (j3 == -1 || j3 < j2) {
                    wnfVar = wnfVar2;
                    j2 = j3;
                } else if (j3 == j2) {
                    int i3 = khe.a;
                    if (wnfVar.d != null && wnfVar2.d != null) {
                        wnfVar = wnfVar2;
                    }
                }
            }
        }
        if (wnfVar != null) {
            return wnfVar;
        }
        String m = m();
        wnf wnfVar3 = new wnf(this, m, i2, zzfVar);
        this.c.put(m, wnfVar3);
        return wnfVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m() {
        byte[] bArr = new byte[12];
        j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void n(wnf wnfVar) {
        if (wnfVar.c != -1) {
            this.h = wnfVar.c;
        }
        this.g = null;
    }

    private final void o(tgf tgfVar) {
        if (tgfVar.b.o()) {
            String str = this.g;
            if (str != null) {
                wnf wnfVar = (wnf) this.c.get(str);
                wnfVar.getClass();
                n(wnfVar);
                return;
            }
            return;
        }
        wnf wnfVar2 = (wnf) this.c.get(this.g);
        wnf l = l(tgfVar.c, tgfVar.d);
        this.g = l.a;
        a(tgfVar);
        zzf zzfVar = tgfVar.d;
        if (zzfVar == null || !zzfVar.b()) {
            return;
        }
        if (wnfVar2 != null) {
            if (wnfVar2.c == zzfVar.d && wnfVar2.d != null && wnfVar2.d.b == tgfVar.d.b && wnfVar2.d.c == tgfVar.d.c) {
                return;
            }
        }
        zzf zzfVar2 = tgfVar.d;
        String unused = l(tgfVar.c, new zzf(zzfVar2.a, zzfVar2.d)).a;
        String unused2 = l.a;
    }

    @Override // defpackage.lof
    public final synchronized void a(tgf tgfVar) {
        try {
            if (this.e == null) {
                throw null;
            }
            if (!tgfVar.b.o()) {
                zzf zzfVar = tgfVar.d;
                if (zzfVar != null) {
                    if (zzfVar.d >= k()) {
                        wnf wnfVar = (wnf) this.c.get(this.g);
                        if (wnfVar != null) {
                            if (wnfVar.c == -1) {
                                if (wnfVar.b == tgfVar.c) {
                                }
                            }
                        }
                    }
                }
                wnf l = l(tgfVar.c, tgfVar.d);
                if (this.g == null) {
                    this.g = l.a;
                }
                zzf zzfVar2 = tgfVar.d;
                if (zzfVar2 != null && zzfVar2.b()) {
                    wnf l2 = l(tgfVar.c, new zzf(zzfVar2.a, zzfVar2.d, zzfVar2.b));
                    if (!l2.e) {
                        l2.e = true;
                        n1c n1cVar = tgfVar.b;
                        zzf zzfVar3 = tgfVar.d;
                        n1cVar.n(zzfVar3.a, this.b);
                        this.b.i(tgfVar.d.b);
                        Math.max(0L, khe.I(0L) + khe.I(0L));
                        String unused = l2.a;
                    }
                }
                if (!l.e) {
                    l.e = true;
                    String unused2 = l.a;
                }
                if (l.a.equals(this.g) && !l.f) {
                    l.f = true;
                    this.e.b(tgfVar, l.a);
                }
            }
        } finally {
        }
    }

    @Override // defpackage.lof
    public final synchronized void b(tgf tgfVar) {
        iof iofVar;
        try {
            String str = this.g;
            if (str != null) {
                wnf wnfVar = (wnf) this.c.get(str);
                if (wnfVar == null) {
                    throw null;
                }
                n(wnfVar);
            }
            Iterator it2 = this.c.values().iterator();
            while (it2.hasNext()) {
                wnf wnfVar2 = (wnf) it2.next();
                it2.remove();
                if (wnfVar2.e && (iofVar = this.e) != null) {
                    iofVar.e(tgfVar, wnfVar2.a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.lof
    public final synchronized String c(n1c n1cVar, zzf zzfVar) {
        return l(n1cVar.n(zzfVar.a, this.b).c, zzfVar).a;
    }

    @Override // defpackage.lof
    public final synchronized void d(tgf tgfVar, int i2) {
        try {
            if (this.e == null) {
                throw null;
            }
            Iterator it2 = this.c.values().iterator();
            while (it2.hasNext()) {
                wnf wnfVar = (wnf) it2.next();
                if (wnfVar.k(tgfVar)) {
                    it2.remove();
                    if (wnfVar.e) {
                        boolean equals = wnfVar.a.equals(this.g);
                        boolean z = false;
                        if (i2 == 0 && equals && wnfVar.f) {
                            z = true;
                        }
                        if (equals) {
                            n(wnfVar);
                        }
                        this.e.e(tgfVar, wnfVar.a, z);
                    }
                }
            }
            o(tgfVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.lof
    public final void e(iof iofVar) {
        this.e = iofVar;
    }

    @Override // defpackage.lof
    public final synchronized void f(tgf tgfVar) {
        try {
            if (this.e == null) {
                throw null;
            }
            n1c n1cVar = this.f;
            this.f = tgfVar.b;
            Iterator it2 = this.c.values().iterator();
            while (it2.hasNext()) {
                wnf wnfVar = (wnf) it2.next();
                if (wnfVar.l(n1cVar, this.f) && !wnfVar.k(tgfVar)) {
                }
                it2.remove();
                if (wnfVar.e) {
                    if (wnfVar.a.equals(this.g)) {
                        n(wnfVar);
                    }
                    this.e.e(tgfVar, wnfVar.a, false);
                }
            }
            o(tgfVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.lof
    public final synchronized String zze() {
        return this.g;
    }
}
