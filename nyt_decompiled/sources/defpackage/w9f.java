package defpackage;

import defpackage.aaf;

/* loaded from: classes3.dex */
final class w9f extends r9f {
    /* synthetic */ w9f(aaf.a aVar) {
        super(null);
    }

    @Override // defpackage.r9f
    final u9f a(aaf aafVar, u9f u9fVar) {
        u9f u9fVar2;
        synchronized (aafVar) {
            try {
                u9fVar2 = aafVar.b;
                if (u9fVar2 != u9fVar) {
                    aafVar.b = u9fVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u9fVar2;
    }

    @Override // defpackage.r9f
    final z9f b(aaf aafVar, z9f z9fVar) {
        z9f z9fVar2;
        synchronized (aafVar) {
            try {
                z9fVar2 = aafVar.c;
                if (z9fVar2 != z9fVar) {
                    aafVar.c = z9fVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9fVar2;
    }

    @Override // defpackage.r9f
    final void c(z9f z9fVar, z9f z9fVar2) {
        z9fVar.b = z9fVar2;
    }

    @Override // defpackage.r9f
    final void d(z9f z9fVar, Thread thread) {
        z9fVar.a = thread;
    }

    @Override // defpackage.r9f
    final boolean e(aaf aafVar, Object obj, Object obj2) {
        Object obj3;
        synchronized (aafVar) {
            try {
                obj3 = aafVar.a;
                if (obj3 != obj) {
                    return false;
                }
                aafVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r9f
    final boolean f(aaf aafVar, z9f z9fVar, z9f z9fVar2) {
        z9f z9fVar3;
        synchronized (aafVar) {
            try {
                z9fVar3 = aafVar.c;
                if (z9fVar3 != z9fVar) {
                    return false;
                }
                aafVar.c = z9fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
