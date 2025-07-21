package kotlin;

import defpackage.c04;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class InitializedLazyImpl<T> implements c04, Serializable {
    private final T value;

    /* JADX WARN: Multi-variable type inference failed */
    public InitializedLazyImpl(Object obj) {
        this.value = obj;
    }

    @Override // defpackage.c04
    public boolean a() {
        return true;
    }

    @Override // defpackage.c04
    public Object getValue() {
        return this.value;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
