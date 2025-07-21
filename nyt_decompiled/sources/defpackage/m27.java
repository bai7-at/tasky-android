package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* loaded from: classes3.dex */
public abstract class m27 {
    public static final boolean a = true;
    private static final int[] b = {R.attr.state_pressed};
    private static final int[] c = {R.attr.state_hovered, R.attr.state_focused};
    private static final int[] d = {R.attr.state_focused};
    private static final int[] e = {R.attr.state_hovered};
    private static final int[] f = {R.attr.state_selected, R.attr.state_pressed};
    private static final int[] g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
    private static final int[] h = {R.attr.state_selected, R.attr.state_focused};
    private static final int[] i = {R.attr.state_selected, R.attr.state_hovered};
    private static final int[] j = {R.attr.state_selected};
    private static final int[] k = {R.attr.state_enabled, R.attr.state_pressed};
    static final String l = m27.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }

    public static boolean b(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
