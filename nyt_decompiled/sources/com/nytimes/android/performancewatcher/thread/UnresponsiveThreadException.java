package com.nytimes.android.performancewatcher.thread;

import defpackage.zq3;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class UnresponsiveThreadException extends Exception {
    private final Map<Thread, StackTraceElement[]> allThreadStackTraces;
    private final Thread watchedThread;

    public UnresponsiveThreadException(Thread thread) {
        zq3.h(thread, "watchedThread");
        this.watchedThread = thread;
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        zq3.g(allStackTraces, "getAllStackTraces(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            StackTraceElement[] value = entry.getValue();
            zq3.g(value, "<get-value>(...)");
            if (!(value.length == 0)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.allThreadStackTraces = linkedHashMap;
        setStackTrace(this.watchedThread.getStackTrace());
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Thread " + this.watchedThread.getName() + "[" + this.watchedThread.getId() + "] unresponsive";
    }
}
