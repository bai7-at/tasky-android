package defpackage;

import android.R;
import android.text.SpannableString;
import kotlin.collections.d;

/* loaded from: classes4.dex */
public abstract class b58 {
    private static final int[] a;
    private static final int b;
    private static final int c;
    private static final int d;

    static {
        int[] iArr = {R.attr.fontFamily, R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier};
        d.E(iArr);
        a = iArr;
        b = d.i0(iArr, R.attr.fontFamily);
        c = d.i0(iArr, R.attr.lineSpacingExtra);
        d = d.i0(iArr, R.attr.lineSpacingMultiplier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SpannableString spannableString, Object obj, int i, int i2) {
        spannableString.setSpan(obj, i, i2 + i, 34);
    }

    static /* synthetic */ void c(SpannableString spannableString, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        b(spannableString, obj, i, i2);
    }
}
