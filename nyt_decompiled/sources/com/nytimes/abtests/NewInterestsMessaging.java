package com.nytimes.abtests;

import com.nytimes.android.abra.AbraVariant;
import defpackage.b22;
import defpackage.ss7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NewInterestsMessaging implements AbraVariant {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ NewInterestsMessaging[] $VALUES;
    public static final a Companion;
    private static final ss7 testSpec;
    private final String variantName;
    public static final NewInterestsMessaging CONTROL = new NewInterestsMessaging("CONTROL", 0, "0_control");
    public static final NewInterestsMessaging MESSAGES = new NewInterestsMessaging("MESSAGES", 1, "1_newInterestsToolTip");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss7 a() {
            return NewInterestsMessaging.testSpec;
        }

        private a() {
        }
    }

    private static final /* synthetic */ NewInterestsMessaging[] $values() {
        return new NewInterestsMessaging[]{CONTROL, MESSAGES};
    }

    static {
        NewInterestsMessaging[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        testSpec = new ss7("APP_userspace_newInterests_messaging", values(), null, false, 12, null);
    }

    private NewInterestsMessaging(String str, int i, String str2) {
        this.variantName = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static NewInterestsMessaging valueOf(String str) {
        return (NewInterestsMessaging) Enum.valueOf(NewInterestsMessaging.class, str);
    }

    public static NewInterestsMessaging[] values() {
        return (NewInterestsMessaging[]) $VALUES.clone();
    }

    @Override // com.nytimes.android.abra.AbraVariant
    public String getVariantName() {
        return this.variantName;
    }
}
