package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class j32 {
    private final String a;
    private final Map b;

    public j32(String str, Map map) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.a = str;
        this.b = map;
    }

    public final String a() {
        return this.a;
    }

    public abstract Map b();

    public /* synthetic */ j32(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "event" : str, (i & 2) != 0 ? null : map);
    }
}
