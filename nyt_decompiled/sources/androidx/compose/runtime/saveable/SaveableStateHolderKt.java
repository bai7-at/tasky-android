package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import defpackage.qs2;
import defpackage.u87;

/* loaded from: classes.dex */
public abstract class SaveableStateHolderKt {
    public static final u87 a(Composer composer, int i) {
        composer.z(15454635);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(15454635, i, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:59)");
        }
        SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) RememberSaveableKt.b(new Object[0], SaveableStateHolderImpl.d.a(), null, new qs2() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderKt$rememberSaveableStateHolder$1
            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SaveableStateHolderImpl mo865invoke() {
                return new SaveableStateHolderImpl(null, 1, null);
            }
        }, composer, 3080, 4);
        saveableStateHolderImpl.i((a) composer.m(SaveableStateRegistryKt.b()));
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return saveableStateHolderImpl;
    }
}
