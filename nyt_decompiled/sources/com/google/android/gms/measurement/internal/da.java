package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.nytimes.android.abra.models.AbraPackageKt;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
public final class da {
    private final a5 a;

    public da(a5 a5Var) {
        this.a = a5Var;
    }

    final void a(String str, Bundle bundle) {
        String uri;
        this.a.e().c();
        if (this.a.k()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        this.a.E().u.b(uri);
        this.a.E().v.b(this.a.p().currentTimeMillis());
    }

    final void b() {
        this.a.e().c();
        if (d()) {
            if (e()) {
                this.a.E().u.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.a.H().u(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmpx", bundle);
            } else {
                String a = this.a.E().u.a();
                if (TextUtils.isEmpty(a)) {
                    this.a.o().s().a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((this.a.E().v.a() / AbraPackageKt.MS_IN_HOUR) - 1) * AbraPackageKt.MS_IN_HOUR;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", a2);
                    Object obj = pair.first;
                    this.a.H().u(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.a.E().u.b(null);
            }
            this.a.E().v.b(0L);
        }
    }

    final void c() {
        if (d() && e()) {
            this.a.E().u.b(null);
        }
    }

    final boolean d() {
        return this.a.E().v.a() > 0;
    }

    final boolean e() {
        return d() && this.a.p().currentTimeMillis() - this.a.E().v.a() > this.a.y().n(null, m3.S);
    }
}
