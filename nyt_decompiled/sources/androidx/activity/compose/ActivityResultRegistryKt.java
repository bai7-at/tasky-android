package androidx.activity.compose;

import androidx.activity.result.ActivityResultRegistry;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.y;
import defpackage.e5;
import defpackage.k5;
import defpackage.l5;
import defpackage.le4;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.x08;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistryKt {
    public static final le4 a(e5 e5Var, ss2 ss2Var, Composer composer, int i) {
        composer.z(-1408504823);
        x08 o = y.o(e5Var, composer, 8);
        x08 o2 = y.o(ss2Var, composer, (i >> 3) & 14);
        String str = (String) RememberSaveableKt.b(new Object[0], null, null, new qs2() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$key$1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                return UUID.randomUUID().toString();
            }
        }, composer, 3080, 6);
        l5 a = LocalActivityResultRegistryOwner.a.a(composer, 6);
        if (a == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        ActivityResultRegistry activityResultRegistry = a.getActivityResultRegistry();
        composer.z(-3687241);
        Object A = composer.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = new k5();
            composer.q(A);
        }
        composer.R();
        k5 k5Var = (k5) A;
        composer.z(-3687241);
        Object A2 = composer.A();
        if (A2 == aVar.a()) {
            A2 = new le4(k5Var, o);
            composer.q(A2);
        }
        composer.R();
        le4 le4Var = (le4) A2;
        py1.c(activityResultRegistry, str, e5Var, new ActivityResultRegistryKt$rememberLauncherForActivityResult$1(k5Var, activityResultRegistry, str, e5Var, o2), composer, 520);
        composer.R();
        return le4Var;
    }
}
