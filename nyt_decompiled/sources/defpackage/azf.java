package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class azf extends l1a {
    private final Callable c;

    public azf(String str, Callable callable) {
        super("internal.appMetadata");
        this.c = callable;
    }

    @Override // defpackage.l1a
    public final caa b(xhe xheVar, List list) {
        try {
            return k6f.b(this.c.call());
        } catch (Exception unused) {
            return caa.T;
        }
    }
}
