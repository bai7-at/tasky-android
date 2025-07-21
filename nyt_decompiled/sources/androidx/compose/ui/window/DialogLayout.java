package androidx.compose.ui.window;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b0;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.cc7;
import defpackage.dg4;
import defpackage.fq1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.sy4;
import defpackage.ww8;

/* loaded from: classes.dex */
final class DialogLayout extends AbstractComposeView implements fq1 {
    private final Window i;
    private final sy4 j;
    private boolean k;
    private boolean l;

    public DialogLayout(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.i = window;
        this.j = b0.e(ComposableSingletons$AndroidDialog_androidKt.a.a(), null, 2, null);
    }

    private final gt2 getContent() {
        return (gt2) this.j.getValue();
    }

    private final int getDisplayHeight() {
        return dg4.d(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return dg4.d(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final void setContent(gt2 gt2Var) {
        this.j.setValue(gt2Var);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void b(Composer composer, final int i) {
        Composer h = composer.h(1735448596);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1735448596, i, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:268)");
        }
        getContent().invoke(h, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.ui.window.DialogLayout$Content$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    DialogLayout.this.b(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.l;
    }

    @Override // defpackage.fq1
    public Window getWindow() {
        return this.i;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void h(boolean z, int i, int i2, int i3, int i4) {
        View childAt;
        super.h(z, i, i2, i3, i4);
        if (this.k || (childAt = getChildAt(0)) == null) {
            return;
        }
        getWindow().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void i(int i, int i2) {
        if (this.k) {
            super.i(i, i2);
        } else {
            super.i(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), RecyclerView.UNDEFINED_DURATION), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), RecyclerView.UNDEFINED_DURATION));
        }
    }

    public final boolean l() {
        return this.k;
    }

    public final void m(androidx.compose.runtime.c cVar, gt2 gt2Var) {
        setParentCompositionContext(cVar);
        setContent(gt2Var);
        this.l = true;
        e();
    }

    public final void n(boolean z) {
        this.k = z;
    }
}
