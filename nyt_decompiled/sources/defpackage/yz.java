package defpackage;

import androidx.room.AutoClosingRoomOpenHelper;
import defpackage.tc8;

/* loaded from: classes.dex */
public final class yz implements tc8.c {
    private final tc8.c a;
    private final xz b;

    public yz(tc8.c cVar, xz xzVar) {
        zq3.h(cVar, "delegate");
        zq3.h(xzVar, "autoCloser");
        this.a = cVar;
        this.b = xzVar;
    }

    @Override // tc8.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AutoClosingRoomOpenHelper a(tc8.b bVar) {
        zq3.h(bVar, "configuration");
        return new AutoClosingRoomOpenHelper(this.a.a(bVar), this.b);
    }
}
