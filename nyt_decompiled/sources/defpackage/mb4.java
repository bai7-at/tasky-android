package defpackage;

import android.util.LongSparseArray;

/* loaded from: classes.dex */
public abstract class mb4 {

    public static final class a extends db4 {
        private int a;
        final /* synthetic */ LongSparseArray b;

        a(LongSparseArray longSparseArray) {
            this.b = longSparseArray;
        }

        @Override // defpackage.db4
        public long c() {
            LongSparseArray longSparseArray = this.b;
            int i = this.a;
            this.a = i + 1;
            return longSparseArray.keyAt(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a < this.b.size();
        }
    }

    public static final db4 a(LongSparseArray longSparseArray) {
        return new a(longSparseArray);
    }
}
