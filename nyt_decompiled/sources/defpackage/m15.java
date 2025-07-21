package defpackage;

import androidx.navigation.b;
import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes.dex */
public abstract class m15 {
    public static final l15 a(String str, ss2 ss2Var) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(ss2Var, "builder");
        b bVar = new b();
        ss2Var.invoke(bVar);
        return new l15(str, bVar.a());
    }
}
