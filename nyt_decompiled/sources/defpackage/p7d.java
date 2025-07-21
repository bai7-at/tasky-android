package defpackage;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.h;

/* loaded from: classes3.dex */
final class p7d extends n8d {
    private final Activity a;
    private final h b;
    private final String c;
    private final String d;

    /* synthetic */ p7d(Activity activity, h hVar, String str, String str2, o7d o7dVar) {
        this.a = activity;
        this.b = hVar;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.n8d
    public final Activity a() {
        return this.a;
    }

    @Override // defpackage.n8d
    public final h b() {
        return this.b;
    }

    @Override // defpackage.n8d
    public final String c() {
        return this.c;
    }

    @Override // defpackage.n8d
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        h hVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n8d) {
            n8d n8dVar = (n8d) obj;
            if (this.a.equals(n8dVar.a()) && ((hVar = this.b) != null ? hVar.equals(n8dVar.b()) : n8dVar.b() == null) && ((str = this.c) != null ? str.equals(n8dVar.c()) : n8dVar.c() == null) && ((str2 = this.d) != null ? str2.equals(n8dVar.d()) : n8dVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        h hVar = this.b;
        int hashCode2 = ((hashCode * 1000003) ^ (hVar == null ? 0 : hVar.hashCode())) * 1000003;
        String str = this.c;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        return hashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        h hVar = this.b;
        return "OfflineUtilsParams{activity=" + this.a.toString() + ", adOverlay=" + String.valueOf(hVar) + ", gwsQueryId=" + this.c + ", uri=" + this.d + "}";
    }
}
