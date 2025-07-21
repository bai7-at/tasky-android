package com.datadog.android.core.internal.utils;

import defpackage.ss2;
import defpackage.zq3;
import java.lang.Thread;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;

/* loaded from: classes2.dex */
public abstract class ThreadExtKt {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Thread.State.values().length];
            try {
                iArr[Thread.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Thread.State.BLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Thread.State.RUNNABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Thread.State.TERMINATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Thread.State.TIMED_WAITING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Thread.State.WAITING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    public static final String a(Thread.State state) {
        zq3.h(state, "<this>");
        switch (a.a[state.ordinal()]) {
            case 1:
                return "new";
            case 2:
                return "blocked";
            case 3:
                return "runnable";
            case 4:
                return "terminated";
            case 5:
                return "timed_waiting";
            case 6:
                return "waiting";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String b(StackTraceElement[] stackTraceElementArr) {
        zq3.h(stackTraceElementArr, "<this>");
        return d.r0(stackTraceElementArr, "\n", null, null, 0, null, new ss2() { // from class: com.datadog.android.core.internal.utils.ThreadExtKt$loggableStackTrace$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(StackTraceElement stackTraceElement) {
                zq3.h(stackTraceElement, "it");
                return "at " + stackTraceElement;
            }
        }, 30, null);
    }
}
