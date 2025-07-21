package io.embrace.android.embracesdk.arch;

import io.embrace.android.embracesdk.session.MemoryCleanerListener;

/* loaded from: classes5.dex */
public interface DataCaptureService<T> extends MemoryCleanerListener {
    T getCapturedData();
}
