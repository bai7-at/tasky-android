package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class tuc {
    private String g;
    private String i;
    private String j;
    private boolean l;
    private String m;
    private final HashSet a = new HashSet();
    private final Bundle b = new Bundle();
    private final HashMap c = new HashMap();
    private final HashSet d = new HashSet();
    private final Bundle e = new Bundle();
    private final HashSet f = new HashSet();
    private final List h = new ArrayList();
    private int k = -1;
    private int n = 60000;

    public final void a(boolean z) {
        this.k = z ? 1 : 0;
    }

    public final void p(String str) {
        this.a.add(str);
    }

    public final void q(Class cls, Bundle bundle) {
        this.b.putBundle(cls.getName(), bundle);
    }

    public final void r(String str) {
        this.d.add(str);
    }

    public final void s(String str) {
        this.d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void t(String str) {
        this.g = str;
    }

    public final void u(boolean z) {
        this.l = z;
    }
}
