package io.embrace.android.embracesdk.capture.powersave;

import android.content.Context;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.datasource.DataSourceImplKt;
import io.embrace.android.embracesdk.arch.datasource.SpanDataSourceImpl;
import io.embrace.android.embracesdk.arch.datasource.SpanDataSourceKt;
import io.embrace.android.embracesdk.arch.destination.StartSpanData;
import io.embrace.android.embracesdk.arch.destination.StartSpanMapper;
import io.embrace.android.embracesdk.arch.limits.UpToLimitStrategy;
import io.embrace.android.embracesdk.arch.schema.SchemaType;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.internal.spans.SpanService;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final class LowPowerDataSource extends SpanDataSourceImpl implements StartSpanMapper<Long> {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final int MAX_CAPTURED_POWER_MODE_INTERVALS = 100;
    private final BackgroundWorker backgroundWorker;
    private final Clock clock;
    private final Context context;
    private final PowerSaveModeReceiver receiver;
    private EmbraceSpan span;

    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LowPowerDataSource(Context context, SpanService spanService, InternalEmbraceLogger internalEmbraceLogger, BackgroundWorker backgroundWorker, Clock clock, qs2 qs2Var) {
        super(spanService, internalEmbraceLogger, new UpToLimitStrategy(internalEmbraceLogger, new qs2() { // from class: io.embrace.android.embracesdk.capture.powersave.LowPowerDataSource.1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Integer.valueOf(invoke());
            }

            public final int invoke() {
                Companion unused = LowPowerDataSource.Companion;
                return 100;
            }
        }));
        zq3.h(context, "context");
        zq3.h(spanService, "spanService");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(backgroundWorker, "backgroundWorker");
        zq3.h(clock, "clock");
        zq3.h(qs2Var, "provider");
        this.context = context;
        this.backgroundWorker = backgroundWorker;
        this.clock = clock;
        this.receiver = new PowerSaveModeReceiver(internalEmbraceLogger, qs2Var, new LowPowerDataSource$receiver$1(this));
    }

    @Override // io.embrace.android.embracesdk.arch.datasource.DataSourceImpl, io.embrace.android.embracesdk.arch.datasource.DataSource
    public void disableDataCapture() {
        this.receiver.unregister(this.context);
    }

    @Override // io.embrace.android.embracesdk.arch.datasource.DataSourceImpl, io.embrace.android.embracesdk.arch.datasource.DataSource
    public void enableDataCapture() {
        this.receiver.register(this.context, this.backgroundWorker);
    }

    public final void onPowerSaveModeChanged(boolean z) {
        final EmbraceSpan embraceSpan = this.span;
        if (z && embraceSpan == null) {
            alterSessionSpan(DataSourceImplKt.getNoInputValidation(), new ss2() { // from class: io.embrace.android.embracesdk.capture.powersave.LowPowerDataSource$onPowerSaveModeChanged$1

                /* renamed from: io.embrace.android.embracesdk.capture.powersave.LowPowerDataSource$onPowerSaveModeChanged$1$1, reason: invalid class name */
                static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ss2 {
                    AnonymousClass1(LowPowerDataSource lowPowerDataSource) {
                        super(1, lowPowerDataSource, LowPowerDataSource.class, "toStartSpanData", "toStartSpanData(J)Lio/embrace/android/embracesdk/arch/destination/StartSpanData;", 0);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).longValue());
                    }

                    public final StartSpanData invoke(long j) {
                        return ((LowPowerDataSource) this.receiver).toStartSpanData(j);
                    }
                }

                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SpanService) obj);
                    return ww8.a;
                }

                public final void invoke(SpanService spanService) {
                    Clock clock;
                    zq3.h(spanService, "$receiver");
                    clock = LowPowerDataSource.this.clock;
                    EmbraceSpan startSpanCapture = SpanDataSourceKt.startSpanCapture(spanService, Long.valueOf(clock.now()), new AnonymousClass1(LowPowerDataSource.this));
                    if (startSpanCapture != null) {
                        LowPowerDataSource.this.span = startSpanCapture;
                    }
                }
            });
        } else {
            if (z || embraceSpan == null) {
                return;
            }
            captureSpanData(false, DataSourceImplKt.getNoInputValidation(), new ss2() { // from class: io.embrace.android.embracesdk.capture.powersave.LowPowerDataSource$onPowerSaveModeChanged$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SpanService) obj);
                    return ww8.a;
                }

                public final void invoke(SpanService spanService) {
                    zq3.h(spanService, "$receiver");
                    embraceSpan.stop();
                    LowPowerDataSource.this.span = null;
                }
            });
        }
    }

    @Override // io.embrace.android.embracesdk.arch.destination.StartSpanMapper
    public /* bridge */ /* synthetic */ StartSpanData toStartSpanData(Long l) {
        return toStartSpanData(l.longValue());
    }

    public StartSpanData toStartSpanData(long j) {
        return new StartSpanData(SchemaType.LowPower.INSTANCE, j);
    }
}
