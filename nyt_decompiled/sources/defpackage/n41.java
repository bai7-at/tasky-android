package defpackage;

import android.view.inputmethod.CursorAnchorInfo;

/* loaded from: classes.dex */
final class n41 {
    public static final n41 a = new n41();

    private n41() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, aj8 aj8Var, kt6 kt6Var) {
        int r;
        int r2;
        if (!kt6Var.q() && (r = aj8Var.r(kt6Var.l())) <= (r2 = aj8Var.r(kt6Var.e()))) {
            while (true) {
                builder.addVisibleLineBounds(aj8Var.s(r), aj8Var.v(r), aj8Var.t(r), aj8Var.m(r));
                if (r == r2) {
                    break;
                }
                r++;
            }
        }
        return builder;
    }
}
