package io.embrace.android.embracesdk.payload;

import com.facebook.AuthenticationTokenClaims;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.payload.ExceptionInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class LegacyExceptionInfo {
    public static final Companion Companion = new Companion(null);
    private static final int STACK_FRAME_LIMIT = 200;
    private final List<String> lines;
    private final String message;
    private final String name;
    private final Integer originalLength;

    public static final class Companion {
        private Companion() {
        }

        public final LegacyExceptionInfo ofThrowable(Throwable th) {
            zq3.h(th, "throwable");
            String name = th.getClass().getName();
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            StackTraceElement[] stackTrace = th.getStackTrace();
            zq3.g(stackTrace, "throwable.stackTrace");
            ArrayList arrayList = new ArrayList(stackTrace.length);
            for (StackTraceElement stackTraceElement : stackTrace) {
                arrayList.add(stackTraceElement.toString());
            }
            zq3.g(name, AuthenticationTokenClaims.JSON_KEY_NAME);
            return new LegacyExceptionInfo(name, message, arrayList);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LegacyExceptionInfo(@bt3(name = "n") String str, @bt3(name = "m") String str2, List<String> list) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(list, "lines");
        this.name = str;
        this.message = str2;
        this.lines = i.P0(list, 200);
        Integer valueOf = Integer.valueOf(list.size());
        this.originalLength = valueOf.intValue() <= 200 ? null : valueOf;
    }

    @bt3(name = "tt")
    public static /* synthetic */ void getLines$annotations() {
    }

    @bt3(name = "length")
    public static /* synthetic */ void getOriginalLength$annotations() {
    }

    public static final LegacyExceptionInfo ofThrowable(Throwable th) {
        return Companion.ofThrowable(th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zq3.c(LegacyExceptionInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.embrace.android.embracesdk.payload.LegacyExceptionInfo");
        }
        LegacyExceptionInfo legacyExceptionInfo = (LegacyExceptionInfo) obj;
        return zq3.c(this.name, legacyExceptionInfo.name) && zq3.c(this.message, legacyExceptionInfo.message) && zq3.c(this.lines, legacyExceptionInfo.lines);
    }

    public final List<String> getLines() {
        return this.lines;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getOriginalLength() {
        return this.originalLength;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.lines.hashCode();
    }

    public final ExceptionInfo toNewPayload() {
        return new ExceptionInfo(this.name, this.message, this.lines);
    }
}
