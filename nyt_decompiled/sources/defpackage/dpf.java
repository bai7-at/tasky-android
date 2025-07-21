package defpackage;

import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzvn;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class dpf {
    private final Class a;
    private final Map b;
    private final Class c;

    protected dpf(Class cls, zqf... zqfVarArr) {
        this.a = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            zqf zqfVar = zqfVarArr[i];
            if (hashMap.containsKey(zqfVar.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zqfVar.b().getCanonicalName())));
            }
            hashMap.put(zqfVar.b(), zqfVar);
        }
        this.c = zqfVarArr[0].b();
        this.b = Collections.unmodifiableMap(hashMap);
    }

    public kof a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzvn b();

    public abstract zx9 c(zzaby zzabyVar);

    public abstract String d();

    public abstract void e(zx9 zx9Var);

    public int f() {
        return 1;
    }

    public final Class g() {
        return this.c;
    }

    public final Class h() {
        return this.a;
    }

    public final Object i(zx9 zx9Var, Class cls) {
        zqf zqfVar = (zqf) this.b.get(cls);
        if (zqfVar != null) {
            return zqfVar.a(zx9Var);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public final Set j() {
        return this.b.keySet();
    }
}
