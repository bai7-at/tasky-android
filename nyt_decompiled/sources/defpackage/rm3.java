package defpackage;

import android.util.SparseArray;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class rm3 {
    private final SparseArray a;

    private rm3(SparseArray sparseArray) {
        this.a = sparseArray;
    }

    public final Object a(int i) {
        return this.a.get(i);
    }

    public final void b(int i, Object obj) {
        this.a.put(i, obj);
    }

    public rm3(int i) {
        this(new SparseArray(i));
    }

    public /* synthetic */ rm3(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
