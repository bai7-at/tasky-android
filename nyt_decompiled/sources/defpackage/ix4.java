package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
final class ix4 implements t84 {
    private static final Logger b = Logger.getLogger(ix4.class.getName());
    private final t84[] a;

    private ix4(t84[] t84VarArr) {
        this.a = t84VarArr;
    }

    static t84 a(List list) {
        return new ix4((t84[]) list.toArray(new t84[0]));
    }

    @Override // defpackage.t84
    public gq0 export(Collection collection) {
        ArrayList arrayList = new ArrayList(this.a.length);
        for (t84 t84Var : this.a) {
            try {
                arrayList.add(t84Var.export(collection));
            } catch (RuntimeException e) {
                b.log(Level.WARNING, "Exception thrown by the export.", (Throwable) e);
                arrayList.add(gq0.h());
            }
        }
        return gq0.g(arrayList);
    }

    @Override // defpackage.t84
    public gq0 shutdown() {
        ArrayList arrayList = new ArrayList(this.a.length);
        for (t84 t84Var : this.a) {
            try {
                arrayList.add(t84Var.shutdown());
            } catch (RuntimeException e) {
                b.log(Level.WARNING, "Exception thrown by the shutdown.", (Throwable) e);
                arrayList.add(gq0.h());
            }
        }
        return gq0.g(arrayList);
    }

    public String toString() {
        return "MultiLogRecordExporter{logRecordExporters=" + Arrays.toString(this.a) + '}';
    }
}
