package com.nytimes.android.subauth.core.database.userdata.subscription;

import androidx.annotation.Keep;
import defpackage.b22;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
/* loaded from: classes4.dex */
public final class UserSubscriptionOwnershipStatus {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ UserSubscriptionOwnershipStatus[] $VALUES;
    public static final a Companion;
    public static final UserSubscriptionOwnershipStatus OWNED = new UserSubscriptionOwnershipStatus("OWNED", 0);
    public static final UserSubscriptionOwnershipStatus SHARED = new UserSubscriptionOwnershipStatus("SHARED", 1);
    public static final UserSubscriptionOwnershipStatus UNKNOWN = new UserSubscriptionOwnershipStatus("UNKNOWN", 2);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UserSubscriptionOwnershipStatus a(String str) {
            UserSubscriptionOwnershipStatus userSubscriptionOwnershipStatus;
            zq3.h(str, "rawValue");
            UserSubscriptionOwnershipStatus[] values = UserSubscriptionOwnershipStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    userSubscriptionOwnershipStatus = null;
                    break;
                }
                userSubscriptionOwnershipStatus = values[i];
                if (zq3.c(userSubscriptionOwnershipStatus.name(), str)) {
                    break;
                }
                i++;
            }
            return userSubscriptionOwnershipStatus == null ? UserSubscriptionOwnershipStatus.UNKNOWN : userSubscriptionOwnershipStatus;
        }

        private a() {
        }
    }

    private static final /* synthetic */ UserSubscriptionOwnershipStatus[] $values() {
        return new UserSubscriptionOwnershipStatus[]{OWNED, SHARED, UNKNOWN};
    }

    static {
        UserSubscriptionOwnershipStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private UserSubscriptionOwnershipStatus(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static UserSubscriptionOwnershipStatus valueOf(String str) {
        return (UserSubscriptionOwnershipStatus) Enum.valueOf(UserSubscriptionOwnershipStatus.class, str);
    }

    public static UserSubscriptionOwnershipStatus[] values() {
        return (UserSubscriptionOwnershipStatus[]) $VALUES.clone();
    }
}
