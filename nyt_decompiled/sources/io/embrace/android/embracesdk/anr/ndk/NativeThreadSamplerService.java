package io.embrace.android.embracesdk.anr.ndk;

import io.embrace.android.embracesdk.anr.BlockedThreadListener;
import io.embrace.android.embracesdk.payload.NativeThreadAnrInterval;
import io.embrace.android.embracesdk.session.MemoryCleanerListener;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface NativeThreadSamplerService extends BlockedThreadListener, MemoryCleanerListener {
    List<NativeThreadAnrInterval> getCapturedIntervals(Boolean bool);

    Map<String, String> getNativeSymbols();

    boolean monitorCurrentThread();

    boolean setupNativeSampler();
}
