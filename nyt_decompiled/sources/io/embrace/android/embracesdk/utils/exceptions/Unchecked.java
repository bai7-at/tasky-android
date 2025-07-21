package io.embrace.android.embracesdk.utils.exceptions;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public final class Unchecked {
    public static final Unchecked INSTANCE = new Unchecked();

    private Unchecked() {
    }

    public static final RuntimeException propagate(Throwable th) {
        if (th instanceof InvocationTargetException) {
            throw propagate(th.getCause());
        }
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        throw new RuntimeException(th);
    }
}
