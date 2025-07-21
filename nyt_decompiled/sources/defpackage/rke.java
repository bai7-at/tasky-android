package defpackage;

import com.google.android.gms.internal.ads.pf;
import com.google.android.gms.internal.ads.ph;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class rke {
    private final InputStream a;

    private rke(InputStream inputStream) {
        this.a = inputStream;
    }

    public static rke b(byte[] bArr) {
        return new rke(new ByteArrayInputStream(bArr));
    }

    public final pf a() {
        try {
            return pf.Q(this.a, ph.a());
        } finally {
            this.a.close();
        }
    }
}
