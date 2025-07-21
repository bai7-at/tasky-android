package com.bumptech.glide.load.engine;

import android.util.Log;
import defpackage.cz6;
import defpackage.iz6;
import defpackage.j07;
import defpackage.sk5;
import defpackage.sz5;
import defpackage.t91;
import defpackage.z06;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class g {
    private final Class a;
    private final List b;
    private final j07 c;
    private final sz5 d;
    private final String e;

    interface a {
        cz6 a(cz6 cz6Var);
    }

    public g(Class cls, Class cls2, Class cls3, List list, j07 j07Var, sz5 sz5Var) {
        this.a = cls;
        this.b = list;
        this.c = j07Var;
        this.d = sz5Var;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private cz6 b(t91 t91Var, int i, int i2, sk5 sk5Var) {
        List list = (List) z06.d(this.d.b());
        try {
            return c(t91Var, i, i2, sk5Var, list);
        } finally {
            this.d.a(list);
        }
    }

    private cz6 c(t91 t91Var, int i, int i2, sk5 sk5Var, List list) {
        int size = this.b.size();
        cz6 cz6Var = null;
        for (int i3 = 0; i3 < size; i3++) {
            iz6 iz6Var = (iz6) this.b.get(i3);
            try {
                if (iz6Var.a(t91Var.a(), sk5Var)) {
                    cz6Var = iz6Var.b(t91Var.a(), i, i2, sk5Var);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + iz6Var, e);
                }
                list.add(e);
            }
            if (cz6Var != null) {
                break;
            }
        }
        if (cz6Var != null) {
            return cz6Var;
        }
        throw new GlideException(this.e, new ArrayList(list));
    }

    public cz6 a(t91 t91Var, int i, int i2, sk5 sk5Var, a aVar) {
        return this.c.a(aVar.a(b(t91Var, i, i2, sk5Var)), sk5Var);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
