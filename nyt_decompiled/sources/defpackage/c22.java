package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.List;

/* loaded from: classes2.dex */
public final class c22 extends bq0 {
    private final List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c22(String str, List list) {
        super(str, null);
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(list, "values");
        this.b = list;
    }
}
