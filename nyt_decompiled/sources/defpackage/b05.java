package defpackage;

import org.threeten.bp.DayOfWeek;
import org.threeten.bp.LocalDate;

/* loaded from: classes4.dex */
public class b05 {
    public LocalDate a(DayOfWeek dayOfWeek) {
        LocalDate b = b();
        while (b.getDayOfWeek() != dayOfWeek) {
            b = b.minusDays(1L);
        }
        return b;
    }

    public LocalDate b() {
        return LocalDate.now();
    }

    public long c() {
        return System.currentTimeMillis();
    }

    public LocalDate d() {
        return b().minusDays(1L);
    }
}
