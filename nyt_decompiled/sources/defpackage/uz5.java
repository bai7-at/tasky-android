package defpackage;

/* loaded from: classes.dex */
public class uz5 extends tz5 {
    private final Object c;

    public uz5(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.tz5, defpackage.sz5
    public boolean a(Object obj) {
        boolean a;
        zq3.h(obj, "instance");
        synchronized (this.c) {
            a = super.a(obj);
        }
        return a;
    }

    @Override // defpackage.tz5, defpackage.sz5
    public Object b() {
        Object b;
        synchronized (this.c) {
            b = super.b();
        }
        return b;
    }
}
