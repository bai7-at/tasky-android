package androidx.compose.runtime.saveable;

import defpackage.ea7;
import defpackage.fa7;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class SaverKt {
    private static final ea7 a = a(new gt2() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(fa7 fa7Var, Object obj) {
            return obj;
        }
    }, new ss2() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$2
        @Override // defpackage.ss2
        public final Object invoke(Object obj) {
            return obj;
        }
    });

    public static final class a implements ea7 {
        final /* synthetic */ gt2 a;
        final /* synthetic */ ss2 b;

        a(gt2 gt2Var, ss2 ss2Var) {
            this.a = gt2Var;
            this.b = ss2Var;
        }

        @Override // defpackage.ea7
        public Object a(fa7 fa7Var, Object obj) {
            return this.a.invoke(fa7Var, obj);
        }

        @Override // defpackage.ea7
        public Object b(Object obj) {
            return this.b.invoke(obj);
        }
    }

    public static final ea7 a(gt2 gt2Var, ss2 ss2Var) {
        return new a(gt2Var, ss2Var);
    }

    public static final ea7 b() {
        ea7 ea7Var = a;
        zq3.f(ea7Var, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return ea7Var;
    }
}
