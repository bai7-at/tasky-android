package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
final class m7d extends q7d {
    private final String a;
    private final String b;
    private final Drawable c;

    m7d(String str, String str2, Drawable drawable) {
        if (str == null) {
            throw new NullPointerException("Null advertiserName");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.b = str2;
        this.c = drawable;
    }

    @Override // defpackage.q7d
    final Drawable a() {
        return this.c;
    }

    @Override // defpackage.q7d
    final String b() {
        return this.a;
    }

    @Override // defpackage.q7d
    final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q7d) {
            q7d q7dVar = (q7d) obj;
            if (this.a.equals(q7dVar.b()) && this.b.equals(q7dVar.c()) && ((drawable = this.c) != null ? drawable.equals(q7dVar.a()) : q7dVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        Drawable drawable = this.c;
        return (drawable == null ? 0 : drawable.hashCode()) ^ (hashCode * 1000003);
    }

    public final String toString() {
        return "OfflineAdAssets{advertiserName=" + this.a + ", imageUrl=" + this.b + ", icon=" + String.valueOf(this.c) + "}";
    }
}
