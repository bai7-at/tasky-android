package kotlinx.coroutines.time;

import defpackage.by0;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.selects.OnTimeoutKt;
import kotlinx.coroutines.selects.SelectBuilder;

/* loaded from: classes5.dex */
public final class TimeKt {
    private static final long coerceToMillis(Duration duration) {
        if (duration.compareTo(Duration.ZERO) <= 0) {
            return 0L;
        }
        if (duration.compareTo(ChronoUnit.MILLIS.getDuration()) <= 0) {
            return 1L;
        }
        if (duration.getSeconds() < 9223372036854775L || (duration.getSeconds() == 9223372036854775L && duration.getNano() < 807000000)) {
            return duration.toMillis();
        }
        return Long.MAX_VALUE;
    }

    @FlowPreview
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, Duration duration) {
        return FlowKt.debounce(flow, coerceToMillis(duration));
    }

    public static final Object delay(Duration duration, by0<? super ww8> by0Var) {
        Object delay = DelayKt.delay(coerceToMillis(duration), by0Var);
        return delay == a.h() ? delay : ww8.a;
    }

    public static final <R> void onTimeout(SelectBuilder<? super R> selectBuilder, Duration duration, ss2 ss2Var) {
        OnTimeoutKt.onTimeout(selectBuilder, coerceToMillis(duration), ss2Var);
    }

    @FlowPreview
    public static final <T> Flow<T> sample(Flow<? extends T> flow, Duration duration) {
        return FlowKt.sample(flow, coerceToMillis(duration));
    }

    public static final <T> Object withTimeout(Duration duration, gt2 gt2Var, by0<? super T> by0Var) {
        return TimeoutKt.withTimeout(coerceToMillis(duration), gt2Var, by0Var);
    }

    public static final <T> Object withTimeoutOrNull(Duration duration, gt2 gt2Var, by0<? super T> by0Var) {
        return TimeoutKt.withTimeoutOrNull(coerceToMillis(duration), gt2Var, by0Var);
    }
}
