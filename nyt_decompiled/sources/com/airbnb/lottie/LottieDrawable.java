package com.airbnb.lottie;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.LottieDrawable;
import com.amazonaws.services.s3.model.InstructionFileId;
import defpackage.bd4;
import defpackage.bf4;
import defpackage.cd4;
import defpackage.gw3;
import defpackage.hm2;
import defpackage.im2;
import defpackage.j94;
import defpackage.jm2;
import defpackage.lf3;
import defpackage.nu4;
import defpackage.qf3;
import defpackage.rc4;
import defpackage.sh8;
import defpackage.wc4;
import defpackage.yx3;
import defpackage.yy3;
import defpackage.zc4;
import defpackage.zx3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {
    private static final boolean q0 = false;
    private static final List r0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    private static final Executor s0 = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new zc4());
    private RenderMode B;
    private boolean H;
    private final Matrix L;
    private Bitmap M;
    private Canvas N;
    private Rect Q;
    private RectF S;
    private Paint X;
    private Rect Y;
    private Rect Z;
    private LottieComposition a;
    private final bd4 b;
    private boolean c;
    private boolean d;
    private boolean e;
    private RectF e0;
    private OnVisibleAction f;
    private RectF f0;
    private final ArrayList g;
    private Matrix g0;
    private qf3 h;
    private Matrix h0;
    private String i;
    private boolean i0;
    private jm2 j;
    private AsyncUpdates j0;
    private Map k;
    private final ValueAnimator.AnimatorUpdateListener k0;
    String l;
    private final Semaphore l0;
    private boolean m;
    private Handler m0;
    private boolean n;
    private Runnable n0;
    private final Runnable o0;
    private float p0;
    private boolean r;
    private com.airbnb.lottie.model.layer.b s;
    private int t;
    private boolean u;
    private boolean w;
    private boolean x;
    private boolean y;

    private enum OnVisibleAction {
        NONE,
        PLAY,
        RESUME
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        void a(LottieComposition lottieComposition);
    }

    public LottieDrawable() {
        bd4 bd4Var = new bd4();
        this.b = bd4Var;
        this.c = true;
        this.d = false;
        this.e = false;
        this.f = OnVisibleAction.NONE;
        this.g = new ArrayList();
        this.n = false;
        this.r = true;
        this.t = 255;
        this.y = false;
        this.B = RenderMode.AUTOMATIC;
        this.H = false;
        this.L = new Matrix();
        this.i0 = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: nc4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LottieDrawable.this.i0(valueAnimator);
            }
        };
        this.k0 = animatorUpdateListener;
        this.l0 = new Semaphore(1);
        this.o0 = new Runnable() { // from class: oc4
            @Override // java.lang.Runnable
            public final void run() {
                LottieDrawable.this.k0();
            }
        };
        this.p0 = -3.4028235E38f;
        bd4Var.addUpdateListener(animatorUpdateListener);
    }

    private void C0(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    private void D(int i, int i2) {
        Bitmap bitmap = this.M;
        if (bitmap == null || bitmap.getWidth() < i || this.M.getHeight() < i2) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.M = createBitmap;
            this.N.setBitmap(createBitmap);
            this.i0 = true;
            return;
        }
        if (this.M.getWidth() > i || this.M.getHeight() > i2) {
            Bitmap createBitmap2 = Bitmap.createBitmap(this.M, 0, 0, i, i2);
            this.M = createBitmap2;
            this.N.setBitmap(createBitmap2);
            this.i0 = true;
        }
    }

    private void E() {
        if (this.N != null) {
            return;
        }
        this.N = new Canvas();
        this.f0 = new RectF();
        this.g0 = new Matrix();
        this.h0 = new Matrix();
        this.Q = new Rect();
        this.S = new RectF();
        this.X = new zx3();
        this.Y = new Rect();
        this.Z = new Rect();
        this.e0 = new RectF();
    }

    private Context L() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private jm2 M() {
        if (getCallback() == null) {
            return null;
        }
        if (this.j == null) {
            jm2 jm2Var = new jm2(getCallback(), null);
            this.j = jm2Var;
            String str = this.l;
            if (str != null) {
                jm2Var.c(str);
            }
        }
        return this.j;
    }

    private qf3 O() {
        qf3 qf3Var = this.h;
        if (qf3Var != null && !qf3Var.b(L())) {
            this.h = null;
        }
        if (this.h == null) {
            this.h = new qf3(getCallback(), this.i, null, this.a.j());
        }
        return this.h;
    }

    private bf4 S() {
        Iterator it2 = r0.iterator();
        bf4 bf4Var = null;
        while (it2.hasNext()) {
            bf4Var = this.a.l((String) it2.next());
            if (bf4Var != null) {
                break;
            }
        }
        return bf4Var;
    }

    private boolean d0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (((View) callback).getParent() instanceof ViewGroup) {
            return !((ViewGroup) r2).getClipChildren();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0(gw3 gw3Var, Object obj, cd4 cd4Var, LottieComposition lottieComposition) {
        q(gw3Var, obj, cd4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0(ValueAnimator valueAnimator) {
        if (G()) {
            invalidateSelf();
            return;
        }
        com.airbnb.lottie.model.layer.b bVar = this.s;
        if (bVar != null) {
            bVar.M(this.b.k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0() {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    private boolean j1() {
        LottieComposition lottieComposition = this.a;
        if (lottieComposition == null) {
            return false;
        }
        float f = this.p0;
        float k = this.b.k();
        this.p0 = k;
        return Math.abs(k - f) * lottieComposition.d() >= 50.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0() {
        com.airbnb.lottie.model.layer.b bVar = this.s;
        if (bVar == null) {
            return;
        }
        try {
            this.l0.acquire();
            bVar.M(this.b.k());
            if (q0 && this.i0) {
                if (this.m0 == null) {
                    this.m0 = new Handler(Looper.getMainLooper());
                    this.n0 = new Runnable() { // from class: mc4
                        @Override // java.lang.Runnable
                        public final void run() {
                            LottieDrawable.this.j0();
                        }
                    };
                }
                this.m0.post(this.n0);
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            this.l0.release();
            throw th;
        }
        this.l0.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(LottieComposition lottieComposition) {
        y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(LottieComposition lottieComposition) {
        B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(int i, LottieComposition lottieComposition) {
        L0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(String str, LottieComposition lottieComposition) {
        R0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(int i, LottieComposition lottieComposition) {
        Q0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(float f, LottieComposition lottieComposition) {
        S0(f);
    }

    private boolean r() {
        return this.c || this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(String str, LottieComposition lottieComposition) {
        U0(str);
    }

    private void s() {
        LottieComposition lottieComposition = this.a;
        if (lottieComposition == null) {
            return;
        }
        com.airbnb.lottie.model.layer.b bVar = new com.airbnb.lottie.model.layer.b(this, yy3.a(lottieComposition), lottieComposition.k(), lottieComposition);
        this.s = bVar;
        if (this.w) {
            bVar.K(true);
        }
        this.s.Q(this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(int i, int i2, LottieComposition lottieComposition) {
        T0(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(int i, LottieComposition lottieComposition) {
        V0(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(String str, LottieComposition lottieComposition) {
        W0(str);
    }

    private void v() {
        LottieComposition lottieComposition = this.a;
        if (lottieComposition == null) {
            return;
        }
        this.H = this.B.useSoftwareRendering(Build.VERSION.SDK_INT, lottieComposition.q(), lottieComposition.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(float f, LottieComposition lottieComposition) {
        X0(f);
    }

    private void w(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(float f, LottieComposition lottieComposition) {
        a1(f);
    }

    private void x(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void z(Canvas canvas) {
        com.airbnb.lottie.model.layer.b bVar = this.s;
        LottieComposition lottieComposition = this.a;
        if (bVar == null || lottieComposition == null) {
            return;
        }
        this.L.reset();
        if (!getBounds().isEmpty()) {
            this.L.preScale(r2.width() / lottieComposition.b().width(), r2.height() / lottieComposition.b().height());
            this.L.preTranslate(r2.left, r2.top);
        }
        bVar.h(canvas, this.L, this.t);
    }

    private void z0(Canvas canvas, com.airbnb.lottie.model.layer.b bVar) {
        if (this.a == null || bVar == null) {
            return;
        }
        E();
        canvas.getMatrix(this.g0);
        canvas.getClipBounds(this.Q);
        w(this.Q, this.S);
        this.g0.mapRect(this.S);
        x(this.S, this.Q);
        if (this.r) {
            this.f0.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            bVar.d(this.f0, null, false);
        }
        this.g0.mapRect(this.f0);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        C0(this.f0, width, height);
        if (!d0()) {
            RectF rectF = this.f0;
            Rect rect = this.Q;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int ceil = (int) Math.ceil(this.f0.width());
        int ceil2 = (int) Math.ceil(this.f0.height());
        if (ceil <= 0 || ceil2 <= 0) {
            return;
        }
        D(ceil, ceil2);
        if (this.i0) {
            this.L.set(this.g0);
            this.L.preScale(width, height);
            Matrix matrix = this.L;
            RectF rectF2 = this.f0;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.M.eraseColor(0);
            bVar.h(this.N, this.L, this.t);
            this.g0.invert(this.h0);
            this.h0.mapRect(this.e0, this.f0);
            x(this.e0, this.Z);
        }
        this.Y.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.M, this.Y, this.Z, this.X);
    }

    public void A(boolean z) {
        if (this.m == z) {
            return;
        }
        this.m = z;
        if (this.a != null) {
            s();
        }
    }

    public List A0(gw3 gw3Var) {
        if (this.s == null) {
            j94.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.s.g(gw3Var, 0, arrayList, new gw3(new String[0]));
        return arrayList;
    }

    public boolean B() {
        return this.m;
    }

    public void B0() {
        if (this.s == null) {
            this.g.add(new a() { // from class: com.airbnb.lottie.h
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(LottieComposition lottieComposition) {
                    LottieDrawable.this.m0(lottieComposition);
                }
            });
            return;
        }
        v();
        if (r() || Y() == 0) {
            if (isVisible()) {
                this.b.w();
                this.f = OnVisibleAction.NONE;
            } else {
                this.f = OnVisibleAction.RESUME;
            }
        }
        if (r()) {
            return;
        }
        L0((int) (a0() < 0.0f ? U() : T()));
        this.b.i();
        if (isVisible()) {
            return;
        }
        this.f = OnVisibleAction.NONE;
    }

    public void C() {
        this.g.clear();
        this.b.i();
        if (isVisible()) {
            return;
        }
        this.f = OnVisibleAction.NONE;
    }

    public void D0(boolean z) {
        this.x = z;
    }

    public void E0(AsyncUpdates asyncUpdates) {
        this.j0 = asyncUpdates;
    }

    public AsyncUpdates F() {
        AsyncUpdates asyncUpdates = this.j0;
        return asyncUpdates != null ? asyncUpdates : yx3.d();
    }

    public void F0(boolean z) {
        if (z != this.y) {
            this.y = z;
            invalidateSelf();
        }
    }

    public boolean G() {
        return F() == AsyncUpdates.ENABLED;
    }

    public void G0(boolean z) {
        if (z != this.r) {
            this.r = z;
            com.airbnb.lottie.model.layer.b bVar = this.s;
            if (bVar != null) {
                bVar.Q(z);
            }
            invalidateSelf();
        }
    }

    public Bitmap H(String str) {
        qf3 O = O();
        if (O != null) {
            return O.a(str);
        }
        return null;
    }

    public boolean H0(LottieComposition lottieComposition) {
        if (this.a == lottieComposition) {
            return false;
        }
        this.i0 = true;
        u();
        this.a = lottieComposition;
        s();
        this.b.y(lottieComposition);
        a1(this.b.getAnimatedFraction());
        Iterator it2 = new ArrayList(this.g).iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (aVar != null) {
                aVar.a(lottieComposition);
            }
            it2.remove();
        }
        this.g.clear();
        lottieComposition.w(this.u);
        v();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public boolean I() {
        return this.y;
    }

    public void I0(String str) {
        this.l = str;
        jm2 M = M();
        if (M != null) {
            M.c(str);
        }
    }

    public boolean J() {
        return this.r;
    }

    public void J0(im2 im2Var) {
        jm2 jm2Var = this.j;
        if (jm2Var != null) {
            jm2Var.d(im2Var);
        }
    }

    public LottieComposition K() {
        return this.a;
    }

    public void K0(Map map) {
        if (map == this.k) {
            return;
        }
        this.k = map;
        invalidateSelf();
    }

    public void L0(final int i) {
        if (this.a == null) {
            this.g.add(new a() { // from class: com.airbnb.lottie.n
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(LottieComposition lottieComposition) {
                    LottieDrawable.this.n0(i, lottieComposition);
                }
            });
        } else {
            this.b.z(i);
        }
    }

    public void M0(boolean z) {
        this.d = z;
    }

    public int N() {
        return (int) this.b.l();
    }

    public void N0(lf3 lf3Var) {
        qf3 qf3Var = this.h;
        if (qf3Var != null) {
            qf3Var.d(lf3Var);
        }
    }

    public void O0(String str) {
        this.i = str;
    }

    public String P() {
        return this.i;
    }

    public void P0(boolean z) {
        this.n = z;
    }

    public rc4 Q(String str) {
        LottieComposition lottieComposition = this.a;
        if (lottieComposition == null) {
            return null;
        }
        return (rc4) lottieComposition.j().get(str);
    }

    public void Q0(final int i) {
        if (this.a == null) {
            this.g.add(new a() { // from class: com.airbnb.lottie.c
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(LottieComposition lottieComposition) {
                    LottieDrawable.this.p0(i, lottieComposition);
                }
            });
        } else {
            this.b.A(i + 0.99f);
        }
    }

    public boolean R() {
        return this.n;
    }

    public void R0(final String str) {
        LottieComposition lottieComposition = this.a;
        if (lottieComposition == null) {
            this.g.add(new a() { // from class: com.airbnb.lottie.i
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(LottieComposition lottieComposition2) {
                    LottieDrawable.this.o0(str, lottieComposition2);
                }
            });
            return;
        }
        bf4 l = lottieComposition.l(str);
        if (l != null) {
            Q0((int) (l.b + l.c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + InstructionFileId.DOT);
    }

    public void S0(final float f) {
        LottieComposition lottieComposition = this.a;
        if (lottieComposition == null) {
            this.g.add(new a() { // from class: com.airbnb.lottie.f
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(LottieComposition lottieComposition2) {
                    LottieDrawable.this.q0(f, lottieComposition2);
                }
            });
        } else {
            this.b.A(nu4.i(lottieComposition.p(), this.a.f(), f));
        }
    }

    public float T() {
        return this.b.n();
    }

    public void T0(final int i, final int i2) {
        if (this.a == null) {
            this.g.add(new a() { // from class: com.airbnb.lottie.g
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(LottieComposition lottieComposition) {
                    LottieDrawable.this.s0(i, i2, lottieComposition);
                }
            });
        } else {
            this.b.B(i, i2 + 0.99f);
        }
    }

    public float U() {
        return this.b.o();
    }

    public void U0(final String str) {
        LottieComposition lottieComposition = this.a;
        if (lottieComposition == null) {
            this.g.add(new a() { // from class: com.airbnb.lottie.b
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(LottieComposition lottieComposition2) {
                    LottieDrawable.this.r0(str, lottieComposition2);
                }
            });
            return;
        }
        bf4 l = lottieComposition.l(str);
        if (l != null) {
            int i = (int) l.b;
            T0(i, ((int) l.c) + i);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + InstructionFileId.DOT);
        }
    }

    public p V() {
        LottieComposition lottieComposition = this.a;
        if (lottieComposition != null) {
            return lottieComposition.n();
        }
        return null;
    }

    public void V0(final int i) {
        if (this.a == null) {
            this.g.add(new a() { // from class: com.airbnb.lottie.d
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(LottieComposition lottieComposition) {
                    LottieDrawable.this.t0(i, lottieComposition);
                }
            });
        } else {
            this.b.D(i);
        }
    }

    public float W() {
        return this.b.k();
    }

    public void W0(final String str) {
        LottieComposition lottieComposition = this.a;
        if (lottieComposition == null) {
            this.g.add(new a() { // from class: com.airbnb.lottie.j
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(LottieComposition lottieComposition2) {
                    LottieDrawable.this.u0(str, lottieComposition2);
                }
            });
            return;
        }
        bf4 l = lottieComposition.l(str);
        if (l != null) {
            V0((int) l.b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + InstructionFileId.DOT);
    }

    public RenderMode X() {
        return this.H ? RenderMode.SOFTWARE : RenderMode.HARDWARE;
    }

    public void X0(final float f) {
        LottieComposition lottieComposition = this.a;
        if (lottieComposition == null) {
            this.g.add(new a() { // from class: com.airbnb.lottie.l
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(LottieComposition lottieComposition2) {
                    LottieDrawable.this.v0(f, lottieComposition2);
                }
            });
        } else {
            V0((int) nu4.i(lottieComposition.p(), this.a.f(), f));
        }
    }

    public int Y() {
        return this.b.getRepeatCount();
    }

    public void Y0(boolean z) {
        if (this.w == z) {
            return;
        }
        this.w = z;
        com.airbnb.lottie.model.layer.b bVar = this.s;
        if (bVar != null) {
            bVar.K(z);
        }
    }

    public int Z() {
        return this.b.getRepeatMode();
    }

    public void Z0(boolean z) {
        this.u = z;
        LottieComposition lottieComposition = this.a;
        if (lottieComposition != null) {
            lottieComposition.w(z);
        }
    }

    public float a0() {
        return this.b.p();
    }

    public void a1(final float f) {
        if (this.a == null) {
            this.g.add(new a() { // from class: com.airbnb.lottie.m
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(LottieComposition lottieComposition) {
                    LottieDrawable.this.w0(f, lottieComposition);
                }
            });
            return;
        }
        yx3.b("Drawable#setProgress");
        this.b.z(this.a.h(f));
        yx3.c("Drawable#setProgress");
    }

    public sh8 b0() {
        return null;
    }

    public void b1(RenderMode renderMode) {
        this.B = renderMode;
        v();
    }

    public Typeface c0(hm2 hm2Var) {
        Map map = this.k;
        if (map != null) {
            String a2 = hm2Var.a();
            if (map.containsKey(a2)) {
                return (Typeface) map.get(a2);
            }
            String b = hm2Var.b();
            if (map.containsKey(b)) {
                return (Typeface) map.get(b);
            }
            String str = hm2Var.a() + "-" + hm2Var.c();
            if (map.containsKey(str)) {
                return (Typeface) map.get(str);
            }
        }
        jm2 M = M();
        if (M != null) {
            return M.b(hm2Var);
        }
        return null;
    }

    public void c1(int i) {
        this.b.setRepeatCount(i);
    }

    public void d1(int i) {
        this.b.setRepeatMode(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        com.airbnb.lottie.model.layer.b bVar = this.s;
        if (bVar == null) {
            return;
        }
        boolean G = G();
        if (G) {
            try {
                this.l0.acquire();
            } catch (InterruptedException unused) {
                yx3.c("Drawable#draw");
                if (!G) {
                    return;
                }
                this.l0.release();
                if (bVar.P() == this.b.k()) {
                    return;
                }
            } catch (Throwable th) {
                yx3.c("Drawable#draw");
                if (G) {
                    this.l0.release();
                    if (bVar.P() != this.b.k()) {
                        s0.execute(this.o0);
                    }
                }
                throw th;
            }
        }
        yx3.b("Drawable#draw");
        if (G && j1()) {
            a1(this.b.k());
        }
        if (this.e) {
            try {
                if (this.H) {
                    z0(canvas, bVar);
                } else {
                    z(canvas);
                }
            } catch (Throwable th2) {
                j94.b("Lottie crashed in draw!", th2);
            }
        } else if (this.H) {
            z0(canvas, bVar);
        } else {
            z(canvas);
        }
        this.i0 = false;
        yx3.c("Drawable#draw");
        if (G) {
            this.l0.release();
            if (bVar.P() == this.b.k()) {
                return;
            }
            s0.execute(this.o0);
        }
    }

    public boolean e0() {
        bd4 bd4Var = this.b;
        if (bd4Var == null) {
            return false;
        }
        return bd4Var.isRunning();
    }

    public void e1(boolean z) {
        this.e = z;
    }

    boolean f0() {
        if (isVisible()) {
            return this.b.isRunning();
        }
        OnVisibleAction onVisibleAction = this.f;
        return onVisibleAction == OnVisibleAction.PLAY || onVisibleAction == OnVisibleAction.RESUME;
    }

    public void f1(float f) {
        this.b.E(f);
    }

    public boolean g0() {
        return this.x;
    }

    public void g1(Boolean bool) {
        this.c = bool.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        LottieComposition lottieComposition = this.a;
        if (lottieComposition == null) {
            return -1;
        }
        return lottieComposition.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        LottieComposition lottieComposition = this.a;
        if (lottieComposition == null) {
            return -1;
        }
        return lottieComposition.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h1(sh8 sh8Var) {
    }

    public void i1(boolean z) {
        this.b.F(z);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.i0) {
            return;
        }
        this.i0 = true;
        if ((!q0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return e0();
    }

    public boolean k1() {
        return this.k == null && this.a.c().m() > 0;
    }

    public void q(final gw3 gw3Var, final Object obj, final cd4 cd4Var) {
        com.airbnb.lottie.model.layer.b bVar = this.s;
        if (bVar == null) {
            this.g.add(new a() { // from class: com.airbnb.lottie.e
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(LottieComposition lottieComposition) {
                    LottieDrawable.this.h0(gw3Var, obj, cd4Var, lottieComposition);
                }
            });
            return;
        }
        boolean z = true;
        if (gw3Var == gw3.c) {
            bVar.f(obj, cd4Var);
        } else if (gw3Var.d() != null) {
            gw3Var.d().f(obj, cd4Var);
        } else {
            List A0 = A0(gw3Var);
            for (int i = 0; i < A0.size(); i++) {
                ((gw3) A0.get(i)).d().f(obj, cd4Var);
            }
            z = true ^ A0.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (obj == wc4.E) {
                a1(W());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        j94.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            OnVisibleAction onVisibleAction = this.f;
            if (onVisibleAction == OnVisibleAction.PLAY) {
                y0();
            } else if (onVisibleAction == OnVisibleAction.RESUME) {
                B0();
            }
        } else if (this.b.isRunning()) {
            x0();
            this.f = OnVisibleAction.RESUME;
        } else if (isVisible) {
            this.f = OnVisibleAction.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        y0();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        C();
    }

    public void t() {
        this.g.clear();
        this.b.cancel();
        if (isVisible()) {
            return;
        }
        this.f = OnVisibleAction.NONE;
    }

    public void u() {
        if (this.b.isRunning()) {
            this.b.cancel();
            if (!isVisible()) {
                this.f = OnVisibleAction.NONE;
            }
        }
        this.a = null;
        this.s = null;
        this.h = null;
        this.p0 = -3.4028235E38f;
        this.b.h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public void x0() {
        this.g.clear();
        this.b.r();
        if (isVisible()) {
            return;
        }
        this.f = OnVisibleAction.NONE;
    }

    public void y(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.model.layer.b bVar = this.s;
        LottieComposition lottieComposition = this.a;
        if (bVar == null || lottieComposition == null) {
            return;
        }
        boolean G = G();
        if (G) {
            try {
                this.l0.acquire();
                if (j1()) {
                    a1(this.b.k());
                }
            } catch (InterruptedException unused) {
                if (!G) {
                    return;
                }
                this.l0.release();
                if (bVar.P() == this.b.k()) {
                    return;
                }
            } catch (Throwable th) {
                if (G) {
                    this.l0.release();
                    if (bVar.P() != this.b.k()) {
                        s0.execute(this.o0);
                    }
                }
                throw th;
            }
        }
        if (this.H) {
            canvas.save();
            canvas.concat(matrix);
            z0(canvas, bVar);
            canvas.restore();
        } else {
            bVar.h(canvas, matrix, this.t);
        }
        this.i0 = false;
        if (G) {
            this.l0.release();
            if (bVar.P() == this.b.k()) {
                return;
            }
            s0.execute(this.o0);
        }
    }

    public void y0() {
        if (this.s == null) {
            this.g.add(new a() { // from class: com.airbnb.lottie.k
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void a(LottieComposition lottieComposition) {
                    LottieDrawable.this.l0(lottieComposition);
                }
            });
            return;
        }
        v();
        if (r() || Y() == 0) {
            if (isVisible()) {
                this.b.s();
                this.f = OnVisibleAction.NONE;
            } else {
                this.f = OnVisibleAction.PLAY;
            }
        }
        if (r()) {
            return;
        }
        bf4 S = S();
        if (S != null) {
            L0((int) S.b);
        } else {
            L0((int) (a0() < 0.0f ? U() : T()));
        }
        this.b.i();
        if (isVisible()) {
            return;
        }
        this.f = OnVisibleAction.NONE;
    }
}
