package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.h0;

/* loaded from: classes.dex */
class xk extends PopupWindow {
    private static final boolean b = false;
    private boolean a;

    public xk(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        h0 v = h0.v(context, attributeSet, fo6.PopupWindow, i, i2);
        if (v.s(fo6.PopupWindow_overlapAnchor)) {
            b(v.a(fo6.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(v.g(fo6.PopupWindow_android_popupBackground));
        v.w();
    }

    private void b(boolean z) {
        if (b) {
            this.a = z;
        } else {
            zz5.a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
