package defpackage;

/* loaded from: classes5.dex */
public abstract class ou3 {
    public static final Class a(vu3 vu3Var) {
        zq3.h(vu3Var, "<this>");
        Class a = ((al0) vu3Var).a();
        zq3.f(a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class b(vu3 vu3Var) {
        zq3.h(vu3Var, "<this>");
        Class a = ((al0) vu3Var).a();
        if (!a.isPrimitive()) {
            zq3.f(a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return a;
        }
        String name = a.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    a = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    a = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    a = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    a = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    a = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    a = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    a = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    a = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    a = Short.class;
                    break;
                }
                break;
        }
        zq3.f(a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return a;
    }

    public static final vu3 c(Class cls) {
        zq3.h(cls, "<this>");
        return zt6.b(cls);
    }
}
