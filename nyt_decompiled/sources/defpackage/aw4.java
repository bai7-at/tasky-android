package defpackage;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class aw4 {
    private long a;
    private final SparseLongArray b = new SparseLongArray();
    private final SparseBooleanArray c = new SparseBooleanArray();
    private final List d = new ArrayList();
    private int e = -1;
    private int f = -1;

    private final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.b;
                long j = this.a;
                this.a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.b;
            long j2 = this.a;
            this.a = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.c.put(pointerId2, true);
            }
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.e && source == this.f) {
            return;
        }
        this.e = toolType;
        this.f = source;
        this.c.clear();
        this.b.clear();
    }

    private final yx5 d(d06 d06Var, MotionEvent motionEvent, int i, boolean z) {
        long a;
        long l;
        long f = f(motionEvent.getPointerId(i));
        float pressure = motionEvent.getPressure(i);
        long i2 = fd5.i(hd5.a(motionEvent.getX(i), motionEvent.getY(i)), 0.0f, 0.0f, 3, null);
        if (i == 0) {
            a = hd5.a(motionEvent.getRawX(), motionEvent.getRawY());
            l = d06Var.l(a);
        } else {
            a = cw4.a.a(motionEvent, i);
            l = d06Var.l(a);
        }
        long j = a;
        long j2 = l;
        int toolType = motionEvent.getToolType(i);
        int e = toolType != 0 ? toolType != 1 ? toolType != 2 ? toolType != 3 ? toolType != 4 ? iy5.a.e() : iy5.a.a() : iy5.a.b() : iy5.a.c() : iy5.a.d() : iy5.a.e();
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        for (int i3 = 0; i3 < historySize; i3++) {
            float historicalX = motionEvent.getHistoricalX(i, i3);
            float historicalY = motionEvent.getHistoricalY(i, i3);
            if (!Float.isInfinite(historicalX) && !Float.isNaN(historicalX) && !Float.isInfinite(historicalY) && !Float.isNaN(historicalY)) {
                long a2 = hd5.a(historicalX, historicalY);
                arrayList.add(new x83(motionEvent.getHistoricalEventTime(i3), a2, a2, null));
            }
        }
        return new yx5(f, motionEvent.getEventTime(), j, j2, z, pressure, e, this.c.get(motionEvent.getPointerId(i), false), arrayList, motionEvent.getActionMasked() == 8 ? hd5.a(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f) : fd5.b.c(), i2, null);
    }

    private final long f(int i) {
        long j;
        int indexOfKey = this.b.indexOfKey(i);
        if (indexOfKey >= 0) {
            j = this.b.valueAt(indexOfKey);
        } else {
            long j2 = this.a;
            this.a = 1 + j2;
            this.b.put(i, j2);
            j = j2;
        }
        return tx5.b(j);
    }

    private final boolean g(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    private final void h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.c.get(pointerId, false)) {
                this.b.delete(pointerId);
                this.c.delete(pointerId);
            }
        }
        if (this.b.size() > motionEvent.getPointerCount()) {
            for (int size = this.b.size() - 1; -1 < size; size--) {
                int keyAt = this.b.keyAt(size);
                if (!g(motionEvent, keyAt)) {
                    this.b.removeAt(size);
                    this.c.delete(keyAt);
                }
            }
        }
    }

    public final xx5 c(MotionEvent motionEvent, d06 d06Var) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.b.clear();
            this.c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z2 = actionMasked == 8;
        if (z) {
            this.c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        while (i < pointerCount) {
            this.d.add(d(d06Var, motionEvent, i, (z || i == actionIndex || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
            i++;
        }
        h(motionEvent);
        return new xx5(motionEvent.getEventTime(), this.d, motionEvent);
    }

    public final void e(int i) {
        this.c.delete(i);
        this.b.delete(i);
    }
}
