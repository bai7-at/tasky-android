package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes3.dex */
public interface fr0 {
    public static final fr0 a = new fr0() { // from class: er0
        @Override // defpackage.fr0
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List a(ComponentRegistrar componentRegistrar);
}
