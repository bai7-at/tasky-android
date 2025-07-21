package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public interface qh4 {
    public static final qh4 a = new a();

    class a implements qh4 {
        a() {
        }

        @Override // defpackage.qh4
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // defpackage.qh4
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // defpackage.qh4
        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
