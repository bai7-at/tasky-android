package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.a;
import defpackage.vy4;

/* loaded from: classes.dex */
public abstract class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(vy4 vy4Var, int i) {
        int q = vy4Var.q() - 1;
        int i2 = 0;
        while (i2 < q) {
            int i3 = ((q - i2) / 2) + i2;
            int b = ((a.C0029a) vy4Var.p()[i3]).b();
            if (b == i) {
                return i3;
            }
            if (b < i) {
                i2 = i3 + 1;
                if (i < ((a.C0029a) vy4Var.p()[i2]).b()) {
                    return i3;
                }
            } else {
                q = i3 - 1;
            }
        }
        return i2;
    }
}
