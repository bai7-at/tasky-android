package io.embrace.android.embracesdk.payload;

/* loaded from: classes5.dex */
public enum ThreadState {
    NEW(0),
    RUNNABLE(1),
    BLOCKED(2),
    WAITING(3),
    TIMED_WAITING(4),
    TERMINATED(5);

    private final int code;

    ThreadState(int i) {
        this.code = i;
    }

    public final int getCode$embrace_android_sdk_release() {
        return this.code;
    }
}
