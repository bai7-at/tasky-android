package defpackage;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SerializationException;

/* loaded from: classes5.dex */
public abstract class u1 {
    public static final Void a(vu3 vu3Var, vu3 vu3Var2) {
        zq3.h(vu3Var, "subClass");
        zq3.h(vu3Var2, "baseClass");
        String d = vu3Var.d();
        if (d == null) {
            d = String.valueOf(vu3Var);
        }
        b(d, vu3Var2);
        throw new KotlinNothingValueException();
    }

    public static final Void b(String str, vu3 vu3Var) {
        String str2;
        zq3.h(vu3Var, "baseClass");
        String str3 = "in the scope of '" + vu3Var.d() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default polymorphic serializers were registered " + str3;
        } else {
            str2 = "Class '" + str + "' is not registered for polymorphic serialization " + str3 + ".\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + vu3Var.d() + "' has to be sealed and '@Serializable'.\nAlternatively, register the serializer for '" + str + "' explicitly in a corresponding SerializersModule.";
        }
        throw new SerializationException(str2);
    }
}
