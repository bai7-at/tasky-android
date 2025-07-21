package defpackage;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class xjc extends ita {
    private final rkc a;
    private ee3 b;

    public xjc(rkc rkcVar) {
        this.a = rkcVar;
    }

    private static float w6(ee3 ee3Var) {
        Drawable drawable;
        if (ee3Var == null || (drawable = (Drawable) fc5.Q1(ee3Var)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // defpackage.jta
    public final void J(ee3 ee3Var) {
        this.b = ee3Var;
    }

    @Override // defpackage.jta
    public final void k1(xua xuaVar) {
        if (((Boolean) pla.c().a(mpa.n6)).booleanValue() && (this.a.W() instanceof ymb)) {
            ((ymb) this.a.W()).C6(xuaVar);
        }
    }

    @Override // defpackage.jta
    public final float zze() {
        if (!((Boolean) pla.c().a(mpa.m6)).booleanValue()) {
            return 0.0f;
        }
        if (this.a.O() != 0.0f) {
            return this.a.O();
        }
        if (this.a.W() != null) {
            try {
                return this.a.W().zze();
            } catch (RemoteException e) {
                fgb.e("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        }
        ee3 ee3Var = this.b;
        if (ee3Var != null) {
            return w6(ee3Var);
        }
        mta Z = this.a.Z();
        if (Z == null) {
            return 0.0f;
        }
        float zzd = (Z.zzd() == -1 || Z.zzc() == -1) ? 0.0f : Z.zzd() / Z.zzc();
        return zzd == 0.0f ? w6(Z.zzf()) : zzd;
    }

    @Override // defpackage.jta
    public final float zzf() {
        if (((Boolean) pla.c().a(mpa.n6)).booleanValue() && this.a.W() != null) {
            return this.a.W().zzf();
        }
        return 0.0f;
    }

    @Override // defpackage.jta
    public final float zzg() {
        if (((Boolean) pla.c().a(mpa.n6)).booleanValue() && this.a.W() != null) {
            return this.a.W().zzg();
        }
        return 0.0f;
    }

    @Override // defpackage.jta
    public final znc zzh() {
        if (((Boolean) pla.c().a(mpa.n6)).booleanValue()) {
            return this.a.W();
        }
        return null;
    }

    @Override // defpackage.jta
    public final ee3 zzi() {
        ee3 ee3Var = this.b;
        if (ee3Var != null) {
            return ee3Var;
        }
        mta Z = this.a.Z();
        if (Z == null) {
            return null;
        }
        return Z.zzf();
    }

    @Override // defpackage.jta
    public final boolean zzk() {
        if (((Boolean) pla.c().a(mpa.n6)).booleanValue()) {
            return this.a.G();
        }
        return false;
    }

    @Override // defpackage.jta
    public final boolean zzl() {
        return ((Boolean) pla.c().a(mpa.n6)).booleanValue() && this.a.W() != null;
    }
}
