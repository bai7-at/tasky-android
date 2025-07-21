package defpackage;

import defpackage.ob;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class td1 implements ob {
    private final boolean a;
    private final int b;
    private final byte[] c;
    private int d;
    private int e;
    private int f;
    private nb[] g;

    public td1(boolean z, int i) {
        this(z, i, 0);
    }

    @Override // defpackage.ob
    public synchronized void a(ob.a aVar) {
        while (aVar != null) {
            try {
                nb[] nbVarArr = this.g;
                int i = this.f;
                this.f = i + 1;
                nbVarArr[i] = aVar.a();
                this.e--;
                aVar = aVar.next();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    @Override // defpackage.ob
    public synchronized nb b() {
        nb nbVar;
        try {
            this.e++;
            int i = this.f;
            if (i > 0) {
                nb[] nbVarArr = this.g;
                int i2 = i - 1;
                this.f = i2;
                nbVar = (nb) ur.e(nbVarArr[i2]);
                this.g[this.f] = null;
            } else {
                nbVar = new nb(new byte[this.b], 0);
                int i3 = this.e;
                nb[] nbVarArr2 = this.g;
                if (i3 > nbVarArr2.length) {
                    this.g = (nb[]) Arrays.copyOf(nbVarArr2, nbVarArr2.length * 2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return nbVar;
    }

    @Override // defpackage.ob
    public synchronized void c(nb nbVar) {
        nb[] nbVarArr = this.g;
        int i = this.f;
        this.f = i + 1;
        nbVarArr[i] = nbVar;
        this.e--;
        notifyAll();
    }

    @Override // defpackage.ob
    public synchronized void d() {
        try {
            int i = 0;
            int max = Math.max(0, z19.l(this.d, this.b) - this.e);
            int i2 = this.f;
            if (max >= i2) {
                return;
            }
            if (this.c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    nb nbVar = (nb) ur.e(this.g[i]);
                    if (nbVar.a == this.c) {
                        i++;
                    } else {
                        nb nbVar2 = (nb) ur.e(this.g[i3]);
                        if (nbVar2.a != this.c) {
                            i3--;
                        } else {
                            nb[] nbVarArr = this.g;
                            nbVarArr[i] = nbVar2;
                            nbVarArr[i3] = nbVar;
                            i3--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f) {
                    return;
                }
            }
            Arrays.fill(this.g, max, this.f, (Object) null);
            this.f = max;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ob
    public int e() {
        return this.b;
    }

    public synchronized int f() {
        return this.e * this.b;
    }

    public synchronized void g() {
        if (this.a) {
            h(0);
        }
    }

    public synchronized void h(int i) {
        boolean z = i < this.d;
        this.d = i;
        if (z) {
            d();
        }
    }

    public td1(boolean z, int i, int i2) {
        ur.a(i > 0);
        ur.a(i2 >= 0);
        this.a = z;
        this.b = i;
        this.f = i2;
        this.g = new nb[i2 + 100];
        if (i2 <= 0) {
            this.c = null;
            return;
        }
        this.c = new byte[i2 * i];
        for (int i3 = 0; i3 < i2; i3++) {
            this.g[i3] = new nb(this.c, i3 * i);
        }
    }
}
