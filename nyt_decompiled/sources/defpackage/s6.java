package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class s6 extends r40 {
    public s6(Context context) {
        super(context, 0);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public void e(final r6 r6Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        mpa.a(getContext());
        if (((Boolean) ora.f.e()).booleanValue()) {
            if (((Boolean) pla.c().a(mpa.Ga)).booleanValue()) {
                pfb.b.execute(new Runnable() { // from class: cla
                    @Override // java.lang.Runnable
                    public final void run() {
                        s6.this.f(r6Var);
                    }
                });
                return;
            }
        }
        this.a.p(r6Var.a());
    }

    final /* synthetic */ void f(r6 r6Var) {
        try {
            this.a.p(r6Var.a());
        } catch (IllegalStateException e) {
            k8b.c(getContext()).b(e, "AdManagerAdView.loadAd");
        }
    }

    public s7[] getAdSizes() {
        return this.a.a();
    }

    public jl getAppEventListener() {
        return this.a.k();
    }

    public a79 getVideoController() {
        return this.a.i();
    }

    public h89 getVideoOptions() {
        return this.a.j();
    }

    public void setAdSizes(s7... s7VarArr) {
        if (s7VarArr == null || s7VarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.a.v(s7VarArr);
    }

    public void setAppEventListener(jl jlVar) {
        this.a.x(jlVar);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.a.y(z);
    }

    public void setVideoOptions(h89 h89Var) {
        this.a.A(h89Var);
    }
}
