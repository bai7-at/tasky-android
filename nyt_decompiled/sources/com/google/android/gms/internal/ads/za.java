package com.google.android.gms.internal.ads;

import defpackage.uje;

/* loaded from: classes3.dex */
final class za extends ua {
    /* synthetic */ za(uje ujeVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.ua
    final wa a(eb ebVar, wa waVar) {
        wa waVar2;
        synchronized (ebVar) {
            try {
                waVar2 = ebVar.b;
                if (waVar2 != waVar) {
                    ebVar.b = waVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return waVar2;
    }

    @Override // com.google.android.gms.internal.ads.ua
    final db b(eb ebVar, db dbVar) {
        db dbVar2;
        synchronized (ebVar) {
            try {
                dbVar2 = ebVar.c;
                if (dbVar2 != dbVar) {
                    ebVar.c = dbVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dbVar2;
    }

    @Override // com.google.android.gms.internal.ads.ua
    final void c(db dbVar, db dbVar2) {
        dbVar.b = dbVar2;
    }

    @Override // com.google.android.gms.internal.ads.ua
    final void d(db dbVar, Thread thread) {
        dbVar.a = thread;
    }

    @Override // com.google.android.gms.internal.ads.ua
    final boolean e(eb ebVar, wa waVar, wa waVar2) {
        wa waVar3;
        synchronized (ebVar) {
            try {
                waVar3 = ebVar.b;
                if (waVar3 != waVar) {
                    return false;
                }
                ebVar.b = waVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ua
    final boolean f(eb ebVar, Object obj, Object obj2) {
        Object obj3;
        synchronized (ebVar) {
            try {
                obj3 = ebVar.a;
                if (obj3 != obj) {
                    return false;
                }
                ebVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ua
    final boolean g(eb ebVar, db dbVar, db dbVar2) {
        db dbVar3;
        synchronized (ebVar) {
            try {
                dbVar3 = ebVar.c;
                if (dbVar3 != dbVar) {
                    return false;
                }
                ebVar.c = dbVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
