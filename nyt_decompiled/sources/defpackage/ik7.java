package defpackage;

import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class ik7 extends uk7 {
    private final Map a;
    public final Map b;
    private final Map c;
    private final Map d;
    private final Map e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik7(Map map, Map map2, Map map3, Map map4, Map map5) {
        super(null);
        zq3.h(map, "class2ContextualFactory");
        zq3.h(map2, "polyBase2Serializers");
        zq3.h(map3, "polyBase2DefaultSerializerProvider");
        zq3.h(map4, "polyBase2NamedSerializers");
        zq3.h(map5, "polyBase2DefaultDeserializerProvider");
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
        this.e = map5;
    }

    @Override // defpackage.uk7
    public void a(wk7 wk7Var) {
        zq3.h(wk7Var, "collector");
        for (Map.Entry entry : this.a.entrySet()) {
            lh4.a(entry.getValue());
        }
        for (Map.Entry entry2 : this.b.entrySet()) {
            vu3 vu3Var = (vu3) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                vu3 vu3Var2 = (vu3) entry3.getKey();
                KSerializer kSerializer = (KSerializer) entry3.getValue();
                zq3.f(vu3Var, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                zq3.f(vu3Var2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                zq3.f(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                wk7Var.c(vu3Var, vu3Var2, kSerializer);
            }
        }
        for (Map.Entry entry4 : this.c.entrySet()) {
            vu3 vu3Var3 = (vu3) entry4.getKey();
            ss2 ss2Var = (ss2) entry4.getValue();
            zq3.f(vu3Var3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            zq3.f(ss2Var, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            wk7Var.a(vu3Var3, (ss2) ku8.f(ss2Var, 1));
        }
        for (Map.Entry entry5 : this.e.entrySet()) {
            vu3 vu3Var4 = (vu3) entry5.getKey();
            ss2 ss2Var2 = (ss2) entry5.getValue();
            zq3.f(vu3Var4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            zq3.f(ss2Var2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            wk7Var.b(vu3Var4, (ss2) ku8.f(ss2Var2, 1));
        }
    }

    @Override // defpackage.uk7
    public KSerializer b(vu3 vu3Var, List list) {
        zq3.h(vu3Var, "kClass");
        zq3.h(list, "typeArgumentsSerializers");
        lh4.a(this.a.get(vu3Var));
        return null;
    }

    @Override // defpackage.uk7
    public ym1 d(vu3 vu3Var, String str) {
        zq3.h(vu3Var, "baseClass");
        Map map = (Map) this.d.get(vu3Var);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(str) : null;
        if (kSerializer == null) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj = this.e.get(vu3Var);
        ss2 ss2Var = ku8.m(obj, 1) ? (ss2) obj : null;
        if (ss2Var != null) {
            return (ym1) ss2Var.invoke(str);
        }
        return null;
    }

    @Override // defpackage.uk7
    public nk7 e(vu3 vu3Var, Object obj) {
        zq3.h(vu3Var, "baseClass");
        zq3.h(obj, "value");
        if (!vu3Var.b(obj)) {
            return null;
        }
        Map map = (Map) this.b.get(vu3Var);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(zt6.b(obj.getClass())) : null;
        if (kSerializer == null) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj2 = this.c.get(vu3Var);
        ss2 ss2Var = ku8.m(obj2, 1) ? (ss2) obj2 : null;
        if (ss2Var != null) {
            return (nk7) ss2Var.invoke(obj);
        }
        return null;
    }
}
