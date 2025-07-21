package defpackage;

import android.text.TextUtils;
import com.google.common.collect.ImmutableSet;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes2.dex */
final class ai8 {
    private static final Pattern d = Pattern.compile("\\s+");
    private static final ImmutableSet e = ImmutableSet.A(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "none");
    private static final ImmutableSet f = ImmutableSet.B("dot", "sesame", "circle");
    private static final ImmutableSet g = ImmutableSet.A("filled", "open");
    private static final ImmutableSet h = ImmutableSet.B("after", "before", "outside");
    public final int a;
    public final int b;
    public final int c;

    private ai8(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static ai8 a(String str) {
        if (str == null) {
            return null;
        }
        String e2 = tr.e(str.trim());
        if (e2.isEmpty()) {
            return null;
        }
        return b(ImmutableSet.v(TextUtils.split(e2, d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
    
        if (r9.equals("dot") != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.ai8 b(com.google.common.collect.ImmutableSet r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai8.b(com.google.common.collect.ImmutableSet):ai8");
    }
}
