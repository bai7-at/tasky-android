package defpackage;

import com.google.android.gms.internal.pal.b5;
import com.google.android.gms.internal.pal.c5;
import com.google.android.gms.internal.pal.y4;
import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzvn;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes3.dex */
public final class nff extends dpf {
    nff() {
        super(y4.class, new uef(haf.class));
    }

    public static void k(boolean z) {
        if (m()) {
            rdf.l(new nff(), true);
        }
    }

    static /* bridge */ /* synthetic */ hof l(int i, int i2) {
        b5 t = c5.t();
        t.k(i);
        return new hof((c5) t.g(), i2);
    }

    private static boolean m() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // defpackage.dpf
    public final kof a() {
        return new vef(this, c5.class);
    }

    @Override // defpackage.dpf
    public final zzvn b() {
        return zzvn.SYMMETRIC;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ zx9 c(zzaby zzabyVar) {
        return y4.v(zzabyVar, ev9.a());
    }

    @Override // defpackage.dpf
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void e(zx9 zx9Var) {
        y4 y4Var = (y4) zx9Var;
        h7g.b(y4Var.s(), 0);
        h7g.a(y4Var.w().e());
    }
}
