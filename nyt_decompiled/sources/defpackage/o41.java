package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.text.i;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.ResolvedTextDirection;

/* loaded from: classes.dex */
public abstract class o41 {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005d, code lost:
    
        if (c(r22, r8.j(), r8.e()) == false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder a(android.view.inputmethod.CursorAnchorInfo.Builder r17, int r18, int r19, defpackage.id5 r20, defpackage.aj8 r21, defpackage.kt6 r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r18
            r3 = r22
            int r4 = r1.b(r2)
            int r5 = r1.b(r0)
            int r6 = r5 - r4
            int r6 = r6 * 4
            float[] r6 = new float[r6]
            androidx.compose.ui.text.MultiParagraph r7 = r21.w()
            long r8 = defpackage.pj8.b(r4, r5)
            r5 = 0
            r7.a(r8, r6, r5)
        L22:
            if (r2 >= r0) goto L8e
            int r5 = r1.b(r2)
            int r7 = r5 - r4
            int r7 = r7 * 4
            kt6 r8 = new kt6
            r9 = r6[r7]
            int r10 = r7 + 1
            r10 = r6[r10]
            int r11 = r7 + 2
            r11 = r6[r11]
            int r7 = r7 + 3
            r7 = r6[r7]
            r8.<init>(r9, r10, r11, r7)
            boolean r7 = r3.r(r8)
            float r9 = r8.i()
            float r10 = r8.l()
            boolean r9 = c(r3, r9, r10)
            if (r9 == 0) goto L63
            float r9 = r8.j()
            float r10 = r8.e()
            boolean r9 = c(r3, r9, r10)
            if (r9 != 0) goto L60
            goto L63
        L60:
            r9 = r21
            goto L66
        L63:
            r7 = r7 | 2
            goto L60
        L66:
            androidx.compose.ui.text.style.ResolvedTextDirection r5 = r9.c(r5)
            androidx.compose.ui.text.style.ResolvedTextDirection r10 = androidx.compose.ui.text.style.ResolvedTextDirection.Rtl
            if (r5 != r10) goto L73
            r5 = r7 | 4
            r16 = r5
            goto L75
        L73:
            r16 = r7
        L75:
            float r12 = r8.i()
            float r13 = r8.l()
            float r14 = r8.j()
            float r15 = r8.e()
            r10 = r17
            r11 = r2
            r10.addCharacterBounds(r11, r12, r13, r14, r15, r16)
            int r2 = r2 + 1
            goto L22
        L8e:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o41.a(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, id5, aj8, kt6):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    public static final CursorAnchorInfo b(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, id5 id5Var, aj8 aj8Var, Matrix matrix, kt6 kt6Var, kt6 kt6Var2, boolean z, boolean z2, boolean z3, boolean z4) {
        builder.reset();
        builder.setMatrix(matrix);
        int l = i.l(textFieldValue.g());
        builder.setSelectionRange(l, i.k(textFieldValue.g()));
        if (z) {
            d(builder, l, id5Var, aj8Var, kt6Var);
        }
        if (z2) {
            i f = textFieldValue.f();
            int l2 = f != null ? i.l(f.r()) : -1;
            i f2 = textFieldValue.f();
            int k = f2 != null ? i.k(f2.r()) : -1;
            if (l2 >= 0 && l2 < k) {
                builder.setComposingText(l2, textFieldValue.h().subSequence(l2, k));
                a(builder, l2, k, id5Var, aj8Var, kt6Var);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && z3) {
            l41.a(builder, kt6Var2);
        }
        if (i >= 34 && z4) {
            n41.a(builder, aj8Var, kt6Var);
        }
        return builder.build();
    }

    private static final boolean c(kt6 kt6Var, float f, float f2) {
        float i = kt6Var.i();
        if (f <= kt6Var.j() && i <= f) {
            float l = kt6Var.l();
            if (f2 <= kt6Var.e() && l <= f2) {
                return true;
            }
        }
        return false;
    }

    private static final CursorAnchorInfo.Builder d(CursorAnchorInfo.Builder builder, int i, id5 id5Var, aj8 aj8Var, kt6 kt6Var) {
        if (i < 0) {
            return builder;
        }
        int b = id5Var.b(i);
        kt6 e = aj8Var.e(b);
        float l = uo6.l(e.i(), 0.0f, hn3.g(aj8Var.B()));
        boolean c = c(kt6Var, l, e.l());
        boolean c2 = c(kt6Var, l, e.e());
        boolean z = aj8Var.c(b) == ResolvedTextDirection.Rtl;
        int i2 = (c || c2) ? 1 : 0;
        if (!c || !c2) {
            i2 |= 2;
        }
        builder.setInsertionMarkerLocation(l, e.l(), e.e(), e.e(), z ? i2 | 4 : i2);
        return builder;
    }
}
