package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class kge {
    private final String a;
    private final ige b;
    private ige c;

    /* synthetic */ kge(String str, jge jgeVar) {
        ige igeVar = new ige();
        this.b = igeVar;
        this.c = igeVar;
        str.getClass();
        this.a = str;
    }

    public final kge a(Object obj) {
        ige igeVar = new ige();
        this.c.b = igeVar;
        this.c = igeVar;
        igeVar.a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        ige igeVar = this.b.b;
        String str = "";
        while (igeVar != null) {
            Object obj = igeVar.a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
            }
            igeVar = igeVar.b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
