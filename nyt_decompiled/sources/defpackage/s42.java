package defpackage;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.facebook.AuthenticationTokenClaims;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class s42 extends ue4 {
    public /* synthetic */ s42(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, y32 y32Var, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : y32Var, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : str7);
    }

    public s42(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, y32 y32Var, String str7) {
        super(du8.a(AuthenticationTokenClaims.JSON_KEY_NAME, str), du8.a("label", str2), du8.a("cta", str4), du8.a("link", str5), du8.a("region", str3), du8.a("success", bool), du8.a("uri", str6), du8.a("element", y32Var), du8.a("context", str7));
    }
}
