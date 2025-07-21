package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bwa implements uxa {
    private final cwa a;

    public bwa(cwa cwaVar) {
        this.a = cwaVar;
    }

    @Override // defpackage.uxa
    public final void a(Object obj, Map map) {
        String str = (String) map.get(AuthenticationTokenClaims.JSON_KEY_NAME);
        if (str == null) {
            fgb.g("App event with no name parameter.");
        } else {
            this.a.zzb(str, (String) map.get("info"));
        }
    }
}
