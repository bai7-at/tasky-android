package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ux4 implements gb8 {
    final AtomicReference a = new AtomicReference(new a(false, tb8.b()));

    private static final class a {
        final boolean a;
        final gb8 b;

        a(boolean z, gb8 gb8Var) {
            this.a = z;
            this.b = gb8Var;
        }

        a a(gb8 gb8Var) {
            return new a(this.a, gb8Var);
        }

        a b() {
            return new a(true, this.b);
        }
    }

    public void a(gb8 gb8Var) {
        a aVar;
        if (gb8Var == null) {
            throw new IllegalArgumentException("Subscription can not be null");
        }
        AtomicReference atomicReference = this.a;
        do {
            aVar = (a) atomicReference.get();
            if (aVar.a) {
                gb8Var.unsubscribe();
                return;
            }
        } while (!kz4.a(atomicReference, aVar, aVar.a(gb8Var)));
    }

    @Override // defpackage.gb8
    public boolean isUnsubscribed() {
        return ((a) this.a.get()).a;
    }

    @Override // defpackage.gb8
    public void unsubscribe() {
        a aVar;
        AtomicReference atomicReference = this.a;
        do {
            aVar = (a) atomicReference.get();
            if (aVar.a) {
                return;
            }
        } while (!kz4.a(atomicReference, aVar, aVar.b()));
        aVar.b.unsubscribe();
    }
}
