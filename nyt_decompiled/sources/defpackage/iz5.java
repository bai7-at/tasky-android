package defpackage;

import defpackage.hk7;
import java.lang.annotation.Annotation;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.k;

/* loaded from: classes5.dex */
public abstract class iz5 {
    public static final void b(hk7 hk7Var) {
        zq3.h(hk7Var, "kind");
        if (hk7Var instanceof hk7.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (hk7Var instanceof r26) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (hk7Var instanceof hz5) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(SerialDescriptor serialDescriptor, at3 at3Var) {
        zq3.h(serialDescriptor, "<this>");
        zq3.h(at3Var, "json");
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof ft3) {
                return ((ft3) annotation).discriminator();
            }
        }
        return at3Var.e().c();
    }

    public static final Object d(lt3 lt3Var, ym1 ym1Var) {
        JsonPrimitive j;
        zq3.h(lt3Var, "<this>");
        zq3.h(ym1Var, "deserializer");
        if (!(ym1Var instanceof t1) || lt3Var.d().e().m()) {
            return ym1Var.deserialize(lt3Var);
        }
        String c = c(ym1Var.getDescriptor(), lt3Var.d());
        JsonElement h = lt3Var.h();
        SerialDescriptor descriptor = ym1Var.getDescriptor();
        if (h instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) h;
            JsonElement jsonElement = (JsonElement) jsonObject.get(c);
            String a = (jsonElement == null || (j = nt3.j(jsonElement)) == null) ? null : j.a();
            ym1 c2 = ((t1) ym1Var).c(lt3Var, a);
            if (c2 != null) {
                return k.b(lt3Var.d(), c, jsonObject, c2);
            }
            e(a, jsonObject);
            throw new KotlinNothingValueException();
        }
        throw qt3.e(-1, "Expected " + zt6.b(JsonObject.class) + " as the serialized body of " + descriptor.i() + ", but had " + zt6.b(h.getClass()));
    }

    public static final Void e(String str, JsonObject jsonObject) {
        String str2;
        zq3.h(jsonObject, "jsonTree");
        if (str == null) {
            str2 = "missing class discriminator ('null')";
        } else {
            str2 = "class discriminator '" + str + '\'';
        }
        throw qt3.f(-1, "Polymorphic serializer was not found for " + str2, jsonObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(nk7 nk7Var, nk7 nk7Var2, String str) {
        if ((nk7Var instanceof SealedClassSerializer) && st3.a(nk7Var2.getDescriptor()).contains(str)) {
            String i = nk7Var.getDescriptor().i();
            throw new IllegalStateException(("Sealed class '" + nk7Var2.getDescriptor().i() + "' cannot be serialized as base class '" + i + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
