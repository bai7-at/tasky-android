package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.crumbs.Breadcrumb;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class CustomBreadcrumb implements Breadcrumb {
    private static final int BREADCRUMB_MESSAGE_MAX_LENGTH = 256;
    public static final Companion Companion = new Companion(null);
    private final String message;
    private final long timestamp;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CustomBreadcrumb(String str, @bt3(name = "ts") long j) {
        this.timestamp = j;
        this.message = ellipsizeBreadcrumbMessage(str);
    }

    private final String ellipsizeBreadcrumbMessage(String str) {
        if (str == null || str.length() < 256) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 253);
        zq3.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append("...");
        return sb.toString();
    }

    @bt3(name = QueryKeys.MAX_SCROLL_DEPTH)
    public static /* synthetic */ void getMessage$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zq3.c(CustomBreadcrumb.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.embrace.android.embracesdk.payload.CustomBreadcrumb");
        }
        CustomBreadcrumb customBreadcrumb = (CustomBreadcrumb) obj;
        return this.timestamp == customBreadcrumb.timestamp && zq3.c(this.message, customBreadcrumb.message);
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // io.embrace.android.embracesdk.capture.crumbs.Breadcrumb
    public long getStartTime() {
        return this.timestamp;
    }

    public final long getTimestamp$embrace_android_sdk_release() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.timestamp) * 31;
        String str = this.message;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
