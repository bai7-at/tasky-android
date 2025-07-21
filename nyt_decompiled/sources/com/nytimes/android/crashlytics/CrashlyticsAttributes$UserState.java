package com.nytimes.android.crashlytics;

import defpackage.b22;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CrashlyticsAttributes$UserState {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ CrashlyticsAttributes$UserState[] $VALUES;
    public static final a Companion;
    public static final CrashlyticsAttributes$UserState Subscribed = new CrashlyticsAttributes$UserState("Subscribed", 0);
    public static final CrashlyticsAttributes$UserState AnonymouslySubscribed = new CrashlyticsAttributes$UserState("AnonymouslySubscribed", 1);
    public static final CrashlyticsAttributes$UserState Registered = new CrashlyticsAttributes$UserState("Registered", 2);
    public static final CrashlyticsAttributes$UserState Anonymous = new CrashlyticsAttributes$UserState("Anonymous", 3);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CrashlyticsAttributes$UserState a(String str, Set set) {
            boolean z = str != null && str.length() > 0;
            boolean z2 = set != null ? !set.isEmpty() : false;
            return (z && z2) ? CrashlyticsAttributes$UserState.Subscribed : (!z || z2) ? (z || !z2) ? CrashlyticsAttributes$UserState.Anonymous : CrashlyticsAttributes$UserState.AnonymouslySubscribed : CrashlyticsAttributes$UserState.Registered;
        }

        private a() {
        }
    }

    private static final /* synthetic */ CrashlyticsAttributes$UserState[] $values() {
        return new CrashlyticsAttributes$UserState[]{Subscribed, AnonymouslySubscribed, Registered, Anonymous};
    }

    static {
        CrashlyticsAttributes$UserState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private CrashlyticsAttributes$UserState(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static final CrashlyticsAttributes$UserState getUserState(String str, Set<String> set) {
        return Companion.a(str, set);
    }

    public static CrashlyticsAttributes$UserState valueOf(String str) {
        return (CrashlyticsAttributes$UserState) Enum.valueOf(CrashlyticsAttributes$UserState.class, str);
    }

    public static CrashlyticsAttributes$UserState[] values() {
        return (CrashlyticsAttributes$UserState[]) $VALUES.clone();
    }
}
