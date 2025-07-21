package com.google.android.gms.internal.common;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class c extends a {
    c(int i) {
        super(4);
    }

    public final c b(Object obj) {
        super.a(obj);
        return this;
    }

    public final c c(Iterator it2) {
        while (it2.hasNext()) {
            super.a(it2.next());
        }
        return this;
    }
}
