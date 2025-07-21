package io.embrace.android.embracesdk.capture.crumbs;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.datasource.DataSourceImpl;
import io.embrace.android.embracesdk.arch.destination.SessionSpanWriter;
import io.embrace.android.embracesdk.arch.destination.SpanEventData;
import io.embrace.android.embracesdk.arch.destination.SpanEventMapper;
import io.embrace.android.embracesdk.arch.limits.UpToLimitStrategy;
import io.embrace.android.embracesdk.arch.schema.SchemaType;
import io.embrace.android.embracesdk.config.behavior.BreadcrumbBehavior;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.internal.clock.ClockKt;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.PushNotificationBreadcrumb;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final class PushNotificationDataSource extends DataSourceImpl<SessionSpanWriter> implements SpanEventMapper<PushNotificationBreadcrumb> {
    private final BreadcrumbBehavior breadcrumbBehavior;
    private final Clock clock;
    private final InternalEmbraceLogger logger;

    /* renamed from: io.embrace.android.embracesdk.capture.crumbs.PushNotificationDataSource$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements qs2 {
        AnonymousClass1(BreadcrumbBehavior breadcrumbBehavior) {
            super(0, breadcrumbBehavior, BreadcrumbBehavior.class, "getCustomBreadcrumbLimit", "getCustomBreadcrumbLimit()I", 0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo865invoke() {
            return Integer.valueOf(invoke());
        }

        public final int invoke() {
            return ((BreadcrumbBehavior) this.receiver).getCustomBreadcrumbLimit();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationDataSource(BreadcrumbBehavior breadcrumbBehavior, Clock clock, SessionSpanWriter sessionSpanWriter, InternalEmbraceLogger internalEmbraceLogger) {
        super(sessionSpanWriter, internalEmbraceLogger, new UpToLimitStrategy(internalEmbraceLogger, new AnonymousClass1(breadcrumbBehavior)));
        zq3.h(breadcrumbBehavior, "breadcrumbBehavior");
        zq3.h(clock, "clock");
        zq3.h(sessionSpanWriter, "writer");
        zq3.h(internalEmbraceLogger, "logger");
        this.breadcrumbBehavior = breadcrumbBehavior;
        this.clock = clock;
        this.logger = internalEmbraceLogger;
    }

    public final void logPushNotification(final String str, final String str2, final String str3, final String str4, final Integer num, final PushNotificationBreadcrumb.NotificationType notificationType) {
        zq3.h(notificationType, TransferTable.COLUMN_TYPE);
        try {
            alterSessionSpan(new qs2() { // from class: io.embrace.android.embracesdk.capture.crumbs.PushNotificationDataSource$logPushNotification$1
                public final boolean invoke() {
                    return true;
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    return Boolean.valueOf(invoke());
                }
            }, new ss2() { // from class: io.embrace.android.embracesdk.capture.crumbs.PushNotificationDataSource$logPushNotification$2

                /* renamed from: io.embrace.android.embracesdk.capture.crumbs.PushNotificationDataSource$logPushNotification$2$1, reason: invalid class name */
                static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ss2 {
                    AnonymousClass1(PushNotificationDataSource pushNotificationDataSource) {
                        super(1, pushNotificationDataSource, PushNotificationDataSource.class, "toSpanEventData", "toSpanEventData(Lio/embrace/android/embracesdk/payload/PushNotificationBreadcrumb;)Lio/embrace/android/embracesdk/arch/destination/SpanEventData;", 0);
                    }

                    @Override // defpackage.ss2
                    public final SpanEventData invoke(PushNotificationBreadcrumb pushNotificationBreadcrumb) {
                        zq3.h(pushNotificationBreadcrumb, "p1");
                        return ((PushNotificationDataSource) this.receiver).toSpanEventData(pushNotificationBreadcrumb);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SessionSpanWriter) obj);
                    return ww8.a;
                }

                public final void invoke(SessionSpanWriter sessionSpanWriter) {
                    BreadcrumbBehavior breadcrumbBehavior;
                    Clock clock;
                    zq3.h(sessionSpanWriter, "$receiver");
                    breadcrumbBehavior = PushNotificationDataSource.this.breadcrumbBehavior;
                    boolean isCaptureFcmPiiDataEnabled = breadcrumbBehavior.isCaptureFcmPiiDataEnabled();
                    String str5 = isCaptureFcmPiiDataEnabled ? str : null;
                    String str6 = isCaptureFcmPiiDataEnabled ? str2 : null;
                    String str7 = isCaptureFcmPiiDataEnabled ? str3 : null;
                    String str8 = str4;
                    Integer num2 = num;
                    String type2 = notificationType.getType();
                    clock = PushNotificationDataSource.this.clock;
                    sessionSpanWriter.addEvent(new PushNotificationBreadcrumb(str5, str6, str7, str8, num2, type2, clock.now()), new AnonymousClass1(PushNotificationDataSource.this));
                }
            });
        } catch (Exception e) {
            this.logger.log("Failed to log push notification " + str4, InternalEmbraceLogger.Severity.ERROR, e, false);
        }
    }

    @Override // io.embrace.android.embracesdk.arch.destination.SpanEventMapper
    public SpanEventData toSpanEventData(PushNotificationBreadcrumb pushNotificationBreadcrumb) {
        zq3.h(pushNotificationBreadcrumb, "obj");
        String title = pushNotificationBreadcrumb.getTitle();
        String str = title == null ? "" : title;
        String type2 = pushNotificationBreadcrumb.getType();
        String body = pushNotificationBreadcrumb.getBody();
        String str2 = body == null ? "" : body;
        String id$embrace_android_sdk_release = pushNotificationBreadcrumb.getId$embrace_android_sdk_release();
        String str3 = id$embrace_android_sdk_release == null ? "" : id$embrace_android_sdk_release;
        String from = pushNotificationBreadcrumb.getFrom();
        String str4 = from == null ? "" : from;
        Integer priority = pushNotificationBreadcrumb.getPriority();
        return new SpanEventData(new SchemaType.PushNotification(str, type2, str2, str3, str4, priority != null ? priority.intValue() : 0), ClockKt.millisToNanos(pushNotificationBreadcrumb.getTimestamp$embrace_android_sdk_release()));
    }
}
