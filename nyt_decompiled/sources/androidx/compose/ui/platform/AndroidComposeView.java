package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.runtime.b0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.ViewLayer;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.text.font.d;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import defpackage.aa7;
import defpackage.af;
import defpackage.aw4;
import defpackage.ay5;
import defpackage.bd9;
import defpackage.bk8;
import defpackage.bl3;
import defpackage.by0;
import defpackage.cl3;
import defpackage.d06;
import defpackage.d44;
import defpackage.de;
import defpackage.dg4;
import defpackage.dl3;
import defpackage.ds0;
import defpackage.ei1;
import defpackage.em2;
import defpackage.er3;
import defpackage.ex7;
import defpackage.fd5;
import defpackage.fm1;
import defpackage.fv0;
import defpackage.gf;
import defpackage.hd5;
import defpackage.hm1;
import defpackage.hu1;
import defpackage.hy5;
import defpackage.ij7;
import defpackage.il7;
import defpackage.iu5;
import defpackage.iv0;
import defpackage.ja9;
import defpackage.jm5;
import defpackage.k99;
import defpackage.kg4;
import defpackage.kt6;
import defpackage.ku8;
import defpackage.l20;
import defpackage.ld;
import defpackage.lh4;
import defpackage.lu1;
import defpackage.ng9;
import defpackage.nv3;
import defpackage.o20;
import defpackage.og9;
import defpackage.pv8;
import defpackage.px5;
import defpackage.qs2;
import defpackage.r20;
import defpackage.r99;
import defpackage.ri8;
import defpackage.rx5;
import defpackage.sd;
import defpackage.ss2;
import defpackage.sv3;
import defpackage.sy4;
import defpackage.td;
import defpackage.th0;
import defpackage.u27;
import defpackage.u36;
import defpackage.u63;
import defpackage.u99;
import defpackage.uz3;
import defpackage.vg;
import defpackage.vl2;
import defpackage.vm3;
import defpackage.vv3;
import defpackage.vy4;
import defpackage.w2;
import defpackage.w27;
import defpackage.wl1;
import defpackage.wm3;
import defpackage.wv3;
import defpackage.ww8;
import defpackage.x08;
import defpackage.xd;
import defpackage.xx5;
import defpackage.ye;
import defpackage.yg;
import defpackage.yu1;
import defpackage.yu5;
import defpackage.yx5;
import defpackage.zq3;
import defpackage.zx5;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements androidx.compose.ui.node.m, w, d06, ei1 {
    public static final b Y0 = new b(null);
    public static final int Z0 = 8;
    private static Class a1;
    private static Method b1;
    private final ViewTreeObserver.OnTouchModeChangeListener A0;
    private final aw4 B;
    private final TextInputServiceAndroid B0;
    private final ri8 C0;
    private final AtomicReference D0;
    private final ex7 E0;
    private final d.a F0;
    private final sy4 G0;
    private final zx5 H;
    private int H0;
    private final sy4 I0;
    private final u63 J0;
    private final dl3 K0;
    private ss2 L;
    private final ModifierLocalManager L0;
    private final sd M;
    private final bk8 M0;
    private boolean N;
    private MotionEvent N0;
    private long O0;
    private final bd9 P0;
    private final xd Q;
    private final vy4 Q0;
    private final e R0;
    private final ld S;
    private final Runnable S0;
    private boolean T0;
    private final qs2 U0;
    private final n V0;
    private boolean W0;
    private final rx5 X0;
    private final CoroutineContext a;
    private long b;
    private boolean c;
    private final uz3 d;
    private fm1 e;
    private final OwnerSnapshotObserver e0;
    private final EmptySemanticsElement f;
    private boolean f0;
    private final vl2 g;
    private yg g0;
    private final DragAndDropModifierOnDragListener h;
    private yu1 h0;
    private final hu1 i;
    private fv0 i0;
    private final og9 j;
    private boolean j0;
    private final Modifier k;
    private final androidx.compose.ui.node.j k0;
    private final Modifier l;
    private final r99 l0;
    private final th0 m;
    private long m0;
    private final LayoutNode n;
    private final int[] n0;
    private final float[] o0;
    private final float[] p0;
    private final float[] q0;
    private final u27 r;
    private long r0;
    private final ij7 s;
    private boolean s0;
    private final AndroidComposeViewAccessibilityDelegateCompat t;
    private long t0;
    private final r20 u;
    private boolean u0;
    private final sy4 v0;
    private final List w;
    private final x08 w0;
    private List x;
    private ss2 x0;
    private boolean y;
    private final ViewTreeObserver.OnGlobalLayoutListener y0;
    private final ViewTreeObserver.OnScrollChangedListener z0;

    private static final class a implements ViewTranslationCallback {
        public boolean onClearTranslation(View view) {
            zq3.f(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((AndroidComposeView) view).t.F0();
            return true;
        }

        public boolean onHideTranslation(View view) {
            zq3.f(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((AndroidComposeView) view).t.H0();
            return true;
        }

        public boolean onShowTranslation(View view) {
            zq3.f(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((AndroidComposeView) view).t.K0();
            return true;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b() {
            try {
                if (AndroidComposeView.a1 == null) {
                    AndroidComposeView.a1 = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.a1;
                    AndroidComposeView.b1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.b1;
                Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = invoke instanceof Boolean ? (Boolean) invoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        private b() {
        }
    }

    public static final class c {
        private final d44 a;
        private final aa7 b;

        public c(d44 d44Var, aa7 aa7Var) {
            this.a = d44Var;
            this.b = aa7Var;
        }

        public final d44 a() {
            return this.a;
        }

        public final aa7 b() {
            return this.b;
        }
    }

    public static final class d implements rx5 {
        private px5 a = px5.a.a();

        d() {
        }

        @Override // defpackage.rx5
        public void a(px5 px5Var) {
            if (px5Var == null) {
                px5Var = px5.a.a();
            }
            this.a = px5Var;
            l.a.a(AndroidComposeView.this, px5Var);
        }
    }

    public static final class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidComposeView.this.removeCallbacks(this);
            MotionEvent motionEvent = AndroidComposeView.this.N0;
            if (motionEvent != null) {
                boolean z = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i = 2;
                }
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                androidComposeView.w0(motionEvent, i, androidComposeView.O0, false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidComposeView(Context context, CoroutineContext coroutineContext) {
        super(context);
        this.a = coroutineContext;
        fd5.a aVar = fd5.b;
        this.b = aVar.b();
        this.c = true;
        this.d = new uz3(null, 1, 0 == true ? 1 : 0);
        this.e = af.a(context);
        EmptySemanticsElement emptySemanticsElement = EmptySemanticsElement.b;
        this.f = emptySemanticsElement;
        this.g = new FocusOwnerImpl(new ss2() { // from class: androidx.compose.ui.platform.AndroidComposeView$focusOwner$1
            {
                super(1);
            }

            public final void b(qs2 qs2Var) {
                AndroidComposeView.this.r(qs2Var);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((qs2) obj);
                return ww8.a;
            }
        });
        DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener = new DragAndDropModifierOnDragListener(new AndroidComposeView$dragAndDropModifierOnDragListener$1(this));
        this.h = dragAndDropModifierOnDragListener;
        this.i = dragAndDropModifierOnDragListener;
        this.j = new og9();
        Modifier.a aVar2 = Modifier.a;
        Modifier a2 = androidx.compose.ui.input.key.a.a(aVar2, new ss2() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1
            {
                super(1);
            }

            public final Boolean b(KeyEvent keyEvent) {
                androidx.compose.ui.focus.d V = AndroidComposeView.this.V(keyEvent);
                return (V == null || !vv3.e(wv3.b(keyEvent), vv3.a.a())) ? Boolean.FALSE : Boolean.valueOf(AndroidComposeView.this.getFocusOwner().f(V.o()));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((sv3) obj).f());
            }
        });
        this.k = a2;
        Modifier a3 = androidx.compose.ui.input.rotary.a.a(aVar2, new ss2() { // from class: androidx.compose.ui.platform.AndroidComposeView$rotaryInputModifier$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(w27 w27Var) {
                return Boolean.FALSE;
            }
        });
        this.l = a3;
        this.m = new th0();
        LayoutNode layoutNode = new LayoutNode(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        layoutNode.j(RootMeasurePolicy.b);
        layoutNode.h(getDensity());
        layoutNode.k(aVar2.h(emptySemanticsElement).h(a3).h(getFocusOwner().j()).h(a2).h(dragAndDropModifierOnDragListener.d()));
        this.n = layoutNode;
        this.r = this;
        this.s = new ij7(getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.t = androidComposeViewAccessibilityDelegateCompat;
        this.u = new r20();
        this.w = new ArrayList();
        this.B = new aw4();
        this.H = new zx5(getRoot());
        this.L = new ss2() { // from class: androidx.compose.ui.platform.AndroidComposeView$configurationChangeObserver$1
            public final void b(Configuration configuration) {
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Configuration) obj);
                return ww8.a;
            }
        };
        this.M = P() ? new sd(this, getAutofillTree()) : null;
        this.Q = new xd(context);
        this.S = new ld(context);
        this.e0 = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.k0 = new androidx.compose.ui.node.j(getRoot());
        this.l0 = new vg(ViewConfiguration.get(context));
        this.m0 = wm3.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.n0 = new int[]{0, 0};
        this.o0 = kg4.c(null, 1, null);
        this.p0 = kg4.c(null, 1, null);
        this.q0 = kg4.c(null, 1, null);
        this.r0 = -1L;
        this.t0 = aVar.a();
        this.u0 = true;
        this.v0 = b0.e(null, null, 2, null);
        this.w0 = androidx.compose.runtime.y.d(new qs2() { // from class: androidx.compose.ui.platform.AndroidComposeView$viewTreeOwners$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AndroidComposeView.c mo865invoke() {
                AndroidComposeView.c cVar;
                cVar = AndroidComposeView.this.get_viewTreeOwners();
                return cVar;
            }
        });
        this.y0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ee
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.X(AndroidComposeView.this);
            }
        };
        this.z0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: fe
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.t0(AndroidComposeView.this);
            }
        };
        this.A0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: ge
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                AndroidComposeView.z0(AndroidComposeView.this, z);
            }
        };
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(getView(), this);
        this.B0 = textInputServiceAndroid;
        this.C0 = new ri8((yu5) AndroidComposeView_androidKt.e().invoke(textInputServiceAndroid));
        this.D0 = il7.a();
        this.E0 = new wl1(getTextInputService());
        this.F0 = new gf(context);
        this.G0 = androidx.compose.runtime.y.i(androidx.compose.ui.text.font.f.a(context), androidx.compose.runtime.y.n());
        this.H0 = W(context.getResources().getConfiguration());
        this.I0 = b0.e(AndroidComposeView_androidKt.d(context.getResources().getConfiguration()), null, 2, null);
        this.J0 = new iu5(this);
        this.K0 = new dl3(isInTouchMode() ? bl3.b.b() : bl3.b.a(), new ss2() { // from class: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1
            {
                super(1);
            }

            public final Boolean b(int i) {
                bl3.a aVar3 = bl3.b;
                return Boolean.valueOf(bl3.f(i, aVar3.b()) ? AndroidComposeView.this.isInTouchMode() : bl3.f(i, aVar3.a()) ? AndroidComposeView.this.isInTouchMode() ? AndroidComposeView.this.requestFocusFromTouch() : true : false);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((bl3) obj).i());
            }
        }, null);
        this.L0 = new ModifierLocalManager(this);
        this.M0 = new AndroidTextToolbar(this);
        this.P0 = new bd9();
        this.Q0 = new vy4(new qs2[16], 0);
        this.R0 = new e();
        this.S0 = new Runnable() { // from class: he
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.u0(AndroidComposeView.this);
            }
        };
        this.U0 = new qs2() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m92invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m92invoke() {
                AndroidComposeView.e eVar;
                MotionEvent motionEvent = AndroidComposeView.this.N0;
                if (motionEvent != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 7 || actionMasked == 9) {
                        AndroidComposeView.this.O0 = SystemClock.uptimeMillis();
                        AndroidComposeView androidComposeView = AndroidComposeView.this;
                        eVar = androidComposeView.R0;
                        androidComposeView.post(eVar);
                    }
                }
            }
        };
        this.V0 = new o();
        setWillNotDraw(false);
        setFocusable(true);
        m.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        k99.l0(this, androidComposeViewAccessibilityDelegateCompat);
        ss2 a4 = w.I.a();
        if (a4 != null) {
            a4.invoke(this);
        }
        setOnDragListener(dragAndDropModifierOnDragListener);
        getRoot().t(this);
        j.a.a(this);
        this.X0 = new d();
    }

    private final void A0() {
        getLocationOnScreen(this.n0);
        long j = this.m0;
        int c2 = vm3.c(j);
        int d2 = vm3.d(j);
        int[] iArr = this.n0;
        boolean z = false;
        int i = iArr[0];
        if (c2 != i || d2 != iArr[1]) {
            this.m0 = wm3.a(i, iArr[1]);
            if (c2 != Integer.MAX_VALUE && d2 != Integer.MAX_VALUE) {
                getRoot().S().F().I1();
                z = true;
            }
        }
        this.k0.c(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        Integer num;
        if (zq3.c(str, this.t.i0())) {
            Integer num2 = (Integer) this.t.k0().get(Integer.valueOf(i));
            if (num2 != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                return;
            }
            return;
        }
        if (!zq3.c(str, this.t.h0()) || (num = (Integer) this.t.j0().get(Integer.valueOf(i))) == null) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
    }

    private final boolean P() {
        return true;
    }

    private final boolean R(LayoutNode layoutNode) {
        LayoutNode k0;
        return this.j0 || !((k0 = layoutNode.k0()) == null || k0.L());
    }

    private final void S(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).t();
            } else if (childAt instanceof ViewGroup) {
                S((ViewGroup) childAt);
            }
        }
    }

    private final long T(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return k0(0, size);
        }
        if (mode == 0) {
            return k0(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return k0(size, size);
        }
        throw new IllegalStateException();
    }

    private final int W(Configuration configuration) {
        int i;
        if (Build.VERSION.SDK_INT < 31) {
            return 0;
        }
        i = configuration.fontWeightAdjustment;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(AndroidComposeView androidComposeView) {
        androidComposeView.A0();
    }

    private final int Y(MotionEvent motionEvent) {
        removeCallbacks(this.R0);
        try {
            m0(motionEvent);
            boolean z = true;
            this.s0 = true;
            a(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.N0;
                boolean z2 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && a0(motionEvent, motionEvent2)) {
                    if (f0(motionEvent2)) {
                        this.H.b();
                    } else if (motionEvent2.getActionMasked() != 10 && z2) {
                        x0(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                    }
                }
                if (motionEvent.getToolType(0) != 3) {
                    z = false;
                }
                if (!z2 && z && actionMasked != 3 && actionMasked != 9 && g0(motionEvent)) {
                    x0(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.N0 = MotionEvent.obtainNoHistory(motionEvent);
                int v0 = v0(motionEvent);
                Trace.endSection();
                return v0;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } finally {
            this.s0 = false;
        }
    }

    private final boolean Z(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f = -motionEvent.getAxisValue(26);
        return getFocusOwner().n(new w27(f * u99.h(viewConfiguration, getContext()), f * u99.e(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()));
    }

    private final boolean a0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private final void c0(LayoutNode layoutNode) {
        layoutNode.B0();
        vy4 s0 = layoutNode.s0();
        int q = s0.q();
        if (q > 0) {
            Object[] p = s0.p();
            int i = 0;
            do {
                c0((LayoutNode) p[i]);
                i++;
            } while (i < q);
        }
    }

    private final void d0(LayoutNode layoutNode) {
        int i = 0;
        androidx.compose.ui.node.j.H(this.k0, layoutNode, false, 2, null);
        vy4 s0 = layoutNode.s0();
        int q = s0.q();
        if (q > 0) {
            Object[] p = s0.p();
            do {
                d0((LayoutNode) p[i]);
                i++;
            } while (i < q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[LOOP:0: B:20:0x004c->B:33:0x007c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[EDGE_INSN: B:34:0x007f->B:37:0x007f BREAK  A[LOOP:0: B:20:0x004c->B:33:0x007c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean e0(android.view.MotionEvent r6) {
        /*
            r5 = this;
            float r5 = r6.getX()
            boolean r0 = java.lang.Float.isInfinite(r5)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L44
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L44
            float r5 = r6.getY()
            boolean r0 = java.lang.Float.isInfinite(r5)
            if (r0 != 0) goto L44
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L44
            float r5 = r6.getRawX()
            boolean r0 = java.lang.Float.isInfinite(r5)
            if (r0 != 0) goto L44
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L44
            float r5 = r6.getRawY()
            boolean r0 = java.lang.Float.isInfinite(r5)
            if (r0 != 0) goto L44
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L44
            r5 = r1
            goto L45
        L44:
            r5 = r2
        L45:
            if (r5 != 0) goto L7f
            int r0 = r6.getPointerCount()
            r3 = r2
        L4c:
            if (r3 >= r0) goto L7f
            float r5 = r6.getX(r3)
            boolean r4 = java.lang.Float.isInfinite(r5)
            if (r4 != 0) goto L79
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L79
            float r5 = r6.getY(r3)
            boolean r4 = java.lang.Float.isInfinite(r5)
            if (r4 != 0) goto L79
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L79
            androidx.compose.ui.platform.s r5 = androidx.compose.ui.platform.s.a
            boolean r5 = r5.a(r6, r3)
            if (r5 != 0) goto L77
            goto L79
        L77:
            r5 = r1
            goto L7a
        L79:
            r5 = r2
        L7a:
            if (r5 != 0) goto L7f
            int r3 = r3 + 1
            goto L4c
        L7f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.e0(android.view.MotionEvent):boolean");
    }

    private final boolean f0(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean g0(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c get_viewTreeOwners() {
        return (c) this.v0.getValue();
    }

    private final boolean h0(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.N0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    private final long k0(int i, int i2) {
        return pv8.b(pv8.b(pv8.b(i) << 32) | pv8.b(i2));
    }

    private final void l0() {
        if (this.s0) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.r0) {
            this.r0 = currentAnimationTimeMillis;
            n0();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.n0);
            int[] iArr = this.n0;
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.n0;
            this.t0 = hd5.a(f - iArr2[0], f2 - iArr2[1]);
        }
    }

    private final void m0(MotionEvent motionEvent) {
        this.r0 = AnimationUtils.currentAnimationTimeMillis();
        n0();
        long f = kg4.f(this.p0, hd5.a(motionEvent.getX(), motionEvent.getY()));
        this.t0 = hd5.a(motionEvent.getRawX() - fd5.o(f), motionEvent.getRawY() - fd5.p(f));
    }

    private final void n0() {
        this.V0.a(this, this.p0);
        er3.a(this.p0, this.q0);
    }

    private final void r0(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.d0() == LayoutNode.UsageByParent.InMeasureBlock && R(layoutNode)) {
                layoutNode = layoutNode.k0();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    static /* synthetic */ void s0(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.r0(layoutNode);
    }

    private void setFontFamilyResolver(e.b bVar) {
        this.G0.setValue(bVar);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.I0.setValue(layoutDirection);
    }

    private final void set_viewTreeOwners(c cVar) {
        this.v0.setValue(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(AndroidComposeView androidComposeView) {
        androidComposeView.A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(AndroidComposeView androidComposeView) {
        androidComposeView.T0 = false;
        MotionEvent motionEvent = androidComposeView.N0;
        zq3.e(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        androidComposeView.v0(motionEvent);
    }

    private final int v0(MotionEvent motionEvent) {
        Object obj;
        if (this.W0) {
            this.W0 = false;
            this.j.a(hy5.b(motionEvent.getMetaState()));
        }
        xx5 c2 = this.B.c(motionEvent, this);
        if (c2 == null) {
            this.H.b();
            return ay5.a(false, false);
        }
        List b2 = c2.b();
        int size = b2.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = b2.get(size);
                if (((yx5) obj).a()) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        obj = null;
        yx5 yx5Var = (yx5) obj;
        if (yx5Var != null) {
            this.b = yx5Var.f();
        }
        int a2 = this.H.a(c2, this, g0(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || u36.c(a2)) {
            return a2;
        }
        this.B.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i2 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i2 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i2 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((i2 < 0 || i5 < i2) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            long i0 = i0(hd5.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = fd5.o(i0);
            pointerCoords.y = fd5.p(i0);
            i5++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        xx5 c2 = this.B.c(obtain, this);
        zq3.e(c2);
        this.H.a(c2, this, true);
        obtain.recycle();
    }

    static /* synthetic */ void x0(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        androidComposeView.w0(motionEvent, i, j, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y0(lu1 lu1Var, long j, ss2 ss2Var) {
        Resources resources = getContext().getResources();
        return k.a.a(this, lu1Var, new ds0(hm1.a(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j, ss2Var, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(AndroidComposeView androidComposeView, boolean z) {
        androidComposeView.K0.b(z ? bl3.b.b() : bl3.b.a());
    }

    public final void N(AndroidViewHolder androidViewHolder, final LayoutNode layoutNode) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(androidViewHolder, layoutNode);
        getAndroidViewsHandler$ui_release().addView(androidViewHolder);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, androidViewHolder);
        k99.v0(androidViewHolder, 1);
        k99.l0(androidViewHolder, new w2() { // from class: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1
            /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
            
                if (r6.intValue() == r5.d.getSemanticsOwner().a().n()) goto L12;
             */
            @Override // defpackage.w2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void g(android.view.View r6, defpackage.h3 r7) {
                /*
                    r5 = this;
                    super.g(r6, r7)
                    androidx.compose.ui.platform.AndroidComposeView r6 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r6 = androidx.compose.ui.platform.AndroidComposeView.B(r6)
                    boolean r6 = r6.z0()
                    if (r6 == 0) goto L13
                    r6 = 0
                    r7.S0(r6)
                L13:
                    androidx.compose.ui.node.LayoutNode r6 = r2
                    androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1 r0 = new defpackage.ss2() { // from class: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1
                        static {
                            /*
                                androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1 r0 = new androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1
                                r0.<init>()
                                
                                // error: 0x0005: SPUT (r0 I:androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1) androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1.a androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1.<clinit>():void");
                        }

                        {
                            /*
                                r1 = this;
                                r0 = 1
                                r1.<init>(r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1.<init>():void");
                        }

                        @Override // defpackage.ss2
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode r1) {
                            /*
                                r0 = this;
                                androidx.compose.ui.node.k r0 = r1.h0()
                                r1 = 8
                                int r1 = defpackage.a85.a(r1)
                                boolean r0 = r0.q(r1)
                                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1.invoke(androidx.compose.ui.node.LayoutNode):java.lang.Boolean");
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                            /*
                                r0 = this;
                                androidx.compose.ui.node.LayoutNode r1 = (androidx.compose.ui.node.LayoutNode) r1
                                java.lang.Boolean r0 = r0.invoke(r1)
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1.invoke(java.lang.Object):java.lang.Object");
                        }
                    }
                    androidx.compose.ui.node.LayoutNode r6 = defpackage.gj7.f(r6, r0)
                    if (r6 == 0) goto L26
                    int r6 = r6.m0()
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    goto L27
                L26:
                    r6 = 0
                L27:
                    if (r6 == 0) goto L3d
                    androidx.compose.ui.platform.AndroidComposeView r0 = androidx.compose.ui.platform.AndroidComposeView.this
                    ij7 r0 = r0.getSemanticsOwner()
                    androidx.compose.ui.semantics.SemanticsNode r0 = r0.a()
                    int r0 = r0.n()
                    int r1 = r6.intValue()
                    if (r1 != r0) goto L42
                L3d:
                    r6 = -1
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                L42:
                    androidx.compose.ui.platform.AndroidComposeView r0 = r3
                    int r6 = r6.intValue()
                    r7.B0(r0, r6)
                    androidx.compose.ui.node.LayoutNode r6 = r2
                    int r6 = r6.m0()
                    androidx.compose.ui.platform.AndroidComposeView r0 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = androidx.compose.ui.platform.AndroidComposeView.B(r0)
                    java.util.HashMap r0 = r0.k0()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                    java.lang.Object r0 = r0.get(r1)
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    if (r0 == 0) goto L93
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeView r2 = r3
                    int r3 = r0.intValue()
                    yg r4 = r1.getAndroidViewsHandler$ui_release()
                    int r0 = r0.intValue()
                    android.view.View r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.D(r4, r0)
                    if (r0 == 0) goto L81
                    r7.P0(r0)
                    goto L84
                L81:
                    r7.Q0(r2, r3)
                L84:
                    android.view.accessibility.AccessibilityNodeInfo r0 = r7.T0()
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = androidx.compose.ui.platform.AndroidComposeView.B(r1)
                    java.lang.String r2 = r2.i0()
                    androidx.compose.ui.platform.AndroidComposeView.A(r1, r6, r0, r2)
                L93:
                    androidx.compose.ui.platform.AndroidComposeView r0 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = androidx.compose.ui.platform.AndroidComposeView.B(r0)
                    java.util.HashMap r0 = r0.j0()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                    java.lang.Object r0 = r0.get(r1)
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    if (r0 == 0) goto Ld5
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeView r5 = r3
                    int r2 = r0.intValue()
                    yg r3 = r1.getAndroidViewsHandler$ui_release()
                    int r0 = r0.intValue()
                    android.view.View r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.D(r3, r0)
                    if (r0 == 0) goto Lc3
                    r7.N0(r0)
                    goto Lc6
                Lc3:
                    r7.O0(r5, r2)
                Lc6:
                    android.view.accessibility.AccessibilityNodeInfo r5 = r7.T0()
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r7 = androidx.compose.ui.platform.AndroidComposeView.B(r1)
                    java.lang.String r7 = r7.h0()
                    androidx.compose.ui.platform.AndroidComposeView.A(r1, r6, r5, r7)
                Ld5:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1.g(android.view.View, h3):void");
            }
        });
    }

    public final Object Q(by0 by0Var) {
        Object O = this.t.O(by0Var);
        return O == kotlin.coroutines.intrinsics.a.h() ? O : ww8.a;
    }

    public final void U(AndroidViewHolder androidViewHolder, Canvas canvas) {
        getAndroidViewsHandler$ui_release().a(androidViewHolder, canvas);
    }

    public androidx.compose.ui.focus.d V(KeyEvent keyEvent) {
        long a2 = wv3.a(keyEvent);
        nv3.a aVar = nv3.b;
        if (nv3.p(a2, aVar.l())) {
            return androidx.compose.ui.focus.d.i(wv3.f(keyEvent) ? androidx.compose.ui.focus.d.b.f() : androidx.compose.ui.focus.d.b.e());
        }
        if (nv3.p(a2, aVar.e())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.b.g());
        }
        if (nv3.p(a2, aVar.d())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.b.d());
        }
        if (nv3.p(a2, aVar.f()) ? true : nv3.p(a2, aVar.k())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.b.h());
        }
        if (nv3.p(a2, aVar.c()) ? true : nv3.p(a2, aVar.j())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.b.a());
        }
        if (nv3.p(a2, aVar.b()) ? true : nv3.p(a2, aVar.g()) ? true : nv3.p(a2, aVar.i())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.b.b());
        }
        if (nv3.p(a2, aVar.a()) ? true : nv3.p(a2, aVar.h())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.b.c());
        }
        return null;
    }

    @Override // androidx.compose.ui.node.m
    public void a(boolean z) {
        qs2 qs2Var;
        if (this.k0.k() || this.k0.l()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    qs2Var = this.U0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                qs2Var = null;
            }
            if (this.k0.p(qs2Var)) {
                requestLayout();
            }
            androidx.compose.ui.node.j.d(this.k0, false, 1, null);
            ww8 ww8Var = ww8.a;
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public void autofill(SparseArray sparseArray) {
        sd sdVar;
        if (!P() || (sdVar = this.M) == null) {
            return;
        }
        td.a(sdVar, sparseArray);
    }

    public void b0() {
        c0(getRoot());
    }

    @Override // androidx.compose.ui.node.m
    public void c(LayoutNode layoutNode, boolean z, boolean z2) {
        if (z) {
            if (this.k0.z(layoutNode, z2)) {
                s0(this, null, 1, null);
            }
        } else if (this.k0.E(layoutNode, z2)) {
            s0(this, null, 1, null);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.t.R(false, i, this.b);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.t.R(true, i, this.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            c0(getRoot());
        }
        androidx.compose.ui.node.m.b(this, false, 1, null);
        androidx.compose.runtime.snapshots.e.e.k();
        this.y = true;
        th0 th0Var = this.m;
        Canvas a2 = th0Var.a().a();
        th0Var.a().z(canvas);
        getRoot().A(th0Var.a());
        th0Var.a().z(a2);
        if (!this.w.isEmpty()) {
            int size = this.w.size();
            for (int i = 0; i < size; i++) {
                ((jm5) this.w.get(i)).k();
            }
        }
        if (ViewLayer.s.b()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.w.clear();
        this.y = false;
        List list = this.x;
        if (list != null) {
            zq3.e(list);
            this.w.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 8 ? motionEvent.isFromSource(4194304) ? Z(motionEvent) : (e0(motionEvent) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(motionEvent) : u36.c(Y(motionEvent)) : super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.T0) {
            removeCallbacks(this.S0);
            this.S0.run();
        }
        if (e0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        this.t.Z(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && g0(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.N0;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.N0 = MotionEvent.obtainNoHistory(motionEvent);
                this.T0 = true;
                post(this.S0);
                return false;
            }
        } else if (!h0(motionEvent)) {
            return false;
        }
        return u36.c(Y(motionEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        this.j.a(hy5.b(keyEvent.getMetaState()));
        return getFocusOwner().p(sv3.b(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().g(sv3.b(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.T0) {
            removeCallbacks(this.S0);
            MotionEvent motionEvent2 = this.N0;
            zq3.e(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || a0(motionEvent, motionEvent2)) {
                this.S0.run();
            } else {
                this.T0 = false;
            }
        }
        if (e0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !h0(motionEvent)) {
            return false;
        }
        int Y = Y(motionEvent);
        if (u36.b(Y)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return u36.c(Y);
    }

    @Override // androidx.compose.ui.node.m
    public long e(long j) {
        l0();
        return kg4.f(this.p0, j);
    }

    @Override // androidx.compose.ui.node.m
    public void f(LayoutNode layoutNode) {
        this.k0.D(layoutNode);
        s0(this, null, 1, null);
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // androidx.compose.ui.node.m
    public void g(LayoutNode layoutNode) {
        this.t.I0(layoutNode);
    }

    public final yg getAndroidViewsHandler$ui_release() {
        if (this.g0 == null) {
            yg ygVar = new yg(getContext());
            this.g0 = ygVar;
            addView(ygVar);
        }
        yg ygVar2 = this.g0;
        zq3.e(ygVar2);
        return ygVar2;
    }

    @Override // androidx.compose.ui.node.m
    public l20 getAutofill() {
        return this.M;
    }

    @Override // androidx.compose.ui.node.m
    public r20 getAutofillTree() {
        return this.u;
    }

    public final ss2 getConfigurationChangeObserver() {
        return this.L;
    }

    @Override // androidx.compose.ui.node.m
    public CoroutineContext getCoroutineContext() {
        return this.a;
    }

    @Override // androidx.compose.ui.node.m
    public fm1 getDensity() {
        return this.e;
    }

    @Override // androidx.compose.ui.node.m
    public hu1 getDragAndDropManager() {
        return this.i;
    }

    @Override // androidx.compose.ui.node.m
    public vl2 getFocusOwner() {
        return this.g;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        ww8 ww8Var;
        kt6 k = getFocusOwner().k();
        if (k != null) {
            rect.left = dg4.d(k.i());
            rect.top = dg4.d(k.l());
            rect.right = dg4.d(k.j());
            rect.bottom = dg4.d(k.e());
            ww8Var = ww8.a;
        } else {
            ww8Var = null;
        }
        if (ww8Var == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // androidx.compose.ui.node.m
    public e.b getFontFamilyResolver() {
        return (e.b) this.G0.getValue();
    }

    @Override // androidx.compose.ui.node.m
    public d.a getFontLoader() {
        return this.F0;
    }

    @Override // androidx.compose.ui.node.m
    public u63 getHapticFeedBack() {
        return this.J0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.k0.k();
    }

    @Override // androidx.compose.ui.node.m
    public cl3 getInputModeManager() {
        return this.K0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.r0;
    }

    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.m
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.I0.getValue();
    }

    public long getMeasureIteration() {
        return this.k0.o();
    }

    @Override // androidx.compose.ui.node.m
    public ModifierLocalManager getModifierLocalManager() {
        return this.L0;
    }

    @Override // androidx.compose.ui.node.m
    public l.a getPlacementScope() {
        return PlaceableKt.b(this);
    }

    @Override // androidx.compose.ui.node.m
    public rx5 getPointerIconService() {
        return this.X0;
    }

    @Override // androidx.compose.ui.node.m
    public LayoutNode getRoot() {
        return this.n;
    }

    public u27 getRootForTest() {
        return this.r;
    }

    public ij7 getSemanticsOwner() {
        return this.s;
    }

    @Override // androidx.compose.ui.node.m
    public uz3 getSharedDrawScope() {
        return this.d;
    }

    @Override // androidx.compose.ui.node.m
    public boolean getShowLayoutBounds() {
        return this.f0;
    }

    @Override // androidx.compose.ui.node.m
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.e0;
    }

    @Override // androidx.compose.ui.node.m
    public ex7 getSoftwareKeyboardController() {
        return this.E0;
    }

    @Override // androidx.compose.ui.node.m
    public ri8 getTextInputService() {
        return this.C0;
    }

    @Override // androidx.compose.ui.node.m
    public bk8 getTextToolbar() {
        return this.M0;
    }

    public View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.m
    public r99 getViewConfiguration() {
        return this.l0;
    }

    public final c getViewTreeOwners() {
        return (c) this.w0.getValue();
    }

    @Override // androidx.compose.ui.node.m
    public ng9 getWindowInfo() {
        return this.j;
    }

    @Override // androidx.compose.ui.node.m
    public void i(LayoutNode layoutNode, boolean z) {
        this.k0.g(layoutNode, z);
    }

    public long i0(long j) {
        l0();
        long f = kg4.f(this.p0, j);
        return hd5.a(fd5.o(f) + fd5.o(this.t0), fd5.p(f) + fd5.p(this.t0));
    }

    public final void j0(jm5 jm5Var, boolean z) {
        if (!z) {
            if (this.y) {
                return;
            }
            this.w.remove(jm5Var);
            List list = this.x;
            if (list != null) {
                list.remove(jm5Var);
                return;
            }
            return;
        }
        if (!this.y) {
            this.w.add(jm5Var);
            return;
        }
        List list2 = this.x;
        if (list2 == null) {
            list2 = new ArrayList();
            this.x = list2;
        }
        list2.add(jm5Var);
    }

    @Override // defpackage.d06
    public void k(float[] fArr) {
        l0();
        kg4.k(fArr, this.p0);
        AndroidComposeView_androidKt.h(fArr, fd5.o(this.t0), fd5.p(this.t0), this.o0);
    }

    @Override // defpackage.d06
    public long l(long j) {
        l0();
        return kg4.f(this.q0, hd5.a(fd5.o(j) - fd5.o(this.t0), fd5.p(j) - fd5.p(this.t0)));
    }

    @Override // androidx.compose.ui.node.m
    public void m(LayoutNode layoutNode) {
    }

    @Override // androidx.compose.ui.node.m
    public void n(LayoutNode layoutNode, long j) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.k0.q(layoutNode, j);
            if (!this.k0.k()) {
                androidx.compose.ui.node.j.d(this.k0, false, 1, null);
            }
            ww8 ww8Var = ww8.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.m
    public long o(long j) {
        l0();
        return kg4.f(this.q0, j);
    }

    public final boolean o0(jm5 jm5Var) {
        if (this.h0 != null) {
            ViewLayer.s.b();
        }
        this.P0.c(jm5Var);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        d44 a2;
        Lifecycle lifecycle;
        sd sdVar;
        super.onAttachedToWindow();
        d0(getRoot());
        c0(getRoot());
        getSnapshotObserver().k();
        if (P() && (sdVar = this.M) != null) {
            o20.a.a(sdVar);
        }
        d44 a3 = ViewTreeLifecycleOwner.a(this);
        aa7 a4 = ViewTreeSavedStateRegistryOwner.a(this);
        c viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (a3 != null && a4 != null && (a3 != viewTreeOwners.a() || a4 != viewTreeOwners.a()))) {
            if (a3 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (a4 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (a2 = viewTreeOwners.a()) != null && (lifecycle = a2.getLifecycle()) != null) {
                lifecycle.d(this);
            }
            a3.getLifecycle().a(this);
            c cVar = new c(a3, a4);
            set_viewTreeOwners(cVar);
            ss2 ss2Var = this.x0;
            if (ss2Var != null) {
                ss2Var.invoke(cVar);
            }
            this.x0 = null;
        }
        this.K0.b(isInTouchMode() ? bl3.b.b() : bl3.b.a());
        c viewTreeOwners2 = getViewTreeOwners();
        zq3.e(viewTreeOwners2);
        viewTreeOwners2.a().getLifecycle().a(this);
        c viewTreeOwners3 = getViewTreeOwners();
        zq3.e(viewTreeOwners3);
        viewTreeOwners3.a().getLifecycle().a(this.t);
        getViewTreeObserver().addOnGlobalLayoutListener(this.y0);
        getViewTreeObserver().addOnScrollChangedListener(this.z0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.A0);
        if (Build.VERSION.SDK_INT >= 31) {
            ye.a.b(this, de.a(new a()));
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        lh4.a(il7.c(this.D0));
        return this.B0.q();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.e = af.a(getContext());
        if (W(configuration) != this.H0) {
            this.H0 = W(configuration);
            setFontFamilyResolver(androidx.compose.ui.text.font.f.a(getContext()));
        }
        this.L.invoke(configuration);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        lh4.a(il7.c(this.D0));
        return this.B0.n(editorInfo);
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        this.t.G0(jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        sd sdVar;
        d44 a2;
        Lifecycle lifecycle;
        d44 a3;
        Lifecycle lifecycle2;
        super.onDetachedFromWindow();
        getSnapshotObserver().l();
        c viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (a3 = viewTreeOwners.a()) != null && (lifecycle2 = a3.getLifecycle()) != null) {
            lifecycle2.d(this);
        }
        c viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (a2 = viewTreeOwners2.a()) != null && (lifecycle = a2.getLifecycle()) != null) {
            lifecycle.d(this.t);
        }
        if (P() && (sdVar = this.M) != null) {
            o20.a.b(sdVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.y0);
        getViewTreeObserver().removeOnScrollChangedListener(this.z0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.A0);
        if (Build.VERSION.SDK_INT >= 31) {
            ye.a.a(this);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onFocusChanged(final boolean z, int i, Rect rect) {
        vy4 vy4Var;
        boolean z2;
        super.onFocusChanged(z, i, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z + ')');
        em2 e2 = getFocusOwner().e();
        qs2 qs2Var = new qs2() { // from class: androidx.compose.ui.platform.AndroidComposeView$onFocusChanged$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m90invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m90invoke() {
                boolean z3 = z;
                AndroidComposeView androidComposeView = this;
                if (z3) {
                    androidComposeView.clearFocus();
                } else {
                    androidComposeView.requestFocus();
                }
            }
        };
        vy4Var = e2.b;
        vy4Var.b(qs2Var);
        z2 = e2.c;
        if (z2) {
            vl2 focusOwner = getFocusOwner();
            if (z) {
                focusOwner.b();
                return;
            } else {
                focusOwner.m();
                return;
            }
        }
        try {
            e2.f();
            if (z) {
                getFocusOwner().b();
            } else {
                getFocusOwner().m();
            }
            ww8 ww8Var = ww8.a;
            e2.h();
        } catch (Throwable th) {
            e2.h();
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.k0.p(this.U0);
        this.i0 = null;
        A0();
        if (this.g0 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                d0(getRoot());
            }
            long T = T(i);
            int b2 = (int) pv8.b(T >>> 32);
            int b3 = (int) pv8.b(T & 4294967295L);
            long T2 = T(i2);
            long a2 = iv0.a(b2, b3, (int) pv8.b(T2 >>> 32), (int) pv8.b(4294967295L & T2));
            fv0 fv0Var = this.i0;
            boolean z = false;
            if (fv0Var == null) {
                this.i0 = fv0.b(a2);
                this.j0 = false;
            } else {
                if (fv0Var != null) {
                    z = fv0.g(fv0Var.t(), a2);
                }
                if (!z) {
                    this.j0 = true;
                }
            }
            this.k0.I(a2);
            this.k0.r();
            setMeasuredDimension(getRoot().p0(), getRoot().M());
            if (this.g0 != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().p0(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().M(), 1073741824));
            }
            ww8 ww8Var = ww8.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        sd sdVar;
        if (!P() || viewStructure == null || (sdVar = this.M) == null) {
            return;
        }
        td.b(sdVar, viewStructure);
    }

    @Override // defpackage.ei1
    public void onResume(d44 d44Var) {
        setShowLayoutBounds(Y0.b());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        LayoutDirection f;
        if (this.c) {
            f = AndroidComposeView_androidKt.f(i);
            setLayoutDirection(f);
            getFocusOwner().a(f);
        }
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        this.t.L0(longSparseArray);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        boolean b2;
        this.j.b(z);
        this.W0 = true;
        super.onWindowFocusChanged(z);
        if (!z || getShowLayoutBounds() == (b2 = Y0.b())) {
            return;
        }
        setShowLayoutBounds(b2);
        b0();
    }

    @Override // androidx.compose.ui.node.m
    public void p(LayoutNode layoutNode, boolean z, boolean z2, boolean z3) {
        if (z) {
            if (this.k0.B(layoutNode, z2) && z3) {
                r0(layoutNode);
                return;
            }
            return;
        }
        if (this.k0.G(layoutNode, z2) && z3) {
            r0(layoutNode);
        }
    }

    public final void p0(final AndroidViewHolder androidViewHolder) {
        r(new qs2() { // from class: androidx.compose.ui.platform.AndroidComposeView$removeAndroidView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m91invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m91invoke() {
                AndroidComposeView.this.getAndroidViewsHandler$ui_release().removeViewInLayout(androidViewHolder);
                HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = AndroidComposeView.this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
                ku8.d(layoutNodeToHolder).remove(AndroidComposeView.this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(androidViewHolder));
                k99.v0(androidViewHolder, 0);
            }
        });
    }

    @Override // androidx.compose.ui.node.m
    public jm5 q(ss2 ss2Var, qs2 qs2Var) {
        jm5 jm5Var = (jm5) this.P0.b();
        if (jm5Var != null) {
            jm5Var.f(ss2Var, qs2Var);
            return jm5Var;
        }
        if (isHardwareAccelerated() && this.u0) {
            try {
                return new RenderNodeLayer(this, ss2Var, qs2Var);
            } catch (Throwable unused) {
                this.u0 = false;
            }
        }
        if (this.h0 == null) {
            ViewLayer.b bVar = ViewLayer.s;
            if (!bVar.a()) {
                bVar.d(new View(getContext()));
            }
            yu1 yu1Var = bVar.b() ? new yu1(getContext()) : new ja9(getContext());
            this.h0 = yu1Var;
            addView(yu1Var);
        }
        yu1 yu1Var2 = this.h0;
        zq3.e(yu1Var2);
        return new ViewLayer(this, yu1Var2, ss2Var, qs2Var);
    }

    public final void q0() {
        this.N = true;
    }

    @Override // androidx.compose.ui.node.m
    public void r(qs2 qs2Var) {
        if (this.Q0.j(qs2Var)) {
            return;
        }
        this.Q0.b(qs2Var);
    }

    @Override // androidx.compose.ui.node.m
    public void s(LayoutNode layoutNode) {
        this.k0.t(layoutNode);
        q0();
    }

    public final void setConfigurationChangeObserver(ss2 ss2Var) {
        this.L = ss2Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.r0 = j;
    }

    public final void setOnViewTreeOwnersAvailable(ss2 ss2Var) {
        c viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            ss2Var.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.x0 = ss2Var;
    }

    @Override // androidx.compose.ui.node.m
    public void setShowLayoutBounds(boolean z) {
        this.f0 = z;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.compose.ui.node.m
    public void t() {
        if (this.N) {
            getSnapshotObserver().b();
            this.N = false;
        }
        yg ygVar = this.g0;
        if (ygVar != null) {
            S(ygVar);
        }
        while (this.Q0.t()) {
            int q = this.Q0.q();
            for (int i = 0; i < q; i++) {
                qs2 qs2Var = (qs2) this.Q0.p()[i];
                this.Q0.B(i, null);
                if (qs2Var != null) {
                    qs2Var.mo865invoke();
                }
            }
            this.Q0.z(0, q);
        }
    }

    @Override // androidx.compose.ui.node.m
    public void u() {
        this.t.J0();
    }

    @Override // androidx.compose.ui.node.m
    public ld getAccessibilityManager() {
        return this.S;
    }

    @Override // androidx.compose.ui.node.m
    public xd getClipboardManager() {
        return this.Q;
    }
}
