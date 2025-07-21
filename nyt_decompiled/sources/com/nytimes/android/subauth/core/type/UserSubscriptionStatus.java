package com.nytimes.android.subauth.core.type;

import defpackage.b22;
import defpackage.c22;
import defpackage.zq3;
import java.util.Iterator;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class UserSubscriptionStatus {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ UserSubscriptionStatus[] $VALUES;
    public static final a Companion;

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f78type;
    private final String rawValue;
    public static final UserSubscriptionStatus ACTIVE = new UserSubscriptionStatus("ACTIVE", 0, "ACTIVE");
    public static final UserSubscriptionStatus CLOSED = new UserSubscriptionStatus("CLOSED", 1, "CLOSED");
    public static final UserSubscriptionStatus QUEUED = new UserSubscriptionStatus("QUEUED", 2, "QUEUED");
    public static final UserSubscriptionStatus IN_GRACE_PERIOD = new UserSubscriptionStatus("IN_GRACE_PERIOD", 3, "IN_GRACE_PERIOD");
    public static final UserSubscriptionStatus CANCELED = new UserSubscriptionStatus("CANCELED", 4, "CANCELED");
    public static final UserSubscriptionStatus PAUSED = new UserSubscriptionStatus("PAUSED", 5, "PAUSED");
    public static final UserSubscriptionStatus SOFT_CANCELED = new UserSubscriptionStatus("SOFT_CANCELED", 6, "SOFT_CANCELED");
    public static final UserSubscriptionStatus UNKNOWN__ = new UserSubscriptionStatus("UNKNOWN__", 7, "UNKNOWN__");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UserSubscriptionStatus a(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = UserSubscriptionStatus.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((UserSubscriptionStatus) obj).getRawValue(), str)) {
                    break;
                }
            }
            UserSubscriptionStatus userSubscriptionStatus = (UserSubscriptionStatus) obj;
            return userSubscriptionStatus == null ? UserSubscriptionStatus.UNKNOWN__ : userSubscriptionStatus;
        }

        private a() {
        }
    }

    private static final /* synthetic */ UserSubscriptionStatus[] $values() {
        return new UserSubscriptionStatus[]{ACTIVE, CLOSED, QUEUED, IN_GRACE_PERIOD, CANCELED, PAUSED, SOFT_CANCELED, UNKNOWN__};
    }

    static {
        UserSubscriptionStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        f78type = new c22("UserSubscriptionStatus", i.o("ACTIVE", "CLOSED", "QUEUED", "IN_GRACE_PERIOD", "CANCELED", "PAUSED", "SOFT_CANCELED"));
    }

    private UserSubscriptionStatus(String str, int i, String str2) {
        this.rawValue = str2;
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

    public final String getRawValue() {
        return this.rawValue;
    }
}
