package io.embrace.android.embracesdk.capture.envelope.session;

import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.anr.ndk.NativeThreadSamplerService;
import io.embrace.android.embracesdk.arch.schema.AppTerminationCause;
import io.embrace.android.embracesdk.internal.payload.Span;
import io.embrace.android.embracesdk.internal.payload.SpanMapperKt;
import io.embrace.android.embracesdk.internal.spans.CurrentSessionSpan;
import io.embrace.android.embracesdk.internal.spans.EmbraceSpanData;
import io.embrace.android.embracesdk.internal.spans.SpanRepository;
import io.embrace.android.embracesdk.internal.spans.SpanSink;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.logging.InternalErrorService;
import io.embrace.android.embracesdk.session.orchestrator.SessionSnapshotType;
import io.embrace.android.embracesdk.session.properties.SessionPropertiesService;
import io.embrace.android.embracesdk.spans.PersistableEmbraceSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class SessionPayloadSourceImpl implements SessionPayloadSource {
    private final CurrentSessionSpan currentSessionSpan;
    private final InternalErrorService internalErrorService;
    private final InternalEmbraceLogger logger;
    private final NativeThreadSamplerService nativeThreadSamplerService;
    private final qs2 sessionPropertiesServiceProvider;
    private final SpanRepository spanRepository;
    private final SpanSink spanSink;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SessionSnapshotType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[SessionSnapshotType.NORMAL_END.ordinal()] = 1;
            iArr[SessionSnapshotType.PERIODIC_CACHE.ordinal()] = 2;
            iArr[SessionSnapshotType.JVM_CRASH.ordinal()] = 3;
        }
    }

    public SessionPayloadSourceImpl(InternalErrorService internalErrorService, NativeThreadSamplerService nativeThreadSamplerService, SpanSink spanSink, CurrentSessionSpan currentSessionSpan, SpanRepository spanRepository, InternalEmbraceLogger internalEmbraceLogger, qs2 qs2Var) {
        zq3.h(internalErrorService, "internalErrorService");
        zq3.h(spanSink, "spanSink");
        zq3.h(currentSessionSpan, "currentSessionSpan");
        zq3.h(spanRepository, "spanRepository");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(qs2Var, "sessionPropertiesServiceProvider");
        this.internalErrorService = internalErrorService;
        this.nativeThreadSamplerService = nativeThreadSamplerService;
        this.spanSink = spanSink;
        this.currentSessionSpan = currentSessionSpan;
        this.spanRepository = spanRepository;
        this.logger = internalEmbraceLogger;
        this.sessionPropertiesServiceProvider = qs2Var;
    }

    private final List<Span> retrieveSpanData(SessionSnapshotType sessionSnapshotType) {
        List<EmbraceSpanData> list;
        InternalEmbraceLogger internalEmbraceLogger = this.logger;
        try {
            int i = WhenMappings.$EnumSwitchMapping$0[sessionSnapshotType.ordinal()];
            if (i == 1) {
                List<EmbraceSpanData> endSession = this.currentSessionSpan.endSession(null);
                ((SessionPropertiesService) this.sessionPropertiesServiceProvider.mo865invoke()).populateCurrentSession();
                list = endSession;
            } else if (i == 2) {
                list = this.spanSink.completedSpans();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                list = this.currentSessionSpan.endSession(AppTerminationCause.Crash.INSTANCE);
            }
            List<EmbraceSpanData> list2 = list;
            ArrayList arrayList = new ArrayList(i.w(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(SpanMapperKt.toNewPayload((EmbraceSpanData) it2.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            internalEmbraceLogger.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th, false);
            return null;
        }
    }

    private final List<Span> retrieveSpanSnapshotData() {
        InternalEmbraceLogger internalEmbraceLogger = this.logger;
        try {
            List<PersistableEmbraceSpan> activeSpans = this.spanRepository.getActiveSpans();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = activeSpans.iterator();
            while (it2.hasNext()) {
                Span snapshot = ((PersistableEmbraceSpan) it2.next()).snapshot();
                if (snapshot != null) {
                    arrayList.add(snapshot);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            internalEmbraceLogger.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th, false);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|2|3|(7:5|6|7|8|(1:10)|12|13)|18|6|7|8|(0)|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        r4.log("Exception thrown capturing data", io.embrace.android.embracesdk.logging.InternalEmbraceLogger.Severity.ERROR, r5, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #1 {all -> 0x002a, blocks: (B:8:0x001d, B:10:0x0025), top: B:7:0x001d }] */
    @Override // io.embrace.android.embracesdk.capture.envelope.session.SessionPayloadSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.embrace.android.embracesdk.internal.payload.SessionPayload getSessionPayload(io.embrace.android.embracesdk.session.orchestrator.SessionSnapshotType r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Exception thrown capturing data"
            java.lang.String r1 = "endType"
            defpackage.zq3.h(r8, r1)
            io.embrace.android.embracesdk.logging.InternalEmbraceLogger r1 = r7.logger
            r2 = 0
            r3 = 0
            io.embrace.android.embracesdk.anr.ndk.NativeThreadSamplerService r4 = r7.nativeThreadSamplerService     // Catch: java.lang.Throwable -> L14
            if (r4 == 0) goto L1a
            java.util.Map r1 = r4.getNativeSymbols()     // Catch: java.lang.Throwable -> L14
            goto L1b
        L14:
            r4 = move-exception
            io.embrace.android.embracesdk.logging.InternalEmbraceLogger$Severity r5 = io.embrace.android.embracesdk.logging.InternalEmbraceLogger.Severity.ERROR
            r1.log(r0, r5, r4, r2)
        L1a:
            r1 = r3
        L1b:
            io.embrace.android.embracesdk.logging.InternalEmbraceLogger r4 = r7.logger
            io.embrace.android.embracesdk.logging.InternalErrorService r5 = r7.internalErrorService     // Catch: java.lang.Throwable -> L2a
            io.embrace.android.embracesdk.payload.LegacyExceptionError r5 = r5.getCurrentExceptionError()     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L30
            io.embrace.android.embracesdk.internal.payload.InternalError r3 = r5.toNewPayload()     // Catch: java.lang.Throwable -> L2a
            goto L30
        L2a:
            r5 = move-exception
            io.embrace.android.embracesdk.logging.InternalEmbraceLogger$Severity r6 = io.embrace.android.embracesdk.logging.InternalEmbraceLogger.Severity.ERROR
            r4.log(r0, r6, r5, r2)
        L30:
            java.util.List r0 = r7.retrieveSpanSnapshotData()
            java.util.List r7 = r7.retrieveSpanData(r8)
            io.embrace.android.embracesdk.internal.payload.SessionPayload r8 = new io.embrace.android.embracesdk.internal.payload.SessionPayload
            r8.<init>(r7, r0, r3, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.capture.envelope.session.SessionPayloadSourceImpl.getSessionPayload(io.embrace.android.embracesdk.session.orchestrator.SessionSnapshotType):io.embrace.android.embracesdk.internal.payload.SessionPayload");
    }
}
