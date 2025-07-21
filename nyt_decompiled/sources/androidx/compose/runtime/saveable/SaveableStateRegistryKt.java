package androidx.compose.runtime.saveable;

import androidx.compose.runtime.CompositionLocalKt;
import defpackage.m76;
import defpackage.qs2;
import defpackage.ss2;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class SaveableStateRegistryKt {
    private static final m76 a = CompositionLocalKt.e(new qs2() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryKt$LocalSaveableStateRegistry$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a mo865invoke() {
            return null;
        }
    });

    public static final a a(Map map, ss2 ss2Var) {
        return new b(map, ss2Var);
    }

    public static final m76 b() {
        return a;
    }
}
