package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class wr8 {
    public View b;
    public final Map a = new HashMap();
    final ArrayList c = new ArrayList();

    public wr8(View view) {
        this.b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wr8)) {
            return false;
        }
        wr8 wr8Var = (wr8) obj;
        return this.b == wr8Var.b && this.a.equals(wr8Var.a);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n") + "    values:";
        for (String str2 : this.a.keySet()) {
            str = str + "    " + str2 + ": " + this.a.get(str2) + "\n";
        }
        return str;
    }
}
