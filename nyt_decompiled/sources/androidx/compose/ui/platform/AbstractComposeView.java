package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Recomposer;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ws0;
import defpackage.ww8;
import defpackage.zr0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class AbstractComposeView extends ViewGroup {
    private WeakReference a;
    private IBinder b;
    private ws0 c;
    private androidx.compose.runtime.c d;
    private qs2 e;
    private boolean f;
    private boolean g;
    private boolean h;

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final androidx.compose.runtime.c c(androidx.compose.runtime.c cVar) {
        androidx.compose.runtime.c cVar2 = j(cVar) ? cVar : null;
        if (cVar2 != null) {
            this.a = new WeakReference(cVar2);
        }
        return cVar;
    }

    private final void d() {
        if (this.g) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void g() {
        if (this.c == null) {
            try {
                this.g = true;
                this.c = y.c(this, k(), zr0.c(-656146368, true, new gt2() { // from class: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 11) == 2 && composer.i()) {
                            composer.K();
                            return;
                        }
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.S(-656146368, i, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:251)");
                        }
                        AbstractComposeView.this.b(composer, 8);
                        if (androidx.compose.runtime.b.G()) {
                            androidx.compose.runtime.b.R();
                        }
                    }
                }));
            } finally {
                this.g = false;
            }
        }
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean j(androidx.compose.runtime.c cVar) {
        return !(cVar instanceof Recomposer) || ((Recomposer.State) ((Recomposer) cVar).b0().getValue()).compareTo(Recomposer.State.ShuttingDown) > 0;
    }

    private final androidx.compose.runtime.c k() {
        androidx.compose.runtime.c cVar;
        androidx.compose.runtime.c cVar2 = this.d;
        if (cVar2 != null) {
            return cVar2;
        }
        androidx.compose.runtime.c d = WindowRecomposer_androidKt.d(this);
        androidx.compose.runtime.c cVar3 = null;
        androidx.compose.runtime.c c = d != null ? c(d) : null;
        if (c != null) {
            return c;
        }
        WeakReference weakReference = this.a;
        if (weakReference != null && (cVar = (androidx.compose.runtime.c) weakReference.get()) != null && j(cVar)) {
            cVar3 = cVar;
        }
        androidx.compose.runtime.c cVar4 = cVar3;
        return cVar4 == null ? c(WindowRecomposer_androidKt.h(this)) : cVar4;
    }

    private final void setParentContext(androidx.compose.runtime.c cVar) {
        if (this.d != cVar) {
            this.d = cVar;
            if (cVar != null) {
                this.a = null;
            }
            ws0 ws0Var = this.c;
            if (ws0Var != null) {
                ws0Var.dispose();
                this.c = null;
                if (isAttachedToWindow()) {
                    g();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.b != iBinder) {
            this.b = iBinder;
            this.a = null;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        d();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        d();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public abstract void b(Composer composer, int i);

    public final void e() {
        if (this.d == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        g();
    }

    public final void f() {
        ws0 ws0Var = this.c;
        if (ws0Var != null) {
            ws0Var.dispose();
        }
        this.c = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.c != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f;
    }

    public void h(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void i(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.h || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        h(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        g();
        i(i, i2);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i);
    }

    public final void setParentCompositionContext(androidx.compose.runtime.c cVar) {
        setParentContext(cVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((androidx.compose.ui.node.m) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.h = true;
    }

    public final void setViewCompositionStrategy(ViewCompositionStrategy viewCompositionStrategy) {
        qs2 qs2Var = this.e;
        if (qs2Var != null) {
            qs2Var.mo865invoke();
        }
        this.e = viewCompositionStrategy.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        this.e = ViewCompositionStrategy.a.a().a(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        d();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        d();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        d();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        d();
        super.addView(view, i, layoutParams);
    }
}
