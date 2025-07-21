package io.embrace.android.embracesdk.payload;

import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.crumbs.Breadcrumb;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class PushNotificationBreadcrumb implements Breadcrumb {
    private final String body;
    private final String from;
    private final String id;
    private final Integer priority;
    private final long timestamp;
    private final String title;

    /* renamed from: type, reason: collision with root package name */
    private final String f85type;

    public enum NotificationType {
        NOTIFICATION("notif"),
        DATA("data"),
        NOTIFICATION_AND_DATA("notif-data"),
        UNKNOWN(DatasetUtils.UNKNOWN_IDENTITY_ID);

        public static final Builder Builder = new Builder(null);

        /* renamed from: type, reason: collision with root package name */
        private final String f86type;

        public static final class Builder {
            private Builder() {
            }

            public final NotificationType notificationTypeFor(boolean z, boolean z2) {
                return (z && z2) ? NotificationType.NOTIFICATION_AND_DATA : (!z || z2) ? (z || !z2) ? NotificationType.UNKNOWN : NotificationType.NOTIFICATION : NotificationType.DATA;
            }

            public /* synthetic */ Builder(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        NotificationType(String str) {
            this.f86type = str;
        }

        public final String getType() {
            return this.f86type;
        }
    }

    public PushNotificationBreadcrumb(@bt3(name = "ti") String str, @bt3(name = "bd") String str2, @bt3(name = "tp") String str3, @bt3(name = "id") String str4, @bt3(name = "pt") Integer num, @bt3(name = "te") String str5, @bt3(name = "ts") long j) {
        this.title = str;
        this.body = str2;
        this.from = str3;
        this.id = str4;
        this.priority = num;
        this.f85type = str5;
        this.timestamp = j;
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.body;
    }

    public final String component3() {
        return this.from;
    }

    public final String component4$embrace_android_sdk_release() {
        return this.id;
    }

    public final Integer component5() {
        return this.priority;
    }

    public final String component6() {
        return this.f85type;
    }

    public final long component7$embrace_android_sdk_release() {
        return this.timestamp;
    }

    public final PushNotificationBreadcrumb copy(@bt3(name = "ti") String str, @bt3(name = "bd") String str2, @bt3(name = "tp") String str3, @bt3(name = "id") String str4, @bt3(name = "pt") Integer num, @bt3(name = "te") String str5, @bt3(name = "ts") long j) {
        return new PushNotificationBreadcrumb(str, str2, str3, str4, num, str5, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushNotificationBreadcrumb)) {
            return false;
        }
        PushNotificationBreadcrumb pushNotificationBreadcrumb = (PushNotificationBreadcrumb) obj;
        return zq3.c(this.title, pushNotificationBreadcrumb.title) && zq3.c(this.body, pushNotificationBreadcrumb.body) && zq3.c(this.from, pushNotificationBreadcrumb.from) && zq3.c(this.id, pushNotificationBreadcrumb.id) && zq3.c(this.priority, pushNotificationBreadcrumb.priority) && zq3.c(this.f85type, pushNotificationBreadcrumb.f85type) && this.timestamp == pushNotificationBreadcrumb.timestamp;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getId$embrace_android_sdk_release() {
        return this.id;
    }

    public final Integer getPriority() {
        return this.priority;
    }

    @Override // io.embrace.android.embracesdk.capture.crumbs.Breadcrumb
    public long getStartTime() {
        return this.timestamp;
    }

    public final long getTimestamp$embrace_android_sdk_release() {
        return this.timestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.f85type;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.body;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.from;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.id;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.priority;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        String str5 = this.f85type;
        return ((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "PushNotificationBreadcrumb(title=" + this.title + ", body=" + this.body + ", from=" + this.from + ", id=" + this.id + ", priority=" + this.priority + ", type=" + this.f85type + ", timestamp=" + this.timestamp + ")";
    }
}
