package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class pd {
    private final Uri a;

    private pd(Uri uri) {
        this.a = uri;
    }

    public static pd b(Uri uri) {
        pd pdVar = new pd(uri);
        if (!"android-app".equals(pdVar.a.getScheme())) {
            throw new IllegalArgumentException("android-app scheme is required.");
        }
        if (TextUtils.isEmpty(pdVar.a())) {
            throw new IllegalArgumentException("Package name is empty.");
        }
        return pdVar;
    }

    public String a() {
        return this.a.getAuthority();
    }

    public boolean equals(Object obj) {
        if (obj instanceof pd) {
            return this.a.equals(((pd) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.a);
    }

    public String toString() {
        return this.a.toString();
    }
}
