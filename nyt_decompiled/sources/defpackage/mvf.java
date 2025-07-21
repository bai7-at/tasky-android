package defpackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class mvf {
    private ArrayList a = new ArrayList();
    private gvf b = gvf.b;
    private Integer c = null;

    public final mvf a(ubf ubfVar, int i, hcf hcfVar) {
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new qvf(ubfVar, i, hcfVar, null));
        return this;
    }

    public final mvf b(gvf gvfVar) {
        if (this.a == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.b = gvfVar;
        return this;
    }

    public final mvf c(int i) {
        if (this.a == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.c = Integer.valueOf(i);
        return this;
    }

    public final uvf d() {
        if (this.a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.c;
        if (num != null) {
            int intValue = num.intValue();
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (((qvf) arrayList.get(i)).a() != intValue) {
                    i = i2;
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        uvf uvfVar = new uvf(this.b, Collections.unmodifiableList(this.a), this.c, null);
        this.a = null;
        return uvfVar;
    }
}
