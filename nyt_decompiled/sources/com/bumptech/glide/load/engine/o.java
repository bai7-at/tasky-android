package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.g;
import defpackage.cz6;
import defpackage.sk5;
import defpackage.sz5;
import defpackage.t91;
import defpackage.z06;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class o {
    private final Class a;
    private final sz5 b;
    private final List c;
    private final String d;

    public o(Class cls, Class cls2, Class cls3, List list, sz5 sz5Var) {
        this.a = cls;
        this.b = sz5Var;
        this.c = (List) z06.c(list);
        this.d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private cz6 b(t91 t91Var, sk5 sk5Var, int i, int i2, g.a aVar, List list) {
        int size = this.c.size();
        cz6 cz6Var = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                cz6Var = ((g) this.c.get(i3)).a(t91Var, i, i2, sk5Var, aVar);
            } catch (GlideException e) {
                list.add(e);
            }
            if (cz6Var != null) {
                break;
            }
        }
        if (cz6Var != null) {
            return cz6Var;
        }
        throw new GlideException(this.d, new ArrayList(list));
    }

    public cz6 a(t91 t91Var, sk5 sk5Var, int i, int i2, g.a aVar) {
        List list = (List) z06.d(this.b.b());
        try {
            return b(t91Var, sk5Var, i, i2, aVar, list);
        } finally {
            this.b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.c.toArray()) + '}';
    }
}
