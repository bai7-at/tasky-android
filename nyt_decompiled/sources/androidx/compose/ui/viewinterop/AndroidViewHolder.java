package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.c;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.h;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.m;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.b;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import defpackage.aa7;
import defpackage.cz3;
import defpackage.d44;
import defpackage.dj7;
import defpackage.es0;
import defpackage.f35;
import defpackage.fd5;
import defpackage.fm1;
import defpackage.fv0;
import defpackage.fv1;
import defpackage.hd5;
import defpackage.hm1;
import defpackage.km5;
import defpackage.l35;
import defpackage.lj7;
import defpackage.m35;
import defpackage.ph0;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.v49;
import defpackage.wd;
import defpackage.ww8;
import defpackage.yq3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes.dex */
public abstract class AndroidViewHolder extends ViewGroup implements l35, es0, km5 {
    public static final a L = new a(null);
    public static final int M = 8;
    private static final ss2 N = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.a;
    private boolean B;
    private final LayoutNode H;
    private final int a;
    private final NestedScrollDispatcher b;
    private final View c;
    private final m d;
    private qs2 e;
    private boolean f;
    private qs2 g;
    private qs2 h;
    private Modifier i;
    private ss2 j;
    private fm1 k;
    private ss2 l;
    private d44 m;
    private aa7 n;
    private final qs2 r;
    private final qs2 s;
    private ss2 t;
    private final int[] u;
    private int w;
    private int x;
    private final m35 y;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidViewHolder(Context context, c cVar, int i, NestedScrollDispatcher nestedScrollDispatcher, View view, m mVar) {
        super(context);
        b.a aVar;
        this.a = i;
        this.b = nestedScrollDispatcher;
        this.c = view;
        this.d = mVar;
        if (cVar != null) {
            WindowRecomposer_androidKt.i(this, cVar);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.e = new qs2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m106invoke() {
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m106invoke();
                return ww8.a;
            }
        };
        this.g = new qs2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m103invoke() {
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m103invoke();
                return ww8.a;
            }
        };
        this.h = new qs2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m102invoke() {
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m102invoke();
                return ww8.a;
            }
        };
        Modifier.a aVar2 = Modifier.a;
        this.i = aVar2;
        this.k = hm1.b(1.0f, 0.0f, 2, null);
        this.r = new qs2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m105invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m105invoke() {
                boolean z;
                OwnerSnapshotObserver snapshotObserver;
                ss2 ss2Var;
                z = AndroidViewHolder.this.f;
                if (z && AndroidViewHolder.this.isAttachedToWindow()) {
                    snapshotObserver = AndroidViewHolder.this.getSnapshotObserver();
                    AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                    ss2Var = AndroidViewHolder.N;
                    snapshotObserver.i(androidViewHolder, ss2Var, AndroidViewHolder.this.getUpdate());
                }
            }
        };
        this.s = new qs2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m104invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m104invoke() {
                AndroidViewHolder.this.getLayoutNode().A0();
            }
        };
        this.u = new int[2];
        this.w = RecyclerView.UNDEFINED_DURATION;
        this.x = RecyclerView.UNDEFINED_DURATION;
        this.y = new m35(this);
        Object[] objArr = 0 == true ? 1 : 0;
        final LayoutNode layoutNode = new LayoutNode(false, objArr, 3, null);
        layoutNode.r1(this);
        aVar = b.a;
        final Modifier a2 = h.a(androidx.compose.ui.draw.a.b(PointerInteropFilter_androidKt.b(dj7.c(androidx.compose.ui.input.nestedscroll.a.a(aVar2, aVar, nestedScrollDispatcher), true, new ss2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            public final void b(lj7 lj7Var) {
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((lj7) obj);
                return ww8.a;
            }
        }), this), new ss2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((fv1) obj);
                return ww8.a;
            }

            public final void invoke(fv1 fv1Var) {
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                LayoutNode layoutNode2 = layoutNode;
                AndroidViewHolder androidViewHolder2 = this;
                ph0 c = fv1Var.i1().c();
                if (androidViewHolder.getView().getVisibility() != 8) {
                    androidViewHolder.B = true;
                    m j0 = layoutNode2.j0();
                    AndroidComposeView androidComposeView = j0 instanceof AndroidComposeView ? (AndroidComposeView) j0 : null;
                    if (androidComposeView != null) {
                        androidComposeView.U(androidViewHolder2, wd.d(c));
                    }
                    androidViewHolder.B = false;
                }
            }
        }), new ss2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(cz3 cz3Var) {
                b.f(AndroidViewHolder.this, layoutNode);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((cz3) obj);
                return ww8.a;
            }
        });
        layoutNode.c(i);
        layoutNode.k(this.i.h(a2));
        this.j = new ss2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(Modifier modifier) {
                LayoutNode.this.k(modifier.h(a2));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Modifier) obj);
                return ww8.a;
            }
        };
        layoutNode.h(this.k);
        this.l = new ss2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            public final void b(fm1 fm1Var) {
                LayoutNode.this.h(fm1Var);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((fm1) obj);
                return ww8.a;
            }
        };
        layoutNode.v1(new ss2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(m mVar2) {
                AndroidComposeView androidComposeView = mVar2 instanceof AndroidComposeView ? (AndroidComposeView) mVar2 : null;
                if (androidComposeView != null) {
                    androidComposeView.N(AndroidViewHolder.this, layoutNode);
                }
                ViewParent parent = AndroidViewHolder.this.getView().getParent();
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                if (parent != androidViewHolder) {
                    androidViewHolder.addView(androidViewHolder.getView());
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((m) obj);
                return ww8.a;
            }
        });
        layoutNode.w1(new ss2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            public final void b(m mVar2) {
                AndroidComposeView androidComposeView = mVar2 instanceof AndroidComposeView ? (AndroidComposeView) mVar2 : null;
                if (androidComposeView != null) {
                    androidComposeView.p0(AndroidViewHolder.this);
                }
                AndroidViewHolder.this.removeAllViewsInLayout();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((m) obj);
                return ww8.a;
            }
        });
        layoutNode.j(new rg4() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            private final int j(int i2) {
                int n;
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                zq3.e(layoutParams);
                n = androidViewHolder.n(0, i2, layoutParams.width);
                androidViewHolder.measure(n, View.MeasureSpec.makeMeasureSpec(0, 0));
                return AndroidViewHolder.this.getMeasuredHeight();
            }

            private final int k(int i2) {
                int n;
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                zq3.e(layoutParams);
                n = androidViewHolder2.n(0, i2, layoutParams.height);
                androidViewHolder.measure(makeMeasureSpec, n);
                return AndroidViewHolder.this.getMeasuredWidth();
            }

            @Override // defpackage.rg4
            public int a(yq3 yq3Var, List list, int i2) {
                return k(i2);
            }

            @Override // defpackage.rg4
            public sg4 d(f fVar, List list, long j) {
                int n;
                int n2;
                if (AndroidViewHolder.this.getChildCount() == 0) {
                    return f.J(fVar, fv0.p(j), fv0.o(j), null, new ss2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                        public final void b(l.a aVar3) {
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((l.a) obj);
                            return ww8.a;
                        }
                    }, 4, null);
                }
                if (fv0.p(j) != 0) {
                    AndroidViewHolder.this.getChildAt(0).setMinimumWidth(fv0.p(j));
                }
                if (fv0.o(j) != 0) {
                    AndroidViewHolder.this.getChildAt(0).setMinimumHeight(fv0.o(j));
                }
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                int p = fv0.p(j);
                int n3 = fv0.n(j);
                ViewGroup.LayoutParams layoutParams = AndroidViewHolder.this.getLayoutParams();
                zq3.e(layoutParams);
                n = androidViewHolder.n(p, n3, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
                int o = fv0.o(j);
                int m = fv0.m(j);
                ViewGroup.LayoutParams layoutParams2 = AndroidViewHolder.this.getLayoutParams();
                zq3.e(layoutParams2);
                n2 = androidViewHolder2.n(o, m, layoutParams2.height);
                androidViewHolder.measure(n, n2);
                int measuredWidth = AndroidViewHolder.this.getMeasuredWidth();
                int measuredHeight = AndroidViewHolder.this.getMeasuredHeight();
                final AndroidViewHolder androidViewHolder3 = AndroidViewHolder.this;
                final LayoutNode layoutNode2 = layoutNode;
                return f.J(fVar, measuredWidth, measuredHeight, null, new ss2() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(l.a aVar3) {
                        b.f(AndroidViewHolder.this, layoutNode2);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((l.a) obj);
                        return ww8.a;
                    }
                }, 4, null);
            }

            @Override // defpackage.rg4
            public int e(yq3 yq3Var, List list, int i2) {
                return k(i2);
            }

            @Override // defpackage.rg4
            public int g(yq3 yq3Var, List list, int i2) {
                return j(i2);
            }

            @Override // defpackage.rg4
            public int i(yq3 yq3Var, List list, int i2) {
                return j(i2);
            }
        });
        this.H = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (isAttachedToWindow()) {
            return this.d.getSnapshotObserver();
        }
        throw new IllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(qs2 qs2Var) {
        qs2Var.mo865invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n(int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(uo6.m(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, RecyclerView.UNDEFINED_DURATION);
    }

    @Override // defpackage.km5
    public boolean M0() {
        return isAttachedToWindow();
    }

    @Override // defpackage.es0
    public void b() {
        this.h.mo865invoke();
    }

    @Override // defpackage.es0
    public void d() {
        this.g.mo865invoke();
        removeAllViewsInLayout();
    }

    @Override // defpackage.es0
    public void g() {
        if (this.c.getParent() != this) {
            addView(this.c);
        } else {
            this.g.mo865invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.u);
        int[] iArr = this.u;
        int i = iArr[0];
        region.op(i, iArr[1], i + getWidth(), this.u[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final fm1 getDensity() {
        return this.k;
    }

    public final View getInteropView() {
        return this.c;
    }

    public final LayoutNode getLayoutNode() {
        return this.H;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final d44 getLifecycleOwner() {
        return this.m;
    }

    public final Modifier getModifier() {
        return this.i;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.y.a();
    }

    public final ss2 getOnDensityChanged$ui_release() {
        return this.l;
    }

    public final ss2 getOnModifierChanged$ui_release() {
        return this.j;
    }

    public final ss2 getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.t;
    }

    public final qs2 getRelease() {
        return this.h;
    }

    public final qs2 getReset() {
        return this.g;
    }

    public final aa7 getSavedStateRegistryOwner() {
        return this.n;
    }

    public final qs2 getUpdate() {
        return this.e;
    }

    public final View getView() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        l();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.c.isNestedScrollingEnabled();
    }

    public final void l() {
        if (!this.B) {
            this.H.A0();
            return;
        }
        View view = this.c;
        final qs2 qs2Var = this.s;
        view.postOnAnimation(new Runnable() { // from class: wg
            @Override // java.lang.Runnable
            public final void run() {
                AndroidViewHolder.m(qs2.this);
            }
        });
    }

    public final void o() {
        int i;
        int i2 = this.w;
        if (i2 == Integer.MIN_VALUE || (i = this.x) == Integer.MIN_VALUE) {
            return;
        }
        measure(i2, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.mo865invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.c.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (this.c.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.c.measure(i, i2);
        setMeasuredDimension(this.c.getMeasuredWidth(), this.c.getMeasuredHeight());
        this.w = i;
        this.x = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        float h;
        float h2;
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        h = b.h(f);
        h2 = b.h(f2);
        BuildersKt__Builders_commonKt.launch$default(this.b.e(), null, null, new AndroidViewHolder$onNestedFling$1(z, this, v49.a(h, h2), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        float h;
        float h2;
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        h = b.h(f);
        h2 = b.h(f2);
        BuildersKt__Builders_commonKt.launch$default(this.b.e(), null, null, new AndroidViewHolder$onNestedPreFling$1(this, v49.a(h, h2), null), 3, null);
        return false;
    }

    @Override // defpackage.k35
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        float g;
        float g2;
        int i4;
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.b;
            g = b.g(i);
            g2 = b.g(i2);
            long a2 = hd5.a(g, g2);
            i4 = b.i(i3);
            long d = nestedScrollDispatcher.d(a2, i4);
            iArr[0] = f35.f(fd5.o(d));
            iArr[1] = f35.f(fd5.p(d));
        }
    }

    @Override // defpackage.l35
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        float g;
        float g2;
        float g3;
        float g4;
        int i6;
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.b;
            g = b.g(i);
            g2 = b.g(i2);
            long a2 = hd5.a(g, g2);
            g3 = b.g(i3);
            g4 = b.g(i4);
            long a3 = hd5.a(g3, g4);
            i6 = b.i(i5);
            long b = nestedScrollDispatcher.b(a2, a3, i6);
            iArr[0] = f35.f(fd5.o(b));
            iArr[1] = f35.f(fd5.p(b));
        }
    }

    @Override // defpackage.k35
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.y.c(view, view2, i, i2);
    }

    @Override // defpackage.k35
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // defpackage.k35
    public void onStopNestedScroll(View view, int i) {
        this.y.e(view, i);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        ss2 ss2Var = this.t;
        if (ss2Var != null) {
            ss2Var.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(fm1 fm1Var) {
        if (fm1Var != this.k) {
            this.k = fm1Var;
            ss2 ss2Var = this.l;
            if (ss2Var != null) {
                ss2Var.invoke(fm1Var);
            }
        }
    }

    public final void setLifecycleOwner(d44 d44Var) {
        if (d44Var != this.m) {
            this.m = d44Var;
            ViewTreeLifecycleOwner.b(this, d44Var);
        }
    }

    public final void setModifier(Modifier modifier) {
        if (modifier != this.i) {
            this.i = modifier;
            ss2 ss2Var = this.j;
            if (ss2Var != null) {
                ss2Var.invoke(modifier);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(ss2 ss2Var) {
        this.l = ss2Var;
    }

    public final void setOnModifierChanged$ui_release(ss2 ss2Var) {
        this.j = ss2Var;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(ss2 ss2Var) {
        this.t = ss2Var;
    }

    protected final void setRelease(qs2 qs2Var) {
        this.h = qs2Var;
    }

    protected final void setReset(qs2 qs2Var) {
        this.g = qs2Var;
    }

    public final void setSavedStateRegistryOwner(aa7 aa7Var) {
        if (aa7Var != this.n) {
            this.n = aa7Var;
            ViewTreeSavedStateRegistryOwner.b(this, aa7Var);
        }
    }

    protected final void setUpdate(qs2 qs2Var) {
        this.e = qs2Var;
        this.f = true;
        this.r.mo865invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // defpackage.k35
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        float g;
        float g2;
        float g3;
        float g4;
        int i6;
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.b;
            g = b.g(i);
            g2 = b.g(i2);
            long a2 = hd5.a(g, g2);
            g3 = b.g(i3);
            g4 = b.g(i4);
            long a3 = hd5.a(g3, g4);
            i6 = b.i(i5);
            nestedScrollDispatcher.b(a2, a3, i6);
        }
    }
}
