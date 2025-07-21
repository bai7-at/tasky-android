package androidx.compose.ui.input.pointer;

import defpackage.gt2;
import defpackage.ov4;
import defpackage.zq3;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends ov4 {
    private final Object b;
    private final Object c;
    private final Object[] d;
    private final gt2 e;

    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, gt2 gt2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2, (i & 4) != 0 ? null : objArr, gt2Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!zq3.c(this.b, suspendPointerInputElement.b) || !zq3.c(this.c, suspendPointerInputElement.c)) {
            return false;
        }
        Object[] objArr = this.d;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.d;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.d != null) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ov4
    public int hashCode() {
        Object obj = this.b;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.c;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.d;
        return hashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public SuspendingPointerInputModifierNodeImpl l() {
        return new SuspendingPointerInputModifierNodeImpl(this.e);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl) {
        suspendingPointerInputModifierNodeImpl.j2(this.e);
    }

    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, gt2 gt2Var) {
        this.b = obj;
        this.c = obj2;
        this.d = objArr;
        this.e = gt2Var;
    }
}
