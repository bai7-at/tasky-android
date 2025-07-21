package io.embrace.android.embracesdk.capture.memory;

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
import io.embrace.android.embracesdk.internal.clock.ClockKt;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.MemoryWarning;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final class MemoryWarningDataSource extends DataSourceImpl<SessionSpanWriter> implements SpanEventMapper<MemoryWarning> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemoryWarningDataSource(SessionSpanWriter sessionSpanWriter, InternalEmbraceLogger internalEmbraceLogger) {
        super(sessionSpanWriter, internalEmbraceLogger, new UpToLimitStrategy(internalEmbraceLogger, new qs2() { // from class: io.embrace.android.embracesdk.capture.memory.MemoryWarningDataSource.1
            public final int invoke() {
                return 100;
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Integer.valueOf(invoke());
            }
        }));
        zq3.h(sessionSpanWriter, "sessionSpanWriter");
        zq3.h(internalEmbraceLogger, "logger");
    }

    public final void onMemoryWarning(final long j) {
        alterSessionSpan(new qs2() { // from class: io.embrace.android.embracesdk.capture.memory.MemoryWarningDataSource$onMemoryWarning$1
            public final boolean invoke() {
                return true;
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Boolean.valueOf(invoke());
            }
        }, new ss2() { // from class: io.embrace.android.embracesdk.capture.memory.MemoryWarningDataSource$onMemoryWarning$2

            /* renamed from: io.embrace.android.embracesdk.capture.memory.MemoryWarningDataSource$onMemoryWarning$2$1, reason: invalid class name */
            static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements ss2 {
                AnonymousClass1(MemoryWarningDataSource memoryWarningDataSource) {
                    super(1, memoryWarningDataSource, MemoryWarningDataSource.class, "toSpanEventData", "toSpanEventData(Lio/embrace/android/embracesdk/payload/MemoryWarning;)Lio/embrace/android/embracesdk/arch/destination/SpanEventData;", 0);
                }

                @Override // defpackage.ss2
                public final SpanEventData invoke(MemoryWarning memoryWarning) {
                    zq3.h(memoryWarning, "p1");
                    return ((MemoryWarningDataSource) this.receiver).toSpanEventData(memoryWarning);
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
                sessionSpanWriter.addEvent(new MemoryWarning(j), new AnonymousClass1(MemoryWarningDataSource.this));
            }
        });
    }

    @Override // io.embrace.android.embracesdk.arch.destination.SpanEventMapper
    public SpanEventData toSpanEventData(MemoryWarning memoryWarning) {
        zq3.h(memoryWarning, "obj");
        return new SpanEventData(new SchemaType.MemoryWarning(), ClockKt.millisToNanos(memoryWarning.getTimestamp()));
    }
}
