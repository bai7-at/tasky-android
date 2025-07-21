package defpackage;

import androidx.compose.runtime.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class z26 {
    private final List a;

    public z26(List list) {
        this.a = list;
    }

    public final void a(int i) {
        if (!this.a.isEmpty()) {
            if (((Number) this.a.get(0)).intValue() == i) {
                return;
            }
            if (((Number) this.a.get(r0.size() - 1)).intValue() == i) {
                return;
            }
        }
        int size = this.a.size();
        this.a.add(Integer.valueOf(i));
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int intValue = ((Number) this.a.get(i2)).intValue();
            if (i <= intValue) {
                break;
            }
            this.a.set(size, Integer.valueOf(intValue));
            size = i2;
        }
        this.a.set(size, Integer.valueOf(i));
    }

    public final boolean b() {
        return !this.a.isEmpty();
    }

    public final int c() {
        return ((Number) i.k0(this.a)).intValue();
    }

    public final int d() {
        int intValue;
        if (!(this.a.size() > 0)) {
            b.t("Set is empty");
            throw new KotlinNothingValueException();
        }
        int intValue2 = ((Number) this.a.get(0)).intValue();
        while (!this.a.isEmpty() && ((Number) this.a.get(0)).intValue() == intValue2) {
            List list = this.a;
            list.set(0, i.w0(list));
            List list2 = this.a;
            list2.remove(list2.size() - 1);
            int size = this.a.size();
            int size2 = this.a.size() >>> 1;
            int i = 0;
            while (i < size2) {
                int intValue3 = ((Number) this.a.get(i)).intValue();
                int i2 = (i + 1) * 2;
                int i3 = i2 - 1;
                int intValue4 = ((Number) this.a.get(i3)).intValue();
                if (i2 >= size || (intValue = ((Number) this.a.get(i2)).intValue()) <= intValue4) {
                    if (intValue4 > intValue3) {
                        this.a.set(i, Integer.valueOf(intValue4));
                        this.a.set(i3, Integer.valueOf(intValue3));
                        i = i3;
                    }
                } else if (intValue > intValue3) {
                    this.a.set(i, Integer.valueOf(intValue));
                    this.a.set(i2, Integer.valueOf(intValue3));
                    i = i2;
                }
            }
        }
        return intValue2;
    }

    public /* synthetic */ z26(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
