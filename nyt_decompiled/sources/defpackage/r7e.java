package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.pal.zzcw;

/* loaded from: classes3.dex */
public final class r7e extends cae {
    private final qtb a;
    private final zvb b;
    private final jzb c;
    private boolean d = false;

    public r7e(String str, Context context, boolean z) {
        gyb v = gyb.v("h.3.2.2/n.android.3.2.2", context, false);
        this.a = v;
        this.c = new jzb(v);
        this.b = zvb.v(context);
    }

    private final ee3 Q1(ee3 ee3Var, ee3 ee3Var2, boolean z) {
        try {
            Uri uri = (Uri) fc5.Q1(ee3Var);
            Context context = (Context) fc5.Q1(ee3Var2);
            return fc5.l3(z ? this.c.b(uri, context) : this.c.a(uri, context, null, null));
        } catch (zzcw unused) {
            return null;
        }
    }

    @Override // defpackage.cbe
    public final boolean C3(String str, boolean z) {
        if (this.b == null) {
            return false;
        }
        this.b.x(new AdvertisingIdClient.Info(str, z));
        this.d = true;
        return true;
    }

    @Override // defpackage.cbe
    public final int zzb() {
        return this.a instanceof gyb ? 1 : -1;
    }

    @Override // defpackage.cbe
    public final ee3 zzc(ee3 ee3Var, ee3 ee3Var2) {
        return Q1(ee3Var, ee3Var2, false);
    }

    @Override // defpackage.cbe
    public final ee3 zzd(ee3 ee3Var, ee3 ee3Var2) {
        return Q1(ee3Var, ee3Var2, true);
    }

    @Override // defpackage.cbe
    public final String zze(ee3 ee3Var, String str) {
        return ((vub) this.a).e((Context) fc5.Q1(ee3Var), str, null, null);
    }

    @Override // defpackage.cbe
    public final String zzf(ee3 ee3Var) {
        return zzg(ee3Var, null);
    }

    @Override // defpackage.cbe
    public final String zzg(ee3 ee3Var, byte[] bArr) {
        Context context = (Context) fc5.Q1(ee3Var);
        String c = this.a.c(context, bArr);
        zvb zvbVar = this.b;
        if (zvbVar == null || !this.d) {
            return c;
        }
        String w = this.b.w(c, zvbVar.c(context, bArr));
        this.d = false;
        return w;
    }

    @Override // defpackage.cbe
    public final String zzh(ee3 ee3Var, ee3 ee3Var2, ee3 ee3Var3, ee3 ee3Var4) {
        return this.a.e((Context) fc5.Q1(ee3Var), (String) fc5.Q1(ee3Var2), (View) fc5.Q1(ee3Var3), (Activity) fc5.Q1(ee3Var4));
    }

    @Override // defpackage.cbe
    public final String zzi(ee3 ee3Var) {
        return this.a.b((Context) fc5.Q1(ee3Var));
    }

    @Override // defpackage.cbe
    public final String zzj() {
        return "ms";
    }

    @Override // defpackage.cbe
    public final String zzk(ee3 ee3Var, ee3 ee3Var2, ee3 ee3Var3) {
        return this.a.d((Context) fc5.Q1(ee3Var), (View) fc5.Q1(ee3Var2), (Activity) fc5.Q1(ee3Var3));
    }

    @Override // defpackage.cbe
    public final void zzl(ee3 ee3Var) {
        this.c.c((MotionEvent) fc5.Q1(ee3Var));
    }

    @Override // defpackage.cbe
    public final void zzm(ee3 ee3Var) {
        this.a.f((View) fc5.Q1(ee3Var));
    }

    @Override // defpackage.cbe
    public final void zzn(String str, String str2) {
        this.c.d(str, str2);
    }

    @Override // defpackage.cbe
    public final void zzo(String str) {
        this.c.e(str);
    }

    @Override // defpackage.cbe
    public final boolean zzp(ee3 ee3Var) {
        return this.c.g((Uri) fc5.Q1(ee3Var));
    }

    @Override // defpackage.cbe
    public final boolean zzq(ee3 ee3Var) {
        return this.c.f((Uri) fc5.Q1(ee3Var));
    }
}
