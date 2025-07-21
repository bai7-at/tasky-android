package io.embrace.android.embracesdk.anr;

import defpackage.fy7;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.DataCaptureServiceOtelConverter;
import io.embrace.android.embracesdk.internal.clock.ClockKt;
import io.embrace.android.embracesdk.internal.payload.Attribute;
import io.embrace.android.embracesdk.internal.payload.Span;
import io.embrace.android.embracesdk.internal.payload.SpanEvent;
import io.embrace.android.embracesdk.payload.AnrInterval;
import io.embrace.android.embracesdk.payload.AnrSample;
import io.embrace.android.embracesdk.payload.AnrSampleList;
import io.embrace.android.embracesdk.payload.ThreadInfo;
import io.opentelemetry.sdk.trace.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class AnrOtelMapper implements DataCaptureServiceOtelConverter {
    private final AnrService anrService;

    public AnrOtelMapper(AnrService anrService) {
        zq3.h(anrService, "anrService");
        this.anrService = anrService;
    }

    private final List<Attribute> mapIntervalToSpanAttributes(AnrInterval anrInterval) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Attribute("emb.type", "perf.thread_blockage"));
        Integer code = anrInterval.getCode();
        if (code != null) {
            arrayList.add(new Attribute("interval_code", String.valueOf(code.intValue())));
        }
        Long lastKnownTime = anrInterval.getLastKnownTime();
        if (lastKnownTime != null) {
            arrayList.add(new Attribute("last_known_time_unix_nano", String.valueOf(ClockKt.millisToNanos(lastKnownTime.longValue()))));
        }
        return arrayList;
    }

    private final List<SpanEvent> mapIntervalToSpanEvents(AnrInterval anrInterval) {
        List<AnrSample> samples;
        AnrSampleList anrSampleList = anrInterval.getAnrSampleList();
        if (anrSampleList == null || (samples = anrSampleList.getSamples()) == null) {
            return i.l();
        }
        List<AnrSample> list = samples;
        ArrayList arrayList = new ArrayList(i.w(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(mapSampleToSpanEvent((AnrSample) it2.next()));
        }
        return arrayList;
    }

    private final SpanEvent mapSampleToSpanEvent(AnrSample anrSample) {
        ThreadInfo threadInfo;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Attribute("emb.type", "perf.thread_blockage_sample"));
        Long sampleOverheadMs = anrSample.getSampleOverheadMs();
        if (sampleOverheadMs != null) {
            arrayList.add(new Attribute("sample_overhead", String.valueOf(ClockKt.millisToNanos(sampleOverheadMs.longValue()))));
        }
        Integer code = anrSample.getCode();
        if (code != null) {
            arrayList.add(new Attribute("sample_code", String.valueOf(code.intValue())));
        }
        List<ThreadInfo> threads = anrSample.getThreads();
        if (threads != null && (threadInfo = (ThreadInfo) i.K0(threads)) != null) {
            arrayList.add(new Attribute("thread_state", String.valueOf(threadInfo.getState())));
            arrayList.add(new Attribute("thread_priority", String.valueOf(threadInfo.getPriority())));
            List<String> lines = threadInfo.getLines();
            if (lines != null) {
                arrayList.add(new Attribute("frame_count", String.valueOf(lines.size())));
                arrayList.add(new Attribute("stacktrace", i.u0(lines, "\n", null, null, 0, null, null, 62, null)));
            }
        }
        return new SpanEvent("perf.thread_blockage_sample", Long.valueOf(ClockKt.millisToNanos(anrSample.getTimestamp())), arrayList);
    }

    @Override // io.embrace.android.embracesdk.arch.DataCaptureServiceOtelConverter
    public List<Span> snapshot(boolean z) {
        List<? extends AnrInterval> capturedData = this.anrService.getCapturedData();
        ArrayList arrayList = new ArrayList(i.w(capturedData, 10));
        for (AnrInterval anrInterval : capturedData) {
            List<Attribute> mapIntervalToSpanAttributes = mapIntervalToSpanAttributes(anrInterval);
            List<SpanEvent> mapIntervalToSpanEvents = mapIntervalToSpanEvents(anrInterval);
            String generateTraceId = c.a().generateTraceId();
            String generateSpanId = c.a().generateSpanId();
            String b = fy7.b();
            Long valueOf = Long.valueOf(ClockKt.millisToNanos(anrInterval.getStartTime()));
            Long endTime = anrInterval.getEndTime();
            arrayList.add(new Span(generateTraceId, generateSpanId, b, "emb-thread-blockage", valueOf, endTime != null ? Long.valueOf(ClockKt.millisToNanos(endTime.longValue())) : null, Span.Status.OK, mapIntervalToSpanEvents, mapIntervalToSpanAttributes));
        }
        return arrayList;
    }
}
