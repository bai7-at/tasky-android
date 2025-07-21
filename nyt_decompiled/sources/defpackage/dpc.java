package defpackage;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class dpc extends pza implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, tsa {
    private View a;
    private znc b;
    private jkc c;
    private boolean d = false;
    private boolean e = false;

    public dpc(jkc jkcVar, rkc rkcVar) {
        this.a = rkcVar.S();
        this.b = rkcVar.W();
        this.c = jkcVar;
        if (rkcVar.f0() != null) {
            rkcVar.f0().p0(this);
        }
    }

    private static final void w6(tza tzaVar, int i) {
        try {
            tzaVar.i(i);
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    private final void zzg() {
        View view;
        jkc jkcVar = this.c;
        if (jkcVar == null || (view = this.a) == null) {
            return;
        }
        jkcVar.h(view, Collections.emptyMap(), Collections.emptyMap(), jkc.D(this.a));
    }

    private final void zzh() {
        View view = this.a;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.a);
        }
    }

    @Override // defpackage.qza
    public final void Y5(ee3 ee3Var, tza tzaVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.d) {
            fgb.d("Instream ad can not be shown after destroy().");
            w6(tzaVar, 2);
            return;
        }
        View view = this.a;
        if (view == null || this.b == null) {
            fgb.d("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            w6(tzaVar, 0);
            return;
        }
        if (this.e) {
            fgb.d("Instream ad should not be used again.");
            w6(tzaVar, 1);
            return;
        }
        this.e = true;
        zzh();
        ((ViewGroup) fc5.Q1(ee3Var)).addView(this.a, new ViewGroup.LayoutParams(-1, -1));
        dyf.z();
        ihb.a(this.a, this);
        dyf.z();
        ihb.b(this.a, this);
        zzg();
        try {
            tzaVar.zzf();
        } catch (RemoteException e) {
            fgb.i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // defpackage.qza
    public final znc zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.d) {
            return this.b;
        }
        fgb.d("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // defpackage.qza
    public final jta zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.d) {
            fgb.d("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        jkc jkcVar = this.c;
        if (jkcVar == null || jkcVar.N() == null) {
            return null;
        }
        return jkcVar.N().a();
    }

    @Override // defpackage.qza
    public final void zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        jkc jkcVar = this.c;
        if (jkcVar != null) {
            jkcVar.a();
        }
        this.c = null;
        this.a = null;
        this.b = null;
        this.d = true;
    }

    @Override // defpackage.qza
    public final void zze(ee3 ee3Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        Y5(ee3Var, new zoc(this));
    }
}
