package defpackage;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.h;

/* loaded from: classes3.dex */
final class n7d extends m8d {
    private Activity a;
    private h b;
    private String c;
    private String d;

    n7d() {
    }

    @Override // defpackage.m8d
    public final m8d a(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.a = activity;
        return this;
    }

    @Override // defpackage.m8d
    public final m8d b(h hVar) {
        this.b = hVar;
        return this;
    }

    @Override // defpackage.m8d
    public final m8d c(String str) {
        this.c = str;
        return this;
    }

    @Override // defpackage.m8d
    public final m8d d(String str) {
        this.d = str;
        return this;
    }

    @Override // defpackage.m8d
    public final n8d e() {
        Activity activity = this.a;
        if (activity != null) {
            return new p7d(activity, this.b, this.c, this.d, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
