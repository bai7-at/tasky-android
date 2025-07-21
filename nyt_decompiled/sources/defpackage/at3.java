package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.json.internal.b;
import kotlinx.serialization.json.internal.k;

/* loaded from: classes5.dex */
public abstract class at3 implements b48 {
    public static final a d = new a(null);
    private final gt3 a;
    private final uk7 b;
    private final b c;

    public static final class a extends at3 {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(new gt3(false, false, false, false, false, false, null, false, false, null, false, false, null, false, 16383, null), vk7.a(), null);
        }
    }

    public /* synthetic */ at3(gt3 gt3Var, uk7 uk7Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(gt3Var, uk7Var);
    }

    @Override // defpackage.gk7
    public uk7 a() {
        return this.b;
    }

    @Override // defpackage.b48
    public final String b(nk7 nk7Var, Object obj) {
        zq3.h(nk7Var, "serializer");
        gu3 gu3Var = new gu3();
        try {
            fu3.b(this, gu3Var, nk7Var, obj);
            return gu3Var.toString();
        } finally {
            gu3Var.h();
        }
    }

    @Override // defpackage.b48
    public final Object c(ym1 ym1Var, String str) {
        zq3.h(ym1Var, "deserializer");
        zq3.h(str, "string");
        f48 f48Var = new f48(str);
        Object z = new s38(this, WriteMode.OBJ, f48Var, ym1Var.getDescriptor(), null).z(ym1Var);
        f48Var.x();
        return z;
    }

    public final Object d(ym1 ym1Var, JsonElement jsonElement) {
        zq3.h(ym1Var, "deserializer");
        zq3.h(jsonElement, "element");
        return k.a(this, jsonElement, ym1Var);
    }

    public final gt3 e() {
        return this.a;
    }

    public final b f() {
        return this.c;
    }

    private at3(gt3 gt3Var, uk7 uk7Var) {
        this.a = gt3Var;
        this.b = uk7Var;
        this.c = new b();
    }
}
