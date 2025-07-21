package io.embrace.android.embracesdk.capture.crumbs;

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
import io.embrace.android.embracesdk.internal.clock.ClockKt;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.CustomBreadcrumb;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final class BreadcrumbDataSource extends DataSourceImpl<SessionSpanWriter> implements SpanEventMapper<CustomBreadcrumb> {

    /* renamed from: io.embrace.android.embracesdk.capture.crumbs.BreadcrumbDataSource$1, reason: invalid class name */
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
    public BreadcrumbDataSource(BreadcrumbBehavior breadcrumbBehavior, SessionSpanWriter sessionSpanWriter, InternalEmbraceLogger internalEmbraceLogger) {
        super(sessionSpanWriter, internalEmbraceLogger, new UpToLimitStrategy(internalEmbraceLogger, new AnonymousClass1(breadcrumbBehavior)));
        zq3.h(breadcrumbBehavior, "breadcrumbBehavior");
        zq3.h(sessionSpanWriter, "writer");
        zq3.h(internalEmbraceLogger, "logger");
    }

    public final void logCustom(final String str, final long j) {
        zq3.h(str, "message");
        alterSessionSpan(new qs2() { // from class: io.embrace.android.embracesdk.capture.crumbs.BreadcrumbDataSource$logCustom$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Boolean.valueOf(invoke());
            }

            public final boolean invoke() {
                return str.length() > 0;
            }
        }, new ss2() { // from class: io.embrace.android.embracesdk.capture.crumbs.BreadcrumbDataSource$logCustom$2

            /* renamed from: io.embrace.android.embracesdk.capture.crumbs.BreadcrumbDataSource$logCustom$2$1, reason: invalid class name */
            static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ss2 {
                AnonymousClass1(BreadcrumbDataSource breadcrumbDataSource) {
                    super(1, breadcrumbDataSource, BreadcrumbDataSource.class, "toSpanEventData", "toSpanEventData(Lio/embrace/android/embracesdk/payload/CustomBreadcrumb;)Lio/embrace/android/embracesdk/arch/destination/SpanEventData;", 0);
                }

                @Override // defpackage.ss2
                public final SpanEventData invoke(CustomBreadcrumb customBreadcrumb) {
                    zq3.h(customBreadcrumb, "p1");
                    return ((BreadcrumbDataSource) this.receiver).toSpanEventData(customBreadcrumb);
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
                zq3.h(sessionSpanWriter, "$receiver");
                sessionSpanWriter.addEvent(new CustomBreadcrumb(str, j), new AnonymousClass1(BreadcrumbDataSource.this));
            }
        });
    }

    @Override // io.embrace.android.embracesdk.arch.destination.SpanEventMapper
    public SpanEventData toSpanEventData(CustomBreadcrumb customBreadcrumb) {
        zq3.h(customBreadcrumb, "obj");
        String message = customBreadcrumb.getMessage();
        if (message == null) {
            message = "";
        }
        return new SpanEventData(new SchemaType.Breadcrumb(message), ClockKt.millisToNanos(customBreadcrumb.getTimestamp$embrace_android_sdk_release()));
    }
}
