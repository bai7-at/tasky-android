package defpackage;

import android.content.Context;
import com.amazonaws.services.s3.internal.Constants;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* loaded from: classes3.dex */
abstract class nde {
    static final String g = new UUID(0, 0).toString();
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    final ode f;

    nde(Context context, String str, String str2, String str3) {
        this.f = ode.b(context);
        this.a = str;
        this.b = str.concat("_3p");
        this.c = str2;
        this.d = str2.concat("_3p");
        this.e = str3;
    }

    private final String h(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes((str + str2 + str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.e;
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb.append(str2 == null ? Constants.NULL_VERSION_ID : "not null");
        sb.append(", hashKey is ");
        sb.append(str3 == null ? Constants.NULL_VERSION_ID : "not null");
        throw new IllegalArgumentException(sb.toString());
    }

    final long a(boolean z) {
        return this.f.a(z ? this.d : this.c, -1L);
    }

    final mde b(String str, String str2, long j, boolean z) {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(g)) {
                    String e = e(true);
                    String c = this.f.c("paid_3p_hash_key", null);
                    if (e != null && c != null && !e.equals(h(str, str2, c))) {
                        return c(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new mde();
        }
        boolean z2 = str != null;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long a = a(z2);
        if (a != -1) {
            if (currentTimeMillis < a) {
                this.f.d(z2 ? this.d : this.c, Long.valueOf(currentTimeMillis));
            } else if (currentTimeMillis >= a + j) {
                return c(str, str2);
            }
        }
        String e2 = e(z2);
        return (e2 != null || z) ? new mde(e2, a(z2)) : c(str, str2);
    }

    final mde c(String str, String str2) {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.f.d("paid_3p_hash_key", uuid);
        return d(h(str, str2, uuid), true);
    }

    final mde d(String str, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        this.f.d(z ? this.d : this.c, Long.valueOf(currentTimeMillis));
        this.f.d(z ? this.b : this.a, str);
        return new mde(str, currentTimeMillis);
    }

    final String e(boolean z) {
        return this.f.c(z ? this.b : this.a, null);
    }

    final void f(boolean z) {
        this.f.e(z ? this.d : this.c);
        this.f.e(z ? this.b : this.a);
    }

    final boolean g(boolean z) {
        return this.f.g(this.a);
    }
}
