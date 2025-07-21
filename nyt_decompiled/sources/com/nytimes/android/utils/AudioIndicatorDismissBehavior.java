package com.nytimes.android.utils;

import android.R;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.snackbar.Snackbar;
import com.nytimes.android.media.audio.views.AudioIndicator;
import com.nytimes.android.messaging.dock.DockView;
import com.nytimes.android.utils.AudioIndicatorDismissBehavior;
import com.nytimes.android.utils.d;
import defpackage.b22;
import defpackage.dg4;
import defpackage.ig4;
import defpackage.k99;
import defpackage.nx;
import defpackage.uo6;
import defpackage.vu3;
import defpackage.zq3;
import defpackage.zt6;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes4.dex */
public final class AudioIndicatorDismissBehavior<V extends View> extends CoordinatorLayout.c {
    public static final a Companion = new a(null);
    public static final int m = 8;
    private final b a;
    private final SwipeDirection b;
    private final float c;
    private com.nytimes.android.utils.d d;
    private boolean e;
    private final float f;
    private final float g;
    private final float h;
    private final Map i;
    private final Map j;
    private final d.c k;
    private CoroutineScope l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SwipeDirection {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ SwipeDirection[] $VALUES;
        public static final SwipeDirection START_TO_END = new SwipeDirection("START_TO_END", 0);
        public static final SwipeDirection END_TO_START = new SwipeDirection("END_TO_START", 1);
        public static final SwipeDirection ANY = new SwipeDirection("ANY", 2);

        private static final /* synthetic */ SwipeDirection[] $values() {
            return new SwipeDirection[]{START_TO_END, END_TO_START, ANY};
        }

        static {
            SwipeDirection[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private SwipeDirection(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static SwipeDirection valueOf(String str) {
            return (SwipeDirection) Enum.valueOf(SwipeDirection.class, str);
        }

        public static SwipeDirection[] values() {
            return (SwipeDirection[]) $VALUES.clone();
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        void a(View view);

        void b(int i);
    }

    private final class c implements Runnable {
        private final View a;
        private final boolean b;
        final /* synthetic */ AudioIndicatorDismissBehavior c;

        public c(AudioIndicatorDismissBehavior audioIndicatorDismissBehavior, View view, boolean z) {
            zq3.h(view, "view");
            this.c = audioIndicatorDismissBehavior;
            this.a = view;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.c.d != null) {
                com.nytimes.android.utils.d dVar = this.c.d;
                zq3.e(dVar);
                if (dVar.k(true)) {
                    k99.d0(this.a, this);
                    return;
                }
            }
            if (this.b) {
                this.a.setAlpha(1.0f);
                this.c.a.a(this.a);
            }
        }
    }

    public static final class d extends d.c {
        private int a;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[SwipeDirection.values().length];
                try {
                    iArr[SwipeDirection.ANY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SwipeDirection.START_TO_END.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SwipeDirection.END_TO_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        d() {
        }

        private final boolean n(View view, float f) {
            if (f == 0.0f) {
                int left = view.getLeft() - this.a;
                if (Math.abs(left) < d(view)) {
                    return false;
                }
            } else {
                int i = a.a[AudioIndicatorDismissBehavior.this.b.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (f <= 0.0f) {
                            return false;
                        }
                    } else if (f >= 0.0f) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // com.nytimes.android.utils.d.c
        public int a(View view, int i, int i2) {
            int d;
            int i3;
            zq3.h(view, "child");
            int i4 = a.a[AudioIndicatorDismissBehavior.this.b.ordinal()];
            if (i4 == 2) {
                d = this.a - d(view);
                i3 = this.a;
            } else if (i4 != 3) {
                d = this.a - d(view);
                i3 = this.a + d(view);
            } else {
                d = this.a;
                i3 = d + d(view);
            }
            return uo6.m(i, d, i3);
        }

        @Override // com.nytimes.android.utils.d.c
        public int b(View view, int i, int i2) {
            zq3.h(view, "child");
            return view.getTop();
        }

        @Override // com.nytimes.android.utils.d.c
        public int d(View view) {
            zq3.h(view, "child");
            return dg4.d(AudioIndicatorDismissBehavior.this.f) * view.getWidth();
        }

        @Override // com.nytimes.android.utils.d.c
        public void i(View view, int i) {
            zq3.h(view, "capturedChild");
            this.a = view.getLeft();
        }

        @Override // com.nytimes.android.utils.d.c
        public void j(int i) {
            AudioIndicatorDismissBehavior.this.a.b(i);
        }

        @Override // com.nytimes.android.utils.d.c
        public void k(View view, int i, int i2, int i3, int i4) {
            zq3.h(view, "child");
            float width = view.getWidth() * AudioIndicatorDismissBehavior.this.g;
            float width2 = view.getWidth() * AudioIndicatorDismissBehavior.this.h;
            int i5 = this.a;
            float f = i5 - width;
            float f2 = i5 - width2;
            float f3 = i5 + width;
            float f4 = i5 + width2;
            float f5 = i;
            float f6 = 1.0f;
            if (f5 < f || f5 > f3) {
                if (f5 <= f2 || f5 >= f4) {
                    f6 = 0.0f;
                } else {
                    f6 = uo6.l(1.0f - (f5 < f ? ig4.b(f, f2, f5) : ig4.b(f3, f4, f5)), 0.0f, 1.0f);
                }
            }
            view.setAlpha(f6);
        }

        @Override // com.nytimes.android.utils.d.c
        public void l(View view, float f, float f2) {
            int i;
            boolean z;
            zq3.h(view, "child");
            if (n(view, f)) {
                int left = view.getLeft();
                int i2 = this.a;
                z = true;
                i = left < i2 ? i2 - d(view) : i2 + d(view);
            } else {
                i = this.a;
                z = false;
            }
            com.nytimes.android.utils.d dVar = AudioIndicatorDismissBehavior.this.d;
            zq3.e(dVar);
            if (dVar.E(i, view.getTop())) {
                k99.d0(view, new c(AudioIndicatorDismissBehavior.this, view, z));
            } else if (z) {
                view.setAlpha(1.0f);
                AudioIndicatorDismissBehavior.this.a.a(view);
            }
        }

        @Override // com.nytimes.android.utils.d.c
        public boolean m(View view, int i) {
            zq3.h(view, "child");
            return AudioIndicatorDismissBehavior.this.o(view);
        }
    }

    public AudioIndicatorDismissBehavior(b bVar, SwipeDirection swipeDirection, float f, float f2, float f3, float f4) {
        zq3.h(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        zq3.h(swipeDirection, "swipeDirection");
        this.a = bVar;
        this.b = swipeDirection;
        this.c = f;
        this.f = uo6.c(f2, 0.0f);
        this.g = uo6.c(f3, 0.0f);
        this.h = uo6.c(f4, 0.0f);
        this.i = new LinkedHashMap();
        this.j = new LinkedHashMap();
        this.k = new d();
    }

    private final MutableStateFlow n(View view, CoordinatorLayout coordinatorLayout) {
        Map map = this.j;
        vu3 b2 = zt6.b(view.getClass());
        Object obj = map.get(b2);
        Object obj2 = obj;
        if (obj == null) {
            View findViewById = coordinatorLayout.getRootView().findViewById(R.id.content);
            zq3.g(findViewById, "findViewById(...)");
            MutableStateFlow a2 = nx.a(findViewById);
            CoroutineScope coroutineScope = this.l;
            if (coroutineScope != null) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AudioIndicatorDismissBehavior$balloonHeightState$1$1$1(a2, this, coordinatorLayout, view, null), 3, null);
            }
            map.put(b2, a2);
            obj2 = a2;
        }
        return (MutableStateFlow) obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o(View view) {
        return view instanceof AudioIndicator;
    }

    private final void p(ViewGroup viewGroup) {
        if (this.d == null) {
            this.d = com.nytimes.android.utils.d.l(viewGroup, this.c, this.k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(View view, AudioIndicatorDismissBehavior audioIndicatorDismissBehavior, CoordinatorLayout coordinatorLayout, View view2) {
        zq3.h(view, "$dependency");
        zq3.h(audioIndicatorDismissBehavior, "this$0");
        zq3.h(coordinatorLayout, "$parent");
        zq3.h(view2, "$child");
        if (view.getVisibility() != 0 && audioIndicatorDismissBehavior.i.containsKey(zt6.b(view.getClass()))) {
            audioIndicatorDismissBehavior.onDependentViewRemoved(coordinatorLayout, view2, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        Float valueOf;
        Iterator it2 = this.i.values().iterator();
        if (it2.hasNext()) {
            float abs = Math.abs(((Number) it2.next()).floatValue());
            while (it2.hasNext()) {
                abs = Math.min(abs, Math.abs(((Number) it2.next()).floatValue()));
            }
            valueOf = Float.valueOf(abs);
        } else {
            valueOf = null;
        }
        view.setTranslationY(Math.min(valueOf != null ? valueOf.floatValue() : coordinatorLayout.getHeight(), i) - coordinatorLayout.getHeight());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean layoutDependsOn(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
        zq3.h(coordinatorLayout, "parent");
        zq3.h(view, "child");
        zq3.h(view2, "dependency");
        if (!(view2 instanceof Snackbar.SnackbarLayout ? true : view2 instanceof DockView ? true : view2 instanceof BottomAppBar)) {
            return false;
        }
        view2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: mx
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AudioIndicatorDismissBehavior.q(view2, this, coordinatorLayout, view);
            }
        });
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
        zq3.h(fVar, "params");
        super.onAttachedToLayoutParams(fVar);
        this.l = CoroutineScopeKt.MainScope();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        zq3.h(coordinatorLayout, "parent");
        zq3.h(view, "child");
        zq3.h(view2, "dependency");
        MutableStateFlow n = n(view, coordinatorLayout);
        this.i.put(zt6.b(view2.getClass()), Float.valueOf(view2.getTop() + view2.getTranslationY()));
        r(coordinatorLayout, view, ((Number) n.getValue()).intValue());
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
        zq3.h(coordinatorLayout, "parent");
        zq3.h(view, "child");
        zq3.h(view2, "dependency");
        MutableStateFlow n = n(view, coordinatorLayout);
        this.i.remove(zt6.b(view2.getClass()));
        r(coordinatorLayout, view, ((Number) n.getValue()).intValue());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDetachedFromLayoutParams() {
        CoroutineScope coroutineScope = this.l;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        super.onDetachedFromLayoutParams();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        zq3.h(coordinatorLayout, "parent");
        zq3.h(view, "child");
        zq3.h(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        boolean z = true;
        if (actionMasked != 1 && actionMasked != 3) {
            if (view.isEnabled() && coordinatorLayout.v(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                z = false;
            }
            this.e = z;
        } else if (this.e) {
            this.e = false;
            return false;
        }
        if (this.e) {
            return false;
        }
        p(coordinatorLayout);
        com.nytimes.android.utils.d dVar = this.d;
        zq3.e(dVar);
        return dVar.F(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        zq3.h(coordinatorLayout, "parent");
        zq3.h(view, "child");
        zq3.h(motionEvent, "event");
        com.nytimes.android.utils.d dVar = this.d;
        if (dVar == null) {
            return false;
        }
        zq3.e(dVar);
        dVar.y(motionEvent);
        return true;
    }
}
