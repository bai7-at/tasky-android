package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.oj2;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout {
    private oj2 a;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
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
