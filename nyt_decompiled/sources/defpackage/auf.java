package defpackage;

import com.google.android.gms.internal.pal.k6;
import com.google.android.gms.internal.pal.m6;
import com.google.android.gms.internal.pal.n6;
import com.google.android.gms.internal.pal.p6;
import com.google.android.gms.internal.pal.q6;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzvn;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class auf extends dpf {
    public auf() {
        super(k6.class, new wtf(ecf.class));
    }

    public static final void l(k6 k6Var) {
        h7g.b(k6Var.s(), 0);
        if (k6Var.C().e() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        n(k6Var.x());
    }

    static /* bridge */ /* synthetic */ hof m(int i, int i2, int i3, int i4) {
        m6 t = n6.t();
        p6 t2 = q6.t();
        t2.l(i3);
        t2.k(i2);
        t.l((q6) t2.g());
        t.k(i);
        return new hof((n6) t.g(), i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(q6 q6Var) {
        if (q6Var.s() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int x = q6Var.x() - 2;
        if (x == 1) {
            if (q6Var.s() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (x == 2) {
            if (q6Var.s() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (x == 3) {
            if (q6Var.s() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (x == 4) {
            if (q6Var.s() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (x != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (q6Var.s() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // defpackage.dpf
    public final kof a() {
        return new ytf(this, n6.class);
    }

    @Override // defpackage.dpf
    public final zzvn b() {
        return zzvn.SYMMETRIC;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ zx9 c(zzaby zzabyVar) {
        return k6.w(zzabyVar, ev9.a());
    }

    @Override // defpackage.dpf
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void e(zx9 zx9Var) {
        l((k6) zx9Var);
    }

    @Override // defpackage.dpf
    public final int f() {
        return 2;
    }
}
