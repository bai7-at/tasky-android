package defpackage;

import android.util.SparseBooleanArray;

/* loaded from: classes3.dex */
public final class zy9 {
    private final SparseBooleanArray a = new SparseBooleanArray();
    private boolean b;

    public final zy9 a(int i) {
        wad.f(!this.b);
        this.a.append(i, true);
        return this;
    }

    public final p0a b() {
        wad.f(!this.b);
        this.b = true;
        return new p0a(this.a, null);
    }
}
