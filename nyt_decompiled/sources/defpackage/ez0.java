package defpackage;

import com.nytimes.android.logging.NYTLogger;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public final class ez0 extends hu3 {
    public static final ez0 b = new ez0();

    private ez0() {
        super(he0.D(z38.a));
    }

    @Override // defpackage.hu3
    protected JsonElement a(JsonElement jsonElement) {
        zq3.h(jsonElement, "element");
        try {
            return nt3.c(nt3.j(jsonElement).a());
        } catch (Exception e) {
            NYTLogger.B(e);
            return nt3.c(jsonElement.toString());
        }
    }
}
