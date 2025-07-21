package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class fib extends FrameLayout implements whb {
    private final wib a;
    private final FrameLayout b;
    private final View c;
    private final eqa d;
    final yib e;
    private final long f;
    private final xhb g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private long l;
    private long m;
    private String n;
    private String[] r;
    private Bitmap s;
    private final ImageView t;
    private boolean u;

    public fib(Context context, wib wibVar, int i, boolean z, eqa eqaVar, vib vibVar) {
        super(context);
        this.a = wibVar;
        this.d = eqaVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(wibVar.zzj());
        yhb yhbVar = wibVar.zzj().a;
        xhb tjbVar = i == 2 ? new tjb(context, new xib(context, wibVar.zzn(), wibVar.u0(), eqaVar, wibVar.zzk()), wibVar, z, yhb.a(wibVar), vibVar) : new vhb(context, wibVar, z, yhb.a(wibVar), vibVar, new xib(context, wibVar.zzn(), wibVar.u0(), eqaVar, wibVar.zzk()));
        this.g = tjbVar;
        View view = new View(context);
        this.c = view;
        view.setBackgroundColor(0);
        frameLayout.addView(tjbVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) pla.c().a(mpa.F)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) pla.c().a(mpa.C)).booleanValue()) {
            p();
        }
        this.t = new ImageView(context);
        this.f = ((Long) pla.c().a(mpa.I)).longValue();
        boolean booleanValue = ((Boolean) pla.c().a(mpa.E)).booleanValue();
        this.k = booleanValue;
        if (eqaVar != null) {
            eqaVar.d("spinner_used", true != booleanValue ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        this.e = new yib(this);
        tjbVar.v(this);
    }

    private final void k() {
        if (this.a.zzi() == null || !this.i || this.j) {
            return;
        }
        this.a.zzi().getWindow().clearFlags(128);
        this.i = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer n = n();
        if (n != null) {
            hashMap.put("playerId", n.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.a.t("onVideoEvent", hashMap);
    }

    private final boolean m() {
        return this.t.getParent() != null;
    }

    public final void A(int i) {
        xhb xhbVar = this.g;
        if (xhbVar == null) {
            return;
        }
        xhbVar.A(i);
    }

    public final void B(int i) {
        xhb xhbVar = this.g;
        if (xhbVar == null) {
            return;
        }
        xhbVar.B(i);
    }

    @Override // defpackage.whb
    public final void a(int i, int i2) {
        if (this.k) {
            zoa zoaVar = mpa.H;
            int max = Math.max(i / ((Integer) pla.c().a(zoaVar)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) pla.c().a(zoaVar)).intValue(), 1);
            Bitmap bitmap = this.s;
            if (bitmap != null && bitmap.getWidth() == max && this.s.getHeight() == max2) {
                return;
            }
            this.s = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.u = false;
        }
    }

    public final void b(int i) {
        xhb xhbVar = this.g;
        if (xhbVar == null) {
            return;
        }
        xhbVar.C(i);
    }

    public final void c(int i) {
        xhb xhbVar = this.g;
        if (xhbVar == null) {
            return;
        }
        xhbVar.b(i);
    }

    public final void d(int i) {
        if (((Boolean) pla.c().a(mpa.F)).booleanValue()) {
            this.b.setBackgroundColor(i);
            this.c.setBackgroundColor(i);
        }
    }

    public final void e(int i) {
        xhb xhbVar = this.g;
        if (xhbVar == null) {
            return;
        }
        xhbVar.e(i);
    }

    public final void f(String str, String[] strArr) {
        this.n = str;
        this.r = strArr;
    }

    public final void finalize() {
        try {
            this.e.a();
            final xhb xhbVar = this.g;
            if (xhbVar != null) {
                pgb.e.execute(new Runnable() { // from class: zhb
                    @Override // java.lang.Runnable
                    public final void run() {
                        xhb.this.x();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    public final void g(int i, int i2, int i3, int i4) {
        if (pzc.m()) {
            pzc.k("Set video bounds to x:" + i + ";y:" + i2 + ";w:" + i3 + ";h:" + i4);
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.b.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void h(float f) {
        xhb xhbVar = this.g;
        if (xhbVar == null) {
            return;
        }
        xhbVar.b.e(f);
        xhbVar.zzn();
    }

    public final void i(float f, float f2) {
        xhb xhbVar = this.g;
        if (xhbVar != null) {
            xhbVar.y(f, f2);
        }
    }

    public final void j() {
        xhb xhbVar = this.g;
        if (xhbVar == null) {
            return;
        }
        xhbVar.b.d(false);
        xhbVar.zzn();
    }

    public final Integer n() {
        xhb xhbVar = this.g;
        if (xhbVar != null) {
            return xhbVar.z();
        }
        return null;
    }

    @Override // defpackage.whb
    public final void o0(String str, String str2) {
        l("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.e.b();
        } else {
            this.e.a();
            this.m = this.l;
        }
        wxf.l.post(new Runnable() { // from class: bib
            @Override // java.lang.Runnable
            public final void run() {
                fib.this.s(z);
            }
        });
    }

    @Override // android.view.View, defpackage.whb
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.e.b();
            z = true;
        } else {
            this.e.a();
            this.m = this.l;
            z = false;
        }
        wxf.l.post(new eib(this, z));
    }

    public final void p() {
        xhb xhbVar = this.g;
        if (xhbVar == null) {
            return;
        }
        TextView textView = new TextView(xhbVar.getContext());
        Resources e = dyf.q().e();
        textView.setText(String.valueOf(e == null ? "AdMob - " : e.getString(tj6.watermark_label_prefix)).concat(this.g.r()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.b.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.b.bringChildToFront(textView);
    }

    public final void q() {
        this.e.a();
        xhb xhbVar = this.g;
        if (xhbVar != null) {
            xhbVar.x();
        }
        k();
    }

    final /* synthetic */ void r() {
        l("firstFrameRendered", new String[0]);
    }

    final /* synthetic */ void s(boolean z) {
        l("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void t(Integer num) {
        if (this.g == null) {
            return;
        }
        if (TextUtils.isEmpty(this.n)) {
            l("no_src", new String[0]);
        } else {
            this.g.f(this.n, this.r, num);
        }
    }

    public final void u() {
        xhb xhbVar = this.g;
        if (xhbVar == null) {
            return;
        }
        xhbVar.b.d(true);
        xhbVar.zzn();
    }

    final void v() {
        xhb xhbVar = this.g;
        if (xhbVar == null) {
            return;
        }
        long i = xhbVar.i();
        if (this.l == i || i <= 0) {
            return;
        }
        float f = i / 1000.0f;
        if (((Boolean) pla.c().a(mpa.Q1)).booleanValue()) {
            l("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.g.q()), "qoeCachedBytes", String.valueOf(this.g.o()), "qoeLoadedBytes", String.valueOf(this.g.p()), "droppedFrames", String.valueOf(this.g.k()), "reportTime", String.valueOf(dyf.b().currentTimeMillis()));
        } else {
            l("timeupdate", "time", String.valueOf(f));
        }
        this.l = i;
    }

    public final void w() {
        xhb xhbVar = this.g;
        if (xhbVar == null) {
            return;
        }
        xhbVar.s();
    }

    public final void x() {
        xhb xhbVar = this.g;
        if (xhbVar == null) {
            return;
        }
        xhbVar.t();
    }

    public final void y(int i) {
        xhb xhbVar = this.g;
        if (xhbVar == null) {
            return;
        }
        xhbVar.u(i);
    }

    public final void z(MotionEvent motionEvent) {
        xhb xhbVar = this.g;
        if (xhbVar == null) {
            return;
        }
        xhbVar.dispatchTouchEvent(motionEvent);
    }

    @Override // defpackage.whb
    public final void zza() {
        if (((Boolean) pla.c().a(mpa.S1)).booleanValue()) {
            this.e.a();
        }
        l("ended", new String[0]);
        k();
    }

    @Override // defpackage.whb
    public final void zzb(String str, String str2) {
        l("error", "what", str, "extra", str2);
    }

    @Override // defpackage.whb
    public final void zzd() {
        l("pause", new String[0]);
        k();
        this.h = false;
    }

    @Override // defpackage.whb
    public final void zze() {
        if (((Boolean) pla.c().a(mpa.S1)).booleanValue()) {
            this.e.b();
        }
        if (this.a.zzi() != null && !this.i) {
            boolean z = (this.a.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.j = z;
            if (!z) {
                this.a.zzi().getWindow().addFlags(128);
                this.i = true;
            }
        }
        this.h = true;
    }

    @Override // defpackage.whb
    public final void zzf() {
        xhb xhbVar = this.g;
        if (xhbVar != null && this.m == 0) {
            float l = xhbVar.l();
            xhb xhbVar2 = this.g;
            l("canplaythrough", "duration", String.valueOf(l / 1000.0f), "videoWidth", String.valueOf(xhbVar2.n()), "videoHeight", String.valueOf(xhbVar2.m()));
        }
    }

    @Override // defpackage.whb
    public final void zzg() {
        this.c.setVisibility(4);
        wxf.l.post(new Runnable() { // from class: aib
            @Override // java.lang.Runnable
            public final void run() {
                fib.this.r();
            }
        });
    }

    @Override // defpackage.whb
    public final void zzh() {
        this.e.b();
        wxf.l.post(new cib(this));
    }

    @Override // defpackage.whb
    public final void zzi() {
        if (this.u && this.s != null && !m()) {
            this.t.setImageBitmap(this.s);
            this.t.invalidate();
            this.b.addView(this.t, new FrameLayout.LayoutParams(-1, -1));
            this.b.bringChildToFront(this.t);
        }
        this.e.a();
        this.m = this.l;
        wxf.l.post(new dib(this));
    }

    @Override // defpackage.whb
    public final void zzk() {
        if (this.h && m()) {
            this.b.removeView(this.t);
        }
        if (this.g == null || this.s == null) {
            return;
        }
        long elapsedRealtime = dyf.b().elapsedRealtime();
        if (this.g.getBitmap(this.s) != null) {
            this.u = true;
        }
        long elapsedRealtime2 = dyf.b().elapsedRealtime() - elapsedRealtime;
        if (pzc.m()) {
            pzc.k("Spinner frame grab took " + elapsedRealtime2 + "ms");
        }
        if (elapsedRealtime2 > this.f) {
            fgb.g("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.k = false;
            this.s = null;
            eqa eqaVar = this.d;
            if (eqaVar != null) {
                eqaVar.d("spinner_jank", Long.toString(elapsedRealtime2));
            }
        }
    }
}
