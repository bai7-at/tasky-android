package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ysa extends xfa {
    @Override // defpackage.xfa
    public final caa a(String str, xhe xheVar, List list) {
        if (str == null || str.isEmpty() || !xheVar.h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        caa d = xheVar.d(str);
        if (d instanceof l1a) {
            return ((l1a) d).b(xheVar, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
