package kotlinx.coroutines.internal;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.an3;
import defpackage.qm3;
import defpackage.ss2;
import defpackage.uo6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class OnDemandAllocatingPool<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater controlState$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(OnDemandAllocatingPool.class, "controlState$volatile");
    private volatile /* synthetic */ int controlState$volatile;
    private final ss2 create;
    private final /* synthetic */ AtomicReferenceArray elements;
    private final int maxCapacity;

    public OnDemandAllocatingPool(int i, ss2 ss2Var) {
        this.maxCapacity = i;
        this.create = ss2Var;
        this.elements = new AtomicReferenceArray(i);
    }

    private final /* synthetic */ int getControlState$volatile() {
        return this.controlState$volatile;
    }

    private final /* synthetic */ AtomicReferenceArray getElements() {
        return this.elements;
    }

    private final boolean isClosed(int i) {
        return (Integer.MIN_VALUE & i) != 0;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, ss2 ss2Var) {
        while (true) {
            ss2Var.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void setControlState$volatile(int i) {
        this.controlState$volatile = i;
    }

    private final int tryForbidNewElements() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                return 0;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i, Integer.MIN_VALUE | i));
        return i;
    }

    public final boolean allocate() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((Integer.MIN_VALUE & i) != 0) {
                return false;
            }
            if (i >= this.maxCapacity) {
                return true;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i, i + 1));
        getElements().set(i, this.create.invoke(Integer.valueOf(i)));
        return true;
    }

    public final List<T> close() {
        int i;
        Object andSet;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        while (true) {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                i = 0;
                break;
            }
            if (controlState$volatile$FU.compareAndSet(this, i, Integer.MIN_VALUE | i)) {
                break;
            }
        }
        an3 u = uo6.u(0, i);
        ArrayList arrayList = new ArrayList(i.w(u, 10));
        Iterator<T> it2 = u.iterator();
        while (it2.hasNext()) {
            int c = ((qm3) it2).c();
            do {
                andSet = getElements().getAndSet(c, null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    public final String stateRepresentation$kotlinx_coroutines_core() {
        int i = controlState$volatile$FU.get(this);
        an3 u = uo6.u(0, Integer.MAX_VALUE & i);
        ArrayList arrayList = new ArrayList(i.w(u, 10));
        Iterator<T> it2 = u.iterator();
        while (it2.hasNext()) {
            arrayList.add(getElements().get(((qm3) it2).c()));
        }
        return arrayList.toString() + ((i & RecyclerView.UNDEFINED_DURATION) != 0 ? "[closed]" : "");
    }

    public String toString() {
        return "OnDemandAllocatingPool(" + stateRepresentation$kotlinx_coroutines_core() + ')';
    }
}
