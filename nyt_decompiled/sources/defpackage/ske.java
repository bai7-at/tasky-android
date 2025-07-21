package defpackage;

import com.google.android.gms.internal.ads.pf;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class ske {
    private final OutputStream a;

    private ske(OutputStream outputStream) {
        this.a = outputStream;
    }

    public static ske b(OutputStream outputStream) {
        return new ske(outputStream);
    }

    public final void a(pf pfVar) {
        try {
            pfVar.h(this.a);
        } finally {
            this.a.close();
        }
    }
}
