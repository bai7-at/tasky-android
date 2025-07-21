package defpackage;

/* loaded from: classes5.dex */
public final class c46 implements b46 {
    static final b46 g = new a();
    long a;
    b46 b;
    boolean c;
    long d;
    long e;
    b46 f;

    static class a implements b46 {
        a() {
        }

        @Override // defpackage.b46
        public void request(long j) {
        }
    }

    public void a() {
        while (true) {
            synchronized (this) {
                try {
                    long j = this.d;
                    long j2 = this.e;
                    b46 b46Var = this.f;
                    if (j == 0 && j2 == 0 && b46Var == null) {
                        this.c = false;
                        return;
                    }
                    this.d = 0L;
                    this.e = 0L;
                    this.f = null;
                    long j3 = this.a;
                    if (j3 != Long.MAX_VALUE) {
                        long j4 = j3 + j;
                        if (j4 < 0 || j4 == Long.MAX_VALUE) {
                            this.a = Long.MAX_VALUE;
                            j3 = Long.MAX_VALUE;
                        } else {
                            j3 = j4 - j2;
                            if (j3 < 0) {
                                throw new IllegalStateException("more produced than requested");
                            }
                            this.a = j3;
                        }
                    }
                    if (b46Var == null) {
                        b46 b46Var2 = this.b;
                        if (b46Var2 != null && j != 0) {
                            b46Var2.request(j);
                        }
                    } else if (b46Var == g) {
                        this.b = null;
                    } else {
                        this.b = b46Var;
                        b46Var.request(j3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void b(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("n > 0 required");
        }
        synchronized (this) {
            try {
                if (this.c) {
                    this.e += j;
                    return;
                }
                this.c = true;
                try {
                    long j2 = this.a;
                    if (j2 != Long.MAX_VALUE) {
                        long j3 = j2 - j;
                        if (j3 < 0) {
                            throw new IllegalStateException("more items arrived than were requested");
                        }
                        this.a = j3;
                    }
                    a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.c = false;
                        throw th;
                    }
                }
            } finally {
            }
        }
    }

    public void c(b46 b46Var) {
        synchronized (this) {
            try {
                if (this.c) {
                    if (b46Var == null) {
                        b46Var = g;
                    }
                    this.f = b46Var;
                    return;
                }
                this.c = true;
                try {
                    this.b = b46Var;
                    if (b46Var != null) {
                        b46Var.request(this.a);
                    }
                    a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.c = false;
                        throw th;
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.b46
    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j == 0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.c) {
                    this.d += j;
                    return;
                }
                this.c = true;
                try {
                    long j2 = this.a + j;
                    if (j2 < 0) {
                        j2 = Long.MAX_VALUE;
                    }
                    this.a = j2;
                    b46 b46Var = this.b;
                    if (b46Var != null) {
                        b46Var.request(j);
                    }
                    a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.c = false;
                        throw th;
                    }
                }
            } finally {
            }
        }
    }
}
