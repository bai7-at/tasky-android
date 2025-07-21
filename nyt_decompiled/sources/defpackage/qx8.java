package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import kotlin.text.a;

/* loaded from: classes5.dex */
public abstract class qx8 {
    public static final int a(int i, int i2) {
        return zq3.j(i ^ RecyclerView.UNDEFINED_DURATION, i2 ^ RecyclerView.UNDEFINED_DURATION);
    }

    public static final int b(long j, long j2) {
        return zq3.k(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    public static final double c(long j) {
        return ((j >>> 11) * ProgressEvent.PART_COMPLETED_EVENT_CODE) + (j & 2047);
    }

    public static final String d(long j, int i) {
        if (j >= 0) {
            String l = Long.toString(j, a.a(i));
            zq3.g(l, "toString(...)");
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String l2 = Long.toString(j3, a.a(i));
        zq3.g(l2, "toString(...)");
        sb.append(l2);
        String l3 = Long.toString(j4, a.a(i));
        zq3.g(l3, "toString(...)");
        sb.append(l3);
        return sb.toString();
    }
}
