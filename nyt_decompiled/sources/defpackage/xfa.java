package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class xfa {
    final List a = new ArrayList();

    protected xfa() {
    }

    public abstract caa a(String str, xhe xheVar, List list);

    final caa b(String str) {
        if (this.a.contains(s0f.e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
