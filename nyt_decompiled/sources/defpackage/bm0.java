package defpackage;

import com.lyft.kronos.internal.ntp.SntpClient;
import com.lyft.kronos.internal.ntp.SntpServiceImpl;
import com.lyft.kronos.internal.ntp.a;
import java.util.List;

/* loaded from: classes3.dex */
public final class bm0 {
    public static final bm0 a = new bm0();

    private bm0() {
    }

    public static final tx3 a(xl0 xl0Var, ld8 ld8Var, kd8 kd8Var, List list, long j, long j2, long j3, long j4) {
        zq3.h(xl0Var, "localClock");
        zq3.h(ld8Var, "syncResponseCache");
        zq3.h(list, "ntpHosts");
        if (xl0Var instanceof tx3) {
            throw new IllegalArgumentException("Local clock should implement Clock instead of KronosClock");
        }
        return new ux3(new SntpServiceImpl(new SntpClient(xl0Var, new ys1(), new ob1()), xl0Var, new a(ld8Var, xl0Var), kd8Var, list, j, j2, j3, j4), xl0Var);
    }
}
