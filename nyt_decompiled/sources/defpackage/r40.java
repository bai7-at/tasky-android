package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.e0;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public abstract class r40 extends ViewGroup {
    protected final e0 a;

    protected r40(Context context, int i) {
        super(context);
        this.a = new e0(this, i);
    }

    public void a() {
        mpa.a(getContext());
        if (((Boolean) ora.e.e()).booleanValue()) {
            if (((Boolean) pla.c().a(mpa.Da)).booleanValue()) {
                pfb.b.execute(new Runnable() { // from class: w5c
                    @Override // java.lang.Runnable
                    public final void run() {
                        r40 r40Var = r40.this;
                        try {
                            r40Var.a.n();
                        } catch (IllegalStateException e) {
                            k8b.c(r40Var.getContext()).b(e, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.a.n();
    }

    public void b(final n7 n7Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        mpa.a(getContext());
        if (((Boolean) ora.f.e()).booleanValue()) {
            if (((Boolean) pla.c().a(mpa.Ga)).booleanValue()) {
                pfb.b.execute(new Runnable() { // from class: ftd
                    @Override // java.lang.Runnable
                    public final void run() {
                        r40 r40Var = r40.this;
                        try {
                            r40Var.a.p(n7Var.a);
                        } catch (IllegalStateException e) {
                            k8b.c(r40Var.getContext()).b(e, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.a.p(n7Var.a);
    }

    public void c() {
        mpa.a(getContext());
        if (((Boolean) ora.g.e()).booleanValue()) {
            if (((Boolean) pla.c().a(mpa.Ea)).booleanValue()) {
                pfb.b.execute(new Runnable() { // from class: wzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        r40 r40Var = r40.this;
                        try {
                            r40Var.a.q();
                        } catch (IllegalStateException e) {
                            k8b.c(r40Var.getContext()).b(e, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.a.q();
    }

    public void d() {
        mpa.a(getContext());
        if (((Boolean) ora.h.e()).booleanValue()) {
            if (((Boolean) pla.c().a(mpa.Ca)).booleanValue()) {
                pfb.b.execute(new Runnable() { // from class: lbb
                    @Override // java.lang.Runnable
                    public final void run() {
                        r40 r40Var = r40.this;
                        try {
                            r40Var.a.r();
                        } catch (IllegalStateException e) {
                            k8b.c(r40Var.getContext()).b(e, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.a.r();
    }

    public o6 getAdListener() {
        return this.a.d();
    }

    public s7 getAdSize() {
        return this.a.e();
    }

    public String getAdUnitId() {
        return this.a.m();
    }

    public cf5 getOnPaidEventListener() {
        this.a.f();
        return null;
    }

    public r07 getResponseInfo() {
        return this.a.g();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        s7 s7Var;
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                s7Var = getAdSize();
            } catch (NullPointerException e) {
                fgb.e("Unable to retrieve ad size.", e);
                s7Var = null;
            }
            if (s7Var != null) {
                Context context = getContext();
                int d = s7Var.d(context);
                i3 = s7Var.b(context);
                i4 = d;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(o6 o6Var) {
        this.a.t(o6Var);
        if (o6Var == 0) {
            this.a.s(null);
            return;
        }
        if (o6Var instanceof jq9) {
            this.a.s((jq9) o6Var);
        }
        if (o6Var instanceof jl) {
            this.a.x((jl) o6Var);
        }
    }

    public void setAdSize(s7 s7Var) {
        this.a.u(s7Var);
    }

    public void setAdUnitId(String str) {
        this.a.w(str);
    }

    public void setOnPaidEventListener(cf5 cf5Var) {
        this.a.z(cf5Var);
    }
}
