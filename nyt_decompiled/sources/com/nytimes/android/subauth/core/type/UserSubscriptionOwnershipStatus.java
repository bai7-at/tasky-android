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
public final class UserSubscriptionOwnershipStatus {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ UserSubscriptionOwnershipStatus[] $VALUES;
    public static final a Companion;
    public static final UserSubscriptionOwnershipStatus OWNED = new UserSubscriptionOwnershipStatus("OWNED", 0, "OWNED");
    public static final UserSubscriptionOwnershipStatus SHARED = new UserSubscriptionOwnershipStatus("SHARED", 1, "SHARED");
    public static final UserSubscriptionOwnershipStatus UNKNOWN__ = new UserSubscriptionOwnershipStatus("UNKNOWN__", 2, "UNKNOWN__");

    /* renamed from: type, reason: collision with root package name */
    private static final c22 f77type;
    private final String rawValue;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UserSubscriptionOwnershipStatus a(String str) {
            Object obj;
            zq3.h(str, "rawValue");
            Iterator<E> it2 = UserSubscriptionOwnershipStatus.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (zq3.c(((UserSubscriptionOwnershipStatus) obj).getRawValue(), str)) {
                    break;
                }
            }
            UserSubscriptionOwnershipStatus userSubscriptionOwnershipStatus = (UserSubscriptionOwnershipStatus) obj;
            return userSubscriptionOwnershipStatus == null ? UserSubscriptionOwnershipStatus.UNKNOWN__ : userSubscriptionOwnershipStatus;
        }

        private a() {
        }
    }

    private static final /* synthetic */ UserSubscriptionOwnershipStatus[] $values() {
        return new UserSubscriptionOwnershipStatus[]{OWNED, SHARED, UNKNOWN__};
    }

    static {
        UserSubscriptionOwnershipStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        f77type = new c22("UserSubscriptionOwnershipStatus", i.o("OWNED", "SHARED"));
    }

    private UserSubscriptionOwnershipStatus(String str, int i, String str2) {
        this.rawValue = str2;
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

    public final String getRawValue() {
        return this.rawValue;
    }
}
