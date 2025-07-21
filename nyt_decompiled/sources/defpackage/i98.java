package defpackage;

import com.nytimes.android.entitlements.debugging.SubauthShowNewsUserStatePreference;
import com.nytimes.android.subauth.core.api.setup.Subauth;

/* loaded from: classes4.dex */
public abstract class i98 implements op4 {
    public static void a(SubauthShowNewsUserStatePreference subauthShowNewsUserStatePreference, Subauth subauth) {
        subauthShowNewsUserStatePreference.subauth = subauth;
    }

    public static void b(SubauthShowNewsUserStatePreference subauthShowNewsUserStatePreference, c78 c78Var) {
        subauthShowNewsUserStatePreference.subauthEntitlementClient = c78Var;
    }
}
