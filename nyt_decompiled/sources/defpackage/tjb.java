package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.internal.ads.p6;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class tjb extends xhb implements TextureView.SurfaceTextureListener, mib {
    private final wib c;
    private final xib d;
    private final vib e;
    private whb f;
    private Surface g;
    private nib h;
    private String i;
    private String[] j;
    private boolean k;
    private int l;
    private uib m;
    private final boolean n;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private float w;

    public tjb(Context context, xib xibVar, wib wibVar, boolean z, boolean z2, vib vibVar) {
        super(context);
        this.l = 1;
        this.c = wibVar;
        this.d = xibVar;
        this.n = z;
        this.e = vibVar;
        setSurfaceTextureListener(this);
        xibVar.a(this);
    }

    private static String S(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void T() {
        nib nibVar = this.h;
        if (nibVar != null) {
            nibVar.H(true);
        }
    }

    private final void U() {
        if (this.r) {
            return;
        }
        this.r = true;
        wxf.l.post(new Runnable() { // from class: sjb
            @Override // java.lang.Runnable
            public final void run() {
                tjb.this.H();
            }
        });
        zzn();
        this.d.b();
        if (this.s) {
            t();
        }
    }

    private final void V(boolean z, Integer num) {
        nib nibVar = this.h;
        if (nibVar != null && !z) {
            nibVar.G(num);
            return;
        }
        if (this.i == null || this.g == null) {
            return;
        }
        if (z) {
            if (!c0()) {
                fgb.g("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                nibVar.L();
                X();
            }
        }
        if (this.i.startsWith("cache:")) {
            mkb E = this.c.E(this.i);
            if (E instanceof alb) {
                nib y = ((alb) E).y();
                this.h = y;
                y.G(num);
                if (!this.h.M()) {
                    fgb.g("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(E instanceof xkb)) {
                    fgb.g("Stream cache miss: ".concat(String.valueOf(this.i)));
                    return;
                }
                xkb xkbVar = (xkb) E;
                String E2 = E();
                ByteBuffer z2 = xkbVar.z();
                boolean A = xkbVar.A();
                String y2 = xkbVar.y();
                if (y2 == null) {
                    fgb.g("Stream cache URL is null.");
                    return;
                } else {
                    nib D = D(num);
                    this.h = D;
                    D.x(new Uri[]{Uri.parse(y2)}, E2, z2, A);
                }
            }
        } else {
            this.h = D(num);
            String E3 = E();
            Uri[] uriArr = new Uri[this.j.length];
            int i = 0;
            while (true) {
                String[] strArr = this.j;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            this.h.w(uriArr, E3);
        }
        this.h.C(this);
        Y(this.g, false);
        if (this.h.M()) {
            int P = this.h.P();
            this.l = P;
            if (P == 3) {
                U();
            }
        }
    }

    private final void W() {
        nib nibVar = this.h;
        if (nibVar != null) {
            nibVar.H(false);
        }
    }

    private final void X() {
        if (this.h != null) {
            Y(null, true);
            nib nibVar = this.h;
            if (nibVar != null) {
                nibVar.C(null);
                this.h.y();
                this.h = null;
            }
            this.l = 1;
            this.k = false;
            this.r = false;
            this.s = false;
        }
    }

    private final void Y(Surface surface, boolean z) {
        nib nibVar = this.h;
        if (nibVar == null) {
            fgb.g("Trying to set surface before player is initialized.");
            return;
        }
        try {
            nibVar.J(surface, z);
        } catch (IOException e) {
            fgb.h("", e);
        }
    }

    private final void Z() {
        a0(this.t, this.u);
    }

    private final void a0(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.w != f) {
            this.w = f;
            requestLayout();
        }
    }

    private final boolean b0() {
        return c0() && this.l != 1;
    }

    private final boolean c0() {
        nib nibVar = this.h;
        return (nibVar == null || !nibVar.M() || this.k) ? false : true;
    }

    @Override // defpackage.xhb
    public final void A(int i) {
        nib nibVar = this.h;
        if (nibVar != null) {
            nibVar.A(i);
        }
    }

    @Override // defpackage.xhb
    public final void B(int i) {
        nib nibVar = this.h;
        if (nibVar != null) {
            nibVar.B(i);
        }
    }

    @Override // defpackage.xhb
    public final void C(int i) {
        nib nibVar = this.h;
        if (nibVar != null) {
            nibVar.D(i);
        }
    }

    final nib D(Integer num) {
        vib vibVar = this.e;
        wib wibVar = this.c;
        p6 p6Var = new p6(wibVar.getContext(), vibVar, wibVar, num);
        fgb.f("ExoPlayerAdapter initialized.");
        return p6Var;
    }

    final String E() {
        wib wibVar = this.c;
        return dyf.r().E(wibVar.getContext(), wibVar.zzn().zza);
    }

    final /* synthetic */ void F(String str) {
        whb whbVar = this.f;
        if (whbVar != null) {
            whbVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void G() {
        whb whbVar = this.f;
        if (whbVar != null) {
            whbVar.zza();
        }
    }

    final /* synthetic */ void H() {
        whb whbVar = this.f;
        if (whbVar != null) {
            whbVar.zzf();
        }
    }

    final /* synthetic */ void I(boolean z, long j) {
        this.c.j0(z, j);
    }

    final /* synthetic */ void J(String str) {
        whb whbVar = this.f;
        if (whbVar != null) {
            whbVar.o0("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void K() {
        whb whbVar = this.f;
        if (whbVar != null) {
            whbVar.zzg();
        }
    }

    final /* synthetic */ void L() {
        whb whbVar = this.f;
        if (whbVar != null) {
            whbVar.zzh();
        }
    }

    final /* synthetic */ void M() {
        whb whbVar = this.f;
        if (whbVar != null) {
            whbVar.zzi();
        }
    }

    final /* synthetic */ void N(int i, int i2) {
        whb whbVar = this.f;
        if (whbVar != null) {
            whbVar.a(i, i2);
        }
    }

    final /* synthetic */ void O() {
        float a = this.b.a();
        nib nibVar = this.h;
        if (nibVar == null) {
            fgb.g("Trying to set volume before player is initialized.");
            return;
        }
        try {
            nibVar.K(a, false);
        } catch (IOException e) {
            fgb.h("", e);
        }
    }

    final /* synthetic */ void P(int i) {
        whb whbVar = this.f;
        if (whbVar != null) {
            whbVar.onWindowVisibilityChanged(i);
        }
    }

    final /* synthetic */ void Q() {
        whb whbVar = this.f;
        if (whbVar != null) {
            whbVar.zzd();
        }
    }

    final /* synthetic */ void R() {
        whb whbVar = this.f;
        if (whbVar != null) {
            whbVar.zze();
        }
    }

    @Override // defpackage.mib
    public final void a() {
        wxf.l.post(new Runnable() { // from class: bjb
            @Override // java.lang.Runnable
            public final void run() {
                tjb.this.K();
            }
        });
    }

    @Override // defpackage.xhb
    public final void b(int i) {
        nib nibVar = this.h;
        if (nibVar != null) {
            nibVar.E(i);
        }
    }

    @Override // defpackage.mib
    public final void c(int i) {
        if (this.l != i) {
            this.l = i;
            if (i == 3) {
                U();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.e.a) {
                W();
            }
            this.d.e();
            this.b.c();
            wxf.l.post(new Runnable() { // from class: rjb
                @Override // java.lang.Runnable
                public final void run() {
                    tjb.this.G();
                }
            });
        }
    }

    @Override // defpackage.mib
    public final void d(int i, int i2) {
        this.t = i;
        this.u = i2;
        Z();
    }

    @Override // defpackage.xhb
    public final void e(int i) {
        nib nibVar = this.h;
        if (nibVar != null) {
            nibVar.I(i);
        }
    }

    @Override // defpackage.xhb
    public final void f(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.j = new String[]{str};
        } else {
            this.j = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.i;
        boolean z = false;
        if (this.e.l && str2 != null && !str.equals(str2) && this.l == 4) {
            z = true;
        }
        this.i = str;
        V(z, num);
    }

    @Override // defpackage.mib
    public final void g(String str, Exception exc) {
        final String S = S("onLoadException", exc);
        fgb.g("ExoPlayerAdapter exception: ".concat(S));
        dyf.q().v(exc, "AdExoPlayerView.onException");
        wxf.l.post(new Runnable() { // from class: ijb
            @Override // java.lang.Runnable
            public final void run() {
                tjb.this.J(S);
            }
        });
    }

    @Override // defpackage.mib
    public final void h(final boolean z, final long j) {
        if (this.c != null) {
            pgb.e.execute(new Runnable() { // from class: hjb
                @Override // java.lang.Runnable
                public final void run() {
                    tjb.this.I(z, j);
                }
            });
        }
    }

    @Override // defpackage.xhb
    public final int i() {
        if (b0()) {
            return (int) this.h.U();
        }
        return 0;
    }

    @Override // defpackage.mib
    public final void j(String str, Exception exc) {
        final String S = S(str, exc);
        fgb.g("ExoPlayerAdapter error: ".concat(S));
        this.k = true;
        if (this.e.a) {
            W();
        }
        wxf.l.post(new Runnable() { // from class: qjb
            @Override // java.lang.Runnable
            public final void run() {
                tjb.this.F(S);
            }
        });
        dyf.q().v(exc, "AdExoPlayerView.onError");
    }

    @Override // defpackage.xhb
    public final int k() {
        nib nibVar = this.h;
        if (nibVar != null) {
            return nibVar.N();
        }
        return -1;
    }

    @Override // defpackage.xhb
    public final int l() {
        if (b0()) {
            return (int) this.h.V();
        }
        return 0;
    }

    @Override // defpackage.xhb
    public final int m() {
        return this.u;
    }

    @Override // defpackage.xhb
    public final int n() {
        return this.t;
    }

    @Override // defpackage.xhb
    public final long o() {
        nib nibVar = this.h;
        if (nibVar != null) {
            return nibVar.T();
        }
        return -1L;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.w;
        if (f != 0.0f && this.m == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        uib uibVar = this.m;
        if (uibVar != null) {
            uibVar.b(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.n) {
            uib uibVar = new uib(getContext());
            this.m = uibVar;
            uibVar.c(surfaceTexture, i, i2);
            this.m.start();
            SurfaceTexture a = this.m.a();
            if (a != null) {
                surfaceTexture = a;
            } else {
                this.m.d();
                this.m = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.g = surface;
        if (this.h == null) {
            V(false, null);
        } else {
            Y(surface, true);
            if (!this.e.a) {
                T();
            }
        }
        if (this.t == 0 || this.u == 0) {
            a0(i, i2);
        } else {
            Z();
        }
        wxf.l.post(new Runnable() { // from class: kjb
            @Override // java.lang.Runnable
            public final void run() {
                tjb.this.L();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        s();
        uib uibVar = this.m;
        if (uibVar != null) {
            uibVar.d();
            this.m = null;
        }
        if (this.h != null) {
            W();
            Surface surface = this.g;
            if (surface != null) {
                surface.release();
            }
            this.g = null;
            Y(null, true);
        }
        wxf.l.post(new Runnable() { // from class: gjb
            @Override // java.lang.Runnable
            public final void run() {
                tjb.this.M();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        uib uibVar = this.m;
        if (uibVar != null) {
            uibVar.b(i, i2);
        }
        wxf.l.post(new Runnable() { // from class: fjb
            @Override // java.lang.Runnable
            public final void run() {
                tjb.this.N(i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.d.f(this);
        this.a.a(surfaceTexture, this.f);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        pzc.k("AdExoPlayerView3 window visibility changed to " + i);
        wxf.l.post(new Runnable() { // from class: ejb
            @Override // java.lang.Runnable
            public final void run() {
                tjb.this.P(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // defpackage.xhb
    public final long p() {
        nib nibVar = this.h;
        if (nibVar != null) {
            return nibVar.r();
        }
        return -1L;
    }

    @Override // defpackage.xhb
    public final long q() {
        nib nibVar = this.h;
        if (nibVar != null) {
            return nibVar.s();
        }
        return -1L;
    }

    @Override // defpackage.xhb
    public final String r() {
        return "ExoPlayer/2".concat(true != this.n ? "" : " spherical");
    }

    @Override // defpackage.xhb
    public final void s() {
        if (b0()) {
            if (this.e.a) {
                W();
            }
            this.h.F(false);
            this.d.e();
            this.b.c();
            wxf.l.post(new Runnable() { // from class: jjb
                @Override // java.lang.Runnable
                public final void run() {
                    tjb.this.Q();
                }
            });
        }
    }

    @Override // defpackage.xhb
    public final void t() {
        if (!b0()) {
            this.s = true;
            return;
        }
        if (this.e.a) {
            T();
        }
        this.h.F(true);
        this.d.c();
        this.b.b();
        this.a.b();
        wxf.l.post(new Runnable() { // from class: cjb
            @Override // java.lang.Runnable
            public final void run() {
                tjb.this.R();
            }
        });
    }

    @Override // defpackage.xhb
    public final void u(int i) {
        if (b0()) {
            this.h.z(i);
        }
    }

    @Override // defpackage.xhb
    public final void v(whb whbVar) {
        this.f = whbVar;
    }

    @Override // defpackage.xhb
    public final void w(String str) {
        if (str != null) {
            f(str, null, null);
        }
    }

    @Override // defpackage.xhb
    public final void x() {
        if (c0()) {
            this.h.L();
            X();
        }
        this.d.e();
        this.b.c();
        this.d.d();
    }

    @Override // defpackage.xhb
    public final void y(float f, float f2) {
        uib uibVar = this.m;
        if (uibVar != null) {
            uibVar.e(f, f2);
        }
    }

    @Override // defpackage.xhb
    public final Integer z() {
        nib nibVar = this.h;
        if (nibVar != null) {
            return nibVar.t();
        }
        return null;
    }

    @Override // defpackage.xhb, defpackage.zib
    public final void zzn() {
        wxf.l.post(new Runnable() { // from class: djb
            @Override // java.lang.Runnable
            public final void run() {
                tjb.this.O();
            }
        });
    }
}
