package com.facebook.appevents.cloudbridge;

import defpackage.zq3;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public enum AppEventType {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;

    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AppEventType a(String str) {
            zq3.h(str, "rawValue");
            return zq3.c(str, "MOBILE_APP_INSTALL") ? AppEventType.MOBILE_APP_INSTALL : zq3.c(str, "CUSTOM_APP_EVENTS") ? AppEventType.CUSTOM : AppEventType.OTHER;
        }

        private a() {
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static AppEventType[] valuesCustom() {
        AppEventType[] valuesCustom = values();
        return (AppEventType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
