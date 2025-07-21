package io.embrace.android.embracesdk.internal.spans;

import io.embrace.android.embracesdk.arch.destination.SessionSpanWriter;
import io.embrace.android.embracesdk.arch.schema.AppTerminationCause;
import io.embrace.android.embracesdk.internal.Initializable;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import java.util.List;

/* loaded from: classes5.dex */
public interface CurrentSessionSpan extends Initializable, SessionSpanWriter {

    public static final class DefaultImpls {
        public static /* synthetic */ List endSession$default(CurrentSessionSpan currentSessionSpan, AppTerminationCause appTerminationCause, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: endSession");
            }
            if ((i & 1) != 0) {
                appTerminationCause = null;
            }
            return currentSessionSpan.endSession(appTerminationCause);
        }
    }

    boolean canStartNewSpan(EmbraceSpan embraceSpan, boolean z);

    List<EmbraceSpanData> endSession(AppTerminationCause appTerminationCause);

    String getSessionId();
}
