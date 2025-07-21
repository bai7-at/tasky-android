package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class xvc {
    private final String a;
    private final List b;
    private final Set c;
    private final Bundle d;
    private final Map e;
    private final String f;
    private final String g;
    private final int h;
    private final Set i;
    private final Bundle j;
    private final Set k;
    private final boolean l;
    private final String m;
    private final int n;

    public xvc(tuc tucVar, pd7 pd7Var) {
        String str;
        List list;
        HashSet hashSet;
        Bundle bundle;
        HashMap hashMap;
        String str2;
        String str3;
        int i;
        HashSet hashSet2;
        Bundle bundle2;
        HashSet hashSet3;
        boolean z;
        String str4;
        int i2;
        str = tucVar.g;
        this.a = str;
        list = tucVar.h;
        this.b = list;
        hashSet = tucVar.a;
        this.c = Collections.unmodifiableSet(hashSet);
        bundle = tucVar.b;
        this.d = bundle;
        hashMap = tucVar.c;
        this.e = Collections.unmodifiableMap(hashMap);
        str2 = tucVar.i;
        this.f = str2;
        str3 = tucVar.j;
        this.g = str3;
        i = tucVar.k;
        this.h = i;
        hashSet2 = tucVar.d;
        this.i = Collections.unmodifiableSet(hashSet2);
        bundle2 = tucVar.e;
        this.j = bundle2;
        hashSet3 = tucVar.f;
        this.k = Collections.unmodifiableSet(hashSet3);
        z = tucVar.l;
        this.l = z;
        str4 = tucVar.m;
        this.m = str4;
        i2 = tucVar.n;
        this.n = i2;
    }

    public final int a() {
        return this.n;
    }

    public final int b() {
        return this.h;
    }

    public final Bundle c() {
        return this.j;
    }

    public final Bundle d(Class cls) {
        return this.d.getBundle(cls.getName());
    }

    public final Bundle e() {
        return this.d;
    }

    public final pd7 f() {
        return null;
    }

    public final String g() {
        return this.m;
    }

    public final String h() {
        return this.a;
    }

    public final String i() {
        return this.f;
    }

    public final String j() {
        return this.g;
    }

    public final List k() {
        return new ArrayList(this.b);
    }

    public final Set l() {
        return this.k;
    }

    public final Set m() {
        return this.c;
    }

    public final boolean n() {
        return this.l;
    }

    public final boolean o(Context context) {
        RequestConfiguration a = v9d.b().a();
        kia.b();
        Set set = this.i;
        String A = tfb.A(context);
        return set.contains(A) || a.e().contains(A);
    }
}
