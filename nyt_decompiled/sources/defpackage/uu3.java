package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.reflect.KVisibility;

/* loaded from: classes5.dex */
public interface uu3 extends tu3 {
    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    mv3 getReturnType();

    List getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
