package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes3.dex */
public class yf4 extends AppCompatTextView {
    public yf4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private void r(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, nn6.MaterialTextAppearance);
        int v = v(getContext(), obtainStyledAttributes, nn6.MaterialTextAppearance_android_lineHeight, nn6.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (v >= 0) {
            setLineHeight(v);
        }
    }

    private static boolean s(Context context) {
        return if4.b(context, lc6.textAppearanceLineHeightEnabled, true);
    }

    private static int t(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, nn6.MaterialTextView, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(nn6.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private void u(AttributeSet attributeSet, int i, int i2) {
        int t;
        Context context = getContext();
        if (s(context)) {
            Resources.Theme theme = context.getTheme();
            if (w(context, theme, attributeSet, i, i2) || (t = t(theme, attributeSet, i, i2)) == -1) {
                return;
            }
            r(theme, t);
        }
    }

    private static int v(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = tf4.c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    private static boolean w(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, nn6.MaterialTextView, i, i2);
        int v = v(context, obtainStyledAttributes, nn6.MaterialTextView_android_lineHeight, nn6.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        return v != -1;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (s(context)) {
            r(context.getTheme(), i);
        }
    }

    public yf4(Context context, AttributeSet attributeSet, int i) {
        super(bg4.c(context, attributeSet, i, 0), attributeSet, i);
        u(attributeSet, i, 0);
    }
}
