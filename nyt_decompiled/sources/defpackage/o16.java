package defpackage;

import android.content.Context;
import com.facebook.AuthenticationTokenClaims;
import java.io.File;

/* loaded from: classes.dex */
public abstract class o16 {
    public static final File a(Context context, String str) {
        zq3.h(context, "<this>");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return ea1.a(context, zq3.q(str, ".preferences_pb"));
    }
}
