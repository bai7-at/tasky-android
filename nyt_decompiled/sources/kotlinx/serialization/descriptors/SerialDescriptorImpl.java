package kotlinx.serialization.descriptors;

import com.facebook.AuthenticationTokenClaims;
import defpackage.bj3;
import defpackage.c04;
import defpackage.cl0;
import defpackage.cv5;
import defpackage.du8;
import defpackage.hk7;
import defpackage.qs2;
import defpackage.sg0;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.xv5;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.c;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class SerialDescriptorImpl implements SerialDescriptor, sg0 {
    private final String a;
    private final hk7 b;
    private final int c;
    private final List d;
    private final Set e;
    private final String[] f;
    private final SerialDescriptor[] g;
    private final List[] h;
    private final boolean[] i;
    private final Map j;
    private final SerialDescriptor[] k;
    private final c04 l;

    public SerialDescriptorImpl(String str, hk7 hk7Var, int i, List list, cl0 cl0Var) {
        zq3.h(str, "serialName");
        zq3.h(hk7Var, "kind");
        zq3.h(list, "typeParameters");
        zq3.h(cl0Var, "builder");
        this.a = str;
        this.b = hk7Var;
        this.c = i;
        this.d = cl0Var.c();
        this.e = i.V0(cl0Var.f());
        String[] strArr = (String[]) cl0Var.f().toArray(new String[0]);
        this.f = strArr;
        this.g = cv5.b(cl0Var.e());
        this.h = (List[]) cl0Var.d().toArray(new List[0]);
        this.i = i.Q0(cl0Var.g());
        Iterable<bj3> G0 = d.G0(strArr);
        ArrayList arrayList = new ArrayList(i.w(G0, 10));
        for (bj3 bj3Var : G0) {
            arrayList.add(du8.a(bj3Var.b(), Integer.valueOf(bj3Var.a())));
        }
        this.j = t.t(arrayList);
        this.k = cv5.b(list);
        this.l = c.a(new qs2() { // from class: kotlinx.serialization.descriptors.SerialDescriptorImpl$_hashCode$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Integer mo865invoke() {
                SerialDescriptor[] serialDescriptorArr;
                SerialDescriptorImpl serialDescriptorImpl = SerialDescriptorImpl.this;
                serialDescriptorArr = serialDescriptorImpl.k;
                return Integer.valueOf(xv5.a(serialDescriptorImpl, serialDescriptorArr));
            }
        });
    }

    private final int l() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.sg0
    public Set a() {
        return this.e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean b() {
        return SerialDescriptor.a.c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int c(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public hk7 d() {
        return this.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof SerialDescriptorImpl) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (zq3.c(i(), serialDescriptor.i()) && Arrays.equals(this.k, ((SerialDescriptorImpl) obj).k) && e() == serialDescriptor.e()) {
                int e = e();
                for (0; i < e; i + 1) {
                    i = (zq3.c(h(i).i(), serialDescriptor.h(i).i()) && zq3.c(h(i).d(), serialDescriptor.h(i).d())) ? i + 1 : 0;
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String f(int i) {
        return this.f[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List g(int i) {
        return this.h[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List getAnnotations() {
        return this.d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor h(int i) {
        return this.g[i];
    }

    public int hashCode() {
        return l();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String i() {
        return this.a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.a.b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean j(int i) {
        return this.i[i];
    }

    public String toString() {
        return i.u0(uo6.u(0, e()), ", ", i() + '(', ")", 0, null, new ss2() { // from class: kotlinx.serialization.descriptors.SerialDescriptorImpl$toString$1
            {
                super(1);
            }

            public final CharSequence b(int i) {
                return SerialDescriptorImpl.this.f(i) + ": " + SerialDescriptorImpl.this.h(i).i();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).intValue());
            }
        }, 24, null);
    }
}
