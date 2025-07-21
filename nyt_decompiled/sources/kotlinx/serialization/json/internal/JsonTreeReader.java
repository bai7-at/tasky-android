package kotlinx.serialization.json.internal;

import com.amazonaws.services.s3.internal.Constants;
import defpackage.g1;
import defpackage.gt3;
import defpackage.h1;
import defpackage.nd1;
import defpackage.ut3;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
public final class JsonTreeReader {
    private final g1 a;
    private final boolean b;
    private int c;

    public JsonTreeReader(gt3 gt3Var, g1 g1Var) {
        zq3.h(gt3Var, "configuration");
        zq3.h(g1Var, "lexer");
        this.a = g1Var;
        this.b = gt3Var.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonElement f() {
        int i;
        byte l = this.a.l();
        if (this.a.I() == 4) {
            g1.z(this.a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.a.f()) {
            arrayList.add(e());
            l = this.a.l();
            if (l != 4) {
                g1 g1Var = this.a;
                boolean z = l == 9;
                i = g1Var.a;
                if (!z) {
                    g1.z(g1Var, "Expected end of the array or comma", i, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (l == 8) {
            this.a.m((byte) 9);
        } else if (l == 4) {
            g1.z(this.a, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return new JsonArray(arrayList);
    }

    private final JsonElement g() {
        return (JsonElement) kotlin.a.b(new nd1(new JsonTreeReader$readDeepRecursive$1(this, null)), ww8.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009a -> B:10:0x00a5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.od1 r20, defpackage.by0 r21) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonTreeReader.h(od1, by0):java.lang.Object");
    }

    private final JsonElement i() {
        byte m = this.a.m((byte) 6);
        if (this.a.I() == 4) {
            g1.z(this.a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.a.f()) {
                break;
            }
            String s = this.b ? this.a.s() : this.a.q();
            this.a.m((byte) 5);
            linkedHashMap.put(s, e());
            m = this.a.l();
            if (m != 4) {
                if (m != 7) {
                    g1.z(this.a, "Expected end of the object or comma", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (m == 6) {
            this.a.m((byte) 7);
        } else if (m == 4) {
            g1.z(this.a, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return new JsonObject(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonPrimitive j(boolean z) {
        String s = (this.b || !z) ? this.a.s() : this.a.q();
        return (z || !zq3.c(s, Constants.NULL_VERSION_ID)) ? new ut3(s, z, null, 4, null) : JsonNull.INSTANCE;
    }

    public final JsonElement e() {
        byte I = this.a.I();
        if (I == 1) {
            return j(true);
        }
        if (I == 0) {
            return j(false);
        }
        if (I == 6) {
            int i = this.c + 1;
            this.c = i;
            this.c--;
            return i == 200 ? g() : i();
        }
        if (I == 8) {
            return f();
        }
        g1.z(this.a, "Cannot read Json element because of unexpected " + h1.c(I), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }
}
