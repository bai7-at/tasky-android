package defpackage;

import androidx.compose.runtime.c;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.d;

/* loaded from: classes.dex */
public abstract class at0 {
    private static final Object a = new Object();
    private static final it0 b = new a();

    public static final class a implements it0 {
        a() {
        }
    }

    public static final ws0 a(ln lnVar, c cVar) {
        return new d(cVar, lnVar, null, 4, null);
    }

    public static final i17 b(ln lnVar, c cVar) {
        return new d(cVar, lnVar, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ff3 ff3Var, Object obj, Object obj2) {
        if (ff3Var.b(obj)) {
            IdentityArraySet identityArraySet = (IdentityArraySet) ff3Var.e(obj);
            if (identityArraySet != null) {
                identityArraySet.add(obj2);
                return;
            }
            return;
        }
        IdentityArraySet identityArraySet2 = new IdentityArraySet();
        identityArraySet2.add(obj2);
        ww8 ww8Var = ww8.a;
        ff3Var.j(obj, identityArraySet2);
    }
}
