package defpackage;

import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
class l11 {
    private final String a;
    private final ue2 b;

    public l11(String str, ue2 ue2Var) {
        this.a = str;
        this.b = ue2Var;
    }

    private File b() {
        return this.b.d(this.a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e) {
            m94.f().e("Error creating marker: " + this.a, e);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
