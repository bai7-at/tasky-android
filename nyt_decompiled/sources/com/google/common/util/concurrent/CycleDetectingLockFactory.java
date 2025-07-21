package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableSet;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class CycleDetectingLockFactory {

    private static class ExampleStackTrace extends IllegalStateException {
        static final StackTraceElement[] a = new StackTraceElement[0];
        static final ImmutableSet b = ImmutableSet.B(CycleDetectingLockFactory.class.getName(), ExampleStackTrace.class.getName(), a.class.getName());
    }

    public static final class PotentialDeadlockException extends ExampleStackTrace {
        private final ExampleStackTrace conflictingStackTrace;

        @Override // java.lang.Throwable
        public String getMessage() {
            String message = super.getMessage();
            Objects.requireNonNull(message);
            StringBuilder sb = new StringBuilder(message);
            for (Throwable th = this.conflictingStackTrace; th != null; th = th.getCause()) {
                sb.append(", ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        }
    }

    private static class a {
    }
}
