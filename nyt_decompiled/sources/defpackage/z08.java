package defpackage;

import androidx.compose.runtime.AtomicInt;
import androidx.compose.runtime.snapshots.c;

/* loaded from: classes.dex */
public abstract class z08 implements y08 {
    public static final int $stable = 0;
    private final AtomicInt readerKind = new AtomicInt(0);

    public final boolean A(int i) {
        return (c.a(this.readerKind.get()) & i) != 0;
    }

    public final void B(int i) {
        int a;
        do {
            a = c.a(this.readerKind.get());
            if ((a & i) != 0) {
                return;
            }
        } while (!this.readerKind.compareAndSet(a, c.a(a | i)));
    }
}
