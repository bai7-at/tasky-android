package androidx.compose.ui.platform;

import android.R;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.a85;
import defpackage.aj7;
import defpackage.aj8;
import defpackage.bj7;
import defpackage.d44;
import defpackage.dg4;
import defpackage.e64;
import defpackage.ei1;
import defpackage.fd5;
import defpackage.gj7;
import defpackage.gt2;
import defpackage.h3;
import defpackage.hd5;
import defpackage.hj7;
import defpackage.i3;
import defpackage.it2;
import defpackage.jm0;
import defpackage.k99;
import defpackage.kb9;
import defpackage.kg6;
import defpackage.kt6;
import defpackage.lh4;
import defpackage.m99;
import defpackage.md;
import defpackage.n27;
import defpackage.nc7;
import defpackage.ok6;
import defpackage.pe;
import defpackage.py7;
import defpackage.qe;
import defpackage.qs2;
import defpackage.r46;
import defpackage.rl1;
import defpackage.s64;
import defpackage.so;
import defpackage.ss2;
import defpackage.u2;
import defpackage.ue;
import defpackage.uo6;
import defpackage.ve;
import defpackage.vo;
import defpackage.vv0;
import defpackage.w2;
import defpackage.ww8;
import defpackage.y2;
import defpackage.z83;
import defpackage.zq3;
import defpackage.zv8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends w2 implements ei1 {
    public static final d r0 = new d(null);
    public static final int s0 = 8;
    private static final int[] t0 = {kg6.accessibility_custom_action_0, kg6.accessibility_custom_action_1, kg6.accessibility_custom_action_2, kg6.accessibility_custom_action_3, kg6.accessibility_custom_action_4, kg6.accessibility_custom_action_5, kg6.accessibility_custom_action_6, kg6.accessibility_custom_action_7, kg6.accessibility_custom_action_8, kg6.accessibility_custom_action_9, kg6.accessibility_custom_action_10, kg6.accessibility_custom_action_11, kg6.accessibility_custom_action_12, kg6.accessibility_custom_action_13, kg6.accessibility_custom_action_14, kg6.accessibility_custom_action_15, kg6.accessibility_custom_action_16, kg6.accessibility_custom_action_17, kg6.accessibility_custom_action_18, kg6.accessibility_custom_action_19, kg6.accessibility_custom_action_20, kg6.accessibility_custom_action_21, kg6.accessibility_custom_action_22, kg6.accessibility_custom_action_23, kg6.accessibility_custom_action_24, kg6.accessibility_custom_action_25, kg6.accessibility_custom_action_26, kg6.accessibility_custom_action_27, kg6.accessibility_custom_action_28, kg6.accessibility_custom_action_29, kg6.accessibility_custom_action_30, kg6.accessibility_custom_action_31};
    private int B;
    private Integer H;
    private final vo L;
    private final Channel M;
    private boolean N;
    private boolean Q;
    private vv0 S;
    private final so X;
    private final vo Y;
    private g Z;
    private final AndroidComposeView d;
    private Map e0;
    private vo f0;
    private final AccessibilityManager g;
    private HashMap g0;
    private boolean h;
    private HashMap h0;
    private final AccessibilityManager.AccessibilityStateChangeListener i;
    private final String i0;
    private final AccessibilityManager.TouchExplorationStateChangeListener j;
    private final String j0;
    private List k;
    private final zv8 k0;
    private TranslateStatus l;
    private Map l0;
    private final Handler m;
    private i m0;
    private i3 n;
    private boolean n0;
    private final Runnable o0;
    private final List p0;
    private final ss2 q0;
    private int r;
    private AccessibilityNodeInfo s;
    private boolean t;
    private final HashMap u;
    private final HashMap w;
    private py7 x;
    private py7 y;
    private int e = RecyclerView.UNDEFINED_DURATION;
    private ss2 f = new ss2() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1
        {
            super(1);
        }

        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(AndroidComposeViewAccessibilityDelegateCompat.this.s0().getParent().requestSendAccessibilityEvent(AndroidComposeViewAccessibilityDelegateCompat.this.s0(), accessibilityEvent));
        }
    };

    private enum TranslateStatus {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED
    }

    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager = AndroidComposeViewAccessibilityDelegateCompat.this.g;
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            accessibilityManager.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.i);
            accessibilityManager.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.j);
            if (AndroidComposeViewAccessibilityDelegateCompat.this.e0()) {
                return;
            }
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = AndroidComposeViewAccessibilityDelegateCompat.this;
            androidComposeViewAccessibilityDelegateCompat2.j1(androidComposeViewAccessibilityDelegateCompat2.f0(view));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AndroidComposeViewAccessibilityDelegateCompat.this.m.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.o0);
            AccessibilityManager accessibilityManager = AndroidComposeViewAccessibilityDelegateCompat.this.g;
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            accessibilityManager.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.i);
            accessibilityManager.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.j);
            AndroidComposeViewAccessibilityDelegateCompat.this.j1(null);
        }
    }

    private static final class b {
        public static final b a = new b();

        private b() {
        }

        public static final void a(h3 h3Var, SemanticsNode semanticsNode) {
            boolean p;
            u2 u2Var;
            p = AndroidComposeViewAccessibilityDelegateCompat_androidKt.p(semanticsNode);
            if (!p || (u2Var = (u2) SemanticsConfigurationKt.a(semanticsNode.v(), aj7.a.u())) == null) {
                return;
            }
            h3Var.b(new h3.a(R.id.accessibilityActionSetProgress, u2Var.b()));
        }
    }

    private static final class c {
        public static final c a = new c();

        private c() {
        }

        public static final void a(h3 h3Var, SemanticsNode semanticsNode) {
            boolean p;
            p = AndroidComposeViewAccessibilityDelegateCompat_androidKt.p(semanticsNode);
            if (p) {
                bj7 v = semanticsNode.v();
                aj7 aj7Var = aj7.a;
                u2 u2Var = (u2) SemanticsConfigurationKt.a(v, aj7Var.p());
                if (u2Var != null) {
                    h3Var.b(new h3.a(R.id.accessibilityActionPageUp, u2Var.b()));
                }
                u2 u2Var2 = (u2) SemanticsConfigurationKt.a(semanticsNode.v(), aj7Var.m());
                if (u2Var2 != null) {
                    h3Var.b(new h3.a(R.id.accessibilityActionPageDown, u2Var2.b()));
                }
                u2 u2Var3 = (u2) SemanticsConfigurationKt.a(semanticsNode.v(), aj7Var.n());
                if (u2Var3 != null) {
                    h3Var.b(new h3.a(R.id.accessibilityActionPageLeft, u2Var3.b()));
                }
                u2 u2Var4 = (u2) SemanticsConfigurationKt.a(semanticsNode.v(), aj7Var.o());
                if (u2Var4 != null) {
                    h3Var.b(new h3.a(R.id.accessibilityActionPageRight, u2Var4.b()));
                }
            }
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    private final class e extends AccessibilityNodeProvider {
        public e() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            AndroidComposeViewAccessibilityDelegateCompat.this.M(i, accessibilityNodeInfo, str, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            AccessibilityNodeInfo X = AndroidComposeViewAccessibilityDelegateCompat.this.X(i);
            if (AndroidComposeViewAccessibilityDelegateCompat.this.t && i == AndroidComposeViewAccessibilityDelegateCompat.this.r) {
                AndroidComposeViewAccessibilityDelegateCompat.this.s = X;
            }
            return X;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.r);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.M0(i, i2, bundle);
        }
    }

    private static final class f implements Comparator {
        public static final f a = new f();

        private f() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
            kt6 j = semanticsNode.j();
            kt6 j2 = semanticsNode2.j();
            int compare = Float.compare(j.i(), j2.i());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(j.l(), j2.l());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(j.e(), j2.e());
            return compare3 != 0 ? compare3 : Float.compare(j.j(), j2.j());
        }
    }

    private static final class g {
        private final SemanticsNode a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final long f;

        public g(SemanticsNode semanticsNode, int i, int i2, int i3, int i4, long j) {
            this.a = semanticsNode;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = j;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.d;
        }

        public final int c() {
            return this.c;
        }

        public final SemanticsNode d() {
            return this.a;
        }

        public final int e() {
            return this.e;
        }

        public final long f() {
            return this.f;
        }
    }

    private static final class h implements Comparator {
        public static final h a = new h();

        private h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
            kt6 j = semanticsNode.j();
            kt6 j2 = semanticsNode2.j();
            int compare = Float.compare(j2.j(), j.j());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(j.l(), j2.l());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(j.e(), j2.e());
            return compare3 != 0 ? compare3 : Float.compare(j2.i(), j.i());
        }
    }

    private static final class i {
        private final SemanticsNode a;
        private final bj7 b;
        private final Set c = new LinkedHashSet();

        public i(SemanticsNode semanticsNode, Map map) {
            this.a = semanticsNode;
            this.b = semanticsNode.v();
            List s = semanticsNode.s();
            int size = s.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode2 = (SemanticsNode) s.get(i);
                if (map.containsKey(Integer.valueOf(semanticsNode2.n()))) {
                    this.c.add(Integer.valueOf(semanticsNode2.n()));
                }
            }
        }

        public final Set a() {
            return this.c;
        }

        public final SemanticsNode b() {
            return this.a;
        }

        public final bj7 c() {
            return this.b;
        }

        public final boolean d() {
            return this.b.f(SemanticsProperties.a.r());
        }
    }

    private static final class j implements Comparator {
        public static final j a = new j();

        private j() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Pair pair, Pair pair2) {
            int compare = Float.compare(((kt6) pair.c()).l(), ((kt6) pair2.c()).l());
            return compare != 0 ? compare : Float.compare(((kt6) pair.c()).e(), ((kt6) pair2.c()).e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class k {
        public static final k a = new k();

        private k() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        
            r2 = r2.getText();
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
        
            r2 = r2.getValue("android:text");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void b(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r10, android.util.LongSparseArray r11) {
            /*
                r9 = this;
                db4 r9 = defpackage.mb4.a(r11)
            L4:
                boolean r0 = r9.hasNext()
                if (r0 == 0) goto L6c
                long r0 = r9.c()
                java.lang.Object r2 = r11.get(r0)
                android.view.translation.ViewTranslationResponse r2 = defpackage.re.a(r2)
                if (r2 == 0) goto L4
                java.lang.String r3 = "android:text"
                android.view.translation.TranslationResponseValue r2 = defpackage.se.a(r2, r3)
                if (r2 == 0) goto L4
                java.lang.CharSequence r2 = defpackage.te.a(r2)
                if (r2 == 0) goto L4
                java.util.Map r3 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.x(r10)
                int r0 = (int) r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object r0 = r3.get(r0)
                hj7 r0 = (defpackage.hj7) r0
                if (r0 == 0) goto L4
                androidx.compose.ui.semantics.SemanticsNode r0 = r0.b()
                if (r0 == 0) goto L4
                bj7 r0 = r0.v()
                aj7 r1 = defpackage.aj7.a
                androidx.compose.ui.semantics.SemanticsPropertyKey r1 = r1.x()
                java.lang.Object r0 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r0, r1)
                u2 r0 = (defpackage.u2) r0
                if (r0 == 0) goto L4
                lt2 r0 = r0.a()
                ss2 r0 = (defpackage.ss2) r0
                if (r0 == 0) goto L4
                androidx.compose.ui.text.a r1 = new androidx.compose.ui.text.a
                java.lang.String r4 = r2.toString()
                r7 = 6
                r8 = 0
                r5 = 0
                r6 = 0
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8)
                java.lang.Object r0 = r0.invoke(r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                goto L4
            L6c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.k.b(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat, android.util.LongSparseArray):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, LongSparseArray longSparseArray) {
            a.b(androidComposeViewAccessibilityDelegateCompat, longSparseArray);
        }

        public final void c(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
            SemanticsNode b;
            String x;
            TranslationRequestValue forText;
            ViewTranslationRequest build;
            for (long j : jArr) {
                hj7 hj7Var = (hj7) androidComposeViewAccessibilityDelegateCompat.g0().get(Integer.valueOf((int) j));
                if (hj7Var != null && (b = hj7Var.b()) != null) {
                    qe.a();
                    ViewTranslationRequest.Builder a2 = pe.a(androidComposeViewAccessibilityDelegateCompat.s0().getAutofillId(), b.n());
                    x = AndroidComposeViewAccessibilityDelegateCompat_androidKt.x(b);
                    if (x != null) {
                        forText = TranslationRequestValue.forText(new androidx.compose.ui.text.a(x, null, null, 6, null));
                        a2.setValue("android:text", forText);
                        build = a2.build();
                        consumer.accept(build);
                    }
                }
            }
        }

        public final void d(final AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, final LongSparseArray<ViewTranslationResponse> longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (zq3.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                b(androidComposeViewAccessibilityDelegateCompat, longSparseArray);
            } else {
                androidComposeViewAccessibilityDelegateCompat.s0().post(new Runnable() { // from class: androidx.compose.ui.platform.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidComposeViewAccessibilityDelegateCompat.k.e(AndroidComposeViewAccessibilityDelegateCompat.this, longSparseArray);
                    }
                });
            }
        }
    }

    public /* synthetic */ class l {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        zq3.f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.g = accessibilityManager;
        this.i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: je
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.a0(AndroidComposeViewAccessibilityDelegateCompat.this, z);
            }
        };
        this.j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: ke
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.w1(AndroidComposeViewAccessibilityDelegateCompat.this, z);
            }
        };
        this.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.l = TranslateStatus.SHOW_ORIGINAL;
        this.m = new Handler(Looper.getMainLooper());
        this.n = new i3(new e());
        this.r = RecyclerView.UNDEFINED_DURATION;
        this.u = new HashMap();
        this.w = new HashMap();
        this.x = new py7(0, 1, null);
        this.y = new py7(0, 1, null);
        this.B = -1;
        this.L = new vo(0, 1, null);
        this.M = ChannelKt.Channel$default(1, null, null, 6, null);
        this.N = true;
        this.X = new so();
        this.Y = new vo(0, 1, null);
        this.e0 = kotlin.collections.t.i();
        this.f0 = new vo(0, 1, null);
        this.g0 = new HashMap();
        this.h0 = new HashMap();
        this.i0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.j0 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.k0 = new zv8();
        this.l0 = new LinkedHashMap();
        this.m0 = new i(androidComposeView.getSemanticsOwner().a(), kotlin.collections.t.i());
        androidComposeView.addOnAttachStateChangeListener(new a());
        this.o0 = new Runnable() { // from class: le
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.V0(AndroidComposeViewAccessibilityDelegateCompat.this);
            }
        };
        this.p0 = new ArrayList();
        this.q0 = new ss2() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            {
                super(1);
            }

            public final void b(t tVar) {
                AndroidComposeViewAccessibilityDelegateCompat.this.U0(tVar);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((t) obj);
                return ww8.a;
            }
        };
    }

    private final boolean A0() {
        return !AndroidComposeViewAccessibilityDelegateCompat_androidKt.v() && (this.S != null || this.Q);
    }

    private final void A1(SemanticsNode semanticsNode) {
        if (A0()) {
            Q(semanticsNode.n());
            List s = semanticsNode.s();
            int size = s.size();
            for (int i2 = 0; i2 < size; i2++) {
                A1((SemanticsNode) s.get(i2));
            }
        }
    }

    private final boolean B0(SemanticsNode semanticsNode) {
        String w;
        w = AndroidComposeViewAccessibilityDelegateCompat_androidKt.w(semanticsNode);
        boolean z = (w == null && n0(semanticsNode) == null && m0(semanticsNode) == null && !l0(semanticsNode)) ? false : true;
        if (semanticsNode.v().t()) {
            return true;
        }
        return semanticsNode.z() && z;
    }

    private final void B1(int i2) {
        int i3 = this.e;
        if (i3 == i2) {
            return;
        }
        this.e = i2;
        c1(this, i2, 128, null, null, 12, null);
        c1(this, i3, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, null, null, 12, null);
    }

    private final boolean C0() {
        return this.h || (this.g.isEnabled() && this.g.isTouchExplorationEnabled());
    }

    private final void C1() {
        boolean y;
        bj7 c2;
        boolean y2;
        vo voVar = new vo(0, 1, null);
        Iterator it2 = this.f0.iterator();
        while (it2.hasNext()) {
            int intValue = ((Number) it2.next()).intValue();
            hj7 hj7Var = (hj7) g0().get(Integer.valueOf(intValue));
            SemanticsNode b2 = hj7Var != null ? hj7Var.b() : null;
            if (b2 != null) {
                y2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.y(b2);
                if (!y2) {
                }
            }
            voVar.add(Integer.valueOf(intValue));
            i iVar = (i) this.l0.get(Integer.valueOf(intValue));
            d1(intValue, 32, (iVar == null || (c2 = iVar.c()) == null) ? null : (String) SemanticsConfigurationKt.a(c2, SemanticsProperties.a.r()));
        }
        this.f0.n(voVar);
        this.l0.clear();
        for (Map.Entry entry : g0().entrySet()) {
            y = AndroidComposeViewAccessibilityDelegateCompat_androidKt.y(((hj7) entry.getValue()).b());
            if (y && this.f0.add(entry.getKey())) {
                d1(((Number) entry.getKey()).intValue(), 16, (String) ((hj7) entry.getValue()).b().v().n(SemanticsProperties.a.r()));
            }
            this.l0.put(entry.getKey(), new i(((hj7) entry.getValue()).b(), g0()));
        }
        this.m0 = new i(this.d.getSemanticsOwner().a(), g0());
    }

    private final void D0() {
        vv0 vv0Var = this.S;
        if (vv0Var == null) {
            return;
        }
        if (!this.X.isEmpty()) {
            List X0 = kotlin.collections.i.X0(this.X.values());
            ArrayList arrayList = new ArrayList(X0.size());
            int size = X0.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((kb9) X0.get(i2)).f());
            }
            vv0Var.d(arrayList);
            this.X.clear();
        }
        if (this.Y.isEmpty()) {
            return;
        }
        List X02 = kotlin.collections.i.X0(this.Y);
        ArrayList arrayList2 = new ArrayList(X02.size());
        int size2 = X02.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList2.add(Long.valueOf(((Number) X02.get(i3)).intValue()));
        }
        vv0Var.e(kotlin.collections.i.Y0(arrayList2));
        this.Y.clear();
    }

    private final void D1(SemanticsNode semanticsNode) {
        u2 u2Var;
        ss2 ss2Var;
        ss2 ss2Var2;
        bj7 v = semanticsNode.v();
        Boolean bool = (Boolean) SemanticsConfigurationKt.a(v, SemanticsProperties.a.o());
        if (this.l == TranslateStatus.SHOW_ORIGINAL && zq3.c(bool, Boolean.TRUE)) {
            u2 u2Var2 = (u2) SemanticsConfigurationKt.a(v, aj7.a.y());
            if (u2Var2 == null || (ss2Var2 = (ss2) u2Var2.a()) == null) {
                return;
            }
            return;
        }
        if (this.l != TranslateStatus.SHOW_TRANSLATED || !zq3.c(bool, Boolean.FALSE) || (u2Var = (u2) SemanticsConfigurationKt.a(v, aj7.a.y())) == null || (ss2Var = (ss2) u2Var.a()) == null) {
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(LayoutNode layoutNode) {
        if (this.L.add(layoutNode)) {
            this.M.mo129trySendJP2dKIU(ww8.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        SemanticsNode b2;
        hj7 hj7Var = (hj7) g0().get(Integer.valueOf(i2));
        if (hj7Var == null || (b2 = hj7Var.b()) == null) {
            return;
        }
        String o0 = o0(b2);
        if (zq3.c(str, this.i0)) {
            Integer num = (Integer) this.g0.get(Integer.valueOf(i2));
            if (num != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
                return;
            }
            return;
        }
        if (zq3.c(str, this.j0)) {
            Integer num2 = (Integer) this.h0.get(Integer.valueOf(i2));
            if (num2 != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                return;
            }
            return;
        }
        if (!b2.v().f(aj7.a.h()) || bundle == null || !zq3.c(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            bj7 v = b2.v();
            SemanticsProperties semanticsProperties = SemanticsProperties.a;
            if (!v.f(semanticsProperties.y()) || bundle == null || !zq3.c(str, "androidx.compose.ui.semantics.testTag")) {
                if (zq3.c(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, b2.n());
                    return;
                }
                return;
            } else {
                String str2 = (String) SemanticsConfigurationKt.a(b2.v(), semanticsProperties.y());
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i4 > 0 && i3 >= 0) {
            if (i3 < (o0 != null ? o0.length() : Integer.MAX_VALUE)) {
                aj8 r02 = r0(b2.v());
                if (r02 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    int i6 = i3 + i5;
                    if (i6 >= r02.l().j().length()) {
                        arrayList.add(null);
                    } else {
                        arrayList.add(u1(b2, r02.d(i6)));
                    }
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x018b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01aa  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v20, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0188 -> B:84:0x0189). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean M0(int r13, int r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 1626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.M0(int, int, android.os.Bundle):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect N(hj7 hj7Var) {
        Rect a2 = hj7Var.a();
        long i0 = this.d.i0(hd5.a(a2.left, a2.top));
        long i02 = this.d.i0(hd5.a(a2.right, a2.bottom));
        return new Rect((int) Math.floor(fd5.o(i0)), (int) Math.floor(fd5.p(i0)), (int) Math.ceil(fd5.o(i02)), (int) Math.ceil(fd5.p(i02)));
    }

    private static final boolean N0(nc7 nc7Var, float f2) {
        return (f2 < 0.0f && ((Number) nc7Var.c().mo865invoke()).floatValue() > 0.0f) || (f2 > 0.0f && ((Number) nc7Var.c().mo865invoke()).floatValue() < ((Number) nc7Var.a().mo865invoke()).floatValue());
    }

    private static final float O0(float f2, float f3) {
        if (Math.signum(f2) == Math.signum(f3)) {
            return Math.abs(f2) < Math.abs(f3) ? f2 : f3;
        }
        return 0.0f;
    }

    private final void P(int i2, kb9 kb9Var) {
        if (kb9Var == null) {
            return;
        }
        if (this.Y.contains(Integer.valueOf(i2))) {
            this.Y.remove(Integer.valueOf(i2));
        } else {
            this.X.put(Integer.valueOf(i2), kb9Var);
        }
    }

    private final void P0(int i2, h3 h3Var, SemanticsNode semanticsNode) {
        boolean A;
        String w;
        boolean p;
        boolean B;
        boolean p2;
        boolean p3;
        boolean p4;
        boolean p5;
        boolean p6;
        boolean q;
        boolean p7;
        boolean p8;
        boolean z;
        String E;
        h3Var.e0("android.view.View");
        bj7 v = semanticsNode.v();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        n27 n27Var = (n27) SemanticsConfigurationKt.a(v, semanticsProperties.u());
        if (n27Var != null) {
            n27Var.n();
            if (semanticsNode.w() || semanticsNode.s().isEmpty()) {
                n27.a aVar = n27.b;
                if (n27.k(n27Var.n(), aVar.g())) {
                    h3Var.E0(this.d.getContext().getResources().getString(ok6.tab));
                } else if (n27.k(n27Var.n(), aVar.f())) {
                    h3Var.E0(this.d.getContext().getResources().getString(ok6.switch_role));
                } else {
                    E = AndroidComposeViewAccessibilityDelegateCompat_androidKt.E(n27Var.n());
                    if (!n27.k(n27Var.n(), aVar.d()) || semanticsNode.z() || semanticsNode.v().t()) {
                        h3Var.e0(E);
                    }
                }
            }
            ww8 ww8Var = ww8.a;
        }
        if (semanticsNode.v().f(aj7.a.w())) {
            h3Var.e0("android.widget.EditText");
        }
        if (semanticsNode.m().f(semanticsProperties.z())) {
            h3Var.e0("android.widget.TextView");
        }
        h3Var.y0(this.d.getContext().getPackageName());
        A = AndroidComposeViewAccessibilityDelegateCompat_androidKt.A(semanticsNode);
        h3Var.s0(A);
        List s = semanticsNode.s();
        int size = s.size();
        for (int i3 = 0; i3 < size; i3++) {
            SemanticsNode semanticsNode2 = (SemanticsNode) s.get(i3);
            if (g0().containsKey(Integer.valueOf(semanticsNode2.n()))) {
                AndroidViewHolder androidViewHolder = this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.p());
                if (androidViewHolder != null) {
                    h3Var.c(androidViewHolder);
                } else {
                    h3Var.d(this.d, semanticsNode2.n());
                }
            }
        }
        if (i2 == this.r) {
            h3Var.Z(true);
            h3Var.b(h3.a.l);
        } else {
            h3Var.Z(false);
            h3Var.b(h3.a.k);
        }
        n1(semanticsNode, h3Var);
        k1(semanticsNode, h3Var);
        m1(semanticsNode, h3Var);
        l1(semanticsNode, h3Var);
        bj7 v2 = semanticsNode.v();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.a;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.a(v2, semanticsProperties2.C());
        if (toggleableState != null) {
            if (toggleableState == ToggleableState.On) {
                h3Var.d0(true);
            } else if (toggleableState == ToggleableState.Off) {
                h3Var.d0(false);
            }
            ww8 ww8Var2 = ww8.a;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.a(semanticsNode.v(), semanticsProperties2.w());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (n27Var == null ? false : n27.k(n27Var.n(), n27.b.g())) {
                h3Var.H0(booleanValue);
            } else {
                h3Var.d0(booleanValue);
            }
            ww8 ww8Var3 = ww8.a;
        }
        if (!semanticsNode.v().t() || semanticsNode.s().isEmpty()) {
            w = AndroidComposeViewAccessibilityDelegateCompat_androidKt.w(semanticsNode);
            h3Var.i0(w);
        }
        String str = (String) SemanticsConfigurationKt.a(semanticsNode.v(), semanticsProperties2.y());
        if (str != null) {
            SemanticsNode semanticsNode3 = semanticsNode;
            while (true) {
                if (semanticsNode3 == null) {
                    z = false;
                    break;
                }
                bj7 v3 = semanticsNode3.v();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.a;
                if (v3.f(semanticsPropertiesAndroid.a())) {
                    z = ((Boolean) semanticsNode3.v().n(semanticsPropertiesAndroid.a())).booleanValue();
                    break;
                }
                semanticsNode3 = semanticsNode3.q();
            }
            if (z) {
                h3Var.R0(str);
            }
        }
        bj7 v4 = semanticsNode.v();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.a;
        if (((ww8) SemanticsConfigurationKt.a(v4, semanticsProperties3.h())) != null) {
            h3Var.q0(true);
            ww8 ww8Var4 = ww8.a;
        }
        h3Var.C0(semanticsNode.m().f(semanticsProperties3.s()));
        bj7 v5 = semanticsNode.v();
        aj7 aj7Var = aj7.a;
        h3Var.l0(v5.f(aj7Var.w()));
        p = AndroidComposeViewAccessibilityDelegateCompat_androidKt.p(semanticsNode);
        h3Var.m0(p);
        h3Var.o0(semanticsNode.v().f(semanticsProperties3.g()));
        if (h3Var.J()) {
            h3Var.p0(((Boolean) semanticsNode.v().n(semanticsProperties3.g())).booleanValue());
            if (h3Var.K()) {
                h3Var.a(2);
            } else {
                h3Var.a(1);
            }
        }
        B = AndroidComposeViewAccessibilityDelegateCompat_androidKt.B(semanticsNode);
        h3Var.S0(B);
        s64 s64Var = (s64) SemanticsConfigurationKt.a(semanticsNode.v(), semanticsProperties3.q());
        if (s64Var != null) {
            int i4 = s64Var.i();
            s64.a aVar2 = s64.b;
            h3Var.u0((s64.f(i4, aVar2.b()) || !s64.f(i4, aVar2.a())) ? 1 : 2);
            ww8 ww8Var5 = ww8.a;
        }
        h3Var.f0(false);
        u2 u2Var = (u2) SemanticsConfigurationKt.a(semanticsNode.v(), aj7Var.j());
        if (u2Var != null) {
            boolean c2 = zq3.c(SemanticsConfigurationKt.a(semanticsNode.v(), semanticsProperties3.w()), Boolean.TRUE);
            h3Var.f0(!c2);
            p8 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.p(semanticsNode);
            if (p8 && !c2) {
                h3Var.b(new h3.a(16, u2Var.b()));
            }
            ww8 ww8Var6 = ww8.a;
        }
        h3Var.v0(false);
        u2 u2Var2 = (u2) SemanticsConfigurationKt.a(semanticsNode.v(), aj7Var.l());
        if (u2Var2 != null) {
            h3Var.v0(true);
            p7 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.p(semanticsNode);
            if (p7) {
                h3Var.b(new h3.a(32, u2Var2.b()));
            }
            ww8 ww8Var7 = ww8.a;
        }
        u2 u2Var3 = (u2) SemanticsConfigurationKt.a(semanticsNode.v(), aj7Var.c());
        if (u2Var3 != null) {
            h3Var.b(new h3.a(Http2.INITIAL_MAX_FRAME_SIZE, u2Var3.b()));
            ww8 ww8Var8 = ww8.a;
        }
        p2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.p(semanticsNode);
        if (p2) {
            u2 u2Var4 = (u2) SemanticsConfigurationKt.a(semanticsNode.v(), aj7Var.w());
            if (u2Var4 != null) {
                h3Var.b(new h3.a(2097152, u2Var4.b()));
                ww8 ww8Var9 = ww8.a;
            }
            u2 u2Var5 = (u2) SemanticsConfigurationKt.a(semanticsNode.v(), aj7Var.k());
            if (u2Var5 != null) {
                h3Var.b(new h3.a(R.id.accessibilityActionImeEnter, u2Var5.b()));
                ww8 ww8Var10 = ww8.a;
            }
            u2 u2Var6 = (u2) SemanticsConfigurationKt.a(semanticsNode.v(), aj7Var.e());
            if (u2Var6 != null) {
                h3Var.b(new h3.a(65536, u2Var6.b()));
                ww8 ww8Var11 = ww8.a;
            }
            u2 u2Var7 = (u2) SemanticsConfigurationKt.a(semanticsNode.v(), aj7Var.q());
            if (u2Var7 != null) {
                if (h3Var.K() && this.d.getClipboardManager().b()) {
                    h3Var.b(new h3.a(32768, u2Var7.b()));
                }
                ww8 ww8Var12 = ww8.a;
            }
        }
        String o0 = o0(semanticsNode);
        if (!(o0 == null || o0.length() == 0)) {
            h3Var.M0(d0(semanticsNode), c0(semanticsNode));
            u2 u2Var8 = (u2) SemanticsConfigurationKt.a(semanticsNode.v(), aj7Var.v());
            h3Var.b(new h3.a(131072, u2Var8 != null ? u2Var8.b() : null));
            h3Var.a(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
            h3Var.a(512);
            h3Var.x0(11);
            List list = (List) SemanticsConfigurationKt.a(semanticsNode.v(), semanticsProperties3.c());
            if ((list == null || list.isEmpty()) && semanticsNode.v().f(aj7Var.h())) {
                q = AndroidComposeViewAccessibilityDelegateCompat_androidKt.q(semanticsNode);
                if (!q) {
                    h3Var.x0(h3Var.v() | 20);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("androidx.compose.ui.semantics.id");
        CharSequence y = h3Var.y();
        if (!(y == null || y.length() == 0) && semanticsNode.v().f(aj7Var.h())) {
            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
        }
        if (semanticsNode.v().f(semanticsProperties3.y())) {
            arrayList.add("androidx.compose.ui.semantics.testTag");
        }
        androidx.compose.ui.platform.g.a.a(h3Var.T0(), arrayList);
        r46 r46Var = (r46) SemanticsConfigurationKt.a(semanticsNode.v(), semanticsProperties3.t());
        if (r46Var != null) {
            if (semanticsNode.v().f(aj7Var.u())) {
                h3Var.e0("android.widget.SeekBar");
            } else {
                h3Var.e0("android.widget.ProgressBar");
            }
            if (r46Var != r46.d.a()) {
                h3Var.D0(h3.g.a(1, ((Number) r46Var.c().a()).floatValue(), ((Number) r46Var.c().f()).floatValue(), r46Var.b()));
            }
            if (semanticsNode.v().f(aj7Var.u())) {
                p6 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.p(semanticsNode);
                if (p6) {
                    if (r46Var.b() < uo6.c(((Number) r46Var.c().f()).floatValue(), ((Number) r46Var.c().a()).floatValue())) {
                        h3Var.b(h3.a.q);
                    }
                    if (r46Var.b() > uo6.h(((Number) r46Var.c().a()).floatValue(), ((Number) r46Var.c().f()).floatValue())) {
                        h3Var.b(h3.a.r);
                    }
                }
            }
        }
        b.a(h3Var, semanticsNode);
        CollectionInfo_androidKt.d(semanticsNode, h3Var);
        CollectionInfo_androidKt.e(semanticsNode, h3Var);
        nc7 nc7Var = (nc7) SemanticsConfigurationKt.a(semanticsNode.v(), semanticsProperties3.i());
        u2 u2Var9 = (u2) SemanticsConfigurationKt.a(semanticsNode.v(), aj7Var.s());
        if (nc7Var != null && u2Var9 != null) {
            if (!CollectionInfo_androidKt.b(semanticsNode)) {
                h3Var.e0("android.widget.HorizontalScrollView");
            }
            if (((Number) nc7Var.a().mo865invoke()).floatValue() > 0.0f) {
                h3Var.G0(true);
            }
            p5 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.p(semanticsNode);
            if (p5) {
                if (R0(nc7Var)) {
                    h3Var.b(h3.a.q);
                    h3Var.b(!(semanticsNode.o().getLayoutDirection() == LayoutDirection.Rtl) ? h3.a.F : h3.a.D);
                }
                if (Q0(nc7Var)) {
                    h3Var.b(h3.a.r);
                    h3Var.b(!(semanticsNode.o().getLayoutDirection() == LayoutDirection.Rtl) ? h3.a.D : h3.a.F);
                }
            }
        }
        nc7 nc7Var2 = (nc7) SemanticsConfigurationKt.a(semanticsNode.v(), semanticsProperties3.E());
        if (nc7Var2 != null && u2Var9 != null) {
            if (!CollectionInfo_androidKt.b(semanticsNode)) {
                h3Var.e0("android.widget.ScrollView");
            }
            if (((Number) nc7Var2.a().mo865invoke()).floatValue() > 0.0f) {
                h3Var.G0(true);
            }
            p4 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.p(semanticsNode);
            if (p4) {
                if (R0(nc7Var2)) {
                    h3Var.b(h3.a.q);
                    h3Var.b(h3.a.E);
                }
                if (Q0(nc7Var2)) {
                    h3Var.b(h3.a.r);
                    h3Var.b(h3.a.C);
                }
            }
        }
        c.a(h3Var, semanticsNode);
        h3Var.z0((CharSequence) SemanticsConfigurationKt.a(semanticsNode.v(), semanticsProperties3.r()));
        p3 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.p(semanticsNode);
        if (p3) {
            u2 u2Var10 = (u2) SemanticsConfigurationKt.a(semanticsNode.v(), aj7Var.g());
            if (u2Var10 != null) {
                h3Var.b(new h3.a(262144, u2Var10.b()));
                ww8 ww8Var13 = ww8.a;
            }
            u2 u2Var11 = (u2) SemanticsConfigurationKt.a(semanticsNode.v(), aj7Var.b());
            if (u2Var11 != null) {
                h3Var.b(new h3.a(524288, u2Var11.b()));
                ww8 ww8Var14 = ww8.a;
            }
            u2 u2Var12 = (u2) SemanticsConfigurationKt.a(semanticsNode.v(), aj7Var.f());
            if (u2Var12 != null) {
                h3Var.b(new h3.a(Constants.MB, u2Var12.b()));
                ww8 ww8Var15 = ww8.a;
            }
            if (semanticsNode.v().f(aj7Var.d())) {
                List list2 = (List) semanticsNode.v().n(aj7Var.d());
                int size2 = list2.size();
                int[] iArr = t0;
                if (size2 >= iArr.length) {
                    throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                }
                py7 py7Var = new py7(0, 1, null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (this.y.d(i2)) {
                    Map map = (Map) this.y.e(i2);
                    List D0 = kotlin.collections.d.D0(iArr);
                    ArrayList arrayList2 = new ArrayList();
                    if (list2.size() > 0) {
                        lh4.a(list2.get(0));
                        zq3.e(map);
                        throw null;
                    }
                    if (arrayList2.size() > 0) {
                        lh4.a(arrayList2.get(0));
                        ((Number) D0.get(0)).intValue();
                        throw null;
                    }
                } else if (list2.size() > 0) {
                    lh4.a(list2.get(0));
                    int i5 = iArr[0];
                    throw null;
                }
                this.x.i(i2, py7Var);
                this.y.i(i2, linkedHashMap);
            }
        }
        h3Var.F0(B0(semanticsNode));
        Integer num = (Integer) this.g0.get(Integer.valueOf(i2));
        if (num != null) {
            View D = AndroidComposeViewAccessibilityDelegateCompat_androidKt.D(this.d.getAndroidViewsHandler$ui_release(), num.intValue());
            if (D != null) {
                h3Var.P0(D);
            } else {
                h3Var.Q0(this.d, num.intValue());
            }
            M(i2, h3Var.T0(), this.i0, null);
            ww8 ww8Var16 = ww8.a;
        }
        Integer num2 = (Integer) this.h0.get(Integer.valueOf(i2));
        if (num2 != null) {
            View D2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.D(this.d.getAndroidViewsHandler$ui_release(), num2.intValue());
            if (D2 != null) {
                h3Var.N0(D2);
                M(i2, h3Var.T0(), this.j0, null);
            }
            ww8 ww8Var17 = ww8.a;
        }
    }

    private final void Q(int i2) {
        if (this.X.containsKey(Integer.valueOf(i2))) {
            this.X.remove(Integer.valueOf(i2));
        } else {
            this.Y.add(Integer.valueOf(i2));
        }
    }

    private static final boolean Q0(nc7 nc7Var) {
        return (((Number) nc7Var.c().mo865invoke()).floatValue() > 0.0f && !nc7Var.b()) || (((Number) nc7Var.c().mo865invoke()).floatValue() < ((Number) nc7Var.a().mo865invoke()).floatValue() && nc7Var.b());
    }

    private static final boolean R0(nc7 nc7Var) {
        return (((Number) nc7Var.c().mo865invoke()).floatValue() < ((Number) nc7Var.a().mo865invoke()).floatValue() && !nc7Var.b()) || (((Number) nc7Var.c().mo865invoke()).floatValue() > 0.0f && nc7Var.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:15:0x003c->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean S(java.util.Collection r5, boolean r6, int r7, long r8) {
        /*
            r4 = this;
            fd5$a r4 = defpackage.fd5.b
            long r0 = r4.b()
            boolean r4 = defpackage.fd5.l(r8, r0)
            r0 = 0
            if (r4 != 0) goto Lbd
            boolean r4 = defpackage.fd5.r(r8)
            if (r4 != 0) goto L15
            goto Lbd
        L15:
            r4 = 1
            if (r6 != r4) goto L1f
            androidx.compose.ui.semantics.SemanticsProperties r6 = androidx.compose.ui.semantics.SemanticsProperties.a
            androidx.compose.ui.semantics.SemanticsPropertyKey r6 = r6.E()
            goto L27
        L1f:
            if (r6 != 0) goto Lb7
            androidx.compose.ui.semantics.SemanticsProperties r6 = androidx.compose.ui.semantics.SemanticsProperties.a
            androidx.compose.ui.semantics.SemanticsPropertyKey r6 = r6.i()
        L27:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r1 = r5 instanceof java.util.Collection
            if (r1 == 0) goto L38
            r1 = r5
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L38
            goto Lb6
        L38:
            java.util.Iterator r5 = r5.iterator()
        L3c:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto Lb6
            java.lang.Object r1 = r5.next()
            hj7 r1 = (defpackage.hj7) r1
            android.graphics.Rect r2 = r1.a()
            kt6 r2 = defpackage.mt6.c(r2)
            boolean r2 = r2.b(r8)
            if (r2 != 0) goto L58
        L56:
            r1 = r0
            goto Lb3
        L58:
            androidx.compose.ui.semantics.SemanticsNode r1 = r1.b()
            bj7 r1 = r1.m()
            java.lang.Object r1 = androidx.compose.ui.semantics.SemanticsConfigurationKt.a(r1, r6)
            nc7 r1 = (defpackage.nc7) r1
            if (r1 != 0) goto L69
            goto L56
        L69:
            boolean r2 = r1.b()
            if (r2 == 0) goto L71
            int r2 = -r7
            goto L72
        L71:
            r2 = r7
        L72:
            if (r7 != 0) goto L7b
            boolean r3 = r1.b()
            if (r3 == 0) goto L7b
            r2 = -1
        L7b:
            if (r2 >= 0) goto L92
            qs2 r1 = r1.c()
            java.lang.Object r1 = r1.mo865invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L56
        L90:
            r1 = r4
            goto Lb3
        L92:
            qs2 r2 = r1.c()
            java.lang.Object r2 = r2.mo865invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            qs2 r1 = r1.a()
            java.lang.Object r1 = r1.mo865invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 >= 0) goto L56
            goto L90
        Lb3:
            if (r1 == 0) goto L3c
            r0 = r4
        Lb6:
            return r0
        Lb7:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        Lbd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.S(java.util.Collection, boolean, int, long):boolean");
    }

    private final boolean S0(int i2, List list) {
        t r;
        boolean z;
        r = AndroidComposeViewAccessibilityDelegateCompat_androidKt.r(list, i2);
        if (r != null) {
            z = false;
        } else {
            r = new t(i2, this.p0, null, null, null, null);
            z = true;
        }
        this.p0.add(r);
        return z;
    }

    private final void T() {
        if (z0()) {
            X0(this.d.getSemanticsOwner().a(), this.m0);
        }
        if (A0()) {
            Y0(this.d.getSemanticsOwner().a(), this.m0);
        }
        f1(g0());
        C1();
    }

    private final boolean T0(int i2) {
        if (!C0() || w0(i2)) {
            return false;
        }
        int i3 = this.r;
        if (i3 != Integer.MIN_VALUE) {
            c1(this, i3, 65536, null, null, 12, null);
        }
        this.r = i2;
        this.d.invalidate();
        c1(this, i2, 32768, null, null, 12, null);
        return true;
    }

    private final boolean U(int i2) {
        if (!w0(i2)) {
            return false;
        }
        this.r = RecyclerView.UNDEFINED_DURATION;
        this.s = null;
        this.d.invalidate();
        c1(this, i2, 65536, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0(final t tVar) {
        if (tVar.M0()) {
            this.d.getSnapshotObserver().i(tVar, this.q0, new qs2() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m93invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m93invoke() {
                    int W0;
                    SemanticsNode b2;
                    LayoutNode p;
                    HashMap hashMap;
                    HashMap hashMap2;
                    AccessibilityNodeInfo accessibilityNodeInfo;
                    Rect N;
                    nc7 a2 = t.this.a();
                    nc7 e2 = t.this.e();
                    Float b3 = t.this.b();
                    Float c2 = t.this.c();
                    float floatValue = (a2 == null || b3 == null) ? 0.0f : ((Number) a2.c().mo865invoke()).floatValue() - b3.floatValue();
                    float floatValue2 = (e2 == null || c2 == null) ? 0.0f : ((Number) e2.c().mo865invoke()).floatValue() - c2.floatValue();
                    if (floatValue != 0.0f || floatValue2 != 0.0f) {
                        W0 = this.W0(t.this.d());
                        hj7 hj7Var = (hj7) this.g0().get(Integer.valueOf(this.r));
                        if (hj7Var != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
                            try {
                                accessibilityNodeInfo = androidComposeViewAccessibilityDelegateCompat.s;
                                if (accessibilityNodeInfo != null) {
                                    N = androidComposeViewAccessibilityDelegateCompat.N(hj7Var);
                                    accessibilityNodeInfo.setBoundsInScreen(N);
                                    ww8 ww8Var = ww8.a;
                                }
                            } catch (IllegalStateException unused) {
                                ww8 ww8Var2 = ww8.a;
                            }
                        }
                        this.s0().invalidate();
                        hj7 hj7Var2 = (hj7) this.g0().get(Integer.valueOf(W0));
                        if (hj7Var2 != null && (b2 = hj7Var2.b()) != null && (p = b2.p()) != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this;
                            if (a2 != null) {
                                Integer valueOf = Integer.valueOf(W0);
                                hashMap2 = androidComposeViewAccessibilityDelegateCompat2.u;
                                hashMap2.put(valueOf, a2);
                            }
                            if (e2 != null) {
                                Integer valueOf2 = Integer.valueOf(W0);
                                hashMap = androidComposeViewAccessibilityDelegateCompat2.w;
                                hashMap.put(valueOf2, e2);
                            }
                            androidComposeViewAccessibilityDelegateCompat2.E0(p);
                        }
                    }
                    if (a2 != null) {
                        t.this.g((Float) a2.c().mo865invoke());
                    }
                    if (e2 != null) {
                        t.this.h((Float) e2.c().mo865invoke());
                    }
                }
            });
        }
    }

    private final void V() {
        u2 u2Var;
        qs2 qs2Var;
        Iterator it2 = g0().values().iterator();
        while (it2.hasNext()) {
            bj7 v = ((hj7) it2.next()).b().v();
            if (SemanticsConfigurationKt.a(v, SemanticsProperties.a.o()) != null && (u2Var = (u2) SemanticsConfigurationKt.a(v, aj7.a.a())) != null && (qs2Var = (qs2) u2Var.a()) != null) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        androidx.compose.ui.node.m.b(androidComposeViewAccessibilityDelegateCompat.d, false, 1, null);
        androidComposeViewAccessibilityDelegateCompat.T();
        androidComposeViewAccessibilityDelegateCompat.n0 = false;
    }

    private final AccessibilityEvent W(int i2, int i3) {
        hj7 hj7Var;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.d.getContext().getPackageName());
        obtain.setSource(this.d, i2);
        if (z0() && (hj7Var = (hj7) g0().get(Integer.valueOf(i2))) != null) {
            obtain.setPassword(hj7Var.b().m().f(SemanticsProperties.a.s()));
        }
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int W0(int i2) {
        if (i2 == this.d.getSemanticsOwner().a().n()) {
            return -1;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AccessibilityNodeInfo X(int i2) {
        d44 a2;
        Lifecycle lifecycle;
        AndroidComposeView.c viewTreeOwners = this.d.getViewTreeOwners();
        if (((viewTreeOwners == null || (a2 = viewTreeOwners.a()) == null || (lifecycle = a2.getLifecycle()) == null) ? null : lifecycle.b()) == Lifecycle.State.DESTROYED) {
            return null;
        }
        h3 U = h3.U();
        hj7 hj7Var = (hj7) g0().get(Integer.valueOf(i2));
        if (hj7Var == null) {
            return null;
        }
        SemanticsNode b2 = hj7Var.b();
        if (i2 == -1) {
            ViewParent D = k99.D(this.d);
            U.A0(D instanceof View ? (View) D : null);
        } else {
            SemanticsNode q = b2.q();
            Integer valueOf = q != null ? Integer.valueOf(q.n()) : null;
            if (valueOf == null) {
                throw new IllegalStateException(("semanticsNode " + i2 + " has null parent").toString());
            }
            int intValue = valueOf.intValue();
            U.B0(this.d, intValue != this.d.getSemanticsOwner().a().n() ? intValue : -1);
        }
        U.J0(this.d, i2);
        U.b0(N(hj7Var));
        P0(i2, U, b2);
        return U.T0();
    }

    private final void X0(SemanticsNode semanticsNode, i iVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List s = semanticsNode.s();
        int size = s.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = (SemanticsNode) s.get(i2);
            if (g0().containsKey(Integer.valueOf(semanticsNode2.n()))) {
                if (!iVar.a().contains(Integer.valueOf(semanticsNode2.n()))) {
                    E0(semanticsNode.p());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(semanticsNode2.n()));
            }
        }
        Iterator it2 = iVar.a().iterator();
        while (it2.hasNext()) {
            if (!linkedHashSet.contains(Integer.valueOf(((Number) it2.next()).intValue()))) {
                E0(semanticsNode.p());
                return;
            }
        }
        List s2 = semanticsNode.s();
        int size2 = s2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            SemanticsNode semanticsNode3 = (SemanticsNode) s2.get(i3);
            if (g0().containsKey(Integer.valueOf(semanticsNode3.n()))) {
                Object obj = this.l0.get(Integer.valueOf(semanticsNode3.n()));
                zq3.e(obj);
                X0(semanticsNode3, (i) obj);
            }
        }
    }

    private final AccessibilityEvent Y(int i2, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent W = W(i2, 8192);
        if (num != null) {
            W.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            W.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            W.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            W.getText().add(charSequence);
        }
        return W;
    }

    private final void Y0(SemanticsNode semanticsNode, i iVar) {
        List s = semanticsNode.s();
        int size = s.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = (SemanticsNode) s.get(i2);
            if (g0().containsKey(Integer.valueOf(semanticsNode2.n())) && !iVar.a().contains(Integer.valueOf(semanticsNode2.n()))) {
                z1(semanticsNode2);
            }
        }
        for (Map.Entry entry : this.l0.entrySet()) {
            if (!g0().containsKey(entry.getKey())) {
                Q(((Number) entry.getKey()).intValue());
            }
        }
        List s2 = semanticsNode.s();
        int size2 = s2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            SemanticsNode semanticsNode3 = (SemanticsNode) s2.get(i3);
            if (g0().containsKey(Integer.valueOf(semanticsNode3.n())) && this.l0.containsKey(Integer.valueOf(semanticsNode3.n()))) {
                Object obj = this.l0.get(Integer.valueOf(semanticsNode3.n()));
                zq3.e(obj);
                Y0(semanticsNode3, (i) obj);
            }
        }
    }

    private final void Z0(int i2, String str) {
        vv0 vv0Var = this.S;
        if (vv0Var == null) {
            return;
        }
        AutofillId a2 = vv0Var.a(i2);
        if (a2 == null) {
            throw new IllegalStateException("Invalid content capture ID");
        }
        vv0Var.c(a2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        androidComposeViewAccessibilityDelegateCompat.k = z ? androidComposeViewAccessibilityDelegateCompat.g.getEnabledAccessibilityServiceList(-1) : kotlin.collections.i.l();
    }

    private final boolean a1(AccessibilityEvent accessibilityEvent) {
        if (!z0()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.t = true;
        }
        try {
            return ((Boolean) this.f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.t = false;
        }
    }

    private final void b0(SemanticsNode semanticsNode, ArrayList arrayList, Map map) {
        boolean z = semanticsNode.o().getLayoutDirection() == LayoutDirection.Rtl;
        boolean booleanValue = ((Boolean) semanticsNode.m().o(SemanticsProperties.a.p(), new qs2() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$isTraversalGroup$1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue();
        if ((booleanValue || B0(semanticsNode)) && g0().keySet().contains(Integer.valueOf(semanticsNode.n()))) {
            arrayList.add(semanticsNode);
        }
        if (booleanValue) {
            map.put(Integer.valueOf(semanticsNode.n()), t1(z, kotlin.collections.i.a1(semanticsNode.k())));
            return;
        }
        List k2 = semanticsNode.k();
        int size = k2.size();
        for (int i2 = 0; i2 < size; i2++) {
            b0((SemanticsNode) k2.get(i2), arrayList, map);
        }
    }

    private final boolean b1(int i2, int i3, Integer num, List list) {
        if (i2 == Integer.MIN_VALUE || !y0()) {
            return false;
        }
        AccessibilityEvent W = W(i2, i3);
        if (num != null) {
            W.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            W.setContentDescription(e64.e(list, ",", null, null, 0, null, null, 62, null));
        }
        return a1(W);
    }

    private final int c0(SemanticsNode semanticsNode) {
        bj7 v = semanticsNode.v();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        return (v.f(semanticsProperties.c()) || !semanticsNode.v().f(semanticsProperties.A())) ? this.B : androidx.compose.ui.text.i.i(((androidx.compose.ui.text.i) semanticsNode.v().n(semanticsProperties.A())).r());
    }

    static /* synthetic */ boolean c1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i2, int i3, Integer num, List list, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        if ((i4 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.b1(i2, i3, num, list);
    }

    private final int d0(SemanticsNode semanticsNode) {
        bj7 v = semanticsNode.v();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        return (v.f(semanticsProperties.c()) || !semanticsNode.v().f(semanticsProperties.A())) ? this.B : androidx.compose.ui.text.i.n(((androidx.compose.ui.text.i) semanticsNode.v().n(semanticsProperties.A())).r());
    }

    private final void d1(int i2, int i3, String str) {
        AccessibilityEvent W = W(W0(i2), 32);
        W.setContentChangeTypes(i3);
        if (str != null) {
            W.getText().add(str);
        }
        a1(W);
    }

    private final void e1(int i2) {
        g gVar = this.Z;
        if (gVar != null) {
            if (i2 != gVar.d().n()) {
                return;
            }
            if (SystemClock.uptimeMillis() - gVar.f() <= 1000) {
                AccessibilityEvent W = W(W0(gVar.d().n()), 131072);
                W.setFromIndex(gVar.b());
                W.setToIndex(gVar.e());
                W.setAction(gVar.a());
                W.setMovementGranularity(gVar.c());
                W.getText().add(o0(gVar.d()));
                a1(W);
            }
        }
        this.Z = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vv0 f0(View view) {
        m99.c(view, 1);
        return m99.b(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0422 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f1(java.util.Map r29) {
        /*
            Method dump skipped, instructions count: 1607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.f1(java.util.Map):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map g0() {
        Map t;
        if (this.N) {
            this.N = false;
            t = AndroidComposeViewAccessibilityDelegateCompat_androidKt.t(this.d.getSemanticsOwner());
            this.e0 = t;
            if (z0()) {
                o1();
            }
        }
        return this.e0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.s(r8, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g1(androidx.compose.ui.node.LayoutNode r8, defpackage.vo r9) {
        /*
            r7 = this;
            boolean r0 = r8.G0()
            if (r0 != 0) goto L7
            return
        L7:
            androidx.compose.ui.platform.AndroidComposeView r0 = r7.d
            yg r0 = r0.getAndroidViewsHandler$ui_release()
            java.util.HashMap r0 = r0.getLayoutNodeToHolder()
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto L18
            return
        L18:
            vo r0 = r7.L
            int r0 = r0.size()
            r1 = 0
        L1f:
            if (r1 >= r0) goto L33
            vo r2 = r7.L
            java.lang.Object r2 = r2.u(r1)
            androidx.compose.ui.node.LayoutNode r2 = (androidx.compose.ui.node.LayoutNode) r2
            boolean r2 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.j(r2, r8)
            if (r2 == 0) goto L30
            return
        L30:
            int r1 = r1 + 1
            goto L1f
        L33:
            androidx.compose.ui.node.k r0 = r8.h0()
            r1 = 8
            int r1 = defpackage.a85.a(r1)
            boolean r0 = r0.q(r1)
            if (r0 == 0) goto L44
            goto L4a
        L44:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1 r0 = new defpackage.ss2() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                static {
                    /*
                        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1 r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT 
  (r0 I:androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1)
 androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.a androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.<init>():void");
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
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.invoke(androidx.compose.ui.node.LayoutNode):java.lang.Boolean");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                    /*
                        r0 = this;
                        androidx.compose.ui.node.LayoutNode r1 = (androidx.compose.ui.node.LayoutNode) r1
                        java.lang.Boolean r0 = r0.invoke(r1)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.invoke(java.lang.Object):java.lang.Object");
                }
            }
            androidx.compose.ui.node.LayoutNode r8 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.e(r8, r0)
        L4a:
            if (r8 == 0) goto L84
            bj7 r0 = r8.G()
            if (r0 != 0) goto L53
            goto L84
        L53:
            boolean r0 = r0.t()
            if (r0 != 0) goto L62
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 r0 = new defpackage.ss2() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1
                static {
                    /*
                        androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1 r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT 
  (r0 I:androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1)
 androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.a androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.<init>():void");
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final java.lang.Boolean invoke(androidx.compose.ui.node.LayoutNode r2) {
                    /*
                        r1 = this;
                        bj7 r1 = r2.G()
                        r2 = 0
                        if (r1 == 0) goto Lf
                        boolean r1 = r1.t()
                        r0 = 1
                        if (r1 != r0) goto Lf
                        r2 = r0
                    Lf:
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.invoke(androidx.compose.ui.node.LayoutNode):java.lang.Boolean");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                    /*
                        r0 = this;
                        androidx.compose.ui.node.LayoutNode r1 = (androidx.compose.ui.node.LayoutNode) r1
                        java.lang.Boolean r0 = r0.invoke(r1)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.invoke(java.lang.Object):java.lang.Object");
                }
            }
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.e(r8, r0)
            if (r0 == 0) goto L62
            r8 = r0
        L62:
            int r8 = r8.m0()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            boolean r9 = r9.add(r0)
            if (r9 != 0) goto L71
            return
        L71:
            int r1 = r7.W0(r8)
            r8 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r5 = 8
            r6 = 0
            r2 = 2048(0x800, float:2.87E-42)
            r4 = 0
            r0 = r7
            c1(r0, r1, r2, r3, r4, r5, r6)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.g1(androidx.compose.ui.node.LayoutNode, vo):void");
    }

    private final void h1(LayoutNode layoutNode) {
        if (layoutNode.G0() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int m0 = layoutNode.m0();
            nc7 nc7Var = (nc7) this.u.get(Integer.valueOf(m0));
            nc7 nc7Var2 = (nc7) this.w.get(Integer.valueOf(m0));
            if (nc7Var == null && nc7Var2 == null) {
                return;
            }
            AccessibilityEvent W = W(m0, ProgressEvent.PART_FAILED_EVENT_CODE);
            if (nc7Var != null) {
                W.setScrollX((int) ((Number) nc7Var.c().mo865invoke()).floatValue());
                W.setMaxScrollX((int) ((Number) nc7Var.a().mo865invoke()).floatValue());
            }
            if (nc7Var2 != null) {
                W.setScrollY((int) ((Number) nc7Var2.c().mo865invoke()).floatValue());
                W.setMaxScrollY((int) ((Number) nc7Var2.a().mo865invoke()).floatValue());
            }
            a1(W);
        }
    }

    private final boolean i1(SemanticsNode semanticsNode, int i2, int i3, boolean z) {
        String o0;
        boolean p;
        bj7 v = semanticsNode.v();
        aj7 aj7Var = aj7.a;
        if (v.f(aj7Var.v())) {
            p = AndroidComposeViewAccessibilityDelegateCompat_androidKt.p(semanticsNode);
            if (p) {
                it2 it2Var = (it2) ((u2) semanticsNode.v().n(aj7Var.v())).a();
                if (it2Var != null) {
                    return ((Boolean) it2Var.invoke(Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
                }
                return false;
            }
        }
        if ((i2 == i3 && i3 == this.B) || (o0 = o0(semanticsNode)) == null) {
            return false;
        }
        if (i2 < 0 || i2 != i3 || i3 > o0.length()) {
            i2 = -1;
        }
        this.B = i2;
        boolean z2 = o0.length() > 0;
        a1(Y(W0(semanticsNode.n()), z2 ? Integer.valueOf(this.B) : null, z2 ? Integer.valueOf(this.B) : null, z2 ? Integer.valueOf(o0.length()) : null, o0));
        e1(semanticsNode.n());
        return true;
    }

    private final void k1(SemanticsNode semanticsNode, h3 h3Var) {
        bj7 v = semanticsNode.v();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        if (v.f(semanticsProperties.f())) {
            h3Var.j0(true);
            h3Var.n0((CharSequence) SemanticsConfigurationKt.a(semanticsNode.v(), semanticsProperties.f()));
        }
    }

    private final boolean l0(SemanticsNode semanticsNode) {
        bj7 v = semanticsNode.v();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.a(v, semanticsProperties.C());
        n27 n27Var = (n27) SemanticsConfigurationKt.a(semanticsNode.v(), semanticsProperties.u());
        boolean z = toggleableState != null;
        if (((Boolean) SemanticsConfigurationKt.a(semanticsNode.v(), semanticsProperties.w())) != null) {
            return n27Var != null ? n27.k(n27Var.n(), n27.b.g()) : false ? z : true;
        }
        return z;
    }

    private final void l1(SemanticsNode semanticsNode, h3 h3Var) {
        h3Var.c0(l0(semanticsNode));
    }

    private final String m0(SemanticsNode semanticsNode) {
        bj7 v = semanticsNode.v();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        Object a2 = SemanticsConfigurationKt.a(v, semanticsProperties.x());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.a(semanticsNode.v(), semanticsProperties.C());
        n27 n27Var = (n27) SemanticsConfigurationKt.a(semanticsNode.v(), semanticsProperties.u());
        if (toggleableState != null) {
            int i2 = l.a[toggleableState.ordinal()];
            if (i2 == 1) {
                if ((n27Var == null ? false : n27.k(n27Var.n(), n27.b.f())) && a2 == null) {
                    a2 = this.d.getContext().getResources().getString(ok6.on);
                }
            } else if (i2 == 2) {
                if ((n27Var == null ? false : n27.k(n27Var.n(), n27.b.f())) && a2 == null) {
                    a2 = this.d.getContext().getResources().getString(ok6.off);
                }
            } else if (i2 == 3 && a2 == null) {
                a2 = this.d.getContext().getResources().getString(ok6.indeterminate);
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.a(semanticsNode.v(), semanticsProperties.w());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (!(n27Var == null ? false : n27.k(n27Var.n(), n27.b.g())) && a2 == null) {
                a2 = booleanValue ? this.d.getContext().getResources().getString(ok6.selected) : this.d.getContext().getResources().getString(ok6.not_selected);
            }
        }
        r46 r46Var = (r46) SemanticsConfigurationKt.a(semanticsNode.v(), semanticsProperties.t());
        if (r46Var != null) {
            if (r46Var != r46.d.a()) {
                if (a2 == null) {
                    jm0 c2 = r46Var.c();
                    float l2 = uo6.l(((((Number) c2.f()).floatValue() - ((Number) c2.a()).floatValue()) > 0.0f ? 1 : ((((Number) c2.f()).floatValue() - ((Number) c2.a()).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (r46Var.b() - ((Number) c2.a()).floatValue()) / (((Number) c2.f()).floatValue() - ((Number) c2.a()).floatValue()), 0.0f, 1.0f);
                    if (!(l2 == 0.0f)) {
                        r5 = (l2 == 1.0f ? 1 : 0) != 0 ? 100 : uo6.m(dg4.d(l2 * 100), 1, 99);
                    }
                    a2 = this.d.getContext().getResources().getString(ok6.template_percent, Integer.valueOf(r5));
                }
            } else if (a2 == null) {
                a2 = this.d.getContext().getResources().getString(ok6.in_progress);
            }
        }
        return (String) a2;
    }

    private final void m1(SemanticsNode semanticsNode, h3 h3Var) {
        h3Var.K0(m0(semanticsNode));
    }

    private final SpannableString n0(SemanticsNode semanticsNode) {
        androidx.compose.ui.text.a aVar;
        e.b fontFamilyResolver = this.d.getFontFamilyResolver();
        androidx.compose.ui.text.a q0 = q0(semanticsNode.v());
        SpannableString spannableString = null;
        SpannableString spannableString2 = (SpannableString) y1(q0 != null ? md.b(q0, this.d.getDensity(), fontFamilyResolver, this.k0) : null, 100000);
        List list = (List) SemanticsConfigurationKt.a(semanticsNode.v(), SemanticsProperties.a.z());
        if (list != null && (aVar = (androidx.compose.ui.text.a) kotlin.collections.i.m0(list)) != null) {
            spannableString = md.b(aVar, this.d.getDensity(), fontFamilyResolver, this.k0);
        }
        return spannableString2 == null ? (SpannableString) y1(spannableString, 100000) : spannableString2;
    }

    private final void n1(SemanticsNode semanticsNode, h3 h3Var) {
        h3Var.L0(n0(semanticsNode));
    }

    private final String o0(SemanticsNode semanticsNode) {
        androidx.compose.ui.text.a aVar;
        if (semanticsNode == null) {
            return null;
        }
        bj7 v = semanticsNode.v();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        if (v.f(semanticsProperties.c())) {
            return e64.e((List) semanticsNode.v().n(semanticsProperties.c()), ",", null, null, 0, null, null, 62, null);
        }
        if (semanticsNode.v().f(aj7.a.w())) {
            androidx.compose.ui.text.a q0 = q0(semanticsNode.v());
            if (q0 != null) {
                return q0.j();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.a(semanticsNode.v(), semanticsProperties.z());
        if (list == null || (aVar = (androidx.compose.ui.text.a) kotlin.collections.i.m0(list)) == null) {
            return null;
        }
        return aVar.j();
    }

    private final void o1() {
        this.g0.clear();
        this.h0.clear();
        hj7 hj7Var = (hj7) g0().get(-1);
        SemanticsNode b2 = hj7Var != null ? hj7Var.b() : null;
        zq3.e(b2);
        int i2 = 1;
        List t1 = t1(b2.o().getLayoutDirection() == LayoutDirection.Rtl, kotlin.collections.i.r(b2));
        int n = kotlin.collections.i.n(t1);
        if (1 > n) {
            return;
        }
        while (true) {
            int n2 = ((SemanticsNode) t1.get(i2 - 1)).n();
            int n3 = ((SemanticsNode) t1.get(i2)).n();
            this.g0.put(Integer.valueOf(n2), Integer.valueOf(n3));
            this.h0.put(Integer.valueOf(n3), Integer.valueOf(n2));
            if (i2 == n) {
                return;
            } else {
                i2++;
            }
        }
    }

    private final y2 p0(SemanticsNode semanticsNode, int i2) {
        String o0;
        aj8 r02;
        if (semanticsNode == null || (o0 = o0(semanticsNode)) == null || o0.length() == 0) {
            return null;
        }
        if (i2 == 1) {
            androidx.compose.ui.platform.b a2 = androidx.compose.ui.platform.b.d.a(this.d.getContext().getResources().getConfiguration().locale);
            a2.e(o0);
            return a2;
        }
        if (i2 == 2) {
            androidx.compose.ui.platform.f a3 = androidx.compose.ui.platform.f.d.a(this.d.getContext().getResources().getConfiguration().locale);
            a3.e(o0);
            return a3;
        }
        if (i2 != 4) {
            if (i2 == 8) {
                androidx.compose.ui.platform.e a4 = androidx.compose.ui.platform.e.c.a();
                a4.e(o0);
                return a4;
            }
            if (i2 != 16) {
                return null;
            }
        }
        if (!semanticsNode.v().f(aj7.a.h()) || (r02 = r0(semanticsNode.v())) == null) {
            return null;
        }
        if (i2 == 4) {
            androidx.compose.ui.platform.c a5 = androidx.compose.ui.platform.c.d.a();
            a5.j(o0, r02);
            return a5;
        }
        androidx.compose.ui.platform.d a6 = androidx.compose.ui.platform.d.f.a();
        a6.j(o0, r02, semanticsNode);
        return a6;
    }

    private final void p1() {
        u2 u2Var;
        ss2 ss2Var;
        Iterator it2 = g0().values().iterator();
        while (it2.hasNext()) {
            bj7 v = ((hj7) it2.next()).b().v();
            if (zq3.c(SemanticsConfigurationKt.a(v, SemanticsProperties.a.o()), Boolean.FALSE) && (u2Var = (u2) SemanticsConfigurationKt.a(v, aj7.a.y())) != null && (ss2Var = (ss2) u2Var.a()) != null) {
            }
        }
    }

    private final androidx.compose.ui.text.a q0(bj7 bj7Var) {
        return (androidx.compose.ui.text.a) SemanticsConfigurationKt.a(bj7Var, SemanticsProperties.a.e());
    }

    private final List q1(boolean z, ArrayList arrayList, Map map) {
        ArrayList arrayList2 = new ArrayList();
        int n = kotlin.collections.i.n(arrayList);
        int i2 = 0;
        if (n >= 0) {
            int i3 = 0;
            while (true) {
                SemanticsNode semanticsNode = (SemanticsNode) arrayList.get(i3);
                if (i3 == 0 || !s1(arrayList2, semanticsNode)) {
                    arrayList2.add(new Pair(semanticsNode.j(), kotlin.collections.i.r(semanticsNode)));
                }
                if (i3 == n) {
                    break;
                }
                i3++;
            }
        }
        kotlin.collections.i.A(arrayList2, j.a);
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            Pair pair = (Pair) arrayList2.get(i4);
            kotlin.collections.i.A((List) pair.d(), new ve(new ue(z ? h.a : f.a, LayoutNode.j0.b())));
            arrayList3.addAll((Collection) pair.d());
        }
        final AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 androidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 = new gt2() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2
            @Override // defpackage.gt2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(SemanticsNode semanticsNode2, SemanticsNode semanticsNode3) {
                bj7 m = semanticsNode2.m();
                SemanticsProperties semanticsProperties = SemanticsProperties.a;
                SemanticsPropertyKey D = semanticsProperties.D();
                AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1 androidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1 = new qs2() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1
                    @Override // defpackage.qs2
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Float mo865invoke() {
                        return Float.valueOf(0.0f);
                    }
                };
                return Integer.valueOf(Float.compare(((Number) m.o(D, androidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1)).floatValue(), ((Number) semanticsNode3.m().o(semanticsProperties.D(), androidComposeViewAccessibilityDelegateCompat_androidKt$traversalIndex$1)).floatValue()));
            }
        };
        kotlin.collections.i.A(arrayList3, new Comparator() { // from class: ie
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int r1;
                r1 = AndroidComposeViewAccessibilityDelegateCompat.r1(gt2.this, obj, obj2);
                return r1;
            }
        });
        while (i2 <= kotlin.collections.i.n(arrayList3)) {
            List list = (List) map.get(Integer.valueOf(((SemanticsNode) arrayList3.get(i2)).n()));
            if (list != null) {
                if (B0((SemanticsNode) arrayList3.get(i2))) {
                    i2++;
                } else {
                    arrayList3.remove(i2);
                }
                arrayList3.addAll(i2, list);
                i2 += list.size();
            } else {
                i2++;
            }
        }
        return arrayList3;
    }

    private final aj8 r0(bj7 bj7Var) {
        ss2 ss2Var;
        ArrayList arrayList = new ArrayList();
        u2 u2Var = (u2) SemanticsConfigurationKt.a(bj7Var, aj7.a.h());
        if (u2Var == null || (ss2Var = (ss2) u2Var.a()) == null || !((Boolean) ss2Var.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (aj8) arrayList.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r1(gt2 gt2Var, Object obj, Object obj2) {
        return ((Number) gt2Var.invoke(obj, obj2)).intValue();
    }

    private static final boolean s1(ArrayList arrayList, SemanticsNode semanticsNode) {
        float l2 = semanticsNode.j().l();
        float e2 = semanticsNode.j().e();
        boolean z = l2 >= e2;
        int n = kotlin.collections.i.n(arrayList);
        if (n >= 0) {
            int i2 = 0;
            while (true) {
                kt6 kt6Var = (kt6) ((Pair) arrayList.get(i2)).c();
                boolean z2 = kt6Var.l() >= kt6Var.e();
                if (!z && !z2 && Math.max(l2, kt6Var.l()) < Math.min(e2, kt6Var.e())) {
                    arrayList.set(i2, new Pair(kt6Var.o(0.0f, l2, Float.POSITIVE_INFINITY, e2), ((Pair) arrayList.get(i2)).d()));
                    ((List) ((Pair) arrayList.get(i2)).d()).add(semanticsNode);
                    return true;
                }
                if (i2 == n) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    private final void t0() {
        u2 u2Var;
        ss2 ss2Var;
        Iterator it2 = g0().values().iterator();
        while (it2.hasNext()) {
            bj7 v = ((hj7) it2.next()).b().v();
            if (zq3.c(SemanticsConfigurationKt.a(v, SemanticsProperties.a.o()), Boolean.TRUE) && (u2Var = (u2) SemanticsConfigurationKt.a(v, aj7.a.y())) != null && (ss2Var = (ss2) u2Var.a()) != null) {
            }
        }
    }

    private final List t1(boolean z, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            b0((SemanticsNode) list.get(i2), arrayList, linkedHashMap);
        }
        return q1(z, arrayList, linkedHashMap);
    }

    private final RectF u1(SemanticsNode semanticsNode, kt6 kt6Var) {
        if (semanticsNode == null) {
            return null;
        }
        kt6 t = kt6Var.t(semanticsNode.r());
        kt6 i2 = semanticsNode.i();
        kt6 p = t.r(i2) ? t.p(i2) : null;
        if (p == null) {
            return null;
        }
        long i0 = this.d.i0(hd5.a(p.i(), p.l()));
        long i02 = this.d.i0(hd5.a(p.j(), p.e()));
        return new RectF(fd5.o(i0), fd5.p(i0), fd5.o(i02), fd5.p(i02));
    }

    private final void v0(boolean z) {
        if (z) {
            z1(this.d.getSemanticsOwner().a());
        } else {
            A1(this.d.getSemanticsOwner().a());
        }
        D0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
    
        r1 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.E(r1.n());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.kb9 v1(androidx.compose.ui.semantics.SemanticsNode r14) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.v1(androidx.compose.ui.semantics.SemanticsNode):kb9");
    }

    private final boolean w0(int i2) {
        return this.r == i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        androidComposeViewAccessibilityDelegateCompat.k = androidComposeViewAccessibilityDelegateCompat.g.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean x0(SemanticsNode semanticsNode) {
        bj7 v = semanticsNode.v();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        return !v.f(semanticsProperties.c()) && semanticsNode.v().f(semanticsProperties.e());
    }

    private final boolean x1(SemanticsNode semanticsNode, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int n = semanticsNode.n();
        Integer num = this.H;
        if (num == null || n != num.intValue()) {
            this.B = -1;
            this.H = Integer.valueOf(semanticsNode.n());
        }
        String o0 = o0(semanticsNode);
        boolean z3 = false;
        if (o0 != null && o0.length() != 0) {
            y2 p0 = p0(semanticsNode, i2);
            if (p0 == null) {
                return false;
            }
            int c0 = c0(semanticsNode);
            if (c0 == -1) {
                c0 = z ? 0 : o0.length();
            }
            int[] a2 = z ? p0.a(c0) : p0.b(c0);
            if (a2 == null) {
                return false;
            }
            int i5 = a2[0];
            z3 = true;
            int i6 = a2[1];
            if (z2 && x0(semanticsNode)) {
                i3 = d0(semanticsNode);
                if (i3 == -1) {
                    i3 = z ? i5 : i6;
                }
                i4 = z ? i6 : i5;
            } else {
                i3 = z ? i6 : i5;
                i4 = i3;
            }
            this.Z = new g(semanticsNode, z ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 512, i2, i5, i6, SystemClock.uptimeMillis());
            i1(semanticsNode, i3, i4, true);
        }
        return z3;
    }

    private final boolean y0() {
        return z0() || A0();
    }

    private final CharSequence y1(CharSequence charSequence, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= i2) {
            return charSequence;
        }
        int i3 = i2 - 1;
        if (Character.isHighSurrogate(charSequence.charAt(i3)) && Character.isLowSurrogate(charSequence.charAt(i2))) {
            i2 = i3;
        }
        CharSequence subSequence = charSequence.subSequence(0, i2);
        zq3.f(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return subSequence;
    }

    private final void z1(SemanticsNode semanticsNode) {
        if (A0()) {
            D1(semanticsNode);
            P(semanticsNode.n(), v1(semanticsNode));
            List s = semanticsNode.s();
            int size = s.size();
            for (int i2 = 0; i2 < size; i2++) {
                z1((SemanticsNode) s.get(i2));
            }
        }
    }

    public final void F0() {
        this.l = TranslateStatus.SHOW_ORIGINAL;
        V();
    }

    public final void G0(long[] jArr, int[] iArr, Consumer consumer) {
        k.a.c(this, jArr, iArr, consumer);
    }

    public final void H0() {
        this.l = TranslateStatus.SHOW_ORIGINAL;
        t0();
    }

    public final void I0(LayoutNode layoutNode) {
        this.N = true;
        if (y0()) {
            E0(layoutNode);
        }
    }

    public final void J0() {
        this.N = true;
        if (!y0() || this.n0) {
            return;
        }
        this.n0 = true;
        this.m.post(this.o0);
    }

    public final void K0() {
        this.l = TranslateStatus.SHOW_TRANSLATED;
        p1();
    }

    public final void L0(LongSparseArray longSparseArray) {
        k.a.d(this, longSparseArray);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:11:0x006a, B:16:0x007c, B:18:0x0084, B:20:0x008d, B:21:0x0095, B:23:0x009b, B:25:0x00a4, B:27:0x00b5, B:29:0x00bc, B:30:0x00c5, B:10:0x005e), top: B:9:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e5 -> B:11:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(defpackage.by0 r11) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.O(by0):java.lang.Object");
    }

    public final boolean R(boolean z, int i2, long j2) {
        if (zq3.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return S(g0().values(), z, i2, j2);
        }
        return false;
    }

    public final boolean Z(MotionEvent motionEvent) {
        if (!C0()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int u0 = u0(motionEvent.getX(), motionEvent.getY());
            boolean dispatchGenericMotionEvent = this.d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            B1(u0);
            if (u0 == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.e == Integer.MIN_VALUE) {
            return this.d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        }
        B1(RecyclerView.UNDEFINED_DURATION);
        return true;
    }

    @Override // defpackage.w2
    public i3 b(View view) {
        return this.n;
    }

    public final boolean e0() {
        return this.Q;
    }

    public final String h0() {
        return this.j0;
    }

    public final String i0() {
        return this.i0;
    }

    public final HashMap j0() {
        return this.h0;
    }

    public final void j1(vv0 vv0Var) {
        this.S = vv0Var;
    }

    public final HashMap k0() {
        return this.g0;
    }

    @Override // defpackage.ei1
    public void onStart(d44 d44Var) {
        v0(true);
    }

    @Override // defpackage.ei1
    public void onStop(d44 d44Var) {
        v0(false);
    }

    public final AndroidComposeView s0() {
        return this.d;
    }

    public final int u0(float f2, float f3) {
        androidx.compose.ui.node.k h0;
        boolean B;
        androidx.compose.ui.node.m.b(this.d, false, 1, null);
        z83 z83Var = new z83();
        this.d.getRoot().v0(hd5.a(f2, f3), z83Var, (r13 & 4) != 0, (r13 & 8) != 0);
        Modifier.c cVar = (Modifier.c) kotlin.collections.i.y0(z83Var);
        LayoutNode k2 = cVar != null ? rl1.k(cVar) : null;
        if (k2 != null && (h0 = k2.h0()) != null && h0.q(a85.a(8))) {
            B = AndroidComposeViewAccessibilityDelegateCompat_androidKt.B(gj7.a(k2, false));
            if (B && this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(k2) == null) {
                return W0(k2.m0());
            }
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    public final boolean z0() {
        return this.h || (this.g.isEnabled() && !this.k.isEmpty());
    }
}
