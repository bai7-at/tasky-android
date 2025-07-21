package defpackage;

import com.nytimes.android.analytics.purr.PurrTrackerTypeWrapper;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes2.dex */
public interface p86 {

    public static final class a {
        public static StateFlow a(p86 p86Var, PurrTrackerTypeWrapper purrTrackerTypeWrapper, CoroutineScope coroutineScope, SharingStarted sharingStarted) {
            zq3.h(purrTrackerTypeWrapper, "trackerType");
            zq3.h(coroutineScope, "scope");
            zq3.h(sharingStarted, "sharingStarted");
            return FlowKt.stateIn(p86Var.a(purrTrackerTypeWrapper), coroutineScope, sharingStarted, Boolean.valueOf(p86Var.b(purrTrackerTypeWrapper)));
        }

        public static /* synthetic */ StateFlow b(p86 p86Var, PurrTrackerTypeWrapper purrTrackerTypeWrapper, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackerAllowedStateFlow");
            }
            if ((i & 4) != 0) {
                sharingStarted = SharingStarted.Companion.getEagerly();
            }
            return p86Var.c(purrTrackerTypeWrapper, coroutineScope, sharingStarted);
        }
    }

    Flow a(PurrTrackerTypeWrapper purrTrackerTypeWrapper);

    boolean b(PurrTrackerTypeWrapper purrTrackerTypeWrapper);

    StateFlow c(PurrTrackerTypeWrapper purrTrackerTypeWrapper, CoroutineScope coroutineScope, SharingStarted sharingStarted);
}
