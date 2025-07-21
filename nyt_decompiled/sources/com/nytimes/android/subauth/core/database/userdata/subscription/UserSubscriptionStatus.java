package com.nytimes.android.subauth.core.database.userdata.subscription;

import androidx.annotation.Keep;
import defpackage.b22;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
/* loaded from: classes4.dex */
public final class UserSubscriptionStatus {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ UserSubscriptionStatus[] $VALUES;
    public static final a Companion;
    public static final UserSubscriptionStatus ACTIVE = new UserSubscriptionStatus("ACTIVE", 0);
    public static final UserSubscriptionStatus CLOSED = new UserSubscriptionStatus("CLOSED", 1);
    public static final UserSubscriptionStatus QUEUED = new UserSubscriptionStatus("QUEUED", 2);
    public static final UserSubscriptionStatus IN_GRACE_PERIOD = new UserSubscriptionStatus("IN_GRACE_PERIOD", 3);
    public static final UserSubscriptionStatus CANCELLED = new UserSubscriptionStatus("CANCELLED", 4);
    public static final UserSubscriptionStatus PAUSED = new UserSubscriptionStatus("PAUSED", 5);
    public static final UserSubscriptionStatus SOFT_CANCELLED = new UserSubscriptionStatus("SOFT_CANCELLED", 6);
    public static final UserSubscriptionStatus UNKNOWN = new UserSubscriptionStatus("UNKNOWN", 7);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UserSubscriptionStatus a(String str) {
            UserSubscriptionStatus userSubscriptionStatus;
            if (str != null) {
                UserSubscriptionStatus[] values = UserSubscriptionStatus.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        userSubscriptionStatus = null;
                        break;
                    }
                    userSubscriptionStatus = values[i];
                    if (zq3.c(userSubscriptionStatus == UserSubscriptionStatus.SOFT_CANCELLED ? "SOFT_CANCELED" : userSubscriptionStatus.name(), str)) {
                        break;
                    }
                    i++;
                }
                if (userSubscriptionStatus != null) {
                    return userSubscriptionStatus;
                }
            }
            return UserSubscriptionStatus.UNKNOWN;
        }

        private a() {
        }
    }

    private static final /* synthetic */ UserSubscriptionStatus[] $values() {
        return new UserSubscriptionStatus[]{ACTIVE, CLOSED, QUEUED, IN_GRACE_PERIOD, CANCELLED, PAUSED, SOFT_CANCELLED, UNKNOWN};
    }

    static {
        UserSubscriptionStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private UserSubscriptionStatus(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static UserSubscriptionStatus valueOf(String str) {
        return (UserSubscriptionStatus) Enum.valueOf(UserSubscriptionStatus.class, str);
    }

    public static UserSubscriptionStatus[] values() {
        return (UserSubscriptionStatus[]) $VALUES.clone();
    }
}
