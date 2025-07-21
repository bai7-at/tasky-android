package defpackage;

import androidx.room.h;
import defpackage.tc8;
import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class a67 implements tc8.c {
    private final String a;
    private final File b;
    private final Callable c;
    private final tc8.c d;

    public a67(String str, File file, Callable callable, tc8.c cVar) {
        zq3.h(cVar, "mDelegate");
        this.a = str;
        this.b = file;
        this.c = callable;
        this.d = cVar;
    }

    @Override // tc8.c
    public tc8 a(tc8.b bVar) {
        zq3.h(bVar, "configuration");
        return new h(bVar.a, this.a, this.b, this.c, bVar.c.a, this.d.a(bVar));
    }
}
