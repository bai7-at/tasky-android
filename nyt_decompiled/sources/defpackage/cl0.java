package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.i;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class cl0 {
    private final String a;
    private List b;
    private final List c;
    private final Set d;
    private final List e;
    private final List f;
    private final List g;

    public cl0(String str) {
        zq3.h(str, "serialName");
        this.a = str;
        this.b = i.l();
        this.c = new ArrayList();
        this.d = new HashSet();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    public static /* synthetic */ void b(cl0 cl0Var, String str, SerialDescriptor serialDescriptor, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            list = i.l();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        cl0Var.a(str, serialDescriptor, list, z);
    }

    public final void a(String str, SerialDescriptor serialDescriptor, List list, boolean z) {
        zq3.h(str, "elementName");
        zq3.h(serialDescriptor, "descriptor");
        zq3.h(list, "annotations");
        if (this.d.add(str)) {
            this.c.add(str);
            this.e.add(serialDescriptor);
            this.f.add(list);
            this.g.add(Boolean.valueOf(z));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + this.a).toString());
    }

    public final List c() {
        return this.b;
    }

    public final List d() {
        return this.f;
    }

    public final List e() {
        return this.e;
    }

    public final List f() {
        return this.c;
    }

    public final List g() {
        return this.g;
    }

    public final void h(List list) {
        zq3.h(list, "<set-?>");
        this.b = list;
    }
}
