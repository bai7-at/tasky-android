package defpackage;

import java.util.Date;

/* loaded from: classes4.dex */
public final class rb1 {
    public final Date a(Long l) {
        if (l != null) {
            return new Date(l.longValue());
        }
        return null;
    }

    public final Long b(Date date) {
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }
}
