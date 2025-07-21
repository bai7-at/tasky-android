package defpackage;

/* loaded from: classes3.dex */
final class hhe implements fhe {
    private static final fhe c = new fhe() { // from class: ghe
        @Override // defpackage.fhe
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private volatile fhe a;
    private Object b;

    hhe(fhe fheVar) {
        this.a = fheVar;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == c) {
            obj = "<supplier that returned " + String.valueOf(this.b) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // defpackage.fhe
    public final Object zza() {
        fhe fheVar = this.a;
        fhe fheVar2 = c;
        if (fheVar != fheVar2) {
            synchronized (this) {
                try {
                    if (this.a != fheVar2) {
                        Object zza = this.a.zza();
                        this.b = zza;
                        this.a = fheVar2;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }
}
