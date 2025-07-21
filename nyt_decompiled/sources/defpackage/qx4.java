package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
final class qx4 implements ey7 {
    private static final Logger b = Logger.getLogger(qx4.class.getName());
    private final ey7[] a;

    private qx4(ey7[] ey7VarArr) {
        this.a = ey7VarArr;
    }

    static ey7 a(List list) {
        return new qx4((ey7[]) list.toArray(new ey7[0]));
    }

    @Override // defpackage.ey7
    public gq0 export(Collection collection) {
        ArrayList arrayList = new ArrayList(this.a.length);
        for (ey7 ey7Var : this.a) {
            try {
                arrayList.add(ey7Var.export(collection));
            } catch (RuntimeException e) {
                b.log(Level.WARNING, "Exception thrown by the export.", (Throwable) e);
                arrayList.add(gq0.h());
            }
        }
        return gq0.g(arrayList);
    }

    @Override // defpackage.ey7
    public gq0 shutdown() {
        ArrayList arrayList = new ArrayList(this.a.length);
        for (ey7 ey7Var : this.a) {
            try {
                arrayList.add(ey7Var.shutdown());
            } catch (RuntimeException e) {
                b.log(Level.WARNING, "Exception thrown by the shutdown.", (Throwable) e);
                arrayList.add(gq0.h());
            }
        }
        return gq0.g(arrayList);
    }

    public String toString() {
        return "MultiSpanExporter{spanExporters=" + Arrays.toString(this.a) + '}';
    }
}
