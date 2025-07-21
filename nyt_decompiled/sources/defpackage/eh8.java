package defpackage;

import android.text.Layout;

/* loaded from: classes.dex */
public final class eh8 {
    public static final eh8 a = new eh8();
    private static final Layout.Alignment b;
    private static final Layout.Alignment c;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (zq3.c(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (zq3.c(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        b = alignment;
        c = alignment2;
    }

    private eh8() {
    }

    public final Layout.Alignment a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : c : b : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
    }
}
