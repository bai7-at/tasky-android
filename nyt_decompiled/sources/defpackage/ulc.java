package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzcjw;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ulc {
    static final ImageView.ScaleType k = ImageView.ScaleType.CENTER_INSIDE;
    private final hie a;
    private final s1e b;
    private final wkc c;
    private final rkc d;
    private final gmc e;
    private final omc f;
    private final Executor g;
    private final Executor h;
    private final zzbjb i;
    private final lkc j;

    public ulc(hie hieVar, s1e s1eVar, wkc wkcVar, rkc rkcVar, gmc gmcVar, omc omcVar, Executor executor, Executor executor2, lkc lkcVar) {
        this.a = hieVar;
        this.b = s1eVar;
        this.i = s1eVar.i;
        this.c = wkcVar;
        this.d = rkcVar;
        this.e = gmcVar;
        this.f = omcVar;
        this.g = executor;
        this.h = executor2;
        this.j = lkcVar;
    }

    private static void h(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean i(ViewGroup viewGroup, boolean z) {
        View S = z ? this.d.S() : this.d.T();
        if (S == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (S.getParent() instanceof ViewGroup) {
            ((ViewGroup) S.getParent()).removeView(S);
        }
        viewGroup.addView(S, ((Boolean) pla.c().a(mpa.J3)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void a(ViewGroup viewGroup) {
        rkc rkcVar = this.d;
        if (rkcVar.S() != null) {
            boolean z = viewGroup != null;
            if (rkcVar.P() == 2 || rkcVar.P() == 1) {
                this.a.v(this.b.f, String.valueOf(rkcVar.P()), z);
            } else if (rkcVar.P() == 6) {
                this.a.v(this.b.f, "2", z);
                this.a.v(this.b.f, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void b(qmc qmcVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        jta a;
        Drawable drawable;
        if (this.c.f() || this.c.e()) {
            String[] strArr = {"1098", "3011"};
            for (int i = 0; i < 2; i++) {
                View K = qmcVar.K(strArr[i]);
                if (K != null && (K instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) K;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = qmcVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        rkc rkcVar = this.d;
        if (rkcVar.R() != null) {
            zzbjb zzbjbVar = this.i;
            view = rkcVar.R();
            if (zzbjbVar != null && viewGroup == null) {
                h(layoutParams, zzbjbVar.zze);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (rkcVar.Y() instanceof rsa) {
            rsa rsaVar = (rsa) rkcVar.Y();
            if (viewGroup == null) {
                h(layoutParams, rsaVar.zzc());
                viewGroup = null;
            }
            View ssaVar = new ssa(context, rsaVar, layoutParams);
            ssaVar.setContentDescription((CharSequence) pla.c().a(mpa.H3));
            view = ssaVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                hq9 hq9Var = new hq9(qmcVar.zzf().getContext());
                hq9Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                hq9Var.addView(view);
                FrameLayout zzh = qmcVar.zzh();
                if (zzh != null) {
                    zzh.addView(hq9Var);
                }
            }
            qmcVar.x4(qmcVar.zzk(), view, true);
        }
        zzgaa zzgaaVar = nlc.r;
        int size = zzgaaVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View K2 = qmcVar.K((String) zzgaaVar.get(i2));
            i2++;
            if (K2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) K2;
                break;
            }
        }
        this.h.execute(new Runnable() { // from class: olc
            @Override // java.lang.Runnable
            public final void run() {
                ulc.this.a(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (i(viewGroup2, true)) {
            rkc rkcVar2 = this.d;
            if (rkcVar2.f0() != null) {
                rkcVar2.f0().L(new qlc(qmcVar, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) pla.c().a(mpa.K9)).booleanValue() && i(viewGroup2, false)) {
            rkc rkcVar3 = this.d;
            if (rkcVar3.d0() != null) {
                rkcVar3.d0().L(new qlc(qmcVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View zzf = qmcVar.zzf();
        Context context2 = zzf != null ? zzf.getContext() : null;
        if (context2 == null || (a = this.j.a()) == null) {
            return;
        }
        try {
            ee3 zzi = a.zzi();
            if (zzi == null || (drawable = (Drawable) fc5.Q1(zzi)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            ee3 zzj = qmcVar.zzj();
            if (zzj != null) {
                if (((Boolean) pla.c().a(mpa.i6)).booleanValue()) {
                    imageView.setScaleType((ImageView.ScaleType) fc5.Q1(zzj));
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView);
                }
            }
            imageView.setScaleType(k);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            fgb.g("Could not get main image drawable");
        }
    }

    public final void c(qmc qmcVar) {
        if (qmcVar == null || this.e == null || qmcVar.zzh() == null || !this.c.g()) {
            return;
        }
        try {
            qmcVar.zzh().addView(this.e.a());
        } catch (zzcjw e) {
            pzc.l("web view can not be obtained", e);
        }
    }

    public final void d(qmc qmcVar) {
        if (qmcVar == null) {
            return;
        }
        Context context = qmcVar.zzf().getContext();
        if (l9b.h(context, this.c.a)) {
            if (!(context instanceof Activity)) {
                fgb.b("Activity context is needed for policy validator.");
                return;
            }
            if (this.f == null || qmcVar.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.f.a(qmcVar.zzh(), windowManager), l9b.b());
            } catch (zzcjw e) {
                pzc.l("web view can not be obtained", e);
            }
        }
    }

    public final void e(final qmc qmcVar) {
        this.g.execute(new Runnable() { // from class: plc
            @Override // java.lang.Runnable
            public final void run() {
                ulc.this.b(qmcVar);
            }
        });
    }

    public final boolean f(ViewGroup viewGroup) {
        return i(viewGroup, false);
    }

    public final boolean g(ViewGroup viewGroup) {
        return i(viewGroup, true);
    }
}
