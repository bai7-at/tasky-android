package com.airbnb.lottie;

import defpackage.fo5;
import defpackage.lh4;
import defpackage.pg4;
import defpackage.vo;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class p {
    private boolean a = false;
    private final Set b = new vo();
    private final Map c = new HashMap();
    private final Comparator d = new a();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(fo5 fo5Var, fo5 fo5Var2) {
            float floatValue = ((Float) fo5Var.b).floatValue();
            float floatValue2 = ((Float) fo5Var2.b).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    public void a(String str, float f) {
        if (this.a) {
            pg4 pg4Var = (pg4) this.c.get(str);
            if (pg4Var == null) {
                pg4Var = new pg4();
                this.c.put(str, pg4Var);
            }
            pg4Var.a(f);
            if (str.equals("__container")) {
                Iterator it2 = this.b.iterator();
                if (it2.hasNext()) {
                    lh4.a(it2.next());
                    throw null;
                }
            }
        }
    }

    void b(boolean z) {
        this.a = z;
    }
}
