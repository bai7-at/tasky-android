package io.embrace.android.embracesdk.internal.spans;

import defpackage.by7;
import defpackage.gq0;
import defpackage.zq3;
import io.embrace.android.embracesdk.utils.CollectionExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class SpanSinkImpl implements SpanSink {
    private final Queue<EmbraceSpanData> completedSpans = new ConcurrentLinkedQueue();
    private final AtomicReference<List<EmbraceSpanData>> spansToFlush = new AtomicReference<>(i.l());

    @Override // io.embrace.android.embracesdk.internal.spans.SpanSink
    public List<EmbraceSpanData> completedSpans() {
        return CollectionExtensionsKt.threadSafeTake(this.completedSpans, this.completedSpans.size());
    }

    @Override // io.embrace.android.embracesdk.internal.spans.SpanSink
    public List<EmbraceSpanData> flushSpans() {
        List<EmbraceSpanData> list;
        synchronized (this.spansToFlush) {
            this.spansToFlush.set(completedSpans());
            Queue<EmbraceSpanData> queue = this.completedSpans;
            List<EmbraceSpanData> list2 = this.spansToFlush.get();
            zq3.g(list2, "spansToFlush.get()");
            queue.removeAll(i.c1(list2));
            List<EmbraceSpanData> list3 = this.spansToFlush.get();
            zq3.g(list3, "spansToFlush.get()");
            list = list3;
        }
        return list;
    }

    @Override // io.embrace.android.embracesdk.internal.spans.SpanSink
    public gq0 storeCompletedSpans(List<? extends by7> list) {
        zq3.h(list, "spans");
        try {
            Queue<EmbraceSpanData> queue = this.completedSpans;
            List<? extends by7> list2 = list;
            ArrayList arrayList = new ArrayList(i.w(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(new EmbraceSpanData((by7) it2.next()));
            }
            i.B(queue, arrayList);
            gq0 i = gq0.i();
            zq3.g(i, "CompletableResultCode.ofSuccess()");
            return i;
        } catch (Throwable unused) {
            gq0 h = gq0.h();
            zq3.g(h, "CompletableResultCode.ofFailure()");
            return h;
        }
    }
}
