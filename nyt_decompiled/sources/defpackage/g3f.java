package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class g3f extends j3f {
    final Logger a;

    public g3f(String str) {
        this.a = Logger.getLogger(str);
    }

    @Override // defpackage.j3f
    public final void a(String str) {
        this.a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
