package io.embrace.android.embracesdk.payload;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.zq3;
import java.lang.Thread;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public final class ThreadStateKt {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Thread.State.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Thread.State.NEW.ordinal()] = 1;
            iArr[Thread.State.RUNNABLE.ordinal()] = 2;
            iArr[Thread.State.BLOCKED.ordinal()] = 3;
            iArr[Thread.State.WAITING.ordinal()] = 4;
            iArr[Thread.State.TIMED_WAITING.ordinal()] = 5;
            iArr[Thread.State.TERMINATED.ordinal()] = 6;
        }
    }

    public static final ThreadState mapThreadState(Thread.State state) {
        zq3.h(state, TransferTable.COLUMN_STATE);
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return ThreadState.NEW;
            case 2:
                return ThreadState.RUNNABLE;
            case 3:
                return ThreadState.BLOCKED;
            case 4:
                return ThreadState.WAITING;
            case 5:
                return ThreadState.TIMED_WAITING;
            case 6:
                return ThreadState.TERMINATED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
