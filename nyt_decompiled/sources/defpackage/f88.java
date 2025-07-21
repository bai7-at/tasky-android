package defpackage;

import android.content.SharedPreferences;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionEntitlement;
import com.nytimes.android.subauth.core.devsettings.overrides.EntitlementOverrideSetting;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class f88 {
    public static final a Companion = new a(null);
    private final SharedPreferences a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EntitlementOverrideSetting.values().length];
            try {
                iArr[EntitlementOverrideSetting.NO_OVERRIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EntitlementOverrideSetting.ALL_ACCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EntitlementOverrideSetting.THE_ATHLETIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EntitlementOverrideSetting.NEWS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EntitlementOverrideSetting.COOKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EntitlementOverrideSetting.GAMES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    public f88(SharedPreferences sharedPreferences) {
        zq3.h(sharedPreferences, "defaultSharedPreferences");
        this.a = sharedPreferences;
    }

    private final EntitlementOverrideSetting a() {
        String string = this.a.getString("subauth.entitlement_override.key", null);
        if (string == null) {
            string = "NO_OVERRIDE";
        }
        return EntitlementOverrideSetting.valueOf(string);
    }

    public final Set b() {
        switch (b.a[a().ordinal()]) {
            case 1:
                return null;
            case 2:
                return com.nytimes.android.subauth.core.database.userdata.subscription.a.a();
            case 3:
                return b0.d(UserSubscriptionEntitlement.b.INSTANCE);
            case 4:
                return b0.d(UserSubscriptionEntitlement.g.INSTANCE);
            case 5:
                return b0.d(UserSubscriptionEntitlement.d.INSTANCE);
            case 6:
                return b0.d(UserSubscriptionEntitlement.f.INSTANCE);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
