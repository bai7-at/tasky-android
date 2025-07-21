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
import io.embrace.android.embracesdk.internal.clock.ClockKt;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.TapBreadcrumb;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final class TapDataSource extends DataSourceImpl<SessionSpanWriter> implements SpanEventMapper<TapBreadcrumb> {
    private final BreadcrumbBehavior breadcrumbBehavior;
    private final InternalEmbraceLogger logger;

    /* renamed from: io.embrace.android.embracesdk.capture.crumbs.TapDataSource$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements qs2 {
        AnonymousClass1(BreadcrumbBehavior breadcrumbBehavior) {
            super(0, breadcrumbBehavior, BreadcrumbBehavior.class, "getTapBreadcrumbLimit", "getTapBreadcrumbLimit()I", 0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo865invoke() {
            return Integer.valueOf(invoke());
        }

        public final int invoke() {
            return ((BreadcrumbBehavior) this.receiver).getTapBreadcrumbLimit();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapDataSource(BreadcrumbBehavior breadcrumbBehavior, SessionSpanWriter sessionSpanWriter, InternalEmbraceLogger internalEmbraceLogger) {
        super(sessionSpanWriter, internalEmbraceLogger, new UpToLimitStrategy(internalEmbraceLogger, new AnonymousClass1(breadcrumbBehavior)));
        zq3.h(breadcrumbBehavior, "breadcrumbBehavior");
        zq3.h(sessionSpanWriter, "writer");
        zq3.h(internalEmbraceLogger, "logger");
        this.breadcrumbBehavior = breadcrumbBehavior;
        this.logger = internalEmbraceLogger;
    }

    public final void logTap(Pair<Float, Float> pair, final String str, final long j, final TapBreadcrumb.TapBreadcrumbType tapBreadcrumbType) {
        zq3.h(pair, "point");
        zq3.h(str, "element");
        zq3.h(tapBreadcrumbType, TransferTable.COLUMN_TYPE);
        try {
            if (!this.breadcrumbBehavior.isTapCoordinateCaptureEnabled()) {
                pair = new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
            }
            final Pair<Float, Float> pair2 = pair;
            alterSessionSpan(new qs2() { // from class: io.embrace.android.embracesdk.capture.crumbs.TapDataSource$logTap$1
                public final boolean invoke() {
                    return true;
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    return Boolean.valueOf(invoke());
                }
            }, new ss2() { // from class: io.embrace.android.embracesdk.capture.crumbs.TapDataSource$logTap$2

                /* renamed from: io.embrace.android.embracesdk.capture.crumbs.TapDataSource$logTap$2$1, reason: invalid class name */
                static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ss2 {
                    AnonymousClass1(TapDataSource tapDataSource) {
                        super(1, tapDataSource, TapDataSource.class, "toSpanEventData", "toSpanEventData(Lio/embrace/android/embracesdk/payload/TapBreadcrumb;)Lio/embrace/android/embracesdk/arch/destination/SpanEventData;", 0);
                    }

                    @Override // defpackage.ss2
                    public final SpanEventData invoke(TapBreadcrumb tapBreadcrumb) {
                        zq3.h(tapBreadcrumb, "p1");
                        return ((TapDataSource) this.receiver).toSpanEventData(tapBreadcrumb);
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
                    sessionSpanWriter.addEvent(new TapBreadcrumb(pair2, str, j, tapBreadcrumbType), new AnonymousClass1(TapDataSource.this));
                }
            });
        } catch (Exception e) {
            this.logger.log("Failed to log tap breadcrumb for element " + str, InternalEmbraceLogger.Severity.ERROR, e, false);
        }
    }

    @Override // io.embrace.android.embracesdk.arch.destination.SpanEventMapper
    public SpanEventData toSpanEventData(TapBreadcrumb tapBreadcrumb) {
        zq3.h(tapBreadcrumb, "obj");
        String tappedElementName = tapBreadcrumb.getTappedElementName();
        if (tappedElementName == null) {
            tappedElementName = "";
        }
        TapBreadcrumb.TapBreadcrumbType type2 = tapBreadcrumb.getType();
        if (type2 == null) {
            type2 = TapBreadcrumb.TapBreadcrumbType.TAP;
        }
        String value = type2.getValue();
        String location = tapBreadcrumb.getLocation();
        return new SpanEventData(new SchemaType.Tap(tappedElementName, value, location != null ? location : ""), ClockKt.millisToNanos(tapBreadcrumb.getTimestamp$embrace_android_sdk_release()));
    }
}
