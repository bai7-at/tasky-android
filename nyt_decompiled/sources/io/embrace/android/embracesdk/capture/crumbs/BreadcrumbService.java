package io.embrace.android.embracesdk.capture.crumbs;

import io.embrace.android.embracesdk.payload.Breadcrumbs;
import io.embrace.android.embracesdk.payload.PushNotificationBreadcrumb;
import io.embrace.android.embracesdk.payload.TapBreadcrumb;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes5.dex */
public interface BreadcrumbService {
    boolean endView(String str);

    Breadcrumbs flushBreadcrumbs();

    Breadcrumbs getBreadcrumbs();

    void logCustom(String str, long j);

    void logPushNotification(String str, String str2, String str3, String str4, Integer num, int i, PushNotificationBreadcrumb.NotificationType notificationType);

    void logRnAction(String str, long j, long j2, Map<String, ? extends Object> map, int i, String str2);

    void logTap(Pair<Float, Float> pair, String str, long j, TapBreadcrumb.TapBreadcrumbType tapBreadcrumbType);

    void logView(String str, long j);

    void logWebView(String str, long j);

    boolean startView(String str);
}
