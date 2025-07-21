package kotlinx.serialization.internal;

import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.api.cms.Tag;
import defpackage.c04;
import defpackage.cv5;
import defpackage.hk7;
import defpackage.jx2;
import defpackage.qs2;
import defpackage.sg0;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.xv5;
import defpackage.yv5;
import defpackage.zq3;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.a;

/* loaded from: classes5.dex */
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, sg0 {
    private final String a;
    private final jx2 b;
    private final int c;
    private int d;
    private final String[] e;
    private final List[] f;
    private List g;
    private final boolean[] h;
    private Map i;
    private final c04 j;
    private final c04 k;
    private final c04 l;

    public PluginGeneratedSerialDescriptor(String str, jx2 jx2Var, int i) {
        zq3.h(str, "serialName");
        this.a = str;
        this.b = jx2Var;
        this.c = i;
        this.d = -1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.h = new boolean[i3];
        this.i = t.i();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.j = kotlin.c.b(lazyThreadSafetyMode, new qs2() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$childSerializers$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final KSerializer[] mo865invoke() {
                jx2 jx2Var2;
                KSerializer[] childSerializers;
                jx2Var2 = PluginGeneratedSerialDescriptor.this.b;
                return (jx2Var2 == null || (childSerializers = jx2Var2.childSerializers()) == null) ? yv5.a : childSerializers;
            }
        });
        this.k = kotlin.c.b(lazyThreadSafetyMode, new qs2() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$typeParameterDescriptors$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SerialDescriptor[] mo865invoke() {
                jx2 jx2Var2;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                jx2Var2 = PluginGeneratedSerialDescriptor.this.b;
                if (jx2Var2 == null || (typeParametersSerializers = jx2Var2.typeParametersSerializers()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(typeParametersSerializers.length);
                    for (KSerializer kSerializer : typeParametersSerializers) {
                        arrayList.add(kSerializer.getDescriptor());
                    }
                }
                return cv5.b(arrayList);
            }
        });
        this.l = kotlin.c.b(lazyThreadSafetyMode, new qs2() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$_hashCode$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Integer mo865invoke() {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = PluginGeneratedSerialDescriptor.this;
                return Integer.valueOf(xv5.a(pluginGeneratedSerialDescriptor, pluginGeneratedSerialDescriptor.p()));
            }
        });
    }

    public static /* synthetic */ void m(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        pluginGeneratedSerialDescriptor.l(str, z);
    }

    private final Map n() {
        HashMap hashMap = new HashMap();
        int length = this.e.length;
        for (int i = 0; i < length; i++) {
            hashMap.put(this.e[i], Integer.valueOf(i));
        }
        return hashMap;
    }

    private final KSerializer[] o() {
        return (KSerializer[]) this.j.getValue();
    }

    private final int q() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.sg0
    public Set a() {
        return this.i.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean b() {
        return SerialDescriptor.a.c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int c(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        Integer num = (Integer) this.i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public hk7 d() {
        return a.C0501a.a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginGeneratedSerialDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (zq3.c(i(), serialDescriptor.i()) && Arrays.equals(p(), ((PluginGeneratedSerialDescriptor) obj).p()) && e() == serialDescriptor.e()) {
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
        return this.e[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List g(int i) {
        List list = this.f[i];
        return list == null ? kotlin.collections.i.l() : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public List getAnnotations() {
        List list = this.g;
        return list == null ? kotlin.collections.i.l() : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor h(int i) {
        return o()[i].getDescriptor();
    }

    public int hashCode() {
        return q();
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
        return this.h[i];
    }

    public final void l(String str, boolean z) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        String[] strArr = this.e;
        int i = this.d + 1;
        this.d = i;
        strArr[i] = str;
        this.h[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            this.i = n();
        }
    }

    public final SerialDescriptor[] p() {
        return (SerialDescriptor[]) this.k.getValue();
    }

    public final void r(Annotation annotation) {
        zq3.h(annotation, "annotation");
        List list = this.f[this.d];
        if (list == null) {
            list = new ArrayList(1);
            this.f[this.d] = list;
        }
        list.add(annotation);
    }

    public final void s(Annotation annotation) {
        zq3.h(annotation, Tag.A);
        if (this.g == null) {
            this.g = new ArrayList(1);
        }
        List list = this.g;
        zq3.e(list);
        list.add(annotation);
    }

    public String toString() {
        return kotlin.collections.i.u0(uo6.u(0, this.c), ", ", i() + '(', ")", 0, null, new ss2() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$toString$1
            {
                super(1);
            }

            public final CharSequence b(int i) {
                return PluginGeneratedSerialDescriptor.this.f(i) + ": " + PluginGeneratedSerialDescriptor.this.h(i).i();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return b(((Number) obj).intValue());
            }
        }, 24, null);
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, jx2 jx2Var, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : jx2Var, i);
    }
}
