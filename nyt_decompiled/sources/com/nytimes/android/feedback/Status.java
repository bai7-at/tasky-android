package com.nytimes.android.feedback;

import com.appsflyer.AppsFlyerProperties;
import defpackage.b22;
import defpackage.ed2;
import defpackage.rb8;
import defpackage.zq3;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3ApplicationInterceptor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class Status {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ Status[] $VALUES;
    public static final a Companion;
    public static final Status Subscribed = new Status("Subscribed", 0);
    public static final Status SubscribedUnlinked = new Status("SubscribedUnlinked", 1);
    public static final Status Registered = new Status("Registered", 2);
    public static final Status Unregistered = new Status("Unregistered", 3);
    public static final Status Unknown = new Status(EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION, 4);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Status a(boolean z, String str) {
            zq3.h(str, AppsFlyerProperties.USER_EMAIL);
            return (!z || str.length() <= 0) ? (z && str.length() == 0) ? Status.SubscribedUnlinked : (z || str.length() <= 0) ? (z || str.length() != 0) ? Status.Unknown : Status.Unregistered : Status.Registered : Status.Subscribed;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.Subscribed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.SubscribedUnlinked.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.Registered.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Status.Unregistered.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Status.Unknown.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    private static final /* synthetic */ Status[] $values() {
        return new Status[]{Subscribed, SubscribedUnlinked, Registered, Unregistered, Unknown};
    }

    static {
        Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private Status(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) $VALUES.clone();
    }

    public final rb8 getResString(ed2 ed2Var) {
        zq3.h(ed2Var, "resourceProvider");
        int i = b.a[ordinal()];
        if (i == 1) {
            return ed2Var.D();
        }
        if (i == 2) {
            return ed2Var.q();
        }
        if (i == 3) {
            return ed2Var.k();
        }
        if (i == 4) {
            return ed2Var.j();
        }
        if (i == 5) {
            return ed2Var.v();
        }
        throw new NoWhenBranchMatchedException();
    }
}
