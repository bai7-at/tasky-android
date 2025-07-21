package com.comscore.android.task;

/* loaded from: classes2.dex */
public interface TaskExceptionHandler {
    void exception(Exception exc, TaskExecutor taskExecutor, Runnable runnable);
}
