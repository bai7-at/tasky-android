package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.internal.payload.InternalError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class LegacyExceptionError {
    private List<LegacyExceptionErrorInfo> exceptionErrors;
    private final transient boolean logStrictMode;
    private int occurrences;

    public LegacyExceptionError() {
        this(false, 1, null);
    }

    private final boolean component1() {
        return this.logStrictMode;
    }

    public static /* synthetic */ LegacyExceptionError copy$default(LegacyExceptionError legacyExceptionError, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = legacyExceptionError.logStrictMode;
        }
        return legacyExceptionError.copy(z);
    }

    @bt3(name = "rep")
    public static /* synthetic */ void getExceptionErrors$annotations() {
    }

    private final List<LegacyExceptionInfo> getExceptionInfo(Throwable th) {
        ArrayList arrayList = new ArrayList();
        while (th != null && !zq3.c(th, th.getCause())) {
            arrayList.add(0, LegacyExceptionInfo.Companion.ofThrowable(th));
            th = th.getCause();
        }
        return arrayList;
    }

    @bt3(name = QueryKeys.TIME_ON_VIEW_IN_MINUTES)
    public static /* synthetic */ void getOccurrences$annotations() {
    }

    public final void addException(Throwable th, String str, Clock clock) {
        zq3.h(clock, "clock");
        this.occurrences++;
        if (this.exceptionErrors.size() < (this.logStrictMode ? 50 : 10)) {
            this.exceptionErrors.add(new LegacyExceptionErrorInfo(Long.valueOf(clock.now()), str, getExceptionInfo(th)));
        }
    }

    public final LegacyExceptionError copy(boolean z) {
        return new LegacyExceptionError(z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LegacyExceptionError) && this.logStrictMode == ((LegacyExceptionError) obj).logStrictMode;
        }
        return true;
    }

    public final List<LegacyExceptionErrorInfo> getExceptionErrors() {
        return this.exceptionErrors;
    }

    public final int getOccurrences() {
        return this.occurrences;
    }

    public int hashCode() {
        boolean z = this.logStrictMode;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final void setExceptionErrors(List<LegacyExceptionErrorInfo> list) {
        zq3.h(list, "<set-?>");
        this.exceptionErrors = list;
    }

    public final void setOccurrences(int i) {
        this.occurrences = i;
    }

    public final InternalError toNewPayload() {
        Integer valueOf = Integer.valueOf(this.occurrences);
        List<LegacyExceptionErrorInfo> list = this.exceptionErrors;
        ArrayList arrayList = new ArrayList(i.w(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((LegacyExceptionErrorInfo) it2.next()).toNewPayload());
        }
        return new InternalError(valueOf, arrayList);
    }

    public String toString() {
        return "LegacyExceptionError(logStrictMode=" + this.logStrictMode + ")";
    }

    public LegacyExceptionError(boolean z) {
        this.logStrictMode = z;
        this.exceptionErrors = new ArrayList();
    }

    public /* synthetic */ LegacyExceptionError(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
