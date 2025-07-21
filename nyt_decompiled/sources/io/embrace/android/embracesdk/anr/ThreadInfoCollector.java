package io.embrace.android.embracesdk.anr;

import defpackage.zq3;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.config.behavior.AnrBehavior;
import io.embrace.android.embracesdk.payload.ThreadInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class ThreadInfoCollector {
    private final Map<Long, ThreadInfo> currentStacktraceStates;
    private final Thread targetThread;

    public ThreadInfoCollector(Thread thread) {
        zq3.h(thread, "targetThread");
        this.targetThread = thread;
        this.currentStacktraceStates = new HashMap();
    }

    private final boolean isAllowedByLists(List<Pattern> list, List<Pattern> list2, String str) {
        return matchesList(list, str) || !matchesList(list2, str);
    }

    private final boolean matchesList(List<Pattern> list, String str) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        List<Pattern> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((Pattern) it2.next()).matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    public final List<ThreadInfo> captureSample(ConfigService configService) {
        zq3.h(configService, "configService");
        Set<ThreadInfo> allowedThreads$embrace_android_sdk_release = getAllowedThreads$embrace_android_sdk_release(configService);
        ArrayList arrayList = new ArrayList();
        for (ThreadInfo threadInfo : allowedThreads$embrace_android_sdk_release) {
            long threadId = threadInfo.getThreadId();
            ThreadInfo threadInfo2 = this.currentStacktraceStates.get(Long.valueOf(threadId));
            if (threadInfo2 == null || !zq3.c(threadInfo, threadInfo2)) {
                arrayList.add(threadInfo);
                this.currentStacktraceStates.put(Long.valueOf(threadId), threadInfo);
            }
        }
        return arrayList;
    }

    public final void clearStacktraceCache() {
        this.currentStacktraceStates.clear();
    }

    public final Set<ThreadInfo> getAllowedThreads$embrace_android_sdk_release(ConfigService configService) {
        zq3.h(configService, "configService");
        HashSet hashSet = new HashSet();
        AnrBehavior anrBehavior = configService.getAnrBehavior();
        List<Pattern> blockPatternList = anrBehavior.getBlockPatternList();
        List<Pattern> allowPatternList = anrBehavior.getAllowPatternList();
        int stacktraceFrameLimit = anrBehavior.getStacktraceFrameLimit();
        int minThreadPriority = anrBehavior.getMinThreadPriority();
        if (anrBehavior.shouldCaptureMainThreadOnly()) {
            ThreadInfo.Companion companion = ThreadInfo.Companion;
            Thread thread = this.targetThread;
            StackTraceElement[] stackTrace = thread.getStackTrace();
            zq3.g(stackTrace, "targetThread.stackTrace");
            hashSet.add(companion.ofThread(thread, stackTrace, stacktraceFrameLimit));
        } else {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            zq3.g(allStackTraces, "Thread.getAllStackTraces()");
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                Thread key = entry.getKey();
                StackTraceElement[] value = entry.getValue();
                zq3.g(key, "thread");
                boolean isAllowedByPriority = isAllowedByPriority(minThreadPriority, key.getPriority());
                String name = key.getName();
                zq3.g(name, "thread.name");
                boolean isAllowedByLists = isAllowedByLists(allowPatternList, blockPatternList, name);
                if (isAllowedByPriority && isAllowedByLists) {
                    ThreadInfo.Companion companion2 = ThreadInfo.Companion;
                    zq3.g(value, "stacktrace");
                    hashSet.add(companion2.ofThread(key, value, stacktraceFrameLimit));
                }
            }
        }
        return hashSet;
    }

    public final boolean isAllowedByPriority(int i, int i2) {
        return i2 >= i;
    }
}
