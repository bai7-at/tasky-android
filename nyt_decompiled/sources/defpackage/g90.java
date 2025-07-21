package defpackage;

import com.facebook.AuthenticationTokenClaims;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class g90 extends ue4 {
    private final String b;
    private final String c;

    public /* synthetic */ g90(String str, i90 i90Var, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : i90Var, str2, (i & 8) != 0 ? null : num);
    }

    public g90(String str, i90 i90Var, String str2, Integer num) {
        super(du8.a("label", str), du8.a("list", i90Var), du8.a(AuthenticationTokenClaims.JSON_KEY_NAME, str2), du8.a("index", num));
        this.b = str;
        this.c = str2;
    }
}
