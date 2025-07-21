package defpackage;

import android.location.Location;
import java.util.Date;
import java.util.Set;

/* loaded from: classes3.dex */
public final class e4b implements dp4 {
    private final Date a;
    private final int b;
    private final Set c;
    private final boolean d;
    private final Location e;
    private final int f;
    private final boolean g;
    private final String h;

    public e4b(Date date, int i, Set set, Location location, boolean z, int i2, boolean z2, int i3, String str) {
        this.a = date;
        this.b = i;
        this.c = set;
        this.e = location;
        this.d = z;
        this.f = i2;
        this.g = z2;
        this.h = str;
    }

    @Override // defpackage.dp4
    public final int b() {
        return this.f;
    }

    @Override // defpackage.dp4
    public final boolean c() {
        return this.g;
    }

    @Override // defpackage.dp4
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.dp4
    public final Set g() {
        return this.c;
    }
}
