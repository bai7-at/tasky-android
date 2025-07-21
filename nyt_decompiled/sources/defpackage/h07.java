package defpackage;

import com.nytimes.android.resourcedownloader.model.HybridProperties;
import com.nytimes.android.resourcedownloader.model.ResourceSource;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public interface h07 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    Object a(HybridProperties hybridProperties, ResourceSource resourceSource, boolean z, by0 by0Var);

    Object b(List list, by0 by0Var);

    InputStream c(String str);

    Object d(Set set, Set set2, by0 by0Var);

    Object e(Map map, String str, boolean z, by0 by0Var);
}
