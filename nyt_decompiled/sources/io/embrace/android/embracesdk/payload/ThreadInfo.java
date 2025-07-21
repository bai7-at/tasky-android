package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class ThreadInfo {
    public static final Companion Companion = new Companion(null);
    private final List<String> lines;
    private final String name;
    private final int priority;
    private final Thread.State state;
    private final long threadId;

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ ThreadInfo ofThread$default(Companion companion, Thread thread, StackTraceElement[] stackTraceElementArr, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = Integer.MAX_VALUE;
            }
            return companion.ofThread(thread, stackTraceElementArr, i);
        }

        public final ThreadInfo ofThread(Thread thread, StackTraceElement[] stackTraceElementArr) {
            return ofThread$default(this, thread, stackTraceElementArr, 0, 4, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ThreadInfo ofThread(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
            zq3.h(thread, "thread");
            zq3.h(stackTraceElementArr, "stackTraceElements");
            String name = thread.getName();
            int priority = thread.getPriority();
            List z0 = d.z0(stackTraceElementArr, i);
            ArrayList arrayList = new ArrayList(i.w(z0, 10));
            Iterator it2 = z0.iterator();
            while (it2.hasNext()) {
                arrayList.add(((StackTraceElement) it2.next()).toString());
            }
            return new ThreadInfo(thread.getId(), thread.getState(), name, priority, arrayList);
        }
    }

    public ThreadInfo(long j, Thread.State state, @bt3(name = "n") String str, @bt3(name = "p") int i, @bt3(name = "tt") List<String> list) {
        this.threadId = j;
        this.state = state;
        this.name = str;
        this.priority = i;
        this.lines = list;
    }

    public static /* synthetic */ ThreadInfo copy$default(ThreadInfo threadInfo, long j, Thread.State state, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = threadInfo.threadId;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            state = threadInfo.state;
        }
        Thread.State state2 = state;
        if ((i2 & 4) != 0) {
            str = threadInfo.name;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            i = threadInfo.priority;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            list = threadInfo.lines;
        }
        return threadInfo.copy(j2, state2, str2, i3, list);
    }

    public static final ThreadInfo ofThread(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return Companion.ofThread$default(Companion, thread, stackTraceElementArr, 0, 4, null);
    }

    public final long component1() {
        return this.threadId;
    }

    public final Thread.State component2() {
        return this.state;
    }

    public final String component3() {
        return this.name;
    }

    public final int component4() {
        return this.priority;
    }

    public final List<String> component5() {
        return this.lines;
    }

    public final ThreadInfo copy(long j, Thread.State state, @bt3(name = "n") String str, @bt3(name = "p") int i, @bt3(name = "tt") List<String> list) {
        return new ThreadInfo(j, state, str, i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreadInfo)) {
            return false;
        }
        ThreadInfo threadInfo = (ThreadInfo) obj;
        return this.threadId == threadInfo.threadId && zq3.c(this.state, threadInfo.state) && zq3.c(this.name, threadInfo.name) && this.priority == threadInfo.priority && zq3.c(this.lines, threadInfo.lines);
    }

    public final List<String> getLines() {
        return this.lines;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final Thread.State getState() {
        return this.state;
    }

    public final long getThreadId() {
        return this.threadId;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.threadId) * 31;
        Thread.State state = this.state;
        int hashCode2 = (hashCode + (state != null ? state.hashCode() : 0)) * 31;
        String str = this.name;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.priority)) * 31;
        List<String> list = this.lines;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ThreadInfo(threadId=" + this.threadId + ", state=" + this.state + ", name=" + this.name + ", priority=" + this.priority + ", lines=" + this.lines + ")";
    }

    public static final ThreadInfo ofThread(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return Companion.ofThread(thread, stackTraceElementArr, i);
    }
}
