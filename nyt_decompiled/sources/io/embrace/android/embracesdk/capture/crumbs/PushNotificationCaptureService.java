package io.embrace.android.embracesdk.capture.crumbs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.uo6;
import defpackage.zq3;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.PushNotificationBreadcrumb;
import io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class PushNotificationCaptureService implements ActivityLifecycleListener {
    private static final String RESERVED_COLLAPSE_KEY = "collapse_key";
    private static final String RESERVED_FROM = "from";
    private static final String RESERVED_GOOGLE_DELIVERED_PRIORITY = "google.delivered_priority";
    private static final String RESERVED_GOOGLE_MESSAGE_ID = "google.message_id";
    private static final String RESERVED_MESSAGE_TYPE = "message_type";
    private static final String RESERVED_PREFIX_COM_GOOGLE_FIREBASE = "com.google.firebase";
    private static final String RESERVED_PREFIX_NOTIFICATION_KEYS = "gcm.";
    private static final String RESERVED_PREFIX_PAYLOAD_KEYS = "google.";
    public static final Utils Utils = new Utils(null);
    private final BreadcrumbService breadCrumbService;
    private final InternalEmbraceLogger logger;

    public static final class Utils {

        public enum PRIORITY {
            PRIORITY_UNKNOWN(0),
            PRIORITY_HIGH(1),
            PRIORITY_NORMAL(2);

            private final int priority;

            PRIORITY(int i) {
                this.priority = i;
            }

            public final int getPriority() {
                return this.priority;
            }
        }

        private Utils() {
        }

        public final Map<String, String> extractDeveloperDefinedPayload(Bundle bundle) {
            zq3.h(bundle, "bundle");
            Set<String> keySet = bundle.keySet();
            if (keySet == null) {
                return t.i();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : keySet) {
                String str = (String) obj;
                zq3.g(str, "it");
                if (!h.K(str, PushNotificationCaptureService.RESERVED_PREFIX_PAYLOAD_KEYS, false, 2, null) && !h.K(str, PushNotificationCaptureService.RESERVED_PREFIX_NOTIFICATION_KEYS, false, 2, null) && !h.K(str, PushNotificationCaptureService.RESERVED_PREFIX_COM_GOOGLE_FIREBASE, false, 2, null) && !zq3.c(str, PushNotificationCaptureService.RESERVED_FROM) && !zq3.c(str, PushNotificationCaptureService.RESERVED_MESSAGE_TYPE) && !zq3.c(str, PushNotificationCaptureService.RESERVED_COLLAPSE_KEY)) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(arrayList, 10)), 16));
            for (Object obj2 : arrayList) {
                String string = bundle.getString((String) obj2);
                if (string == null) {
                    string = "";
                }
                linkedHashMap.put(obj2, string);
            }
            return linkedHashMap;
        }

        public final int getMessagePriority(String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1039745817) {
                    if (hashCode == 3202466 && str.equals("high")) {
                        return PRIORITY.PRIORITY_HIGH.getPriority();
                    }
                } else if (str.equals("normal")) {
                    return PRIORITY.PRIORITY_NORMAL.getPriority();
                }
            }
            return PRIORITY.PRIORITY_UNKNOWN.getPriority();
        }

        public /* synthetic */ Utils(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PushNotificationCaptureService(BreadcrumbService breadcrumbService, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(breadcrumbService, "breadCrumbService");
        zq3.h(internalEmbraceLogger, "logger");
        this.breadCrumbService = breadcrumbService;
        this.logger = internalEmbraceLogger;
    }

    private final PushNotificationBreadcrumb.NotificationType determineNotificationType(Bundle bundle) {
        return !Utils.extractDeveloperDefinedPayload(bundle).isEmpty() ? PushNotificationBreadcrumb.NotificationType.NOTIFICATION_AND_DATA : PushNotificationBreadcrumb.NotificationType.NOTIFICATION;
    }

    private final boolean isComingFromPushNotification(Activity activity) {
        Bundle extras;
        Set<String> keySet;
        Intent intent = activity.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || (keySet = extras.keySet()) == null) {
            return false;
        }
        return keySet.containsAll(i.o(RESERVED_FROM, RESERVED_GOOGLE_MESSAGE_ID));
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void applicationStartupComplete() {
        ActivityLifecycleListener.DefaultImpls.applicationStartupComplete(this);
    }

    public final void logPushNotification(String str, String str2, String str3, String str4, Integer num, int i, PushNotificationBreadcrumb.NotificationType notificationType) {
        zq3.h(notificationType, TransferTable.COLUMN_TYPE);
        this.breadCrumbService.logPushNotification(str, str2, str3, str4, num, i, notificationType);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void onActivityCreated(Activity activity, Bundle bundle) {
        zq3.h(activity, "activity");
        if (isComingFromPushNotification(activity)) {
            this.logger.log("Coming from a Firebase push notification", InternalEmbraceLogger.Severity.INFO, null, true);
            Intent intent = activity.getIntent();
            zq3.g(intent, "activity.intent");
            Bundle extras = intent.getExtras();
            if (extras == null) {
                this.logger.log("It seems like we are coming from a Google Push Notification, but intent extras is null. Will not be able to log it to our dashboard.", InternalEmbraceLogger.Severity.WARNING, null, false);
            } else {
                logPushNotification(null, null, extras.getString(RESERVED_FROM), extras.getString(RESERVED_GOOGLE_MESSAGE_ID), null, Utils.getMessagePriority(extras.getString(RESERVED_GOOGLE_DELIVERED_PRIORITY)), determineNotificationType(extras));
            }
        }
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void onView(Activity activity) {
        zq3.h(activity, "activity");
        ActivityLifecycleListener.DefaultImpls.onView(this, activity);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleListener
    public void onViewClose(Activity activity) {
        zq3.h(activity, "activity");
        ActivityLifecycleListener.DefaultImpls.onViewClose(this, activity);
    }
}
