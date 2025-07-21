package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.Map;
import kotlin.c;

/* loaded from: classes4.dex */
public final class k32 extends j32 {
    private final c04 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k32(String str, qs2 qs2Var) {
        super(str, null, 2, null);
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(qs2Var, "parametersFactory");
        this.c = c.a(qs2Var);
    }

    @Override // defpackage.j32
    public Map b() {
        return (Map) this.c.getValue();
    }
}
