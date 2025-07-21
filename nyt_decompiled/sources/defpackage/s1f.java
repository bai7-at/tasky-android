package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
final class s1f extends x5f {
    private final Context a;
    private final k7f b;

    s1f(Context context, k7f k7fVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.a = context;
        this.b = k7fVar;
    }

    @Override // defpackage.x5f
    final Context a() {
        return this.a;
    }

    @Override // defpackage.x5f
    final k7f b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        k7f k7fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x5f) {
            x5f x5fVar = (x5f) obj;
            if (this.a.equals(x5fVar.a()) && ((k7fVar = this.b) != null ? k7fVar.equals(x5fVar.b()) : x5fVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        k7f k7fVar = this.b;
        return (k7fVar == null ? 0 : k7fVar.hashCode()) ^ hashCode;
    }

    public final String toString() {
        return "FlagsContext{context=" + this.a.toString() + ", hermeticFileOverrides=" + String.valueOf(this.b) + "}";
    }
}
