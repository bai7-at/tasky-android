package io.embrace.android.embracesdk.internal.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class InternalError {
    private final Integer count;
    private final List<ExceptionErrorInfo> errors;

    /* JADX WARN: Multi-variable type inference failed */
    public InternalError() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InternalError copy$default(InternalError internalError, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = internalError.count;
        }
        if ((i & 2) != 0) {
            list = internalError.errors;
        }
        return internalError.copy(num, list);
    }

    public final Integer component1() {
        return this.count;
    }

    public final List<ExceptionErrorInfo> component2() {
        return this.errors;
    }

    public final InternalError copy(@bt3(name = "count") Integer num, @bt3(name = "errors") List<ExceptionErrorInfo> list) {
        return new InternalError(num, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalError)) {
            return false;
        }
        InternalError internalError = (InternalError) obj;
        return zq3.c(this.count, internalError.count) && zq3.c(this.errors, internalError.errors);
    }

    public final Integer getCount() {
        return this.count;
    }

    public final List<ExceptionErrorInfo> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        Integer num = this.count;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<ExceptionErrorInfo> list = this.errors;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "InternalError(count=" + this.count + ", errors=" + this.errors + ")";
    }

    public InternalError(@bt3(name = "count") Integer num, @bt3(name = "errors") List<ExceptionErrorInfo> list) {
        this.count = num;
        this.errors = list;
    }

    public /* synthetic */ InternalError(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
