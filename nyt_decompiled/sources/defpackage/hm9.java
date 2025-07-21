package defpackage;

import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public abstract class hm9 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(Set set) {
        return set == null ? "Not Subscribed" : set.containsAll(b0.j("MM", "CKG", "XWD")) ? "All Access Subscriber" : set.contains("MM") ? "Digital Subscriber" : "Not Subscribed";
    }
}
