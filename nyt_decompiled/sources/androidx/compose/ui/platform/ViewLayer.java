package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.du7;
import defpackage.fd5;
import defpackage.fm1;
import defpackage.gl5;
import defpackage.gt2;
import defpackage.hn3;
import defpackage.ip5;
import defpackage.jm5;
import defpackage.kg4;
import defpackage.my4;
import defpackage.ph0;
import defpackage.qs2;
import defpackage.qt6;
import defpackage.ss2;
import defpackage.th0;
import defpackage.vd;
import defpackage.vm3;
import defpackage.wn0;
import defpackage.ww8;
import defpackage.xy3;
import defpackage.yu1;
import defpackage.zq3;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ViewLayer extends View implements jm5 {
    private static boolean B;
    private static boolean H;
    public static final b s = new b(null);
    public static final int t = 8;
    private static final gt2 u = new gt2() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1
        public final void b(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((View) obj, (Matrix) obj2);
            return ww8.a;
        }
    };
    private static final ViewOutlineProvider w = new a();
    private static Method x;
    private static Field y;
    private final AndroidComposeView a;
    private final yu1 b;
    private ss2 c;
    private qs2 d;
    private final gl5 e;
    private boolean f;
    private Rect g;
    private boolean h;
    private boolean i;
    private final th0 j;
    private final xy3 k;
    private long l;
    private boolean m;
    private final long n;
    private int r;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            zq3.f(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline d = ((ViewLayer) view).e.d();
            zq3.e(d);
            outline.set(d);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return ViewLayer.B;
        }

        public final boolean b() {
            return ViewLayer.H;
        }

        public final void c(boolean z) {
            ViewLayer.H = z;
        }

        public final void d(View view) {
            try {
                if (!a()) {
                    ViewLayer.B = true;
                    ViewLayer.x = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    ViewLayer.y = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    Method method = ViewLayer.x;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.y;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.y;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.x;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                c(true);
            }
        }

        private b() {
        }
    }

    private static final class c {
        public static final c a = new c();

        private c() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public ViewLayer(AndroidComposeView androidComposeView, yu1 yu1Var, ss2 ss2Var, qs2 qs2Var) {
        super(androidComposeView.getContext());
        this.a = androidComposeView;
        this.b = yu1Var;
        this.c = ss2Var;
        this.d = qs2Var;
        this.e = new gl5(androidComposeView.getDensity());
        this.j = new th0();
        this.k = new xy3(u);
        this.l = androidx.compose.ui.graphics.e.b.a();
        this.m = true;
        setWillNotDraw(false);
        yu1Var.addView(this);
        this.n = View.generateViewId();
    }

    private final ip5 getManualClipPath() {
        if (!getClipToOutline() || this.e.e()) {
            return null;
        }
        return this.e.c();
    }

    private final void setInvalidated(boolean z) {
        if (z != this.h) {
            this.h = z;
            this.a.j0(this, z);
        }
    }

    private final void v() {
        Rect rect;
        if (this.f) {
            Rect rect2 = this.g;
            if (rect2 == null) {
                this.g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                zq3.e(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void w() {
        setOutlineProvider(this.e.d() != null ? w : null);
    }

    @Override // defpackage.jm5
    public void a(float[] fArr) {
        kg4.k(fArr, this.k.b(this));
    }

    @Override // defpackage.jm5
    public void b(my4 my4Var, boolean z) {
        if (!z) {
            kg4.g(this.k.b(this), my4Var);
            return;
        }
        float[] a2 = this.k.a(this);
        if (a2 != null) {
            kg4.g(a2, my4Var);
        } else {
            my4Var.g(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    @Override // defpackage.jm5
    public long c(long j, boolean z) {
        if (!z) {
            return kg4.f(this.k.b(this), j);
        }
        float[] a2 = this.k.a(this);
        return a2 != null ? kg4.f(a2, j) : fd5.b.a();
    }

    @Override // defpackage.jm5
    public void d(long j) {
        int g = hn3.g(j);
        int f = hn3.f(j);
        if (g == getWidth() && f == getHeight()) {
            return;
        }
        float f2 = g;
        setPivotX(androidx.compose.ui.graphics.e.f(this.l) * f2);
        float f3 = f;
        setPivotY(androidx.compose.ui.graphics.e.g(this.l) * f3);
        this.e.i(du7.a(f2, f3));
        w();
        layout(getLeft(), getTop(), getLeft() + g, getTop() + f);
        v();
        this.k.c();
    }

    @Override // defpackage.jm5
    public void destroy() {
        setInvalidated(false);
        this.a.q0();
        this.c = null;
        this.d = null;
        this.a.o0(this);
        this.b.removeViewInLayout(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        boolean z;
        th0 th0Var = this.j;
        Canvas a2 = th0Var.a().a();
        th0Var.a().z(canvas);
        vd a3 = th0Var.a();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z = false;
        } else {
            a3.t();
            this.e.a(a3);
            z = true;
        }
        ss2 ss2Var = this.c;
        if (ss2Var != null) {
            ss2Var.invoke(a3);
        }
        if (z) {
            a3.k();
        }
        th0Var.a().z(a2);
        setInvalidated(false);
    }

    @Override // defpackage.jm5
    public void e(androidx.compose.ui.graphics.d dVar, LayoutDirection layoutDirection, fm1 fm1Var) {
        qs2 qs2Var;
        int k = dVar.k() | this.r;
        if ((k & ProgressEvent.PART_FAILED_EVENT_CODE) != 0) {
            long j0 = dVar.j0();
            this.l = j0;
            setPivotX(androidx.compose.ui.graphics.e.f(j0) * getWidth());
            setPivotY(androidx.compose.ui.graphics.e.g(this.l) * getHeight());
        }
        if ((k & 1) != 0) {
            setScaleX(dVar.D0());
        }
        if ((k & 2) != 0) {
            setScaleY(dVar.y1());
        }
        if ((k & 4) != 0) {
            setAlpha(dVar.d());
        }
        if ((k & 8) != 0) {
            setTranslationX(dVar.m1());
        }
        if ((k & 16) != 0) {
            setTranslationY(dVar.d1());
        }
        if ((k & 32) != 0) {
            setElevation(dVar.m());
        }
        if ((k & 1024) != 0) {
            setRotation(dVar.R());
        }
        if ((k & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0) {
            setRotationX(dVar.o1());
        }
        if ((k & 512) != 0) {
            setRotationY(dVar.M());
        }
        if ((k & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0) {
            setCameraDistancePx(dVar.f0());
        }
        boolean z = false;
        boolean z2 = getManualClipPath() != null;
        boolean z3 = dVar.f() && dVar.o() != qt6.a();
        if ((k & 24576) != 0) {
            this.f = dVar.f() && dVar.o() == qt6.a();
            v();
            setClipToOutline(z3);
        }
        boolean h = this.e.h(dVar.o(), dVar.d(), z3, dVar.m(), layoutDirection, fm1Var);
        if (this.e.b()) {
            w();
        }
        boolean z4 = getManualClipPath() != null;
        if (z2 != z4 || (z4 && h)) {
            invalidate();
        }
        if (!this.i && getElevation() > 0.0f && (qs2Var = this.d) != null) {
            qs2Var.mo865invoke();
        }
        if ((k & 7963) != 0) {
            this.k.c();
        }
        int i = Build.VERSION.SDK_INT;
        if ((k & 64) != 0) {
            u.a.a(this, wn0.k(dVar.e()));
        }
        if ((k & 128) != 0) {
            u.a.b(this, wn0.k(dVar.u()));
        }
        if (i >= 31 && (131072 & k) != 0) {
            v vVar = v.a;
            dVar.l();
            vVar.a(this, null);
        }
        if ((k & 32768) != 0) {
            int i2 = dVar.i();
            a.C0056a c0056a = androidx.compose.ui.graphics.a.a;
            if (androidx.compose.ui.graphics.a.e(i2, c0056a.c())) {
                setLayerType(2, null);
            } else if (androidx.compose.ui.graphics.a.e(i2, c0056a.b())) {
                setLayerType(0, null);
                this.m = z;
            } else {
                setLayerType(0, null);
            }
            z = true;
            this.m = z;
        }
        this.r = dVar.k();
    }

    @Override // defpackage.jm5
    public void f(ss2 ss2Var, qs2 qs2Var) {
        this.b.addView(this);
        this.f = false;
        this.i = false;
        this.l = androidx.compose.ui.graphics.e.b.a();
        this.c = ss2Var;
        this.d = qs2Var;
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // defpackage.jm5
    public boolean g(long j) {
        float o = fd5.o(j);
        float p = fd5.p(j);
        if (this.f) {
            return 0.0f <= o && o < ((float) getWidth()) && 0.0f <= p && p < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.e.f(j);
        }
        return true;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final yu1 getContainer() {
        return this.b;
    }

    public long getLayerId() {
        return this.n;
    }

    public final AndroidComposeView getOwnerView() {
        return this.a;
    }

    public long getOwnerViewId() {
        return c.a(this.a);
    }

    @Override // defpackage.jm5
    public void h(ph0 ph0Var) {
        boolean z = getElevation() > 0.0f;
        this.i = z;
        if (z) {
            ph0Var.n();
        }
        this.b.a(ph0Var, this, getDrawingTime());
        if (this.i) {
            ph0Var.u();
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.m;
    }

    @Override // defpackage.jm5
    public void i(float[] fArr) {
        float[] a2 = this.k.a(this);
        if (a2 != null) {
            kg4.k(fArr, a2);
        }
    }

    @Override // android.view.View, defpackage.jm5
    public void invalidate() {
        if (this.h) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.a.invalidate();
    }

    @Override // defpackage.jm5
    public void j(long j) {
        int j2 = vm3.j(j);
        if (j2 != getLeft()) {
            offsetLeftAndRight(j2 - getLeft());
            this.k.c();
        }
        int k = vm3.k(j);
        if (k != getTop()) {
            offsetTopAndBottom(k - getTop());
            this.k.c();
        }
    }

    @Override // defpackage.jm5
    public void k() {
        if (!this.h || H) {
            return;
        }
        s.d(this);
        setInvalidated(false);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    public final boolean u() {
        return this.h;
    }
}
