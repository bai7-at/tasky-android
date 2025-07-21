package com.nytimes.android.subauth.core.database.userdata.googleplay;

import androidx.annotation.Keep;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionEntitlement;
import defpackage.b22;
import defpackage.zq3;
import java.util.Date;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* loaded from: classes4.dex */
public final class GooglePlayData {
    private final Set<UserSubscriptionEntitlement> entitlements;
    private final Date provisionalExpirationDate;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EntitlementState {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ EntitlementState[] $VALUES;
        public static final EntitlementState VALID = new EntitlementState("VALID", 0);
        public static final EntitlementState PROVISIONAL = new EntitlementState("PROVISIONAL", 1);
        public static final EntitlementState EXPIRED = new EntitlementState("EXPIRED", 2);

        private static final /* synthetic */ EntitlementState[] $values() {
            return new EntitlementState[]{VALID, PROVISIONAL, EXPIRED};
        }

        static {
            EntitlementState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private EntitlementState(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static EntitlementState valueOf(String str) {
            return (EntitlementState) Enum.valueOf(EntitlementState.class, str);
        }

        public static EntitlementState[] values() {
            return (EntitlementState[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EntitlementState.values().length];
            try {
                iArr[EntitlementState.VALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EntitlementState.PROVISIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EntitlementState.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GooglePlayData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GooglePlayData copy$default(GooglePlayData googlePlayData, Set set, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            set = googlePlayData.entitlements;
        }
        if ((i & 2) != 0) {
            date = googlePlayData.provisionalExpirationDate;
        }
        return googlePlayData.copy(set, date);
    }

    public final Set<UserSubscriptionEntitlement> activeEntitlements() {
        int i = a.$EnumSwitchMapping$0[entitlementState().ordinal()];
        if (i == 1 || i == 2) {
            return this.entitlements;
        }
        if (i == 3) {
            return b0.e();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Set<UserSubscriptionEntitlement> component1() {
        return this.entitlements;
    }

    public final Date component2() {
        return this.provisionalExpirationDate;
    }

    public final GooglePlayData copy(Set<? extends UserSubscriptionEntitlement> set, Date date) {
        zq3.h(set, "entitlements");
        return new GooglePlayData(set, date);
    }

    public final EntitlementState entitlementState() {
        Date date = this.provisionalExpirationDate;
        if (date != null) {
            EntitlementState entitlementState = System.currentTimeMillis() >= date.getTime() ? EntitlementState.EXPIRED : EntitlementState.PROVISIONAL;
            if (entitlementState != null) {
                return entitlementState;
            }
        }
        return EntitlementState.VALID;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePlayData)) {
            return false;
        }
        GooglePlayData googlePlayData = (GooglePlayData) obj;
        return zq3.c(this.entitlements, googlePlayData.entitlements) && zq3.c(this.provisionalExpirationDate, googlePlayData.provisionalExpirationDate);
    }

    public final Set<UserSubscriptionEntitlement> getEntitlements() {
        return this.entitlements;
    }

    public final Date getProvisionalExpirationDate() {
        return this.provisionalExpirationDate;
    }

    public int hashCode() {
        int hashCode = this.entitlements.hashCode() * 31;
        Date date = this.provisionalExpirationDate;
        return hashCode + (date == null ? 0 : date.hashCode());
    }

    public String toString() {
        return "GooglePlayData(entitlements=" + this.entitlements + ", provisionalExpirationDate=" + this.provisionalExpirationDate + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GooglePlayData(Set<? extends UserSubscriptionEntitlement> set, Date date) {
        zq3.h(set, "entitlements");
        this.entitlements = set;
        this.provisionalExpirationDate = date;
    }

    public /* synthetic */ GooglePlayData(Set set, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? b0.e() : set, (i & 2) != 0 ? null : date);
    }
}
