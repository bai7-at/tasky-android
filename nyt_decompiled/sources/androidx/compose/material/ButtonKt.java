package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.ag4;
import defpackage.dy4;
import defpackage.eb0;
import defpackage.fo3;
import defpackage.it2;
import defpackage.nn0;
import defpackage.no7;
import defpackage.qs2;
import defpackage.ve0;
import defpackage.x08;
import defpackage.xe0;
import defpackage.ym5;

/* loaded from: classes.dex */
public abstract class ButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.qs2 r37, androidx.compose.ui.Modifier r38, boolean r39, defpackage.dy4 r40, defpackage.xe0 r41, defpackage.no7 r42, defpackage.eb0 r43, defpackage.ve0 r44, defpackage.ym5 r45, final defpackage.it2 r46, androidx.compose.runtime.Composer r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ButtonKt.a(qs2, androidx.compose.ui.Modifier, boolean, dy4, xe0, no7, eb0, ve0, ym5, it2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(x08 x08Var) {
        return ((nn0) x08Var.getValue()).B();
    }

    public static final void c(qs2 qs2Var, Modifier modifier, boolean z, dy4 dy4Var, xe0 xe0Var, no7 no7Var, eb0 eb0Var, ve0 ve0Var, ym5 ym5Var, it2 it2Var, Composer composer, int i, int i2) {
        dy4 dy4Var2;
        composer.z(-1776134358);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.a : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        if ((i2 & 8) != 0) {
            composer.z(-492369756);
            Object A = composer.A();
            if (A == Composer.a.a()) {
                A = fo3.a();
                composer.q(A);
            }
            composer.R();
            dy4Var2 = (dy4) A;
        } else {
            dy4Var2 = dy4Var;
        }
        xe0 xe0Var2 = (i2 & 16) != 0 ? null : xe0Var;
        no7 c = (i2 & 32) != 0 ? ag4.a.b(composer, 6).c() : no7Var;
        eb0 h = (i2 & 64) != 0 ? a.a.h(composer, 6) : eb0Var;
        ve0 j = (i2 & 128) != 0 ? a.a.j(0L, 0L, 0L, composer, 3072, 7) : ve0Var;
        ym5 c2 = (i2 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? a.a.c() : ym5Var;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1776134358, i, -1, "androidx.compose.material.OutlinedButton (Button.kt:177)");
        }
        a(qs2Var, modifier2, z2, dy4Var2, xe0Var2, c, h, j, c2, it2Var, composer, i & 2147483646, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
    }

    public static final void d(qs2 qs2Var, Modifier modifier, boolean z, dy4 dy4Var, xe0 xe0Var, no7 no7Var, eb0 eb0Var, ve0 ve0Var, ym5 ym5Var, it2 it2Var, Composer composer, int i, int i2) {
        dy4 dy4Var2;
        composer.z(288797557);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.a : modifier;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        if ((i2 & 8) != 0) {
            composer.z(-492369756);
            Object A = composer.A();
            if (A == Composer.a.a()) {
                A = fo3.a();
                composer.q(A);
            }
            composer.R();
            dy4Var2 = (dy4) A;
        } else {
            dy4Var2 = dy4Var;
        }
        xe0 xe0Var2 = (i2 & 16) != 0 ? null : xe0Var;
        no7 c = (i2 & 32) != 0 ? ag4.a.b(composer, 6).c() : no7Var;
        eb0 eb0Var2 = (i2 & 64) != 0 ? null : eb0Var;
        ve0 k = (i2 & 128) != 0 ? a.a.k(0L, 0L, 0L, composer, 3072, 7) : ve0Var;
        ym5 i3 = (i2 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? a.a.i() : ym5Var;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(288797557, i, -1, "androidx.compose.material.TextButton (Button.kt:231)");
        }
        a(qs2Var, modifier2, z2, dy4Var2, xe0Var2, c, eb0Var2, k, i3, it2Var, composer, i & 2147483646, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
    }
}
