package defpackage;

import android.view.KeyEvent;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMappingKt;

/* loaded from: classes.dex */
public abstract class dw3 {
    private static final cw3 a = new a();

    public static final class a implements cw3 {
        a() {
        }

        @Override // defpackage.cw3
        public KeyCommand a(KeyEvent keyEvent) {
            KeyCommand keyCommand = null;
            if (wv3.f(keyEvent) && wv3.d(keyEvent)) {
                long a = wv3.a(keyEvent);
                ve4 ve4Var = ve4.a;
                if (nv3.p(a, ve4Var.i())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (nv3.p(a, ve4Var.j())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (nv3.p(a, ve4Var.k())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (nv3.p(a, ve4Var.h())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (wv3.d(keyEvent)) {
                long a2 = wv3.a(keyEvent);
                ve4 ve4Var2 = ve4.a;
                if (nv3.p(a2, ve4Var2.i())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (nv3.p(a2, ve4Var2.j())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (nv3.p(a2, ve4Var2.k())) {
                    keyCommand = KeyCommand.HOME;
                } else if (nv3.p(a2, ve4Var2.h())) {
                    keyCommand = KeyCommand.END;
                }
            }
            return keyCommand == null ? KeyMappingKt.b().a(keyEvent) : keyCommand;
        }
    }

    public static final cw3 a() {
        return a;
    }
}
