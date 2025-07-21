package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class Crash {
    public final String crashId;
    private final Integer crashNumber;
    private final List<LegacyExceptionInfo> exceptions;
    private final List<String> jsExceptions;
    private final List<ThreadInfo> threads;

    public Crash(@bt3(name = "id") String str, @bt3(name = "ex") List<LegacyExceptionInfo> list, @bt3(name = "rep_js") List<String> list2, @bt3(name = "th") List<ThreadInfo> list3, @bt3(name = "crash_number") Integer num) {
        zq3.h(str, "crashId");
        this.crashId = str;
        this.exceptions = list;
        this.jsExceptions = list2;
        this.threads = list3;
        this.crashNumber = num;
    }

    public static /* synthetic */ Crash copy$default(Crash crash, String str, List list, List list2, List list3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = crash.crashId;
        }
        if ((i & 2) != 0) {
            list = crash.exceptions;
        }
        List list4 = list;
        if ((i & 4) != 0) {
            list2 = crash.jsExceptions;
        }
        List list5 = list2;
        if ((i & 8) != 0) {
            list3 = crash.threads;
        }
        List list6 = list3;
        if ((i & 16) != 0) {
            num = crash.crashNumber;
        }
        return crash.copy(str, list4, list5, list6, num);
    }

    public final String component1() {
        return this.crashId;
    }

    public final List<LegacyExceptionInfo> component2() {
        return this.exceptions;
    }

    public final List<String> component3() {
        return this.jsExceptions;
    }

    public final List<ThreadInfo> component4() {
        return this.threads;
    }

    public final Integer component5() {
        return this.crashNumber;
    }

    public final Crash copy(@bt3(name = "id") String str, @bt3(name = "ex") List<LegacyExceptionInfo> list, @bt3(name = "rep_js") List<String> list2, @bt3(name = "th") List<ThreadInfo> list3, @bt3(name = "crash_number") Integer num) {
        zq3.h(str, "crashId");
        return new Crash(str, list, list2, list3, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Crash)) {
            return false;
        }
        Crash crash = (Crash) obj;
        return zq3.c(this.crashId, crash.crashId) && zq3.c(this.exceptions, crash.exceptions) && zq3.c(this.jsExceptions, crash.jsExceptions) && zq3.c(this.threads, crash.threads) && zq3.c(this.crashNumber, crash.crashNumber);
    }

    public final Integer getCrashNumber() {
        return this.crashNumber;
    }

    public final List<LegacyExceptionInfo> getExceptions() {
        return this.exceptions;
    }

    public final List<String> getJsExceptions() {
        return this.jsExceptions;
    }

    public final List<ThreadInfo> getThreads() {
        return this.threads;
    }

    public int hashCode() {
        String str = this.crashId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<LegacyExceptionInfo> list = this.exceptions;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.jsExceptions;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<ThreadInfo> list3 = this.threads;
        int hashCode4 = (hashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31;
        Integer num = this.crashNumber;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "Crash(crashId=" + this.crashId + ", exceptions=" + this.exceptions + ", jsExceptions=" + this.jsExceptions + ", threads=" + this.threads + ", crashNumber=" + this.crashNumber + ")";
    }

    public /* synthetic */ Crash(String str, List list, List list2, List list3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : num);
    }
}
