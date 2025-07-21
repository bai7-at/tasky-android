package io.embrace.android.embracesdk.anr.ndk;

import com.squareup.moshi.j;
import defpackage.bt3;
import defpackage.et3;
import defpackage.fy7;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.DataCaptureServiceOtelConverter;
import io.embrace.android.embracesdk.internal.clock.ClockKt;
import io.embrace.android.embracesdk.internal.payload.Attribute;
import io.embrace.android.embracesdk.internal.payload.Span;
import io.embrace.android.embracesdk.internal.payload.SpanEvent;
import io.embrace.android.embracesdk.internal.serialization.EmbraceSerializer;
import io.embrace.android.embracesdk.payload.NativeThreadAnrInterval;
import io.embrace.android.embracesdk.payload.NativeThreadAnrSample;
import io.embrace.android.embracesdk.payload.NativeThreadAnrStackframe;
import io.opentelemetry.sdk.trace.c;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class NativeAnrOtelMapper implements DataCaptureServiceOtelConverter {
    private final NativeThreadSamplerService nativeThreadSamplerService;
    private final EmbraceSerializer serializer;

    @et3(generateAdapter = true)
    public static final class NativeAnrSampleFrame {
        private final String programCounter;
        private final Integer result;
        private final String soLoadAddr;
        private final String soName;

        public NativeAnrSampleFrame() {
            this(null, null, null, null, 15, null);
        }

        public final String getProgramCounter() {
            return this.programCounter;
        }

        public final Integer getResult() {
            return this.result;
        }

        public final String getSoLoadAddr() {
            return this.soLoadAddr;
        }

        public final String getSoName() {
            return this.soName;
        }

        public NativeAnrSampleFrame(@bt3(name = "program_counter") String str, @bt3(name = "so_load_addr") String str2, @bt3(name = "so_name") String str3, @bt3(name = "result") Integer num) {
            this.programCounter = str;
            this.soLoadAddr = str2;
            this.soName = str3;
            this.result = num;
        }

        public /* synthetic */ NativeAnrSampleFrame(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num);
        }
    }

    public NativeAnrOtelMapper(NativeThreadSamplerService nativeThreadSamplerService, EmbraceSerializer embraceSerializer) {
        zq3.h(nativeThreadSamplerService, "nativeThreadSamplerService");
        zq3.h(embraceSerializer, "serializer");
        this.nativeThreadSamplerService = nativeThreadSamplerService;
        this.serializer = embraceSerializer;
    }

    private final List<Attribute> mapIntervalToSpanAttributes(NativeThreadAnrInterval nativeThreadAnrInterval) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Attribute("emb.type", "perf.native_thread_blockage"));
        Long id$embrace_android_sdk_release = nativeThreadAnrInterval.getId$embrace_android_sdk_release();
        if (id$embrace_android_sdk_release != null) {
            arrayList.add(new Attribute("thread_id", String.valueOf(id$embrace_android_sdk_release.longValue())));
        }
        String name$embrace_android_sdk_release = nativeThreadAnrInterval.getName$embrace_android_sdk_release();
        if (name$embrace_android_sdk_release != null) {
            arrayList.add(new Attribute("thread_name", name$embrace_android_sdk_release));
        }
        Integer priority$embrace_android_sdk_release = nativeThreadAnrInterval.getPriority$embrace_android_sdk_release();
        if (priority$embrace_android_sdk_release != null) {
            arrayList.add(new Attribute("thread_priority", String.valueOf(priority$embrace_android_sdk_release.intValue())));
        }
        Integer state$embrace_android_sdk_release = nativeThreadAnrInterval.getState$embrace_android_sdk_release();
        if (state$embrace_android_sdk_release != null) {
            arrayList.add(new Attribute("thread_state", String.valueOf(state$embrace_android_sdk_release.intValue())));
        }
        Long sampleOffsetMs$embrace_android_sdk_release = nativeThreadAnrInterval.getSampleOffsetMs$embrace_android_sdk_release();
        if (sampleOffsetMs$embrace_android_sdk_release != null) {
            arrayList.add(new Attribute("sampling_offset_ms", String.valueOf(sampleOffsetMs$embrace_android_sdk_release.longValue())));
        }
        Integer unwinder$embrace_android_sdk_release = nativeThreadAnrInterval.getUnwinder$embrace_android_sdk_release();
        if (unwinder$embrace_android_sdk_release != null) {
            arrayList.add(new Attribute("stack_unwinder", String.valueOf(unwinder$embrace_android_sdk_release.intValue())));
        }
        return arrayList;
    }

    private final List<SpanEvent> mapIntervalToSpanEvents(NativeThreadAnrInterval nativeThreadAnrInterval) {
        List<NativeThreadAnrSample> samples$embrace_android_sdk_release = nativeThreadAnrInterval.getSamples$embrace_android_sdk_release();
        if (samples$embrace_android_sdk_release == null) {
            return i.l();
        }
        List<NativeThreadAnrSample> list = samples$embrace_android_sdk_release;
        ArrayList arrayList = new ArrayList(i.w(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(mapSampleToSpanEvent((NativeThreadAnrSample) it2.next()));
        }
        return arrayList;
    }

    private final SpanEvent mapSampleToSpanEvent(NativeThreadAnrSample nativeThreadAnrSample) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Attribute("emb.type", "perf.native_thread_blockage_sample"));
        Integer result = nativeThreadAnrSample.getResult();
        if (result != null) {
            arrayList2.add(new Attribute("result", String.valueOf(result.intValue())));
        }
        Long sampleDurationMs = nativeThreadAnrSample.getSampleDurationMs();
        if (sampleDurationMs != null) {
            arrayList2.add(new Attribute("sample_overhead_ms", String.valueOf(sampleDurationMs.longValue())));
        }
        List<NativeThreadAnrStackframe> stackframes = nativeThreadAnrSample.getStackframes();
        if (stackframes != null) {
            List<NativeThreadAnrStackframe> list = stackframes;
            arrayList = new ArrayList(i.w(list, 10));
            for (NativeThreadAnrStackframe nativeThreadAnrStackframe : list) {
                arrayList.add(new NativeAnrSampleFrame(nativeThreadAnrStackframe.getPc$embrace_android_sdk_release(), nativeThreadAnrStackframe.getSoLoadAddr$embrace_android_sdk_release(), nativeThreadAnrStackframe.getSoPath$embrace_android_sdk_release(), nativeThreadAnrStackframe.getResult$embrace_android_sdk_release()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            EmbraceSerializer embraceSerializer = this.serializer;
            ParameterizedType j = j.j(List.class, NativeAnrSampleFrame.class);
            zq3.g(j, "Types.newParameterizedTy…rSampleFrame::class.java)");
            arrayList2.add(new Attribute("stacktrace", embraceSerializer.toJson((EmbraceSerializer) arrayList, (Type) j)));
        }
        Long sampleTimestamp = nativeThreadAnrSample.getSampleTimestamp();
        return new SpanEvent("emb_native_thread_blockage_sample", sampleTimestamp != null ? Long.valueOf(ClockKt.millisToNanos(sampleTimestamp.longValue())) : null, arrayList2);
    }

    @Override // io.embrace.android.embracesdk.arch.DataCaptureServiceOtelConverter
    public List<Span> snapshot(boolean z) {
        NativeAnrOtelMapper nativeAnrOtelMapper = this;
        List<NativeThreadAnrInterval> capturedIntervals = nativeAnrOtelMapper.nativeThreadSamplerService.getCapturedIntervals(Boolean.valueOf(z));
        if (capturedIntervals == null) {
            capturedIntervals = i.l();
        }
        List<NativeThreadAnrInterval> list = capturedIntervals;
        ArrayList arrayList = new ArrayList(i.w(list, 10));
        for (NativeThreadAnrInterval nativeThreadAnrInterval : list) {
            List<Attribute> mapIntervalToSpanAttributes = nativeAnrOtelMapper.mapIntervalToSpanAttributes(nativeThreadAnrInterval);
            List<SpanEvent> mapIntervalToSpanEvents = nativeAnrOtelMapper.mapIntervalToSpanEvents(nativeThreadAnrInterval);
            String generateTraceId = c.a().generateTraceId();
            String generateSpanId = c.a().generateSpanId();
            String b = fy7.b();
            Long threadBlockedTimestamp$embrace_android_sdk_release = nativeThreadAnrInterval.getThreadBlockedTimestamp$embrace_android_sdk_release();
            arrayList.add(new Span(generateTraceId, generateSpanId, b, "emb_native_thread_blockage", threadBlockedTimestamp$embrace_android_sdk_release != null ? Long.valueOf(ClockKt.millisToNanos(threadBlockedTimestamp$embrace_android_sdk_release.longValue())) : null, null, Span.Status.OK, mapIntervalToSpanEvents, mapIntervalToSpanAttributes, 32, null));
            nativeAnrOtelMapper = this;
        }
        return arrayList;
    }
}
