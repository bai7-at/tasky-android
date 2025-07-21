package defpackage;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.b;
import androidx.datastore.preferences.c;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import com.facebook.AuthenticationTokenClaims;
import defpackage.s16;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class w16 implements rk7 {
    public static final w16 a = new w16();
    private static final String b = "preferences_pb";

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PreferencesProto$Value.ValueCase.values().length];
            iArr[PreferencesProto$Value.ValueCase.BOOLEAN.ordinal()] = 1;
            iArr[PreferencesProto$Value.ValueCase.FLOAT.ordinal()] = 2;
            iArr[PreferencesProto$Value.ValueCase.DOUBLE.ordinal()] = 3;
            iArr[PreferencesProto$Value.ValueCase.INTEGER.ordinal()] = 4;
            iArr[PreferencesProto$Value.ValueCase.LONG.ordinal()] = 5;
            iArr[PreferencesProto$Value.ValueCase.STRING.ordinal()] = 6;
            iArr[PreferencesProto$Value.ValueCase.STRING_SET.ordinal()] = 7;
            iArr[PreferencesProto$Value.ValueCase.VALUE_NOT_SET.ordinal()] = 8;
            a = iArr;
        }
    }

    private w16() {
    }

    private final void d(String str, PreferencesProto$Value preferencesProto$Value, MutablePreferences mutablePreferences) {
        PreferencesProto$Value.ValueCase X = preferencesProto$Value.X();
        switch (X == null ? -1 : a.a[X.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                mutablePreferences.j(u16.a(str), Boolean.valueOf(preferencesProto$Value.P()));
                return;
            case 2:
                mutablePreferences.j(u16.c(str), Float.valueOf(preferencesProto$Value.S()));
                return;
            case 3:
                mutablePreferences.j(u16.b(str), Double.valueOf(preferencesProto$Value.R()));
                return;
            case 4:
                mutablePreferences.j(u16.d(str), Integer.valueOf(preferencesProto$Value.T()));
                return;
            case 5:
                mutablePreferences.j(u16.e(str), Long.valueOf(preferencesProto$Value.U()));
                return;
            case 6:
                s16.a f = u16.f(str);
                String V = preferencesProto$Value.V();
                zq3.g(V, "value.string");
                mutablePreferences.j(f, V);
                return;
            case 7:
                s16.a g = u16.g(str);
                List M = preferencesProto$Value.W().M();
                zq3.g(M, "value.stringSet.stringsList");
                mutablePreferences.j(g, i.c1(M));
                return;
            case 8:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    private final PreferencesProto$Value g(Object obj) {
        if (obj instanceof Boolean) {
            GeneratedMessageLite l = PreferencesProto$Value.Y().t(((Boolean) obj).booleanValue()).l();
            zq3.g(l, "newBuilder().setBoolean(value).build()");
            return (PreferencesProto$Value) l;
        }
        if (obj instanceof Float) {
            GeneratedMessageLite l2 = PreferencesProto$Value.Y().v(((Number) obj).floatValue()).l();
            zq3.g(l2, "newBuilder().setFloat(value).build()");
            return (PreferencesProto$Value) l2;
        }
        if (obj instanceof Double) {
            GeneratedMessageLite l3 = PreferencesProto$Value.Y().u(((Number) obj).doubleValue()).l();
            zq3.g(l3, "newBuilder().setDouble(value).build()");
            return (PreferencesProto$Value) l3;
        }
        if (obj instanceof Integer) {
            GeneratedMessageLite l4 = PreferencesProto$Value.Y().w(((Number) obj).intValue()).l();
            zq3.g(l4, "newBuilder().setInteger(value).build()");
            return (PreferencesProto$Value) l4;
        }
        if (obj instanceof Long) {
            GeneratedMessageLite l5 = PreferencesProto$Value.Y().x(((Number) obj).longValue()).l();
            zq3.g(l5, "newBuilder().setLong(value).build()");
            return (PreferencesProto$Value) l5;
        }
        if (obj instanceof String) {
            GeneratedMessageLite l6 = PreferencesProto$Value.Y().y((String) obj).l();
            zq3.g(l6, "newBuilder().setString(value).build()");
            return (PreferencesProto$Value) l6;
        }
        if (!(obj instanceof Set)) {
            throw new IllegalStateException(zq3.q("PreferencesSerializer does not support type: ", obj.getClass().getName()));
        }
        GeneratedMessageLite l7 = PreferencesProto$Value.Y().z(c.N().t((Set) obj)).l();
        zq3.g(l7, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
        return (PreferencesProto$Value) l7;
    }

    @Override // defpackage.rk7
    public Object a(InputStream inputStream, by0 by0Var) {
        b a2 = v16.a.a(inputStream);
        MutablePreferences b2 = t16.b(new s16.b[0]);
        Map K = a2.K();
        zq3.g(K, "preferencesProto.preferencesMap");
        for (Map.Entry entry : K.entrySet()) {
            String str = (String) entry.getKey();
            PreferencesProto$Value preferencesProto$Value = (PreferencesProto$Value) entry.getValue();
            w16 w16Var = a;
            zq3.g(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.g(preferencesProto$Value, "value");
            w16Var.d(str, preferencesProto$Value, b2);
        }
        return b2.e();
    }

    @Override // defpackage.rk7
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public s16 b() {
        return t16.a();
    }

    public final String f() {
        return b;
    }

    @Override // defpackage.rk7
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object c(s16 s16Var, OutputStream outputStream, by0 by0Var) {
        Map a2 = s16Var.a();
        b.a N = b.N();
        for (Map.Entry entry : a2.entrySet()) {
            N.t(((s16.a) entry.getKey()).a(), g(entry.getValue()));
        }
        ((b) N.l()).l(outputStream);
        return ww8.a;
    }
}
