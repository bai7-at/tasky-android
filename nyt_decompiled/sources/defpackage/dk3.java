package defpackage;

import androidx.compose.ui.text.a;

/* loaded from: classes.dex */
public abstract class dk3 {
    public static final void a(a.C0064a c0064a, String str, String str2) {
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("alternateText can't be an empty string.");
        }
        c0064a.l("androidx.compose.foundation.text.inlineContent", str);
        c0064a.i(str2);
        c0064a.j();
    }

    public static /* synthetic */ void b(a.C0064a c0064a, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "�";
        }
        a(c0064a, str, str2);
    }
}
