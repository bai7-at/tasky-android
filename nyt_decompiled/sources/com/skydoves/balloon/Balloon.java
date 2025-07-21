package com.skydoves.balloon;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.method.MovementMethod;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.f;
import com.skydoves.balloon.g;
import com.skydoves.balloon.h;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
import com.skydoves.balloon.overlay.BalloonOverlayAnimation;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
import defpackage.a00;
import defpackage.a13;
import defpackage.an3;
import defpackage.b40;
import defpackage.c04;
import defpackage.c44;
import defpackage.d40;
import defpackage.d44;
import defpackage.dg4;
import defpackage.du8;
import defpackage.e40;
import defpackage.ei1;
import defpackage.fh3;
import defpackage.g40;
import defpackage.ge5;
import defpackage.gt2;
import defpackage.h40;
import defpackage.he5;
import defpackage.i40;
import defpackage.ie5;
import defpackage.ik8;
import defpackage.je5;
import defpackage.k99;
import defpackage.ke5;
import defpackage.ll1;
import defpackage.mv1;
import defpackage.px0;
import defpackage.qm3;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.vb6;
import defpackage.ww8;
import defpackage.x99;
import defpackage.ym6;
import defpackage.z38;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* loaded from: classes4.dex */
public final class Balloon implements ei1 {
    public static final b n = new b(null);
    private static final c04 r = kotlin.c.a(new qs2() { // from class: com.skydoves.balloon.Balloon$Companion$channel$2
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Channel mo865invoke() {
            return ChannelKt.Channel$default(0, null, null, 7, null);
        }
    });
    private static final c04 s = kotlin.c.a(new qs2() { // from class: com.skydoves.balloon.Balloon$Companion$scope$2
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineScope mo865invoke() {
            return CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        }
    });
    private final Context a;
    private final a b;
    private final b40 c;
    private final d40 d;
    private final PopupWindow e;
    private final PopupWindow f;
    private BalloonAlign g;
    private boolean h;
    private boolean i;
    public ie5 j;
    private final c04 k;
    private final c04 l;
    private final c04 m;

    public static final class a {
        private int A;
        private boolean A0;
        private int B;
        private boolean B0;
        private int C;
        private boolean C0;
        private int D;
        private long D0;
        private int E;
        private d44 E0;
        private float F;
        private c44 F0;
        private float G;
        private int G0;
        private int H;
        private int H0;
        private Drawable I;
        private BalloonAnimation I0;
        private float J;
        private BalloonOverlayAnimation J0;
        private CharSequence K;
        private long K0;
        private int L;
        private BalloonHighlightAnimation L0;
        private boolean M;
        private int M0;
        private MovementMethod N;
        private long N0;
        private float O;
        private String O0;
        private int P;
        private int P0;
        private Typeface Q;
        private qs2 Q0;
        private Float R;
        private boolean R0;
        private Float S;
        private int S0;
        private boolean T;
        private boolean T0;
        private int U;
        private boolean U0;
        private h V;
        private boolean V0;
        private Drawable W;
        private boolean W0;
        private IconGravity X;
        private int Y;
        private int Z;
        private final Context a;
        private int a0;
        private int b;
        private int b0;
        private int c;
        private g c0;
        private int d;
        private CharSequence d0;
        private float e;
        private float e0;
        private float f;
        private float f0;
        private float g;
        private View g0;
        private int h;
        private Integer h0;
        private int i;
        private boolean i0;
        private int j;
        private int j0;
        private int k;
        private float k0;
        private int l;
        private int l0;
        private int m;
        private Point m0;
        private int n;
        private g40 n0;
        private int o;
        private int o0;
        private int p;
        private ge5 p0;
        private int q;
        private he5 q0;
        private boolean r;
        private ie5 r0;
        private int s;
        private je5 s0;
        private boolean t;
        private View.OnTouchListener t0;
        private int u;
        private View.OnTouchListener u0;
        private float v;
        private ke5 v0;
        private ArrowPositionRules w;
        private boolean w0;
        private ArrowOrientationRules x;
        private boolean x0;
        private ArrowOrientation y;
        private boolean y0;
        private Drawable z;
        private boolean z0;

        public a(Context context) {
            zq3.h(context, "context");
            this.a = context;
            this.b = RecyclerView.UNDEFINED_DURATION;
            this.d = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
            this.h = RecyclerView.UNDEFINED_DURATION;
            this.i = RecyclerView.UNDEFINED_DURATION;
            this.r = true;
            this.s = RecyclerView.UNDEFINED_DURATION;
            this.u = dg4.d(TypedValue.applyDimension(1, 12, Resources.getSystem().getDisplayMetrics()));
            this.v = 0.5f;
            this.w = ArrowPositionRules.ALIGN_BALLOON;
            this.x = ArrowOrientationRules.ALIGN_ANCHOR;
            this.y = ArrowOrientation.BOTTOM;
            this.F = 2.5f;
            this.H = -16777216;
            this.J = TypedValue.applyDimension(1, 5.0f, Resources.getSystem().getDisplayMetrics());
            z38 z38Var = z38.a;
            this.K = "";
            this.L = -1;
            this.O = 12.0f;
            this.T = true;
            this.U = 17;
            this.X = IconGravity.START;
            float f = 28;
            this.Y = dg4.d(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
            this.Z = dg4.d(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
            this.a0 = dg4.d(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics()));
            this.b0 = RecyclerView.UNDEFINED_DURATION;
            this.d0 = "";
            this.e0 = 1.0f;
            this.f0 = TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics());
            this.n0 = e40.a;
            this.o0 = 17;
            this.w0 = true;
            this.x0 = true;
            this.A0 = true;
            this.D0 = -1L;
            this.G0 = RecyclerView.UNDEFINED_DURATION;
            this.H0 = RecyclerView.UNDEFINED_DURATION;
            this.I0 = BalloonAnimation.FADE;
            this.J0 = BalloonOverlayAnimation.FADE;
            this.K0 = 500L;
            this.L0 = BalloonHighlightAnimation.NONE;
            this.M0 = RecyclerView.UNDEFINED_DURATION;
            this.P0 = 1;
            boolean z = context.getResources().getConfiguration().getLayoutDirection() == 1;
            this.R0 = z;
            this.S0 = ll1.b(1, z);
            this.T0 = true;
            this.U0 = true;
            this.V0 = true;
        }

        public final int A() {
            return this.H0;
        }

        public final int A0() {
            return this.P0;
        }

        public final a A1(boolean z) {
            this.C0 = z;
            return this;
        }

        public final i40 B() {
            return null;
        }

        public final int B0() {
            return this.S0;
        }

        public final a B1(int i) {
            if (i <= 0 && i != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("The width of the balloon must bigger than zero.");
            }
            this.b = dg4.d(TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics()));
            return this;
        }

        public final long C() {
            return this.K0;
        }

        public final CharSequence C0() {
            return this.K;
        }

        public final float D() {
            return this.J;
        }

        public final int D0() {
            return this.L;
        }

        public final boolean E() {
            return this.z0;
        }

        public final h E0() {
            return this.V;
        }

        public final boolean F() {
            return this.B0;
        }

        public final int F0() {
            return this.U;
        }

        public final boolean G() {
            return this.A0;
        }

        public final boolean G0() {
            return this.M;
        }

        public final boolean H() {
            return this.y0;
        }

        public final Float H0() {
            return this.S;
        }

        public final boolean I() {
            return this.x0;
        }

        public final Float I0() {
            return this.R;
        }

        public final boolean J() {
            return this.w0;
        }

        public final float J0() {
            return this.O;
        }

        public final float K() {
            return this.f0;
        }

        public final int K0() {
            return this.P;
        }

        public final int L() {
            return this.i;
        }

        public final Typeface L0() {
            return this.Q;
        }

        public final int M() {
            return this.b0;
        }

        public final int M0() {
            return this.b;
        }

        public final Drawable N() {
            return this.W;
        }

        public final float N0() {
            return this.e;
        }

        public final g O() {
            return this.c0;
        }

        public final boolean O0() {
            return this.V0;
        }

        public final IconGravity P() {
            return this.X;
        }

        public final boolean P0() {
            return this.T0;
        }

        public final int Q() {
            return this.Z;
        }

        public final boolean Q0() {
            return this.R0;
        }

        public final int R() {
            return this.a0;
        }

        public final boolean R0() {
            return this.U0;
        }

        public final int S() {
            return this.Y;
        }

        public final boolean S0() {
            return this.r;
        }

        public final View T() {
            return this.g0;
        }

        public final boolean T0() {
            return this.i0;
        }

        public final Integer U() {
            return this.h0;
        }

        public final a U0(int i) {
            this.s = i;
            return this;
        }

        public final c44 V() {
            return this.F0;
        }

        public final a V0(Drawable drawable) {
            this.z = drawable != null ? drawable.mutate() : null;
            if (drawable != null && this.u == Integer.MIN_VALUE) {
                this.u = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
            return this;
        }

        public final d44 W() {
            return this.E0;
        }

        public final a W0(int i) {
            V0(px0.b(this.a, i));
            return this;
        }

        public final int X() {
            return this.q;
        }

        public final a X0(int i) {
            this.G = dg4.d(TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics()));
            return this;
        }

        public final int Y() {
            return this.o;
        }

        public final a Y0(ArrowOrientation arrowOrientation) {
            zq3.h(arrowOrientation, "value");
            this.y = arrowOrientation;
            return this;
        }

        public final int Z() {
            return this.n;
        }

        public final a Z0(ArrowOrientationRules arrowOrientationRules) {
            zq3.h(arrowOrientationRules, "value");
            this.x = arrowOrientationRules;
            return this;
        }

        public final Balloon a() {
            return new Balloon(this.a, this, null);
        }

        public final int a0() {
            return this.p;
        }

        public final a a1(float f) {
            this.v = f;
            return this;
        }

        public final float b() {
            return this.e0;
        }

        public final int b0() {
            return this.d;
        }

        public final a b1(ArrowPositionRules arrowPositionRules) {
            zq3.h(arrowPositionRules, "value");
            this.w = arrowPositionRules;
            return this;
        }

        public final int c() {
            return this.E;
        }

        public final float c0() {
            return this.g;
        }

        public final /* synthetic */ void c1(ArrowPositionRules arrowPositionRules) {
            zq3.h(arrowPositionRules, "<set-?>");
            this.w = arrowPositionRules;
        }

        public final float d() {
            return this.F;
        }

        public final int d0() {
            return this.c;
        }

        public final a d1(int i) {
            int i2 = RecyclerView.UNDEFINED_DURATION;
            if (i != Integer.MIN_VALUE) {
                i2 = dg4.d(TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics()));
            }
            this.u = i2;
            return this;
        }

        public final int e() {
            return this.D;
        }

        public final float e0() {
            return this.f;
        }

        public final a e1(int i) {
            this.H = px0.a(this.a, i);
            return this;
        }

        public final int f() {
            return this.s;
        }

        public final MovementMethod f0() {
            return this.N;
        }

        public final a f1(BalloonAnimation balloonAnimation) {
            zq3.h(balloonAnimation, "value");
            this.I0 = balloonAnimation;
            if (balloonAnimation == BalloonAnimation.CIRCULAR) {
                l1(false);
            }
            return this;
        }

        public final boolean g() {
            return this.t;
        }

        public final ge5 g0() {
            return this.p0;
        }

        public final a g1(float f) {
            this.J = TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
            return this;
        }

        public final Drawable h() {
            return this.z;
        }

        public final he5 h0() {
            return this.q0;
        }

        public final a h1(boolean z) {
            this.z0 = z;
            return this;
        }

        public final float i() {
            return this.G;
        }

        public final ie5 i0() {
            return this.r0;
        }

        public final a i1(boolean z) {
            this.A0 = z;
            return this;
        }

        public final int j() {
            return this.A;
        }

        public final je5 j0() {
            return this.s0;
        }

        public final a j1(boolean z) {
            this.x0 = z;
            return this;
        }

        public final ArrowOrientation k() {
            return this.y;
        }

        public final ke5 k0() {
            return this.v0;
        }

        public final a k1(boolean z) {
            this.w0 = z;
            if (!z) {
                l1(z);
            }
            return this;
        }

        public final ArrowOrientationRules l() {
            return this.x;
        }

        public final View.OnTouchListener l0() {
            return this.u0;
        }

        public final a l1(boolean z) {
            this.T0 = z;
            return this;
        }

        public final float m() {
            return this.v;
        }

        public final View.OnTouchListener m0() {
            return this.t0;
        }

        public final a m1(int i) {
            if (i <= 0 && i != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("The height of the balloon must bigger than zero.");
            }
            this.i = dg4.d(TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics()));
            return this;
        }

        public final ArrowPositionRules n() {
            return this.w;
        }

        public final int n0() {
            return this.j0;
        }

        public final a n1(boolean z) {
            this.W0 = z;
            return this;
        }

        public final int o() {
            return this.B;
        }

        public final int o0() {
            return this.o0;
        }

        public final a o1(boolean z) {
            this.i0 = z;
            return this;
        }

        public final int p() {
            return this.u;
        }

        public final float p0() {
            return this.k0;
        }

        public final a p1(int i) {
            this.h0 = Integer.valueOf(i);
            return this;
        }

        public final int q() {
            return this.C;
        }

        public final int q0() {
            return this.l0;
        }

        public final a q1(View view) {
            zq3.h(view, "layout");
            this.g0 = view;
            return this;
        }

        public final long r() {
            return this.D0;
        }

        public final Point r0() {
            return this.m0;
        }

        public final a r1(d44 d44Var) {
            this.E0 = d44Var;
            return this;
        }

        public final int s() {
            return this.H;
        }

        public final g40 s0() {
            return this.n0;
        }

        public final a s1(int i) {
            t1(i);
            u1(i);
            return this;
        }

        public final Drawable t() {
            return this.I;
        }

        public final int t0() {
            return this.m;
        }

        public final a t1(int i) {
            this.o = dg4.d(TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics()));
            return this;
        }

        public final BalloonAnimation u() {
            return this.I0;
        }

        public final int u0() {
            return this.j;
        }

        public final a u1(int i) {
            this.n = dg4.d(TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics()));
            return this;
        }

        public final int v() {
            return this.G0;
        }

        public final int v0() {
            return this.l;
        }

        public final a v1(int i) {
            if (i <= 0 && i != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("The width of the balloon must bigger than zero.");
            }
            this.h = i;
            return this;
        }

        public final BalloonHighlightAnimation w() {
            return this.L0;
        }

        public final int w0() {
            return this.k;
        }

        public final /* synthetic */ a w1(qs2 qs2Var) {
            zq3.h(qs2Var, "block");
            this.q0 = new com.skydoves.balloon.b(qs2Var);
            return this;
        }

        public final long x() {
            return this.N0;
        }

        public final boolean x0() {
            return this.C0;
        }

        public final /* synthetic */ a x1(ss2 ss2Var) {
            zq3.h(ss2Var, "block");
            this.r0 = new com.skydoves.balloon.c(ss2Var);
            return this;
        }

        public final int y() {
            return this.M0;
        }

        public final String y0() {
            return this.O0;
        }

        public final a y1(int i) {
            this.j0 = px0.a(this.a, i);
            return this;
        }

        public final BalloonOverlayAnimation z() {
            return this.J0;
        }

        public final qs2 z0() {
            return this.Q0;
        }

        public final a z1(g40 g40Var) {
            zq3.h(g40Var, "value");
            this.n0 = g40Var;
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;
        public static final /* synthetic */ int[] f;
        public static final /* synthetic */ int[] g;
        public static final /* synthetic */ int[] h;

        static {
            int[] iArr = new int[ArrowOrientation.values().length];
            try {
                iArr[ArrowOrientation.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ArrowOrientation.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ArrowOrientation.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ArrowOrientation.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[ArrowPositionRules.values().length];
            try {
                iArr2[ArrowPositionRules.ALIGN_BALLOON.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ArrowPositionRules.ALIGN_ANCHOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
            int[] iArr3 = new int[BalloonAnimation.values().length];
            try {
                iArr3[BalloonAnimation.ELASTIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[BalloonAnimation.CIRCULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[BalloonAnimation.FADE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[BalloonAnimation.OVERSHOOT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[BalloonAnimation.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            c = iArr3;
            int[] iArr4 = new int[BalloonOverlayAnimation.values().length];
            try {
                iArr4[BalloonOverlayAnimation.FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            d = iArr4;
            int[] iArr5 = new int[BalloonHighlightAnimation.values().length];
            try {
                iArr5[BalloonHighlightAnimation.HEARTBEAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[BalloonHighlightAnimation.SHAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[BalloonHighlightAnimation.BREATH.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[BalloonHighlightAnimation.ROTATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            e = iArr5;
            int[] iArr6 = new int[PlacementType.values().length];
            try {
                iArr6[PlacementType.DROPDOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[PlacementType.ALIGNMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[PlacementType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            f = iArr6;
            int[] iArr7 = new int[BalloonAlign.values().length];
            try {
                iArr7[BalloonAlign.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr7[BalloonAlign.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr7[BalloonAlign.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr7[BalloonAlign.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            g = iArr7;
            int[] iArr8 = new int[BalloonCenterAlign.values().length];
            try {
                iArr8[BalloonCenterAlign.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr8[BalloonCenterAlign.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr8[BalloonCenterAlign.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr8[BalloonCenterAlign.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused27) {
            }
            h = iArr8;
        }
    }

    public static final class d implements Runnable {
        final /* synthetic */ View a;
        final /* synthetic */ long b;
        final /* synthetic */ qs2 c;

        public static final class a extends AnimatorListenerAdapter {
            final /* synthetic */ qs2 a;

            public a(qs2 qs2Var) {
                this.a = qs2Var;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                zq3.h(animator, "animation");
                super.onAnimationEnd(animator);
                this.a.mo865invoke();
            }
        }

        public d(View view, long j, qs2 qs2Var) {
            this.a = view;
            this.b = j;
            this.c = qs2Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.a.isAttachedToWindow()) {
                View view = this.a;
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, (view.getLeft() + this.a.getRight()) / 2, (this.a.getTop() + this.a.getBottom()) / 2, Math.max(this.a.getWidth(), this.a.getHeight()), 0.0f);
                createCircularReveal.setDuration(this.b);
                createCircularReveal.start();
                createCircularReveal.addListener(new a(this.c));
            }
        }
    }

    public static final class e implements View.OnTouchListener {
        final /* synthetic */ je5 b;

        e(je5 je5Var) {
            this.b = je5Var;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            zq3.h(view, "view");
            zq3.h(motionEvent, "event");
            if (motionEvent.getAction() == 4) {
                if (Balloon.this.b.J()) {
                    Balloon.this.A();
                }
                je5 je5Var = this.b;
                if (je5Var != null) {
                    je5Var.a(view, motionEvent);
                }
                return true;
            }
            if (!Balloon.this.b.I() || motionEvent.getAction() != 1) {
                return false;
            }
            zq3.g(Balloon.this.c.g, "balloonWrapper");
            if (x99.e(r0).x <= motionEvent.getRawX()) {
                zq3.g(Balloon.this.c.g, "balloonWrapper");
                if (x99.e(r0).x + Balloon.this.c.g.getMeasuredWidth() >= motionEvent.getRawX()) {
                    return false;
                }
            }
            if (Balloon.this.b.J()) {
                Balloon.this.A();
            }
            je5 je5Var2 = this.b;
            if (je5Var2 != null) {
                je5Var2.a(view, motionEvent);
            }
            return true;
        }
    }

    public /* synthetic */ Balloon(Context context, a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A0(gt2 gt2Var, View view, MotionEvent motionEvent) {
        zq3.h(gt2Var, "$tmp0");
        return ((Boolean) gt2Var.invoke(view, motionEvent)).booleanValue();
    }

    private final Bitmap C(Drawable drawable, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        zq3.g(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private final void C0(final h40 h40Var) {
        final View b2 = h40Var.b();
        if (y(b2)) {
            b2.post(new Runnable() { // from class: v30
                @Override // java.lang.Runnable
                public final void run() {
                    Balloon.D0(Balloon.this, b2, h40Var);
                }
            });
        } else if (this.b.H()) {
            A();
        }
    }

    private final float D(View view) {
        FrameLayout frameLayout = this.c.e;
        zq3.g(frameLayout, "balloonContent");
        int i = x99.e(frameLayout).x;
        int i2 = x99.e(view).x;
        float T = T();
        float S = ((S() - T) - this.b.Z()) - this.b.Y();
        int i3 = c.b[this.b.n().ordinal()];
        if (i3 == 1) {
            return (this.c.g.getWidth() * this.b.m()) - (this.b.p() * 0.5f);
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (view.getWidth() + i2 < i) {
            return T;
        }
        if (S() + i >= i2) {
            float f = i2;
            float f2 = i;
            float width = (((view.getWidth() * this.b.m()) + f) - f2) - (this.b.p() * 0.5f);
            float width2 = f + (view.getWidth() * this.b.m());
            if (width2 - (this.b.p() * 0.5f) <= f2) {
                return 0.0f;
            }
            if (width2 - (this.b.p() * 0.5f) > f2 && view.getWidth() <= (S() - this.b.Z()) - this.b.Y()) {
                return (width2 - (this.b.p() * 0.5f)) - f2;
            }
            if (width <= O()) {
                return T;
            }
            if (width <= S() - O()) {
                return width;
            }
        }
        return S;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(Balloon balloon, View view, h40 h40Var) {
        zq3.h(balloon, "this$0");
        zq3.h(view, "$mainAnchor");
        zq3.h(h40Var, "$placement");
        boolean y = balloon.y(view);
        Boolean valueOf = Boolean.valueOf(y);
        if (!y) {
            valueOf = null;
        }
        if (valueOf != null) {
            String y0 = balloon.b.y0();
            if (y0 != null) {
                if (!balloon.J().g(y0, balloon.b.A0())) {
                    qs2 z0 = balloon.b.z0();
                    if (z0 != null) {
                        z0.mo865invoke();
                        return;
                    }
                    return;
                }
                balloon.J().f(y0);
            }
            balloon.h = true;
            balloon.g = h40Var.a();
            long r2 = balloon.b.r();
            if (r2 != -1) {
                balloon.B(r2);
            }
            if (balloon.V()) {
                RadiusLayout radiusLayout = balloon.c.d;
                zq3.g(radiusLayout, "balloonCard");
                balloon.M0(radiusLayout);
            } else {
                VectorTextView vectorTextView = balloon.c.f;
                zq3.g(vectorTextView, "balloonText");
                RadiusLayout radiusLayout2 = balloon.c.d;
                zq3.g(radiusLayout2, "balloonCard");
                balloon.i0(vectorTextView, radiusLayout2);
            }
            balloon.c.getRoot().measure(0, 0);
            balloon.e.setWidth(balloon.S());
            balloon.e.setHeight(balloon.Q());
            balloon.c.f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            balloon.W(view);
            balloon.Z();
            balloon.u();
            balloon.H0(view, h40Var.c());
            balloon.j0(view);
            balloon.t();
            balloon.I0();
            Pair x = balloon.x(h40Var);
            balloon.e.showAsDropDown(view, ((Number) x.a()).intValue(), ((Number) x.b()).intValue());
        }
    }

    private final float E(View view) {
        int d2 = x99.d(view, this.b.R0());
        FrameLayout frameLayout = this.c.e;
        zq3.g(frameLayout, "balloonContent");
        int i = x99.e(frameLayout).y - d2;
        int i2 = x99.e(view).y - d2;
        float T = T();
        float Q = ((Q() - T) - this.b.a0()) - this.b.X();
        int p = this.b.p() / 2;
        int i3 = c.b[this.b.n().ordinal()];
        if (i3 == 1) {
            return (this.c.g.getHeight() * this.b.m()) - p;
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (view.getHeight() + i2 < i) {
            return T;
        }
        if (Q() + i >= i2) {
            float height = (((view.getHeight() * this.b.m()) + i2) - i) - p;
            if (height <= O()) {
                return T;
            }
            if (height <= Q() - O()) {
                return height;
            }
        }
        return Q;
    }

    private final BitmapDrawable F(ImageView imageView, float f, float f2) {
        if (this.b.g() && a13.a()) {
            return new BitmapDrawable(imageView.getResources(), q(imageView, f, f2));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a00 G() {
        return (a00) this.l.getValue();
    }

    public static /* synthetic */ void G0(Balloon balloon, View view, int i, int i2, BalloonCenterAlign balloonCenterAlign, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            balloonCenterAlign = BalloonCenterAlign.TOP;
        }
        balloon.F0(view, i, i2, balloonCenterAlign);
    }

    private final void H0(View view, List list) {
        if (this.b.T0()) {
            if (list.isEmpty()) {
                this.d.b.setAnchorView(view);
            } else {
                this.d.b.setAnchorViewList(i.G0(list, view));
            }
            this.f.showAtLocation(view, this.b.o0(), 0, 0);
        }
    }

    private final Animation I() {
        int y;
        if (this.b.y() == Integer.MIN_VALUE) {
            int i = c.e[this.b.w().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    int i2 = c.a[this.b.k().ordinal()];
                    if (i2 == 1) {
                        y = vb6.balloon_shake_top;
                    } else if (i2 == 2) {
                        y = vb6.balloon_shake_bottom;
                    } else if (i2 == 3) {
                        y = vb6.balloon_shake_right;
                    } else {
                        if (i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        y = vb6.balloon_shake_left;
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        this.b.B();
                        return null;
                    }
                    y = vb6.balloon_fade;
                }
            } else if (this.b.S0()) {
                int i3 = c.a[this.b.k().ordinal()];
                if (i3 == 1) {
                    y = vb6.balloon_heartbeat_top;
                } else if (i3 == 2) {
                    y = vb6.balloon_heartbeat_bottom;
                } else if (i3 == 3) {
                    y = vb6.balloon_heartbeat_right;
                } else {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    y = vb6.balloon_heartbeat_left;
                }
            } else {
                y = vb6.balloon_heartbeat_center;
            }
        } else {
            y = this.b.y();
        }
        return AnimationUtils.loadAnimation(this.a, y);
    }

    private final void I0() {
        this.c.b.post(new Runnable() { // from class: y30
            @Override // java.lang.Runnable
            public final void run() {
                Balloon.J0(Balloon.this);
            }
        });
    }

    private final f J() {
        return (f) this.m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(final Balloon balloon) {
        zq3.h(balloon, "this$0");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: a40
            @Override // java.lang.Runnable
            public final void run() {
                Balloon.K0(Balloon.this);
            }
        }, balloon.b.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(Balloon balloon) {
        zq3.h(balloon, "this$0");
        Animation I = balloon.I();
        if (I != null) {
            balloon.c.b.startAnimation(I);
        }
    }

    private final Pair L(float f, float f2) {
        int pixel;
        int pixel2;
        Drawable background = this.c.d.getBackground();
        zq3.g(background, "getBackground(...)");
        Bitmap C = C(background, this.c.d.getWidth() + 1, this.c.d.getHeight() + 1);
        int i = c.a[this.b.k().ordinal()];
        if (i == 1 || i == 2) {
            int i2 = (int) f2;
            pixel = C.getPixel((int) ((this.b.p() * 0.5f) + f), i2);
            pixel2 = C.getPixel((int) (f - (this.b.p() * 0.5f)), i2);
        } else {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = (int) f;
            pixel = C.getPixel(i3, (int) ((this.b.p() * 0.5f) + f2));
            pixel2 = C.getPixel(i3, (int) (f2 - (this.b.p() * 0.5f)));
        }
        return new Pair(Integer.valueOf(pixel), Integer.valueOf(pixel2));
    }

    private final void L0() {
        FrameLayout frameLayout = this.c.b;
        Animation animation = frameLayout.getAnimation();
        if (animation != null) {
            zq3.e(animation);
            animation.cancel();
            animation.reset();
        }
        frameLayout.clearAnimation();
    }

    private final void M0(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            zq3.g(childAt, "getChildAt(index)");
            if (childAt instanceof TextView) {
                i0((TextView) childAt, viewGroup);
            } else if (childAt instanceof ViewGroup) {
                M0((ViewGroup) childAt);
            }
        }
    }

    private final void N0(h40 h40Var) {
        if (this.h) {
            R0(h40Var.b());
            Pair x = x(h40Var);
            this.e.update(h40Var.b(), ((Number) x.a()).intValue(), ((Number) x.b()).intValue(), S(), Q());
            if (this.b.T0()) {
                this.d.b.b();
            }
        }
    }

    private final int O() {
        return this.b.p() * 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler P() {
        return (Handler) this.k.getValue();
    }

    public static /* synthetic */ void P0(Balloon balloon, View view, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        balloon.O0(view, i, i2);
    }

    private final int R(int i, View view) {
        int Z;
        int p;
        int N0;
        int i2 = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        if (this.b.N() != null) {
            Z = this.b.S();
            p = this.b.R();
        } else {
            Z = this.b.Z() + this.b.Y();
            p = this.b.p() * 2;
        }
        int i3 = paddingLeft + Z + p;
        int b0 = this.b.b0() - i3;
        if (this.b.N0() != 0.0f) {
            N0 = (int) (i2 * this.b.N0());
        } else {
            if (this.b.e0() != 0.0f || this.b.c0() != 0.0f) {
                return uo6.i(i, ((int) (i2 * (this.b.c0() == 0.0f ? 1.0f : this.b.c0()))) - i3);
            }
            if (this.b.M0() == Integer.MIN_VALUE || this.b.M0() > i2) {
                return uo6.i(i, b0);
            }
            N0 = this.b.M0();
        }
        return N0 - i3;
    }

    private final void R0(View view) {
        ImageView imageView = this.c.c;
        int i = c.a[ArrowOrientation.Companion.a(this.b.k(), this.b.Q0()).ordinal()];
        if (i == 1) {
            imageView.setRotation(180.0f);
            imageView.setX(D(view));
            imageView.setY((this.c.d.getY() + this.c.d.getHeight()) - 1);
            k99.t0(imageView, this.b.i());
            zq3.e(imageView);
            imageView.setForeground(F(imageView, imageView.getX(), this.c.d.getHeight()));
            return;
        }
        if (i == 2) {
            imageView.setRotation(0.0f);
            imageView.setX(D(view));
            imageView.setY((this.c.d.getY() - this.b.p()) + 1);
            zq3.e(imageView);
            imageView.setForeground(F(imageView, imageView.getX(), 0.0f));
            return;
        }
        if (i == 3) {
            imageView.setRotation(-90.0f);
            imageView.setX((this.c.d.getX() - this.b.p()) + 1);
            imageView.setY(E(view));
            zq3.e(imageView);
            imageView.setForeground(F(imageView, 0.0f, imageView.getY()));
            return;
        }
        if (i != 4) {
            return;
        }
        imageView.setRotation(90.0f);
        imageView.setX((this.c.d.getX() + this.c.d.getWidth()) - 1);
        imageView.setY(E(view));
        zq3.e(imageView);
        imageView.setForeground(F(imageView, this.c.d.getWidth(), imageView.getY()));
    }

    private final float T() {
        return (this.b.p() * this.b.d()) + this.b.c();
    }

    private final boolean V() {
        return (this.b.U() == null && this.b.T() == null) ? false : true;
    }

    private final void W(final View view) {
        final ImageView imageView = this.c.c;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(this.b.p(), this.b.p()));
        imageView.setAlpha(this.b.b());
        Drawable h = this.b.h();
        if (h != null) {
            imageView.setImageDrawable(h);
        }
        imageView.setPadding(this.b.j(), this.b.q(), this.b.o(), this.b.e());
        if (this.b.f() != Integer.MIN_VALUE) {
            fh3.c(imageView, ColorStateList.valueOf(this.b.f()));
        } else {
            fh3.c(imageView, ColorStateList.valueOf(this.b.s()));
        }
        imageView.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        this.c.d.post(new Runnable() { // from class: z30
            @Override // java.lang.Runnable
            public final void run() {
                Balloon.X(Balloon.this, view, imageView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(Balloon balloon, View view, ImageView imageView) {
        zq3.h(balloon, "this$0");
        zq3.h(view, "$anchor");
        zq3.h(imageView, "$this_with");
        ie5 ie5Var = balloon.j;
        if (ie5Var != null) {
            ie5Var.a(balloon.M());
        }
        balloon.r(view);
        balloon.R0(view);
        x99.f(imageView, balloon.b.S0());
    }

    private final void Y() {
        RadiusLayout radiusLayout = this.c.d;
        radiusLayout.setAlpha(this.b.b());
        radiusLayout.setRadius(this.b.D());
        k99.t0(radiusLayout, this.b.K());
        Drawable t = this.b.t();
        Drawable drawable = t;
        if (t == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(this.b.s());
            gradientDrawable.setCornerRadius(this.b.D());
            drawable = gradientDrawable;
        }
        radiusLayout.setBackground(drawable);
        radiusLayout.setPadding(this.b.u0(), this.b.w0(), this.b.v0(), this.b.t0());
    }

    private final void Z() {
        int p = this.b.p() - 1;
        int K = (int) this.b.K();
        FrameLayout frameLayout = this.c.e;
        int i = c.a[this.b.k().ordinal()];
        if (i == 1) {
            frameLayout.setPadding(K, p, K, uo6.d(p, K));
            return;
        }
        if (i == 2) {
            frameLayout.setPadding(K, p, K, uo6.d(p, K));
        } else if (i == 3) {
            frameLayout.setPadding(p, K, p, K);
        } else {
            if (i != 4) {
                return;
            }
            frameLayout.setPadding(p, K, p, K);
        }
    }

    private final void a0() {
        if (V()) {
            f0();
        } else {
            g0();
            h0();
        }
    }

    private final void b0() {
        m0(this.b.g0());
        p0(this.b.h0());
        u0(this.b.j0());
        B0(this.b.m0());
        w0(this.b.k0());
        z0(this.b.l0());
    }

    private final void c0() {
        if (this.b.T0()) {
            BalloonAnchorOverlayView balloonAnchorOverlayView = this.d.b;
            balloonAnchorOverlayView.setOverlayColor(this.b.n0());
            balloonAnchorOverlayView.setOverlayPadding(this.b.p0());
            balloonAnchorOverlayView.setOverlayPosition(this.b.r0());
            balloonAnchorOverlayView.setBalloonOverlayShape(this.b.s0());
            balloonAnchorOverlayView.setOverlayPaddingColor(this.b.q0());
            this.f.setClippingEnabled(false);
        }
    }

    private final void d0() {
        ViewGroup.LayoutParams layoutParams = this.c.g.getLayoutParams();
        zq3.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(this.b.Y(), this.b.a0(), this.b.Z(), this.b.X());
    }

    private final void e0() {
        PopupWindow popupWindow = this.e;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(this.b.P0());
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setElevation(this.b.K());
        k0(this.b.O0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f0() {
        /*
            r4 = this;
            com.skydoves.balloon.Balloon$a r0 = r4.b
            java.lang.Integer r0 = r0.U()
            if (r0 == 0) goto L1d
            int r0 = r0.intValue()
            android.content.Context r1 = r4.a
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            b40 r2 = r4.c
            com.skydoves.balloon.radius.RadiusLayout r2 = r2.d
            r3 = 0
            android.view.View r0 = r1.inflate(r0, r2, r3)
            if (r0 != 0) goto L25
        L1d:
            com.skydoves.balloon.Balloon$a r0 = r4.b
            android.view.View r0 = r0.T()
            if (r0 == 0) goto L51
        L25:
            android.view.ViewParent r1 = r0.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L30
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L31
        L30:
            r1 = 0
        L31:
            if (r1 == 0) goto L36
            r1.removeView(r0)
        L36:
            b40 r1 = r4.c
            com.skydoves.balloon.radius.RadiusLayout r1 = r1.d
            r1.removeAllViews()
            b40 r1 = r4.c
            com.skydoves.balloon.radius.RadiusLayout r1 = r1.d
            r1.addView(r0)
            b40 r0 = r4.c
            com.skydoves.balloon.radius.RadiusLayout r0 = r0.d
            java.lang.String r1 = "balloonCard"
            defpackage.zq3.g(r0, r1)
            r4.M0(r0)
            return
        L51:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The custom layout is null."
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skydoves.balloon.Balloon.f0():void");
    }

    private final void g0() {
        ww8 ww8Var;
        VectorTextView vectorTextView = this.c.f;
        g O = this.b.O();
        if (O != null) {
            zq3.e(vectorTextView);
            ik8.b(vectorTextView, O);
            ww8Var = ww8.a;
        } else {
            ww8Var = null;
        }
        if (ww8Var == null) {
            zq3.e(vectorTextView);
            Context context = vectorTextView.getContext();
            zq3.g(context, "getContext(...)");
            g.a aVar = new g.a(context);
            aVar.j(this.b.N());
            aVar.o(this.b.S());
            aVar.m(this.b.Q());
            aVar.l(this.b.M());
            aVar.n(this.b.R());
            aVar.k(this.b.P());
            ik8.b(vectorTextView, aVar.a());
        }
        vectorTextView.s(this.b.Q0());
    }

    private final void h0() {
        ww8 ww8Var;
        VectorTextView vectorTextView = this.c.f;
        h E0 = this.b.E0();
        if (E0 != null) {
            zq3.e(vectorTextView);
            ik8.c(vectorTextView, E0);
            ww8Var = ww8.a;
        } else {
            ww8Var = null;
        }
        if (ww8Var == null) {
            zq3.e(vectorTextView);
            Context context = vectorTextView.getContext();
            zq3.g(context, "getContext(...)");
            h.a aVar = new h.a(context);
            aVar.m(this.b.C0());
            aVar.s(this.b.J0());
            aVar.n(this.b.D0());
            aVar.p(this.b.G0());
            aVar.o(this.b.F0());
            aVar.t(this.b.K0());
            aVar.u(this.b.L0());
            aVar.r(this.b.I0());
            aVar.q(this.b.H0());
            vectorTextView.setMovementMethod(this.b.f0());
            ik8.c(vectorTextView, aVar.a());
        }
        zq3.e(vectorTextView);
        RadiusLayout radiusLayout = this.c.d;
        zq3.g(radiusLayout, "balloonCard");
        i0(vectorTextView, radiusLayout);
    }

    private final void i0(TextView textView, View view) {
        int c2;
        int compoundPaddingStart;
        int compoundPaddingEnd;
        int measureText = (int) textView.getPaint().measureText(textView.getText().toString());
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        zq3.g(compoundDrawablesRelative, "getCompoundDrawablesRelative(...)");
        if (!mv1.e(compoundDrawablesRelative)) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            zq3.g(compoundDrawables, "getCompoundDrawables(...)");
            if (mv1.e(compoundDrawables)) {
                Drawable[] compoundDrawables2 = textView.getCompoundDrawables();
                zq3.g(compoundDrawables2, "getCompoundDrawables(...)");
                textView.setMinHeight(mv1.b(compoundDrawables2));
                Drawable[] compoundDrawables3 = textView.getCompoundDrawables();
                zq3.g(compoundDrawables3, "getCompoundDrawables(...)");
                c2 = mv1.c(compoundDrawables3);
                compoundPaddingStart = textView.getCompoundPaddingStart();
                compoundPaddingEnd = textView.getCompoundPaddingEnd();
            }
            textView.setMaxWidth(R(measureText, view));
        }
        Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
        zq3.g(compoundDrawablesRelative2, "getCompoundDrawablesRelative(...)");
        textView.setMinHeight(mv1.b(compoundDrawablesRelative2));
        Drawable[] compoundDrawablesRelative3 = textView.getCompoundDrawablesRelative();
        zq3.g(compoundDrawablesRelative3, "getCompoundDrawablesRelative(...)");
        c2 = mv1.c(compoundDrawablesRelative3);
        compoundPaddingStart = textView.getCompoundPaddingStart();
        compoundPaddingEnd = textView.getCompoundPaddingEnd();
        measureText += c2 + compoundPaddingStart + compoundPaddingEnd;
        textView.setMaxWidth(R(measureText, view));
    }

    private final void j0(final View view) {
        if (this.b.x0()) {
            y0(new gt2() { // from class: com.skydoves.balloon.Balloon$passTouchEventToAnchor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(View view2, MotionEvent motionEvent) {
                    boolean z;
                    zq3.h(view2, "view");
                    zq3.h(motionEvent, "event");
                    view2.performClick();
                    Rect rect = new Rect();
                    view.getGlobalVisibleRect(rect);
                    if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                        view.getRootView().dispatchTouchEvent(motionEvent);
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(ge5 ge5Var, Balloon balloon, View view) {
        zq3.h(balloon, "this$0");
        if (ge5Var != null) {
            zq3.e(view);
            ge5Var.a(view);
        }
        if (balloon.b.E()) {
            balloon.A();
        }
    }

    private final Bitmap q(ImageView imageView, float f, float f2) {
        LinearGradient linearGradient;
        int s2 = this.b.s();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(s2, mode);
        Drawable drawable = imageView.getDrawable();
        zq3.g(drawable, "getDrawable(...)");
        Bitmap C = C(drawable, imageView.getDrawable().getIntrinsicWidth(), imageView.getDrawable().getIntrinsicHeight());
        try {
            Pair L = L(f, f2);
            int intValue = ((Number) L.c()).intValue();
            int intValue2 = ((Number) L.d()).intValue();
            Bitmap createBitmap = Bitmap.createBitmap(C.getWidth(), C.getHeight(), Bitmap.Config.ARGB_8888);
            zq3.g(createBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawBitmap(C, 0.0f, 0.0f, (Paint) null);
            Paint paint = new Paint();
            int i = c.a[this.b.k().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                linearGradient = new LinearGradient((C.getWidth() / 2) + (this.b.p() * 0.5f), 0.0f, 0.0f, 0.0f, intValue, intValue2, Shader.TileMode.CLAMP);
                paint.setShader(linearGradient);
                paint.setXfermode(new PorterDuffXfermode(mode));
                canvas.drawRect(0.0f, 0.0f, C.getWidth(), C.getHeight(), paint);
                imageView.setColorFilter(0, mode);
                return createBitmap;
            }
            linearGradient = new LinearGradient((C.getWidth() / 2) - (this.b.p() * 0.5f), 0.0f, C.getWidth(), 0.0f, intValue, intValue2, Shader.TileMode.CLAMP);
            paint.setShader(linearGradient);
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.drawRect(0.0f, 0.0f, C.getWidth(), C.getHeight(), paint);
            imageView.setColorFilter(0, mode);
            return createBitmap;
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Arrow attached outside balloon. Could not get a matching color.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(Balloon balloon, he5 he5Var) {
        zq3.h(balloon, "this$0");
        balloon.L0();
        balloon.A();
        if (he5Var != null) {
            he5Var.a();
        }
    }

    private final void r(View view) {
        if (this.b.l() == ArrowOrientationRules.ALIGN_FIXED) {
            return;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        int[] iArr = {0, 0};
        this.e.getContentView().getLocationOnScreen(iArr);
        ArrowOrientation k = this.b.k();
        ArrowOrientation arrowOrientation = ArrowOrientation.TOP;
        if (k == arrowOrientation && iArr[1] < rect.bottom) {
            this.b.Y0(ArrowOrientation.BOTTOM);
        } else if (this.b.k() == ArrowOrientation.BOTTOM && iArr[1] > rect.top) {
            this.b.Y0(arrowOrientation);
        }
        ArrowOrientation k2 = this.b.k();
        ArrowOrientation arrowOrientation2 = ArrowOrientation.START;
        if (k2 == arrowOrientation2 && iArr[0] < rect.right) {
            this.b.Y0(ArrowOrientation.END);
        } else if (this.b.k() == ArrowOrientation.END && iArr[0] > rect.left) {
            this.b.Y0(arrowOrientation2);
        }
        Z();
    }

    private final void s(ViewGroup viewGroup) {
        viewGroup.setFitsSystemWindows(false);
        an3 u = uo6.u(0, viewGroup.getChildCount());
        ArrayList<View> arrayList = new ArrayList(i.w(u, 10));
        Iterator it2 = u.iterator();
        while (it2.hasNext()) {
            arrayList.add(viewGroup.getChildAt(((qm3) it2).c()));
        }
        for (View view : arrayList) {
            view.setFitsSystemWindows(false);
            if (view instanceof ViewGroup) {
                s((ViewGroup) view);
            }
        }
    }

    private final void t() {
        if (this.b.v() != Integer.MIN_VALUE) {
            this.e.setAnimationStyle(this.b.v());
            return;
        }
        int i = c.c[this.b.u().ordinal()];
        if (i == 1) {
            this.e.setAnimationStyle(ym6.Balloon_Elastic_Anim);
            return;
        }
        if (i == 2) {
            View contentView = this.e.getContentView();
            zq3.g(contentView, "getContentView(...)");
            x99.b(contentView, this.b.C());
            this.e.setAnimationStyle(ym6.Balloon_Normal_Dispose_Anim);
            return;
        }
        if (i == 3) {
            this.e.setAnimationStyle(ym6.Balloon_Fade_Anim);
        } else if (i == 4) {
            this.e.setAnimationStyle(ym6.Balloon_Overshoot_Anim);
        } else {
            if (i != 5) {
                return;
            }
            this.e.setAnimationStyle(ym6.Balloon_None_Anim);
        }
    }

    private final void u() {
        if (this.b.A() != Integer.MIN_VALUE) {
            this.f.setAnimationStyle(this.b.v());
            return;
        }
        if (c.d[this.b.z().ordinal()] == 1) {
            this.f.setAnimationStyle(ym6.Balloon_Fade_Anim);
        } else {
            this.f.setAnimationStyle(ym6.Balloon_Normal_Anim);
        }
    }

    private final Pair v(h40 h40Var) {
        View b2 = h40Var.b();
        int d2 = dg4.d(b2.getMeasuredWidth() * 0.5f);
        int d3 = dg4.d(b2.getMeasuredHeight() * 0.5f);
        int d4 = dg4.d(S() * 0.5f);
        int d5 = dg4.d(Q() * 0.5f);
        int e2 = h40Var.e();
        int f = h40Var.f();
        int i = c.g[h40Var.a().ordinal()];
        if (i == 1) {
            return du8.a(Integer.valueOf(this.b.B0() * ((d2 - d4) + e2)), Integer.valueOf((-(Q() + b2.getMeasuredHeight())) + f));
        }
        if (i == 2) {
            return du8.a(Integer.valueOf(this.b.B0() * ((d2 - d4) + e2)), Integer.valueOf(f));
        }
        if (i == 3) {
            return du8.a(Integer.valueOf(this.b.B0() * ((-S()) + e2)), Integer.valueOf((-(d5 + d3)) + f));
        }
        if (i == 4) {
            return du8.a(Integer.valueOf(this.b.B0() * (b2.getMeasuredWidth() + e2)), Integer.valueOf((-(d5 + d3)) + f));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Pair w(h40 h40Var) {
        View b2 = h40Var.b();
        int d2 = dg4.d(b2.getMeasuredWidth() * 0.5f);
        int d3 = dg4.d(b2.getMeasuredHeight() * 0.5f);
        int d4 = dg4.d(S() * 0.5f);
        int d5 = dg4.d(Q() * 0.5f);
        int e2 = h40Var.e();
        int f = h40Var.f();
        int i = c.g[h40Var.a().ordinal()];
        if (i == 1) {
            return du8.a(Integer.valueOf(this.b.B0() * ((d2 - d4) + e2)), Integer.valueOf((-(Q() + d3)) + f));
        }
        if (i == 2) {
            return du8.a(Integer.valueOf(this.b.B0() * ((d2 - d4) + e2)), Integer.valueOf((-d3) + f));
        }
        if (i == 3) {
            return du8.a(Integer.valueOf(this.b.B0() * ((d2 - S()) + e2)), Integer.valueOf(((-d5) - d3) + f));
        }
        if (i == 4) {
            return du8.a(Integer.valueOf(this.b.B0() * (d2 + e2)), Integer.valueOf(((-d5) - d3) + f));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Pair x(h40 h40Var) {
        int i = c.f[h40Var.d().ordinal()];
        if (i == 1) {
            return du8.a(Integer.valueOf(h40Var.e()), Integer.valueOf(h40Var.f()));
        }
        if (i == 2) {
            return v(h40Var);
        }
        if (i == 3) {
            return w(h40Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(ke5 ke5Var, Balloon balloon, View view) {
        zq3.h(balloon, "this$0");
        if (ke5Var != null) {
            ke5Var.a();
        }
        if (balloon.b.G()) {
            balloon.A();
        }
    }

    private final boolean y(View view) {
        if (!this.h && !this.i) {
            Context context = this.a;
            if ((!(context instanceof Activity) || !((Activity) context).isFinishing()) && this.e.getContentView().getParent() == null && k99.O(view)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [c44] */
    /* JADX WARN: Type inference failed for: r1v6, types: [c44] */
    private final void z() {
        Lifecycle lifecycle;
        Y();
        d0();
        e0();
        a0();
        Z();
        c0();
        b0();
        FrameLayout root = this.c.getRoot();
        zq3.g(root, "getRoot(...)");
        s(root);
        if (this.b.W() == null) {
            Object obj = this.a;
            if (obj instanceof d44) {
                this.b.r1((d44) obj);
                Lifecycle lifecycle2 = ((d44) this.a).getLifecycle();
                ?? V = this.b.V();
                if (V != 0) {
                    this = V;
                }
                lifecycle2.a(this);
                return;
            }
        }
        d44 W = this.b.W();
        if (W == null || (lifecycle = W.getLifecycle()) == null) {
            return;
        }
        ?? V2 = this.b.V();
        if (V2 != 0) {
            this = V2;
        }
        lifecycle.a(this);
    }

    public final void A() {
        if (this.h) {
            qs2 qs2Var = new qs2() { // from class: com.skydoves.balloon.Balloon$dismiss$dismissWindow$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m858invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m858invoke() {
                    Handler P;
                    a00 G;
                    Balloon.this.h = false;
                    Balloon.this.g = null;
                    Balloon.this.K().dismiss();
                    Balloon.this.U().dismiss();
                    P = Balloon.this.P();
                    G = Balloon.this.G();
                    P.removeCallbacks(G);
                }
            };
            if (this.b.u() != BalloonAnimation.CIRCULAR) {
                qs2Var.mo865invoke();
                return;
            }
            View contentView = this.e.getContentView();
            zq3.g(contentView, "getContentView(...)");
            contentView.post(new d(contentView, this.b.C(), qs2Var));
        }
    }

    public final boolean B(long j) {
        return P().postDelayed(G(), j);
    }

    public final void B0(View.OnTouchListener onTouchListener) {
        if (onTouchListener != null) {
            this.e.setTouchInterceptor(onTouchListener);
        }
    }

    public final void E0(View view, int i, int i2) {
        zq3.h(view, "anchor");
        C0(new h40(view, null, BalloonAlign.BOTTOM, i, i2, null, 34, null));
    }

    public final void F0(View view, int i, int i2, BalloonCenterAlign balloonCenterAlign) {
        BalloonAlign balloonAlign;
        zq3.h(view, "anchor");
        zq3.h(balloonCenterAlign, "centerAlign");
        PlacementType placementType = PlacementType.CENTER;
        int i3 = c.h[balloonCenterAlign.ordinal()];
        if (i3 == 1) {
            balloonAlign = BalloonAlign.TOP;
        } else if (i3 == 2) {
            balloonAlign = BalloonAlign.BOTTOM;
        } else if (i3 == 3) {
            balloonAlign = BalloonAlign.START;
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            balloonAlign = BalloonAlign.END;
        }
        C0(new h40(view, null, balloonAlign, i, i2, placementType, 2, null));
    }

    public final View H() {
        ImageView imageView = this.c.c;
        zq3.g(imageView, "balloonArrow");
        return imageView;
    }

    public final PopupWindow K() {
        return this.e;
    }

    public final ViewGroup M() {
        RadiusLayout radiusLayout = this.c.d;
        zq3.g(radiusLayout, "balloonCard");
        return radiusLayout;
    }

    public final BalloonAlign N() {
        return this.g;
    }

    public final void O0(View view, int i, int i2) {
        zq3.h(view, "anchor");
        N0(new h40(view, null, null, i, i2, PlacementType.CENTER, 6, null));
    }

    public final int Q() {
        return this.b.L() != Integer.MIN_VALUE ? this.b.L() : this.c.getRoot().getMeasuredHeight();
    }

    public final void Q0(BalloonAlign balloonAlign, View view, int i, int i2) {
        zq3.h(balloonAlign, "align");
        zq3.h(view, "anchor");
        N0(new h40(view, null, balloonAlign, i, i2, null, 34, null));
    }

    public final int S() {
        int i = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        if (this.b.N0() != 0.0f) {
            return (int) (i * this.b.N0());
        }
        if (this.b.e0() == 0.0f && this.b.c0() == 0.0f) {
            return this.b.M0() != Integer.MIN_VALUE ? uo6.i(this.b.M0(), i) : uo6.m(this.c.getRoot().getMeasuredWidth(), this.b.d0(), this.b.b0());
        }
        float f = i;
        return uo6.m(this.c.getRoot().getMeasuredWidth(), (int) (this.b.e0() * f), (int) (f * (this.b.c0() == 0.0f ? 1.0f : this.b.c0())));
    }

    public final void S0(int i, int i2) {
        this.b.v1(i);
        if (this.c.d.getChildCount() != 0) {
            RadiusLayout radiusLayout = this.c.d;
            zq3.g(radiusLayout, "balloonCard");
            View a2 = ViewGroupKt.a(radiusLayout, 0);
            ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = i;
            layoutParams.height = i2;
            a2.setLayoutParams(layoutParams);
        }
    }

    public final PopupWindow U() {
        return this.f;
    }

    public final Balloon k0(boolean z) {
        this.e.setAttachedInDecor(z);
        return this;
    }

    public final /* synthetic */ void l0(ss2 ss2Var) {
        zq3.h(ss2Var, "block");
        m0(new com.skydoves.balloon.a(ss2Var));
    }

    public final void m0(final ge5 ge5Var) {
        if (ge5Var != null || this.b.E()) {
            this.c.g.setOnClickListener(new View.OnClickListener() { // from class: w30
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Balloon.n0(ge5.this, this, view);
                }
            });
        }
    }

    public final /* synthetic */ void o0(qs2 qs2Var) {
        zq3.h(qs2Var, "block");
        p0(new com.skydoves.balloon.b(qs2Var));
    }

    @Override // defpackage.ei1
    public void onDestroy(d44 d44Var) {
        Lifecycle lifecycle;
        zq3.h(d44Var, "owner");
        super.onDestroy(d44Var);
        this.i = true;
        this.f.dismiss();
        this.e.dismiss();
        d44 W = this.b.W();
        if (W == null || (lifecycle = W.getLifecycle()) == null) {
            return;
        }
        lifecycle.d(this);
    }

    @Override // defpackage.ei1
    public void onPause(d44 d44Var) {
        zq3.h(d44Var, "owner");
        super.onPause(d44Var);
        if (this.b.F()) {
            A();
        }
    }

    public final void p0(final he5 he5Var) {
        this.e.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: x30
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                Balloon.q0(Balloon.this, he5Var);
            }
        });
    }

    public final /* synthetic */ void r0(ss2 ss2Var) {
        zq3.h(ss2Var, "block");
        s0(new com.skydoves.balloon.c(ss2Var));
    }

    public final void s0(ie5 ie5Var) {
        this.j = ie5Var;
    }

    public final /* synthetic */ void t0(gt2 gt2Var) {
        zq3.h(gt2Var, "block");
        u0(new com.skydoves.balloon.d(gt2Var));
    }

    public final void u0(je5 je5Var) {
        this.e.setTouchInterceptor(new e(je5Var));
    }

    public final /* synthetic */ void v0(qs2 qs2Var) {
        zq3.h(qs2Var, "block");
        w0(new com.skydoves.balloon.e(qs2Var));
    }

    public final void w0(final ke5 ke5Var) {
        this.d.getRoot().setOnClickListener(new View.OnClickListener() { // from class: u30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Balloon.x0(ke5.this, this, view);
            }
        });
    }

    public final void y0(final gt2 gt2Var) {
        zq3.h(gt2Var, "block");
        z0(new View.OnTouchListener() { // from class: t30
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean A0;
                A0 = Balloon.A0(gt2.this, view, motionEvent);
                return A0;
            }
        });
    }

    public final void z0(View.OnTouchListener onTouchListener) {
        if (onTouchListener != null) {
            this.f.setTouchInterceptor(onTouchListener);
        }
    }

    private Balloon(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
        b40 c2 = b40.c(LayoutInflater.from(context), null, false);
        zq3.g(c2, "inflate(...)");
        this.c = c2;
        d40 c3 = d40.c(LayoutInflater.from(context), null, false);
        zq3.g(c3, "inflate(...)");
        this.d = c3;
        this.e = new PopupWindow(c2.getRoot(), -2, -2);
        this.f = new PopupWindow(c3.getRoot(), -1, -1);
        this.j = aVar.i0();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.k = kotlin.c.b(lazyThreadSafetyMode, new qs2() { // from class: com.skydoves.balloon.Balloon$handler$2
            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Handler mo865invoke() {
                return new Handler(Looper.getMainLooper());
            }
        });
        this.l = kotlin.c.b(lazyThreadSafetyMode, new qs2() { // from class: com.skydoves.balloon.Balloon$autoDismissRunnable$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a00 mo865invoke() {
                return new a00(Balloon.this);
            }
        });
        this.m = kotlin.c.b(lazyThreadSafetyMode, new qs2() { // from class: com.skydoves.balloon.Balloon$balloonPersistence$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f mo865invoke() {
                Context context2;
                f.a aVar2 = f.a;
                context2 = Balloon.this.a;
                return aVar2.a(context2);
            }
        });
        z();
    }
}
