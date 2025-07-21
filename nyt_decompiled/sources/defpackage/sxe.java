package defpackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class sxe {
    private ArrayList a = new ArrayList();
    private pxe b = pxe.b;
    private Integer c = null;

    public final sxe a(dle dleVar, int i, String str, String str2) {
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new vxe(dleVar, i, str, str2, null));
        return this;
    }

    public final sxe b(pxe pxeVar) {
        if (this.a == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.b = pxeVar;
        return this;
    }

    public final sxe c(int i) {
        if (this.a == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.c = Integer.valueOf(i);
        return this;
    }

    public final xxe d() {
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
                int a = ((vxe) arrayList.get(i)).a();
                i++;
                if (a == intValue) {
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        xxe xxeVar = new xxe(this.b, Collections.unmodifiableList(this.a), this.c, null);
        this.a = null;
        return xxeVar;
    }
}
