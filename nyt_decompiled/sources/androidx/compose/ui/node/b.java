package androidx.compose.ui.node;

/* loaded from: classes.dex */
final class b {
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float a = 1.0f;
    private float b = 1.0f;
    private float h = 8.0f;
    private long i = androidx.compose.ui.graphics.e.b.a();

    public final void a(androidx.compose.ui.graphics.c cVar) {
        this.a = cVar.D0();
        this.b = cVar.y1();
        this.c = cVar.m1();
        this.d = cVar.d1();
        this.e = cVar.o1();
        this.f = cVar.M();
        this.g = cVar.R();
        this.h = cVar.f0();
        this.i = cVar.j0();
    }

    public final void b(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
    }

    public final boolean c(b bVar) {
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && androidx.compose.ui.graphics.e.e(this.i, bVar.i);
    }
}
