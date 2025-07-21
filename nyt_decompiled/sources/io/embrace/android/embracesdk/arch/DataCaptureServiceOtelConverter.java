package io.embrace.android.embracesdk.arch;

import io.embrace.android.embracesdk.internal.payload.Span;
import java.util.List;

/* loaded from: classes5.dex */
public interface DataCaptureServiceOtelConverter {
    List<Span> snapshot(boolean z);
}
