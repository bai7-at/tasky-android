package defpackage;

import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.ee3;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public final class fc5 extends ee3.a {
    private final Object a;

    private fc5(Object obj) {
        this.a = obj;
    }

    public static Object Q1(ee3 ee3Var) {
        if (ee3Var instanceof fc5) {
            return ((fc5) ee3Var).a;
        }
        IBinder asBinder = ee3Var.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        Preconditions.checkNotNull(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }

    public static ee3 l3(Object obj) {
        return new fc5(obj);
    }
}
