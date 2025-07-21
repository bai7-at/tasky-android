package androidx.compose.ui.semantics;

import defpackage.gt2;
import defpackage.iv3;
import defpackage.lj7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class SemanticsPropertyKey {
    public static final int d = 8;
    private final String a;
    private final gt2 b;
    private boolean c;

    public SemanticsPropertyKey(String str, gt2 gt2Var) {
        this.a = str;
        this.b = gt2Var;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.c;
    }

    public final Object c(Object obj, Object obj2) {
        return this.b.invoke(obj, obj2);
    }

    public final void d(lj7 lj7Var, iv3 iv3Var, Object obj) {
        lj7Var.a(this, obj);
    }

    public String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ SemanticsPropertyKey(String str, gt2 gt2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new gt2() { // from class: androidx.compose.ui.semantics.SemanticsPropertyKey.1
            @Override // defpackage.gt2
            public final Object invoke(Object obj, Object obj2) {
                return obj == null ? obj2 : obj;
            }
        } : gt2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(String str, boolean z) {
        this(str, null, 2, 0 == true ? 1 : 0);
        this.c = z;
    }

    public SemanticsPropertyKey(String str, boolean z, gt2 gt2Var) {
        this(str, gt2Var);
        this.c = z;
    }
}
