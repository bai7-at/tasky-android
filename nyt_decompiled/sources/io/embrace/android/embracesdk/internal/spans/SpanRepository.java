package io.embrace.android.embracesdk.internal.spans;

import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.schema.EmbType;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import io.embrace.android.embracesdk.spans.ErrorCode;
import io.embrace.android.embracesdk.spans.PersistableEmbraceSpan;
import io.embrace.android.embracesdk.utils.CollectionExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class SpanRepository {
    private final Map<String, PersistableEmbraceSpan> activeSpans = new LinkedHashMap();
    private final Map<String, EmbraceSpan> completedSpans = new LinkedHashMap();
    private final Map<String, AtomicInteger> spanIdsInProcess = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean notTracked(String str) {
        return this.activeSpans.get(str) == null && this.completedSpans.get(str) == null;
    }

    public final void clearCompletedSpans() {
        synchronized (this.spanIdsInProcess) {
            this.completedSpans.clear();
            ww8 ww8Var = ww8.a;
        }
    }

    public final void failActiveSpans(long j) {
        List<PersistableEmbraceSpan> activeSpans = getActiveSpans();
        ArrayList arrayList = new ArrayList();
        for (Object obj : activeSpans) {
            if (!((PersistableEmbraceSpan) obj).hasEmbraceAttribute(EmbType.Ux.Session.INSTANCE)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((PersistableEmbraceSpan) it2.next()).stop(ErrorCode.FAILURE, Long.valueOf(j));
        }
    }

    public final List<PersistableEmbraceSpan> getActiveSpans() {
        List<PersistableEmbraceSpan> X0;
        synchronized (this.spanIdsInProcess) {
            X0 = i.X0(this.activeSpans.values());
        }
        return X0;
    }

    public final List<EmbraceSpan> getCompletedSpans() {
        List<EmbraceSpan> X0;
        synchronized (this.spanIdsInProcess) {
            X0 = i.X0(this.completedSpans.values());
        }
        return X0;
    }

    public final EmbraceSpan getSpan(final String str) {
        zq3.h(str, "spanId");
        return (EmbraceSpan) CollectionExtensionsKt.lockAndRun(this.spanIdsInProcess, str, new qs2() { // from class: io.embrace.android.embracesdk.internal.spans.SpanRepository$getSpan$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceSpan mo865invoke() {
                Map map;
                Map map2;
                map = SpanRepository.this.activeSpans;
                PersistableEmbraceSpan persistableEmbraceSpan = (PersistableEmbraceSpan) map.get(str);
                if (persistableEmbraceSpan != null) {
                    return persistableEmbraceSpan;
                }
                map2 = SpanRepository.this.completedSpans;
                return (EmbraceSpan) map2.get(str);
            }
        });
    }

    public final void trackStartedSpan(final PersistableEmbraceSpan persistableEmbraceSpan) {
        zq3.h(persistableEmbraceSpan, "embraceSpan");
        final String spanId = persistableEmbraceSpan.getSpanId();
        if (spanId != null && notTracked(spanId)) {
            CollectionExtensionsKt.lockAndRun(this.spanIdsInProcess, spanId, new qs2() { // from class: io.embrace.android.embracesdk.internal.spans.SpanRepository$trackStartedSpan$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    invoke();
                    return ww8.a;
                }

                public final void invoke() {
                    boolean notTracked;
                    Map map;
                    Map map2;
                    notTracked = SpanRepository.this.notTracked(spanId);
                    if (notTracked) {
                        if (persistableEmbraceSpan.isRecording()) {
                            map2 = SpanRepository.this.activeSpans;
                            map2.put(spanId, persistableEmbraceSpan);
                        } else {
                            map = SpanRepository.this.completedSpans;
                            map.put(spanId, persistableEmbraceSpan);
                        }
                    }
                }
            });
        }
    }

    public final void trackedSpanStopped(final String str) {
        zq3.h(str, "spanId");
        CollectionExtensionsKt.lockAndRun(this.spanIdsInProcess, str, new qs2() { // from class: io.embrace.android.embracesdk.internal.spans.SpanRepository$trackedSpanStopped$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final ww8 mo865invoke() {
                Map map;
                Map map2;
                Map map3;
                map = SpanRepository.this.activeSpans;
                PersistableEmbraceSpan persistableEmbraceSpan = (PersistableEmbraceSpan) map.get(str);
                if (persistableEmbraceSpan == null) {
                    return null;
                }
                if (persistableEmbraceSpan.isRecording()) {
                    persistableEmbraceSpan = null;
                }
                if (persistableEmbraceSpan == null) {
                    return null;
                }
                map2 = SpanRepository.this.activeSpans;
                PersistableEmbraceSpan persistableEmbraceSpan2 = (PersistableEmbraceSpan) map2.remove(str);
                if (persistableEmbraceSpan2 == null) {
                    return null;
                }
                map3 = SpanRepository.this.completedSpans;
                map3.put(str, persistableEmbraceSpan2);
                return ww8.a;
            }
        });
    }
}
