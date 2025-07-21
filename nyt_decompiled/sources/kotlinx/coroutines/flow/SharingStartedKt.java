package kotlinx.coroutines.flow;

import kotlin.time.b;
import kotlinx.coroutines.flow.SharingStarted;

/* loaded from: classes5.dex */
public final class SharingStartedKt {
    /* renamed from: WhileSubscribed-5qebJ5I, reason: not valid java name */
    public static final SharingStarted m924WhileSubscribed5qebJ5I(SharingStarted.Companion companion, long j, long j2) {
        return new StartedWhileSubscribed(b.s(j), b.s(j2));
    }

    /* renamed from: WhileSubscribed-5qebJ5I$default, reason: not valid java name */
    public static /* synthetic */ SharingStarted m925WhileSubscribed5qebJ5I$default(SharingStarted.Companion companion, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = b.b.d();
        }
        if ((i & 2) != 0) {
            j2 = b.b.b();
        }
        return m924WhileSubscribed5qebJ5I(companion, j, j2);
    }
}
