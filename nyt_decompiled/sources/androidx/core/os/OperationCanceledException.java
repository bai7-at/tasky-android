package androidx.core.os;

import defpackage.ic5;

/* loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String str) {
        super(ic5.e(str, "The operation has been canceled."));
    }
}
