package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes3.dex */
public abstract class oje extends pje {
    public static int a(long j) {
        int i = (int) j;
        tge.g(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int b(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    public static int c(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j;
    }
}
