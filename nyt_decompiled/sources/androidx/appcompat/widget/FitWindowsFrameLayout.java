package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.oj2;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout {
    private oj2 a;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        oj2 oj2Var = this.a;
        if (oj2Var != null) {
            oj2Var.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(oj2 oj2Var) {
    }
}
