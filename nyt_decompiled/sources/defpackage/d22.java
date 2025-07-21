package defpackage;

import java.lang.annotation.Annotation;
import kotlin.collections.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.EnumDescriptor;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public abstract class d22 {
    public static final KSerializer a(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr, Annotation[] annotationArr2) {
        zq3.h(str, "serialName");
        zq3.h(enumArr, "values");
        zq3.h(strArr, "names");
        zq3.h(annotationArr, "entryAnnotations");
        EnumDescriptor enumDescriptor = new EnumDescriptor(str, enumArr.length);
        if (annotationArr2 != null) {
            for (Annotation annotation : annotationArr2) {
                enumDescriptor.s(annotation);
            }
        }
        int length = enumArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r4 = enumArr[i];
            int i3 = i2 + 1;
            String str2 = (String) d.f0(strArr, i2);
            if (str2 == null) {
                str2 = r4.name();
            }
            PluginGeneratedSerialDescriptor.m(enumDescriptor, str2, false, 2, null);
            Annotation[] annotationArr3 = (Annotation[]) d.f0(annotationArr, i2);
            if (annotationArr3 != null) {
                for (Annotation annotation2 : annotationArr3) {
                    enumDescriptor.r(annotation2);
                }
            }
            i++;
            i2 = i3;
        }
        return new EnumSerializer(str, enumArr, enumDescriptor);
    }

    public static final KSerializer b(String str, Enum[] enumArr) {
        zq3.h(str, "serialName");
        zq3.h(enumArr, "values");
        return new EnumSerializer(str, enumArr);
    }
}
