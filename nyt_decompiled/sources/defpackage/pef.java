package defpackage;

import com.google.android.gms.internal.pal.j4;
import com.google.android.gms.internal.pal.l4;
import com.google.android.gms.internal.pal.m4;
import com.google.android.gms.internal.pal.o4;
import com.google.android.gms.internal.pal.p4;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzvn;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class pef extends dpf {
    pef() {
        super(j4.class, new nef(haf.class));
    }

    static /* bridge */ /* synthetic */ hof k(int i, int i2, int i3) {
        l4 t = m4.t();
        t.k(i);
        o4 t2 = p4.t();
        t2.k(16);
        t.l((p4) t2.g());
        return new hof((m4) t.g(), i3);
    }

    @Override // defpackage.dpf
    public final kof a() {
        return new oef(this, m4.class);
    }

    @Override // defpackage.dpf
    public final zzvn b() {
        return zzvn.SYMMETRIC;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ zx9 c(zzaby zzabyVar) {
        return j4.v(zzabyVar, ev9.a());
    }

    @Override // defpackage.dpf
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void e(zx9 zx9Var) {
        j4 j4Var = (j4) zx9Var;
        h7g.b(j4Var.s(), 0);
        h7g.a(j4Var.x().e());
        if (j4Var.w().s() != 12 && j4Var.w().s() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
