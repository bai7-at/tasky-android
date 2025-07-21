package defpackage;

import com.amazonaws.services.s3.model.InstructionFileId;
import com.chartbeat.androidsdk.QueryKeys;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes5.dex */
public abstract class fu0 {
    public static String d(String str, String str2) {
        final String i = i(str);
        String str3 = (String) System.getProperties().entrySet().stream().filter(new Predicate() { // from class: bu0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean e;
                e = fu0.e(i, (Map.Entry) obj);
                return e;
            }
        }).map(new Function() { // from class: cu0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String f;
                f = fu0.f((Map.Entry) obj);
                return f;
            }
        }).findFirst().orElse(null);
        return str3 != null ? str3 : (String) System.getenv().entrySet().stream().filter(new Predicate() { // from class: du0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean g;
                g = fu0.g(i, (Map.Entry) obj);
                return g;
            }
        }).map(new Function() { // from class: eu0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) ((Map.Entry) obj).getValue();
            }
        }).findFirst().orElse(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean e(String str, Map.Entry entry) {
        return str.equals(i(entry.getKey().toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Map.Entry entry) {
        return entry.getValue().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean g(String str, Map.Entry entry) {
        return str.equals(h((String) entry.getKey()));
    }

    public static String h(String str) {
        return str.toLowerCase(Locale.ROOT).replace(QueryKeys.END_MARKER, InstructionFileId.DOT);
    }

    public static String i(String str) {
        return str.toLowerCase(Locale.ROOT).replace("-", InstructionFileId.DOT);
    }
}
