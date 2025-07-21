package io.embrace.android.embracesdk.internal.spans;

import defpackage.by7;
import defpackage.gq0;
import java.util.List;

/* loaded from: classes5.dex */
public interface SpanSink {
    List<EmbraceSpanData> completedSpans();

    List<EmbraceSpanData> flushSpans();

    gq0 storeCompletedSpans(List<? extends by7> list);
}
