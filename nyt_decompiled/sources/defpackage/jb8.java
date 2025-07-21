package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes5.dex */
public final class jb8 implements gb8 {
    private LinkedList a;
    private volatile boolean b;

    public jb8() {
    }

    private static void c(Collection collection) {
        if (collection == null) {
            return;
        }
        Iterator it2 = collection.iterator();
        ArrayList arrayList = null;
        while (it2.hasNext()) {
            try {
                ((gb8) it2.next()).unsubscribe();
            } catch (Throwable th) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        e62.c(arrayList);
    }

    public void a(gb8 gb8Var) {
        if (gb8Var.isUnsubscribed()) {
            return;
        }
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        LinkedList linkedList = this.a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.a = linkedList;
                        }
                        linkedList.add(gb8Var);
                        return;
                    }
                } finally {
                }
            }
        }
        gb8Var.unsubscribe();
    }

    public void b(gb8 gb8Var) {
        if (this.b) {
            return;
        }
        synchronized (this) {
            LinkedList linkedList = this.a;
            if (!this.b && linkedList != null) {
                boolean remove = linkedList.remove(gb8Var);
                if (remove) {
                    gb8Var.unsubscribe();
                }
            }
        }
    }

    @Override // defpackage.gb8
    public boolean isUnsubscribed() {
        return this.b;
    }

    @Override // defpackage.gb8
    public void unsubscribe() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                LinkedList linkedList = this.a;
                this.a = null;
                c(linkedList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public jb8(gb8... gb8VarArr) {
        this.a = new LinkedList(Arrays.asList(gb8VarArr));
    }

    public jb8(gb8 gb8Var) {
        LinkedList linkedList = new LinkedList();
        this.a = linkedList;
        linkedList.add(gb8Var);
    }
}
