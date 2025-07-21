package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.zzgaa;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nlc extends pta implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, qmc {
    public static final zzgaa r = zzgaa.w("2011", "1009", "3010");
    private final String a;
    private FrameLayout c;
    private FrameLayout d;
    private final kke e;
    private View f;
    private jkc h;
    private wia i;
    private jta k;
    private boolean l;
    private GestureDetector n;
    private Map b = new HashMap();
    private ee3 j = null;
    private boolean m = false;
    private final int g = 240304000;

    public nlc(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.c = frameLayout;
        this.d = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.a = str;
        dyf.z();
        ihb.a(frameLayout, this);
        dyf.z();
        ihb.b(frameLayout, this);
        this.e = pgb.e;
        this.i = new wia(this.c.getContext(), this.c);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void W(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.d.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.d.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] decode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e) {
                        fgb.h("Encountered invalid base64 watermark.", e);
                    }
                }
            }
            this.d.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void a() {
        if (!((Boolean) pla.c().a(mpa.Ua)).booleanValue() || this.h.H() == 0) {
            return;
        }
        this.n = new GestureDetector(this.c.getContext(), new wlc(this.h, this));
    }

    private final synchronized void c() {
        this.e.execute(new Runnable() { // from class: mlc
            @Override // java.lang.Runnable
            public final void run() {
                nlc.this.y6();
            }
        });
    }

    @Override // defpackage.qta
    public final synchronized void G5(ee3 ee3Var) {
        if (this.m) {
            return;
        }
        this.j = ee3Var;
    }

    @Override // defpackage.qta
    public final synchronized void I3(ee3 ee3Var) {
        this.h.s((View) fc5.Q1(ee3Var));
    }

    @Override // defpackage.qmc
    public final synchronized View K(String str) {
        WeakReference weakReference;
        if (!this.m && (weakReference = (WeakReference) this.b.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.qta
    public final synchronized void M1(ee3 ee3Var, int i) {
    }

    @Override // defpackage.qta
    public final void X(ee3 ee3Var) {
        onTouch(this.c, (MotionEvent) fc5.Q1(ee3Var));
    }

    @Override // defpackage.qta
    public final synchronized ee3 f(String str) {
        return fc5.l3(K(str));
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
        jkc jkcVar = this.h;
        if (jkcVar == null || !jkcVar.A()) {
            return;
        }
        this.h.Y();
        this.h.j(view, this.c, zzl(), zzm(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        jkc jkcVar = this.h;
        if (jkcVar != null) {
            FrameLayout frameLayout = this.c;
            jkcVar.h(frameLayout, zzl(), zzm(), jkc.D(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        jkc jkcVar = this.h;
        if (jkcVar != null) {
            FrameLayout frameLayout = this.c;
            jkcVar.h(frameLayout, zzl(), zzm(), jkc.D(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        jkc jkcVar = this.h;
        if (jkcVar != null) {
            jkcVar.q(view, motionEvent, this.c);
            if (((Boolean) pla.c().a(mpa.Ua)).booleanValue() && this.n != null && this.h.H() != 0) {
                this.n.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // defpackage.qta
    public final synchronized void u5(ee3 ee3Var) {
        if (this.m) {
            return;
        }
        Object Q1 = fc5.Q1(ee3Var);
        if (!(Q1 instanceof jkc)) {
            fgb.g("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        jkc jkcVar = this.h;
        if (jkcVar != null) {
            jkcVar.y(this);
        }
        c();
        jkc jkcVar2 = (jkc) Q1;
        this.h = jkcVar2;
        jkcVar2.x(this);
        this.h.p(this.c);
        this.h.X(this.d);
        if (this.l) {
            this.h.N().b(this.k);
        }
        if (((Boolean) pla.c().a(mpa.O3)).booleanValue() && !TextUtils.isEmpty(this.h.R())) {
            W(this.h.R());
        }
        a();
    }

    @Override // defpackage.qta
    public final synchronized void v0(jta jtaVar) {
        if (!this.m) {
            this.l = true;
            this.k = jtaVar;
            jkc jkcVar = this.h;
            if (jkcVar != null) {
                jkcVar.N().b(jtaVar);
            }
        }
    }

    @Override // defpackage.qta
    public final synchronized void v1(String str, ee3 ee3Var) {
        x4(str, (View) fc5.Q1(ee3Var), true);
    }

    @Override // defpackage.qmc
    public final synchronized void x4(String str, View view, boolean z) {
        if (!this.m) {
            if (view == null) {
                this.b.remove(str);
                return;
            }
            this.b.put(str, new WeakReference(view));
            if (!"1098".equals(str) && !"3011".equals(str)) {
                if (l9b.i(this.g)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    public final FrameLayout x6() {
        return this.c;
    }

    final /* synthetic */ void y6() {
        if (this.f == null) {
            View view = new View(this.c.getContext());
            this.f = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.c != this.f.getParent()) {
            this.c.addView(this.f);
        }
    }

    @Override // defpackage.qta
    public final synchronized void zzc() {
        try {
            if (this.m) {
                return;
            }
            jkc jkcVar = this.h;
            if (jkcVar != null) {
                jkcVar.y(this);
                this.h = null;
            }
            this.b.clear();
            this.c.removeAllViews();
            this.d.removeAllViews();
            this.b = null;
            this.c = null;
            this.d = null;
            this.f = null;
            this.i = null;
            this.m = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.qmc
    public final /* synthetic */ View zzf() {
        return this.c;
    }

    @Override // defpackage.qmc
    public final FrameLayout zzh() {
        return this.d;
    }

    @Override // defpackage.qmc
    public final wia zzi() {
        return this.i;
    }

    @Override // defpackage.qmc
    public final ee3 zzj() {
        return this.j;
    }

    @Override // defpackage.qmc
    public final synchronized String zzk() {
        return this.a;
    }

    @Override // defpackage.qmc
    public final synchronized Map zzl() {
        return this.b;
    }

    @Override // defpackage.qmc
    public final synchronized Map zzm() {
        return this.b;
    }

    @Override // defpackage.qmc
    public final synchronized Map zzn() {
        return null;
    }

    @Override // defpackage.qmc
    public final synchronized JSONObject zzo() {
        jkc jkcVar = this.h;
        if (jkcVar == null) {
            return null;
        }
        return jkcVar.T(this.c, zzl(), zzm());
    }

    @Override // defpackage.qmc
    public final synchronized JSONObject zzp() {
        jkc jkcVar = this.h;
        if (jkcVar == null) {
            return null;
        }
        return jkcVar.U(this.c, zzl(), zzm());
    }
}
