package io.embrace.android.embracesdk.internal.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class ExceptionInfo {
    private final String message;
    private final String name;
    private final List<String> stacktrace;

    public ExceptionInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExceptionInfo copy$default(ExceptionInfo exceptionInfo, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exceptionInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = exceptionInfo.message;
        }
        if ((i & 4) != 0) {
            list = exceptionInfo.stacktrace;
        }
        return exceptionInfo.copy(str, str2, list);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.message;
    }

    public final List<String> component3() {
        return this.stacktrace;
    }

    public final ExceptionInfo copy(@bt3(name = "name") String str, @bt3(name = "message") String str2, @bt3(name = "stacktrace") List<String> list) {
        return new ExceptionInfo(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExceptionInfo)) {
            return false;
        }
        ExceptionInfo exceptionInfo = (ExceptionInfo) obj;
        return zq3.c(this.name, exceptionInfo.name) && zq3.c(this.message, exceptionInfo.message) && zq3.c(this.stacktrace, exceptionInfo.stacktrace);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getStacktrace() {
        return this.stacktrace;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.stacktrace;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ExceptionInfo(name=" + this.name + ", message=" + this.message + ", stacktrace=" + this.stacktrace + ")";
    }

    public ExceptionInfo(@bt3(name = "name") String str, @bt3(name = "message") String str2, @bt3(name = "stacktrace") List<String> list) {
        this.name = str;
        this.message = str2;
        this.stacktrace = list;
    }

    public /* synthetic */ ExceptionInfo(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
