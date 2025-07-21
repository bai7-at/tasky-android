package defpackage;

import com.facebook.AuthenticationTokenClaims;
import io.opentelemetry.sdk.metrics.InstrumentType;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class gm3 {
    private InstrumentType a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    gm3() {
    }

    public fm3 a() {
        n29.a((this.a == null && this.b == null && this.c == null && this.d == null && this.e == null && this.f == null) ? false : true, "Instrument selector must contain selection criteria");
        return fm3.b(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public gm3 b(String str) {
        Objects.requireNonNull(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.b = str;
        return this;
    }
}
