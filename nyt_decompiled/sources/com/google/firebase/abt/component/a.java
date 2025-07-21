package com.google.firebase.abt.component;

import android.content.Context;
import defpackage.q76;
import defpackage.rh2;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {
    private final Map a = new HashMap();
    private final Context b;
    private final q76 c;

    protected a(Context context, q76 q76Var) {
        this.b = context;
        this.c = q76Var;
    }

    protected rh2 a(String str) {
        return new rh2(this.b, this.c, str);
    }

    public synchronized rh2 b(String str) {
        try {
            if (!this.a.containsKey(str)) {
                this.a.put(str, a(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (rh2) this.a.get(str);
    }
}
