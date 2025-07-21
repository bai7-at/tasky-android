package defpackage;

import androidx.work.Data;

/* loaded from: classes.dex */
public final class wj9 {
    private final String a;
    private final Data b;

    public wj9(String str, Data data) {
        zq3.h(str, "workSpecId");
        zq3.h(data, "progress");
        this.a = str;
        this.b = data;
    }

    public final Data a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }
}
