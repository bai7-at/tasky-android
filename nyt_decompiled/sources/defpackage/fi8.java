package defpackage;

import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.j;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes.dex */
public abstract class fi8 {
    private static final String a = h.B("H", 10);

    public static final long a(j jVar, fm1 fm1Var, e.b bVar, String str, int i) {
        io5 a2;
        a2 = androidx.compose.ui.text.e.a(str, jVar, iv0.b(0, 0, 0, 0, 15, null), fm1Var, bVar, (r22 & 32) != 0 ? i.l() : i.l(), (r22 & 64) != 0 ? i.l() : null, (r22 & 128) != 0 ? Integer.MAX_VALUE : i, (r22 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? false : false);
        return in3.a(th8.a(a2.b()), th8.a(a2.getHeight()));
    }

    public static /* synthetic */ long b(j jVar, fm1 fm1Var, e.b bVar, String str, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = a;
        }
        if ((i2 & 16) != 0) {
            i = 1;
        }
        return a(jVar, fm1Var, bVar, str, i);
    }

    public static final String c() {
        return a;
    }
}
