package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.y;
import defpackage.cs0;
import defpackage.ea7;
import defpackage.py1;
import defpackage.qs2;
import defpackage.sw7;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class RememberSaveableKt {
    private static final int a = 36;

    public static final Object b(final Object[] objArr, ea7 ea7Var, String str, qs2 qs2Var, Composer composer, int i, int i2) {
        Object e;
        composer.z(441892779);
        if ((i2 & 2) != 0) {
            ea7Var = SaverKt.b();
        }
        Object obj = null;
        if ((i2 & 4) != 0) {
            str = null;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(441892779, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
        }
        int a2 = cs0.a(composer, 0);
        if (str == null || str.length() == 0) {
            str = Integer.toString(a2, kotlin.text.a.a(a));
            zq3.g(str, "toString(this, checkRadix(radix))");
        }
        zq3.f(ea7Var, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final a aVar = (a) composer.m(SaveableStateRegistryKt.b());
        composer.z(-492369756);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            if (aVar != null && (e = aVar.e(str)) != null) {
                obj = ea7Var.b(e);
            }
            A = new SaveableHolder(ea7Var, aVar, str, obj == null ? qs2Var.mo865invoke() : obj, objArr);
            composer.q(A);
        }
        composer.R();
        final SaveableHolder saveableHolder = (SaveableHolder) A;
        Object g = saveableHolder.g(objArr);
        if (g == null) {
            g = qs2Var.mo865invoke();
        }
        final ea7 ea7Var2 = ea7Var;
        final String str2 = str;
        final Object obj2 = g;
        py1.h(new qs2() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m59invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m59invoke() {
                SaveableHolder.this.i(ea7Var2, aVar, str2, obj2, objArr);
            }
        }, composer, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a aVar, Object obj) {
        String str;
        if (obj == null || aVar.a(obj)) {
            return;
        }
        if (obj instanceof sw7) {
            sw7 sw7Var = (sw7) obj;
            if (sw7Var.c() == y.k() || sw7Var.c() == y.q() || sw7Var.c() == y.n()) {
                str = "MutableState containing " + sw7Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            str = obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        throw new IllegalArgumentException(str);
    }
}
