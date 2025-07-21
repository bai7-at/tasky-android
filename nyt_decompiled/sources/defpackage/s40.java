package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
abstract class s40 implements sh {
    final List a;

    s40(List list) {
        this.a = list;
    }

    @Override // defpackage.sh
    public List b() {
        return this.a;
    }

    @Override // defpackage.sh
    public boolean c() {
        if (this.a.isEmpty()) {
            return true;
        }
        return this.a.size() == 1 && ((rw3) this.a.get(0)).i();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }
}
