package defpackage;

import com.amazonaws.event.ProgressEvent;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.log.model.LogEvent;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.i;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public interface f84 {

    public static final class a {
        public static /* synthetic */ LogEvent a(f84 f84Var, int i, String str, Throwable th, Map map, Set set, long j, String str2, ua1 ua1Var, boolean z, String str3, boolean z2, boolean z3, j09 j09Var, NetworkInfo networkInfo, List list, int i2, Object obj) {
            if (obj == null) {
                return f84Var.a(i, str, th, map, set, j, str2, ua1Var, z, str3, (i2 & 1024) != 0 ? true : z2, (i2 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? true : z3, (i2 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : j09Var, (i2 & 8192) != 0 ? null : networkInfo, (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? i.l() : list);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateLog");
        }
    }

    LogEvent a(int i, String str, Throwable th, Map map, Set set, long j, String str2, ua1 ua1Var, boolean z, String str3, boolean z2, boolean z3, j09 j09Var, NetworkInfo networkInfo, List list);
}
